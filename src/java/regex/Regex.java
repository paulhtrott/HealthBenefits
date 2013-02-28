package regex;



/**
 * Regex patterns to test inputted Strings and primitive types in classes,
 * patterns must be passed before input items are written to classes/databases.
 *
 * @author Paul Trott (ptrott)
 */
public class Regex {

    /**
     * This regex match tests a number entered and determines if the passed in
     * number is a 1-5 digit double type followed by a period followed by 1 - 2
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
     * Name can only include dashes and letters, no numbers.
     * @param firstName
     * @return 
     */
    public static boolean isFirstNameValid(String firstName) {
        //If firstName matches Regex then return true.
        //can only include letters and dashes, no numbers.
        if (firstName.matches("[a-zA-Z-]{2,}")){
            return true;
        } else {
            return false;
        }

    }
    
    /**
     * This Regex match tests an email address entered and determines if the
     * email matches the pattern before it is passed into the object.
     * Doesn't match ALL valid emails, but matches emails willing to hold in this app.
     * 
     * @param emailAddress
     * @return true if email address matches pattern
     * @return false if email address does not match pattern 
     */
    public static boolean isEmailValid(String emailAddress) {
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
        String firstNameReplaced = firstName.replaceAll("[0-9]{1,}", "");
        return firstNameReplaced;
    }
    
    
    /**
     * This Regex match replaces spaces in an entry with no spaces.
     * @param text
     * @return words with no spaces.
     */
    public static String replaceSpacesWithNoSpaces(String text){
        String nospaces = text.replaceAll("[\\s]{1,}","");
        return nospaces;
    }
    
    /**
     * Regex match replaces the first letter in a text with an upper case letter
     * if text parameter begins with a lower case letter.
     * @param text - text to be replaced with an upper case name.
     * @return upperLetterName - a text with an upper case first letter.
     */
    public static String replaceLowerCaseFirstLetter(String text){
        //Get the first character in the string.
        //Replace first letter with upper case letter if first letter is lower case.
        char firstLetter = Character.toUpperCase(text.charAt(0));
        //Put word back together.
        String upperLetterName = firstLetter + text.substring(1);
        return upperLetterName;
    }
    
     /**
     * Regex match replaces the first letter in a name with an lower case letter
     * if text parameter begins with a upper case letter.
     * @param text - text to be replaced with an lower case name.
     * @return lowerLetterName - a text with an lower case first letter.
     */
    public static String replaceUpperCaseFirstLetter(String text){
        //Get the first character in the string.
        //Replace first letter with upper case letter if first letter is lower case.
        char firstLetter = Character.toLowerCase(text.charAt(0));
        //Put word back together.
        String lowerLetterName = firstLetter + text.substring(1);
        return lowerLetterName;
    }
    
    /**
     * Regex to determine if a string contains a number.
     * @param text - String parameter.
     * @return boolean value of true or false. True if the string contains a number.
     * false if string does not contain a number.
     */
    public static boolean containsANumber(String text){
        //Determine if passed in parameter contains a number.
        if(text.matches(".*[0-9].*")){
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Regex to determine if a passed in String contains characters. As format
     * should just include digits.
     * @param text - String parameter (number)
     * @return boolean value of true or false. True if parameter String contains
     * characters. False if string only contains digits.
     */
    public static boolean containsText(String text){
        //Determine if passed in parameter contains a characters
        if(text.matches(".*[a-zA-Z].*")){
            return true;
        } else {
            return false;
        }
    }
    
    
    
}
