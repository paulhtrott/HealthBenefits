package food;

/**
 * This class will hold all vegetable specific data.
 * Extends from the Food super class.
 * 
 * @author Paul Trott(ptrott)
 * Date: January 26, 2013
 */
public class Vegetable extends Food{
    
    //Instance variables.
    private String name;
    
    /**
     * Default no-arg constructor for Vegetable class.
     */
    public Vegetable(){
        super();
        this.name = "noname";
    }
    
    /**
     * Overloaded constructor for Vegetable class.
     * @param name
     * @param calories
     * @param caloriesFromFat
     * @param servingSize
     * @param protein
     * @param fat
     * @param carbs 
     */
    public Vegetable(String name, int calories, int caloriesFromFat, 
            double servingSize, double protein, double fat, double carbs){
        
        super(calories, caloriesFromFat, servingSize, protein, fat, carbs);
        this.name = name;
    }
    
    /**
     * Getter for name
     * @return name
     */
    @Override
    public String getName(){
        return this.name;
    }
    
    /**
     * Setter for name
     * @param name 
     */
    @Override
    public void setName(String name){
        this.name = name;
    }
    
    
}
