package regex;

//regex imports
import java.util.regex.*;


/**
 * Regex patterns to test inputted String and other primitive types in classes,
 * patterns must be passed before input items are written to classes/databases.
 *
 * @author Paul Trott (ptrott)
 */
public class Regex {

    /**
     * This regex match tests a number entered and determines if the passed in
     * double is a 1-5 digit number followed by a period followed by 1 - 3
     * digits.
     *
     * @param enteredNum
     * @return true or false
     */
    public static boolean isDoubleRegexMatch(Double enteredNum) {
        String regex = "([0-9]{1,4})(\\.)([0-9]{1,2})";

        String numToCheck = enteredNum.toString();

        if (numToCheck.matches(regex)) {
            return true;
        } else {
            return false;
        }

    }

    
    /**
     * This Regex match tests a first name entered and determines if the
     * first name matches the pattern before it is passed into the object.
     * @param firstName
     * @return 
     */
    public static boolean isFirstNameRegexMatch(String firstName) {
        //If emailToCheck matches Regex then return true.
        if (firstName.matches("[a-zA-Z-]{2,}")){
            return true;
        } else {
            return false;
        }

    }
    
    /**
     * This Regex match tests an email address entered and determines if the
     * email matches the pattern before it is passed into the object.
     * @param emailAddress
     * @return 
     */
    public static boolean isEmailRegexMatch(String emailAddress) {
        //If emailToCheck matches Regex then return true.
        if (emailAddress.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$")){
            return true;
        } else {
            return false;
        }

    }
    
    /**
     * This Regex test removes numbers in a firstName.
     * @param firstName
     * @return 
     */
    public static String replaceNumbersInFirstName(String firstName){
        //If name includes numbers remove numbers.
        return firstName.replaceAll("[0-9]{1,}", "");
    }
    
    /**
     * This Regex match replaces spaces in an entry with no spaces.
     */
    public static String replaceSpacesWithNoSpaces(String text){
        return text.replaceAll("[\\s]{1,}","");
    }
    
    /*
     * SAVED FOR FUTURE REFERENCE.....................
     * //Serving Size...
     //Format the entered number, before checking entered num with regex.
     DecimalFormat df = new DecimalFormat("###0.00");
     servingSize = (Double) Double.parseDouble(df.format(servingSize));
        
     //To set servingSize after a regex test.
     if(Regex.isDoubleRegexMatch(servingSize)){
     this.servingSize = servingSize;
     }
     //End of Serving Size.
     */
    
}
