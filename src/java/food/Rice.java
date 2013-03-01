package food;

/**
 * A class definition for a Rice Object. This Rice Class is in the food
 * package. It contains reference variables for FOOD_CODE and instantiates a 
 * Food object to hold/process all common food data. The class includes a 
 * default no-arg constructor and an overloaded constructor.
 * Extended methods are Overridden.
 * Extends from the Grain abstract class.
 *
 * @author Paul Trott (ptrott) Date: January 28, 2013 Modified Date: February 2,
 * 2013 (to inherit from Grain abstract class)
 */
public class Rice extends Grain {
    //Final variable to hold Rice Food Code.

    private final String FOOD_CODE = "0010";
    //Instantiate a food object.
    private final Food food;

    /**
     * no-arg Default constructor.
     */
    public Rice() {
        //call food no-arg default constructor
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
    public Rice(String name, String description, int calories, int caloriesFromFat, double servingSize, double protein, double fat,
            double carbs) {
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
     *
     * @return
     */
    @Override
    public double getServingSize() {
        return food.getServingSize();
    }

    /**
     * Setter for servingSize
     *
     * @param servingSize
     */
    @Override
    public void setServingSize(double servingSize) {
        food.setServingSize(servingSize);
    }

    /**
     * Getter for protein
     *
     * @return
     */
    @Override
    public double getProtein() {
        return food.getProtein();
    }

    /**
     * Setter for protein
     *
     * @param protein
     */
    @Override
    public void setProtein(double protein) {
        food.setProtein(protein);
    }

    /**
     * Getter for fat
     *
     * @return
     */
    @Override
    public double getFat() {
        return food.getFat();
    }

    /**
     * Setter for fat
     *
     * @param fat
     */
    @Override
    public void setFat(double fat) {
        food.setFat(fat);
    }

    /**
     * Getter for carbs
     *
     * @return
     */
    @Override
    public double getCarbs() {
        return food.getCarbs();
    }

    /**
     * Setter for carbs
     *
     * @param carbs
     */
    @Override
    public void setCarbs(double carbs) {
        food.setCarbs(carbs);
    }

    /**
     * Getter for description
     *
     * @return
     */
    @Override
    public String getDescription() {
        return food.getDescription();
    }

    /**
     * Setter for description
     *
     * @param description
     */
    @Override
    public void setDescription(String description) {
        food.setDescription(description);
    }
}
