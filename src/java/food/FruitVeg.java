package food;

/**
 * 
 * This class will hold all FruitVeg specific data.
 * Foods that are classified as Fruits and Vegetables.
 * Extends from the Food super class.
 * 
 * @author Paul Trott (ptrott)
 * Date: January 26, 2013
 * 
 */

public class FruitVeg extends Food{
    
    //Instance variables.
    private String name;
    
    /**
     * no-arg Default constructor for FruitVeg class.
     */
    public FruitVeg(){
        super();
        this.name = "noname";
    }
    
    /**
     * Overloaded Constructor for FruitVeg class.
     * @param name
     * @param calories
     * @param caloriesFromFat
     * @param servingSize
     * @param protein
     * @param fat
     * @param carbs 
     */
    public FruitVeg(String name, int calories, int caloriesFromFat, 
            double servingSize, double protein, double fat, double carbs){
        
        super(calories, caloriesFromFat, servingSize, protein, fat, carbs);
        this.name = name;
        
    }
    
    /**
     * Getter for name.
     * @return name
     */
    @Override
    public String getName(){
        return this.name;
    }
    
    /**
     * Setter for name.
     * @param name 
     */
    @Override
    public void setName(String name){
        this.name = name;
    }
    
    
    
}
