package UserServlets;

import database.UserData;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.mindrot.BCrypt;
import user.User;

/**
 * Serlvet to process a user during sign up. The user signs up on the signup
 * page and user will be stored in an object, stored in the database; the
 * username, email and first name and will be stored in session cookies and session
 * attributes to be used throughout the web application.
 *
 * @author Paul Trott (ptrott)
 */
public class SignUpServlet extends HttpServlet {

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

        //Get parameters from the signup.jsp page and store in variables.
        String firstName = request.getParameter("firstname");
        String username = request.getParameter("username");
        String password = request.getParameter("password1");
        String emailAddress = request.getParameter("emailaddress");
        //variable to hold returning url
        String url = "";
        //varible for cookie age
        //seconds-minutes-hours-days-years
        int cookieAge = 60*60*24*365*2; //2 years
        //cookiePath to all of the application
        String cookiePath = "/";

        //Has and salt password before it is entered in the database.
        String hashed_pw = BCrypt.hashpw(password, BCrypt.gensalt(14));
        
        //Instantiate a User object of the signing up user.
        User user = new User(firstName, username, hashed_pw, emailAddress);

        //Get a session object to store some user information in a session.
        HttpSession session = request.getSession();

        //Insert user into database if username and emailaddress doesn't already exist
        //in database.
        if (UserData.isUserExisting(user.getEmailAddress(), user.getUsername())) {
            //return to signin page.
            url = "/signin.jsp";
        } else {
            //set session attributes
            synchronized (session) {
                session.setAttribute("firstName", user.getFirstName());
                session.setAttribute("username", user.getUsername());
                session.setAttribute("emailAddress", user.getEmailAddress());
            }
            //set cookies
            Cookie firstNameCookie = new Cookie("firstNameCookie", user.getFirstName());
            Cookie usernameCookie = new Cookie("usernameCookie", user.getUsername());
            Cookie emailAddressCookie = new Cookie("emailAddressCookie", user.getEmailAddress());
            
            //Setup for first name cookie
            firstNameCookie.setMaxAge(cookieAge);
            firstNameCookie.setPath(cookiePath);
            response.addCookie(firstNameCookie);
            //Setup for username cookie
            usernameCookie.setMaxAge(cookieAge);
            usernameCookie.setPath(cookiePath);
            response.addCookie(usernameCookie);
            //Setup for the emailAddress cookie
            emailAddressCookie.setMaxAge(cookieAge);
            emailAddressCookie.setPath(cookiePath);
            response.addCookie(emailAddressCookie);
            
            //insert user into USERS table.
            UserData.insertUser(user);
            //insert same user into USERCODE table.
            UserData.addToUserCodeTable(user);
            //return user to signupthankyou.jsp
            url = "/index.jsp";
            
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
