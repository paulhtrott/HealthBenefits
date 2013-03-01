package util;

import javax.servlet.http.Cookie;

/**
 * A Cookie Utility to get cookies by name and return the cookieValues and check
 * if cookie exists, returns the cookie value.
 * @author Paul Trott (ptrott)
 */
public class CookieUtil {    
    
    public static String getCookieValue(Cookie[] cookies, String cookieName){
        //Variables to hold Cookies and cookie value
        String cookieValue = "";
        Cookie cookie;
        //Check if cookies are empty (see if they exist)
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                //Go through each cookie.
                cookie = cookies[i];
                //Check to see if cookie has the required (searched for) parameter name.
                if (cookieName.equals(cookie.getName()))
                {
                    cookieValue = cookie.getValue();
                }
            }
        }
        return cookieValue;
    }
    
}
