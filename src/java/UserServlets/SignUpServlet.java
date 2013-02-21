package UserServlets;

import database.DerbyUserData;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import encryption.BCrypt;
import user.User;

/**
 * Serlvet to process a user during sign up. The user signs up on the signup
 * page and user will be stored in an object, stored in the database; the
 * username, email and first name and will be stored in session cookies and
 * session attributes to be used throughout the web application.
 * All parameters will be passed through an HTML escape parser so that passed in Strings
 * are turned into HTML code before being sent to the database or processed.
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
        String firstName = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("firstname"));
        String username = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("username"));
        String password = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("password1"));
        String password2 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("password2"));
        String emailAddress = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(request.getParameter("emailaddress"));

        //Variable to hold messages to be returned to user in 
        //case of entered information is invalid.
        String message = "null";

        //variable to hold returning url
        String url;
        //varible for cookie age
        //seconds-minutes-hours-days-years
        int cookieAge = 60 * 60 * 24 * 365 * 2; //2 years
        //cookiePath to all of the application
        String cookiePath = "/";

        //Has and salt password before it is entered in the database.
        String hashed_pw = BCrypt.hashpw(password, BCrypt.gensalt(14));

        //Get a session object to store some user information in.
        HttpSession session = request.getSession();

        //Insert user into database if username and emailaddress doesn't already exist
        //in database.
        if (DerbyUserData.isUserExisting(emailAddress, username)) {
            //set message based on info inputed.
            message = "Email address and/or username already exists.";
            //synchronize message session attribute.
            synchronized (session) {
                session.setAttribute("message", message);
            }
            //return to signup page, show error.
            url = "/signup.jsp";
        } else if (!regex.Regex.isFirstNameValid(firstName)) {
            //If entered name is not a valid name, show error message.
            //set message.
            message = "Please enter a valid first name, no numbers allowed.";
            //synchronize message session attribute.
            synchronized (session) {
                session.setAttribute("message", message);
            }
            //return to signup page, show error.
            url = "/signup.jsp";
        } else if (firstName.length() > 50 && firstName.length() < 2) {
            //If first name is greater than 50 and less than 2, show error message.
            //set message.
            message = "Please enter a first name, between 2 &amp; 50 characters.";
            //synchronize message session attribute.
            synchronized (session) {
                session.setAttribute("message", message);
            }
            //return to signup page, show error.
            url = "/signup.jsp";
        } else if (username.length() < 6 && username.length() > 100) {
            //If username is less than 6 and more than 100 characters long.
            message = "Username must be between 5 &amp; 100 characters.";
            //synchronize message session attribute.
            synchronized (session) {
                session.setAttribute("message", message);
            }
            //return to signup page, show error.
            url = "/signup.jsp";

        } else if (!(password2.equals(password))) {

            //If password equals verification password2 and length is between 30 and 8
            message = "Passwords do not equal.";
            //synchronize message session attribute.
            synchronized (session) {
                session.setAttribute("message", message);
            }
            //return to signup page, show error.
            url = "/signup.jsp";
        } else if (password.length() > 30 && password.length() < 8) {
            //If password is less than 8 and more than 30 characters long.
            message = "Password must be between 8 &amp; 30 characters.";
            //synchronize message session attribute.
            synchronized (session) {
                session.setAttribute("message", message);
            }
            //return to signup page, show error.
            url = "/signup.jsp";
        } else if (!regex.Regex.isEmailValid(emailAddress)) {
            //If enetered email is not valid.
            message = "Please enter a valid email address (johndoe@company.com).";
            //synchronize message session attribute.
            synchronized (session) {
                session.setAttribute("message", message);
            }
            //return to signup page, show error.
            url = "/signup.jsp";
        } else {
            //Instantiate a User object of the signing up user.
            User user = new User(firstName, username, hashed_pw, emailAddress);

            //set cookie for username.
            Cookie usernameCookie = new Cookie("usernameCookie", user.getUsername());

            //Setup for username cookie
            usernameCookie.setMaxAge(cookieAge);
            usernameCookie.setPath(cookiePath);
            //usernameCookie.setSecure(true); //set to true when using SSL/HTTPS Certificate on production.
            response.addCookie(usernameCookie);

            //set session attribute for first name in synchronized threads.
            synchronized (session) {
                session.setAttribute("firstName", user.getFirstName());
                //insert user into USERS table.
                DerbyUserData.insertUser(user);
                //insert same user into USERCODE table.
                DerbyUserData.addToUserCodeTable(user);
            }

            //return user to signupthankyou.jsp
            url = "/index.jsp";

        }

        //Code for forwarding user to new url view
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

        //To remove error message from page on a return to Signup page.
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
