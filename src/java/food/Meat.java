package food;

/**
 * 
 * This class will hold all meat specific data.
 * Extends from the Food super class.
 * 
 * @author Paul Trott (ptrott)
 * Date: January 26, 2013
 */

public class Meat extends Food {
    
    //Instance variable
    private String name;
    
    /**
     * no-arg Default constructor
     */
    public Meat(){
        super();
        this.name = "noname";
    }
    
    /**
     * Overloaded Constructor
     * @param name
     * @param calories
     * @param caloriesFromFat
     * @param servingSize
     * @param protein
     * @param fat
     * @param carbs 
     */
    public Meat(String name, int calories, int caloriesFromFat, double servingSize, double protein, double fat,
            double carbs){
        //call super class overloaded constructor.
        super(calories, caloriesFromFat, servingSize, protein, fat, carbs);
        this.name = name;
    }
    
    /**
     * Setter for name.
     * @param name 
     */
    @Override
    public void setName(String name){
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
    
        
}
