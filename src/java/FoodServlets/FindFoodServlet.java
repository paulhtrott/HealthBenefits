package FoodServlets;

import database.DerbyFoodData;
import food.information.FoodInfo;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet that will search for foods based on the passed in parameter in the
 * search box on the web site. Passed parameter will be passed through an HTML
 * escape parser. This will search for the parameter (food) in the name and
 * description of all foods stored in the DB.
 *
 * @author Paul Trott (ptrott)
 */
public class FindFoodServlet extends HttpServlet {

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

        //Instantiate a string object with the passed in parameter.
        String foodSearch = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("search"));

        //String to hold returning url.
        String url;

        //String to hold a message.
        String message = "";

        //Create a HttpSession object to hold session attributes.
        HttpSession session = request.getSession();

        //List to hold database search the database.
        List<FoodInfo> foodInfo = null;

        synchronized (session) {
            foodInfo = DerbyFoodData.searchFoods(foodSearch);
        }

        //if foodSearch is empty or foodInfo is empty return to a items not found page.
        if (foodInfo.isEmpty()) {

            //Set message to a session attribute.
            synchronized (session) {
                //Set error message
                message = "Sorry, " + foodSearch + " was not found. Please try another search.";
                session.setAttribute("message", message);
            }

            url = "/listoffoods.jsp";

        } else {
            //otherwise return to a list of foods page showing search results.
            synchronized (session) {
                session.setAttribute("foods", foodInfo);
            }

            url = "/listoffoods.jsp";
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

        session.removeAttribute("message");
        session.removeAttribute("foods");

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
