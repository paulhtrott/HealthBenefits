package FoodServlets;

import database.FoodData;
import food.*;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * AddFoodToDBServlet will process the parameters from the enterfood.jsp and add
 * the entered food information to the FOOD database. All parameters will be
 * passed through an HTML escape parser so that passed in Strings are turned
 * into HTML code before being sent to the database or processed. Foods that have a
 * specific type use the overloaded addFood() method to add food to the database.
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
        String foodName = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("foodName"));
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
        
        //Instantiate an IFood (food) object.
        IFood food;
        //Variable to hold food code.
        String code;

        //Convert Strings to int
        int iCalories = Integer.parseInt(calories);
        int iCaloriesFromFat = Integer.parseInt(caloriesFromFat);
        
        //Convert Strings to double and format the entered number
        //DecimalFormat df = new DecimalFormat("###0.00");
        double dServingSize = Double.parseDouble(servingSize);
        double dProtein = Double.parseDouble(protein);
        double dFat = Double.parseDouble(fat);
        double dCarbs = Double.parseDouble(carbs);

        //Determine object to setup based on foodType.
        //Fruit
        if (foodType.compareTo("Fruit") == 0) {
            food = new Fruit(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs, specificType);
            Fruit fruit = (Fruit) food;
            code = food.getFOOD_CODE();
            //Send the inputted food to the database.
            FoodData.addFood(food, code, size, fruit.getSpecificType());
        }
        else if (foodType.compareTo("Vegetable") == 0) { //Vegetable
            food = new Vegetable(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs, specificType);
            Vegetable veg = (Vegetable) food;
            code = food.getFOOD_CODE();
            //Send the inputted food to the database.
            FoodData.addFood(food, code, size, veg.getSpecificType());
            
        }
        else if (foodType.compareTo("FruitVeg") == 0){ //FruitVegetable
            food = (FruitVeg) new FruitVeg(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
            code = food.getFOOD_CODE();
            //add food to database.
            FoodData.addFood(food, code, size);
        }
        else if (foodType.compareTo("Poultry") == 0){ //Poultry
            food = (Poultry) new Poultry(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
            code = food.getFOOD_CODE();
            //add food to database.
            FoodData.addFood(food, code, size);
        }
        else if (foodType.compareTo("Fish") == 0){ //Fish
            food = new Fish(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs, specificType);
            Fish fish = (Fish) food;
            code = food.getFOOD_CODE();
            //Send the inputted food ti the database.
            FoodData.addFood(food, code, size, fish.getSpecificType());
        }
        else if (foodType.compareTo("Wild Game") == 0){ //WildGame
            food = (WildGame) new WildGame(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
            code = food.getFOOD_CODE();
            //add food to database.
            FoodData.addFood(food, code, size);
        }
        else if (foodType.compareTo("Red Meat") == 0){ //RedMeat
            food = (RedMeat) new RedMeat(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
            code = food.getFOOD_CODE();
            //add food to database.
            FoodData.addFood(food, code, size);
        }
        else if (foodType.compareTo("Bread") == 0){ //Bread
            food = (Bread) new Bread(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
            code = food.getFOOD_CODE();
            //add food to database.
            FoodData.addFood(food, code, size);
        }
        else if (foodType.compareTo("Cereal") == 0){ //Cereal
            food = (Cereal) new Cereal(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
            code = food.getFOOD_CODE();
            //add food to database.
            FoodData.addFood(food, code, size);
        }
        else if (foodType.compareTo("Rice") == 0){ //Rice
            food = (Rice) new Rice(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
            code = food.getFOOD_CODE();
            //add food to database.
            FoodData.addFood(food, code, size);
        }
        else if (foodType.compareTo("Pasta") == 0){ //Pasta
            food = (Pasta) new Pasta(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
            code = food.getFOOD_CODE();
            //add food to database.
            FoodData.addFood(food, code, size);
        }
        else if (foodType.compareTo("Dairy") == 0){ //Dairy
            food = new Dairy(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs, specificType);
            Dairy dairy = (Dairy) food;
            code = food.getFOOD_CODE();
            //Add food to database
            FoodData.addFood(food, code, size, dairy.getSpecificType());
        } 
        else if (foodType.compareTo("Legumes") == 0){ //Legumes
            food = new Legume(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
            code = food.getFOOD_CODE();
            //Add food to database.
            FoodData.addFood(food, code, size);
            
        } 
        else if (foodType.compareTo("Fat") == 0){ //Fats
            food = new Fat(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs, specificType);
            Fat fatfood = (Fat) food;
            code = food.getFOOD_CODE();
            //add food to database
            FoodData.addFood(food, code, size, fatfood.getSpecificType());
        } 
        else if (foodType.compareTo("Herbs") == 0){ //Herbs
            food = (Herb) new Herb(foodName, description, iCalories, iCaloriesFromFat, dServingSize, dProtein, dFat, dCarbs);
            code = food.getFOOD_CODE();
            //add food to database.
            FoodData.addFood(food, code, size);
        }
        
        url = "/admin/enterfood.jsp";
        
        //Code for forwarding user to new URL.
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
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
