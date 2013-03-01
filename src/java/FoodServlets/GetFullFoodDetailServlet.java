package FoodServlets;

import database.DerbyFoodData;
import food.information.FoodFullDetails;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * GetFullFoodDetailServlet returns a food items full details based on a clicked
 * food item. Will return all details about a food including Name, Description,
 * Calories, Calories From Fat, Carbohydrates, Protein, Fat, Serving Size, and
 * Specific food information. All information stored in Food Table.
 *
 * @author Paul Trott (ptrott)
 */
public class GetFullFoodDetailServlet extends HttpServlet {

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

        //Store the food name in a String object.
        String foodName = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("food"));

        //Instantiate FoodFullDetails object bean to hold all FoodFullDetail information.
        FoodFullDetails food;
        
        //String to hold returning url
        String url;

        //Instantiate a session object
        HttpSession session = request.getSession();

        //Synchronize request.
        synchronized (session) {
            //Get food item out of database based on food name.
            //Store returned food information in FoodFullDetails object.
            food = (FoodFullDetails) DerbyFoodData.getSelectedFood(foodName);
        }

        //Be sure food has a value stored before running 
        if (food == null) {
            //return to an error page.
            url = "/index.jsp";
        } else {
            //Set FoodFullDetails object in a session
            synchronized(session){
                session.setAttribute("food", food);
            }
            //return to details.jsp page
            url = "/details.jsp";
        }

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
