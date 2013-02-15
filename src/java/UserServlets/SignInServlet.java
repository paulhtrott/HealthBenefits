package UserServlets;

import database.UserData;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.mindrot.BCrypt;
import user.User;

/**
 * SignInServlet that will check to be sure signing in user is an actual user
 * before allowing them into the members only sections of the web app
 * @author Paul Trott (ptrott)
 */
public class SignInServlet extends HttpServlet {

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
        
        //Get parameters from signin.jsp
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        //Variables to hold cookie age and path.
        int cookieAge = 60*60*24*365*2; //2 year cookie life
        String path = "/"; //cookie path leads to all of application.
        //String variable to hold returning url
        String url = "";
        
        //Instantiate a user object from the entered information.
        User user = (User) UserData.getUserOutOfDB(username);
        
        //Determine if user is in the database.
        //Determine if password matches database password.
        if((UserData.isUserAMember(username)) && (BCrypt.checkpw(password, user.getPassword()))){
            
            url = "/index.jsp";
        } else {
            url = "/signup.jsp";
        }
        
        //Code for forwarding user to new url view
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
