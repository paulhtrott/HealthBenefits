package food;

/**
 * This class will hold all Pasta specific data. Extends from the Grain abstract
 * class.
 *
 * @author Paul Trott (ptrott) Date: January 28, 2013
 */
public class Pasta extends Grain {
    //Final variable to hold Pasta FOOD CODE

    private final String FOOD_CODE = "0011";
    //Instantiates a Food object
    private final Food food;

    /**
     * no-arg Default constructor.
     */
    public Pasta() {
        //Calls Food default constructor
        food = new Food();
    }

    /**
     * Overloaded constructor.
     *
     * @param name
     * @param description
     * @param calories
     * @param caloriesFromFat
     * @param servingSize
     * @param protein
     * @param fat
     * @param carbs
     */
    public Pasta(String name, String description, int calories, int caloriesFromFat, double servingSize,
            double protein, double fat, double carbs) {
        //call Food class overloaded constructor.
        food = new Food(name, description, calories, caloriesFromFat, servingSize, protein, fat, carbs);
    }

    /**
     * Getter for FOOD_CODE
     *
     * @return
     */
    @Override
    public String getFOOD_CODE() {
        return FOOD_CODE;
    }

    /**
     * Setter for name
     *
     * @param name
     */
    @Override
    public void setName(String name) {
        food.setName(name);
    }

    /**
     * Getter for name
     *
     * @return
     */
    @Override
    public String getName() {
        return food.getName();
    }

    /**
     * Getter for calories
     *
     * @return
     */
    @Override
    public int getCalories() {
        return food.getCalories();
    }

    /**
     * Setter for calories
     *
     * @param calories
     */
    @Override
    public void setCalories(int calories) {
        food.setCalories(calories);
    }

    /**
     * Getter for caloriesFromFat
     *
     * @return
     */
    @Override
    public int getCaloriesFromFat() {
        return food.getCaloriesFromFat();
    }

    /**
     * Setter for caloriesFromFat
     *
     * @param caloriesFromFat
     */
    @Override
    public void setCaloriesFromFat(int caloriesFromFat) {
        food.setCaloriesFromFat(caloriesFromFat);
    }

    /**
     * Getter for servingSize
     * @return 
     */
    @Override
    public double getServingSize() {
        return food.getServingSize();
    }

    /**
     * Setter for servingSize
     * @param servingSize 
     */
    @Override
    public void setServingSize(double servingSize) {
        food.setServingSize(servingSize);
    }

    /**
     * Getter for protein
     * @return 
     */
    @Override
    public double getProtein() {
        return food.getProtein();
    }

    /**
     * Setter for protein
     * @param protein 
     */
    @Override
    public void setProtein(double protein) {
        food.setProtein(protein);
    }

    /**
     * Getter for fat
     * @return 
     */
    @Override
    public double getFat() {
        return food.getFat();
    }

    /**
     * Setter for fat
     * @param fat 
     */
    @Override
    public void setFat(double fat) {
        food.setFat(fat);
    }

    /**
     * Getter for carbs
     * @return 
     */
    @Override
    public double getCarbs() {
        return food.getCarbs();
    }

    /**
     * Setter for carbs
     * @param carbs 
     */
    @Override
    public void setCarbs(double carbs) {
        food.setCarbs(carbs);
    }

    /**
     * Get description
     * @return 
     */
    @Override
    public String getDescription() {
        return food.getDescription();
    }

    /**
     * Set description
     * @param description 
     */
    @Override
    public void setDescription(String description) {
        food.setDescription(description);
    }
}
