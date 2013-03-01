package food.information;

/**
 * FoodInfo processes a short description of food information, name and description.
 * Class contains private String variables to hold name and description.
 * The default overloaded constructor takes in a name and description as parameters.
 * Class variables (foodName, foodDescription) can only be set through overloaded
 * default constructor. Class contains a getter for foodName and foodDescription.
 * 
 * @author Paul Trott (ptrott)
 */
public class FoodInfo {
    //Private instance variables.
    private String foodName;
    private String foodDescription;
    
    /**
     * Overloaded dafault constructor for FoodInfo class.
     * @param foodName - name of a food.
     * @param foodDescription - description of a food.
     */
    public FoodInfo(String foodName, String foodDescription){
        this.foodName = foodName;
        this.foodDescription = foodDescription;
    }
    
    /**
     * Getter for foodName.
     * @return - name of a food (String).
     */
    public String getFoodName(){
        return this.foodName;
    }
    
    /**
     * Getter for foodDescription.
     * @return - description of a food (String).
     */
    public String getFoodDescription(){
        return this.foodDescription;
    }
    
    
    
}
