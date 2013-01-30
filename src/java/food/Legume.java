package food;

/**
 *
 * This class will hold all Legume specific data.
 * Extends from the Food class.
 * 
 * @author Paul Trott (ptrott)
 * Date: January 28, 2013
 */
public class Legume extends Food{
    
    //Instance variable
    private String name;
    
    /**
     * no-arg Default constructor.
     */
    public Legume(){
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
    public Legume(String name, int calories, int caloriesFromFat, double servingSize,
            double protein, double fat, double carbs){
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
