package FoodServlets;

import database.DerbyFoodData;
import food.*;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import regex.Regex;

/**
 * AddFoodToDBServlet will process the parameters from the enterfood.jsp and add
 * the entered food information to the FOOD database. All parameters will be
 * passed through an HTML escape parser so that passed in Strings are turned
 * into HTML code before being sent to the database or processed. Foods that
 * have a specific type use the overloaded addFood() method to add food to the
 * database.
 *
 * @author Paul Trott (ptrott)
 */
public class AddFoodServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Get parameters from the enterfood.jsp and escape Html4 characters.
        String foodType = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("foodType"));
        String foodName = regex.Regex.replaceLowerCaseFirstLetter(org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("foodName")));
        String specificType = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("specificType"));
        String calories = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("calories")); //convert to int
        String caloriesFromFat = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("caloriesFromFat")); //convert to int
        String servingSize = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("servingSize")); //convert to double
        String size = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("size"));
        String carbs = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("carbs")); //convert to double
        String protein = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("protein")); //convert to double
        String fat = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("fat")); //convert to double
        String description = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("description"));

        //Variable to hold returning url
        String url;

        //Variable to hold error message.
        String message;

        //Instantiate an IFood (food) object.
        IFood food;
        //Variable to hold food code.
        String foodCode;
        
        //Instantiate an HTTP session
        HttpSession session = request.getSession();
        
        //if foodName contains a number post an error message to the user.
        //return the user to the page to re-enter foodName.
        if (Regex.containsANumber(foodName)) {
            //error message.
            message = "Food had an invalid name.";
            //Synchronize a session attribute for setting error messages.
            synchronized(session){
                session.setAttribute("message", message);
            }

            //return to enterfood jsp.
            url = "/admin/enterfood.jsp";

        } else if (description.length() > 3000 || description.length() < 20) {
            //If description is less than 20 characters or greater than 3000 characters
            //return the user to the page to re-enter description
            //error message.
            message = "Description needs to be between 3000 and 20 characters.";
            
            //Synchronized a session attribute for setting error message.
            synchronized(session){
                session.setAttribute("message", message);
            }

            //return to enterfood jsp
            url = "/admin/enterfood.jsp";

        } else if (Regex.containsText(calories) || (calories.length() > 4 && calories.length() < 1)) {
            //If calories contains an invalid value of characters in number text box.
            //error mesage.
            message = "Enter valid numbers in the Calories text box.";
            
            //Synchronized a session attribute for setting error message
            synchronized(session){
                session.setAttribute("message", message);
            }

            //return to enter food jsp.
            url = "/admin/enterfood.jsp";

        } else if (Regex.containsText(caloriesFromFat) || (calories.length() > 4 && calories.length() < 1)) {
            //If caloriesFromFat contains an invalid value of character in number text box.
            //error message.
            message = "Enter valid numbers in the Calories From Fat text box.";
            
            //Synchronized a session attribute for setting error message.
            synchronized(session){
                session.setAttribute("message", message);
            }

            //return to enterfoods jsp
            url = "/admin/enterfood.jsp";

        } else if (Regex.containsText(servingSize) || (servingSize.length() > 6 && servingSize.length() < 1)) {
            //If servingSize contains an invalid value of characters in a number text box.
            //error message.
            message = "Enter valid numbers in the Serving Size text box.";
            
            //Synchronized session to set attribute for setting error message.
            synchronized(session){
                session.setAttribute("message", message);
            }

            //return to enterfoods jsp
            url = "/admin/enterfood.jsp";

        } else if (Regex.containsText(carbs) || (carbs.length() > 6 && carbs.length() < 1)) {
            //If carbs contains an invalid value of characters in a number text box.
            //error message.
            message = "Enter valid numbers in the Carbs text box.";
            
            //Synchronized session to set attribute for setting error message.
            synchronized(session){
                session.setAttribute("message", message);
            }

            //return to enterfoods jsp
            url = "/admin/enterfood.jsp";

        } else if (Regex.containsText(protein) || (protein.length() > 6 && protein.length() < 1)) {
            //If protein contains an invalid value of characters in a number text box.
            //error message.
            message = "Enter valid numbers in the Protein text box.";
            
            //Synchronized session to set attribute for setting error message.
            synchronized(session){
                session.setAttribute("message", message);
            }

            //return to enterfoods jsp.
            url = "/admin/enterfood.jsp";
        } else if (Regex.containsText(fat) || (fat.length() > 6 && fat.length() < 1)) {
            //If fat contains an invalid value of characters in a number text box.
            //error message.
            message = "Enter valid numbers in the Fat text box.";
            
            //synchronized session to set message
            synchronized(session){
                session.setAttribute("message", message);
            }

            //return to enterfoods jsp.
            url = "/admin/enterfood.jsp";
        } else {

            int iCalories = Integer.parseInt(calories);
            int iCaloriesFromFat = Integer.parseInt(caloriesFromFat);

            //Convert Strings to double and format the entered number
            double dServingSize = Double.parseDouble(servingSize);
            double dProtein = Double.parseDouble(protein);
            double dFat = Double.parseDouble(fat);
            double dCarbs = Double.parseDouble(carbs);

            //Determine object to setup based on foodType.
            //Fruit
            if (foodType.compareTo("Fruit") == 0) {
                food = new Fruit(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs, specificType);
                Fruit fruit = (Fruit) food;
                foodCode = food.getFOOD_CODE();
                //Send the inputted food to the database.
                DerbyFoodData.addFood(food, foodCode, size, fruit.getSpecificType());
            } else if (foodType.compareTo("Vegetable") == 0) { //Vegetable
                food = new Vegetable(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs, specificType);
                Vegetable veg = (Vegetable) food;
                foodCode = food.getFOOD_CODE();
                //Send the inputted food to the database.
                DerbyFoodData.addFood(food, foodCode, size, veg.getSpecificType());

            } else if (foodType.compareTo("FruitVeg") == 0) { //FruitVegetable
                food = (FruitVeg) new FruitVeg(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
                foodCode = food.getFOOD_CODE();
                //add food to database.
                DerbyFoodData.addFood(food, foodCode, size);
            } else if (foodType.compareTo("Poultry") == 0) { //Poultry
                food = (Poultry) new Poultry(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
                foodCode = food.getFOOD_CODE();
                //add food to database.
                DerbyFoodData.addFood(food, foodCode, size);
            } else if (foodType.compareTo("Fish") == 0) { //Fish
                food = new Fish(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs, specificType);
                Fish fish = (Fish) food;
                foodCode = food.getFOOD_CODE();
                //Send the inputted food ti the database.
                DerbyFoodData.addFood(food, foodCode, size, fish.getSpecificType());
            } else if (foodType.compareTo("Wild Game") == 0) { //WildGame
                food = (WildGame) new WildGame(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
                foodCode = food.getFOOD_CODE();
                //add food to database.
                DerbyFoodData.addFood(food, foodCode, size);
            } else if (foodType.compareTo("Red Meat") == 0) { //RedMeat
                food = (RedMeat) new RedMeat(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
                foodCode = food.getFOOD_CODE();
                //add food to database.
                DerbyFoodData.addFood(food, foodCode, size);
            } else if (foodType.compareTo("Bread") == 0) { //Bread
                food = (Bread) new Bread(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
                foodCode = food.getFOOD_CODE();
                //add food to database.
                DerbyFoodData.addFood(food, foodCode, size);
            } else if (foodType.compareTo("Cereal") == 0) { //Cereal
                food = (Cereal) new Cereal(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
                foodCode = food.getFOOD_CODE();
                //add food to database.
                DerbyFoodData.addFood(food, foodCode, size);
            } else if (foodType.compareTo("Rice") == 0) { //Rice
                food = (Rice) new Rice(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
                foodCode = food.getFOOD_CODE();
                //add food to database.
                DerbyFoodData.addFood(food, foodCode, size);
            } else if (foodType.compareTo("Pasta") == 0) { //Pasta
                food = (Pasta) new Pasta(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
                foodCode = food.getFOOD_CODE();
                //add food to database.
                DerbyFoodData.addFood(food, foodCode, size);
            } else if (foodType.compareTo("Dairy") == 0) { //Dairy
                food = new Dairy(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs, specificType);
                Dairy dairy = (Dairy) food;
                foodCode = food.getFOOD_CODE();
                //Add food to database
                DerbyFoodData.addFood(food, foodCode, size, dairy.getSpecificType());
            } else if (foodType.compareTo("Legumes") == 0) { //Legumes
                food = new Legume(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
                foodCode = food.getFOOD_CODE();
                //Add food to database.
                DerbyFoodData.addFood(food, foodCode, size);

            } else if (foodType.compareTo("Fat") == 0) { //Fats
                food = new Fat(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs, specificType);
                Fat fatfood = (Fat) food;
                foodCode = food.getFOOD_CODE();
                //add food to database
                DerbyFoodData.addFood(food, foodCode, size, fatfood.getSpecificType());
            } else if (foodType.compareTo("Herbs") == 0) { //Herbs
                food = (Herb) new Herb(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
                foodCode = food.getFOOD_CODE();
                //add food to database.
                DerbyFoodData.addFood(food, foodCode, size);
            }
            
            //Successful message for added food.
            message = "Food added to system.";
            
            //Synchronized session for setting success message.
            synchronized(session){
                session.setAttribute("message", message);
            }

            url = "/admin/enterfood.jsp";
        }

        //Code for forwarding user to new URL.
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
        
        //To remove message from session.
        session.removeAttribute("message");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
