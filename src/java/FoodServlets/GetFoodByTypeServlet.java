package FoodServlets;

import database.DerbyFoodData;
import food.information.FoodInfo;
import java.io.IOException;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * GetFoodByTypeServlet returns a list of foods to the requesting page, based on type
 * of food, such as fruit, vegetable, fruitveg, etc...
 * 
 * @author Paul Trott (ptrott)
 */
public class GetFoodByTypeServlet extends HttpServlet {

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
        //Get the parameter of the clicked link.
        String foodType = request.getParameter("foodType");
        
        //Returning url location.
        String url = "/food/" + foodType + ".jsp";
        
        //Instantiate an HTTPSession object
        HttpSession session = request.getSession();
        
        //Synchronize a session for the link requests being passed to the Database request.
        synchronized(session){
            List<FoodInfo> foodList = DerbyFoodData.getListOfFoods(foodType);
            //Set the Hash as a session object.
            session.setAttribute("foodInfo", foodList);
        }
        
        //Code for forwarding user to new url
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
        
        session.removeAttribute("foodInfo");
        
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
