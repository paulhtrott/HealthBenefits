package food;

/**
 * This class will hold all Poultry specific data.
 * Extends from the Meat class.
 * 
 * @author Paul Trott (ptrott)
 * Date: January 26, 2013
 */
public class Poultry extends Meat{
    //Instance variable
    private String name;
    
    /**
     * no-arg Default Constructor
     */
    public Poultry(){
        super();
        this.name = "noname";
    }
    
    /**
     * Overloaded constructor
     * @param name
     * @param calories
     * @param caloriesFromFat
     * @param servingSize
     * @param protein
     * @param fat
     * @param carbs 
     */
    public Poultry(String name, int calories, int caloriesFromFat, double servingSize, double protein, double fat,
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
    
    
    
    /*
    public static void main(String[] args) {
        //Test for fruit class.
        Food chicken = new Poultry("Chicken", 235, 112, 1.5, 13.4, 12.54, 23.22);
        
        System.out.println("Name: " + chicken.getName() + "\nCalories: " + 
                chicken.getCalories() + "\nCalorie from Fat: " + chicken.getCaloriesFromFat() +
                "\nServing Size: " + chicken.getServingSize() +
                "\nProtein: " + chicken.getProtein() +
                "\nFat: " + chicken.getFat() +
                "\nCarbs: " + chicken.getCarbs() + "\n");
                
    }*/
    
}
