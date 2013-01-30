package food;

/**
 * 
 * This class will hold all Fish specific data.
 * Extends from the Meat class.
 * 
 * @author Paul Trott (ptrott)
 * Date: January 26, 2013
 * 
 */
public class Fish extends Meat{
    
    //Instance variable
    private String name;
    
    /**
     * no-arg Default constructor.
     */
    public Fish(){
        super();
        this.name = "noname";
    }
    
    /**
     * Overloaded constructor.
     * @param name
     * @param calories
     * @param caloriesFromFat
     * @param servingSize
     * @param protein
     * @param fat
     * @param carbs 
     */
    public Fish(String name, int calories, int caloriesFromFat, double servingSize, double protein, double fat,
            double carbs){
        //call super class overloaded constructor.
        super(name, calories, caloriesFromFat, servingSize, protein, fat, carbs);
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
