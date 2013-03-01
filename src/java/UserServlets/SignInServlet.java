package UserServlets;

import database.DerbyUserData;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import user.User;

/**
 * SignInServlet that will check to be sure signing in user is an actual user
 * before allowing them into the members only sections of the web app.
 * All parameters will be passed through an HTML escape parser so that passed in Strings
 * are turned into HTML code before being sent to the database or processed.
 *
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
        String username = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("username"));
        String password = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("password"));
        
        //Set message for error logining in.
        String message;

        //Variables to hold cookie age and path.
        int cookieAge = 60 * 60 * 24 * 365 * 2; //2 year cookie life
        String cookiePath = "/"; //cookie path leads to all of application.
        //String variable to hold returning url
        String url;

        //Instantiate a user object from the entered information.
        User user = (User) DerbyUserData.getUserOutOfDB(username);

        //Instantiate a session object to store user information in a session.
        HttpSession session = request.getSession();

        //If password does not equal hashed password then return to login page.
        if (!(encryption.BCrypt.checkpw(password, user.getPassword()))) {
            //Return to sign up jsp
            url = "/signin.jsp";
        }
        
        if ((DerbyUserData.isUserAMember(username)) && (encryption.BCrypt.checkpw(password, user.getPassword()))) {
            //Determine if user is in the database.
            //Determine if password matches database password.
            //set session attribtues in synchronized threads
            synchronized (session) {
                session.setAttribute("firstName", user.getFirstName());
            }

            //Set Cookies
            Cookie usernameCookie = new Cookie("usernameCookie", user.getUsername());

            //Setup usernameCookie
            usernameCookie.setMaxAge(cookieAge);
            usernameCookie.setPath(cookiePath);
            //usernameCookie.setSecure(true);
            response.addCookie(usernameCookie);

            //Return to index jsp.
            url = "/index.jsp";
        } else {
            //Return to sign up jsp
            url = "/signin.jsp";
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
