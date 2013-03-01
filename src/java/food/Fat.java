package food;

/**
 * A class definition for a Fat Object. This Fat Class is in the food package.
 * It contains reference variables for FOOD_CODE, String to hold three possible
 * values (liquid, solid, nut) and instantiates a Food object to hold/process
 * all common food data. The class includes a default no-arg constructor and an
 * overloaded constructor. Implemented methods are Overridden. Implements the
 * IFood interface class.
 *
 * @author Paul Trott (ptrott) Date: January 28, 2013
 */
public class Fat implements IFood {
    //Final variable to hold the Fat FOOD CODE.

    private final String FOOD_CODE = "0014";
    //Instantiate a food object.
    private final Food food;
    //Instance variables
    private String specificType;

    /**
     * no-arg Default constructor.
     */
    public Fat() {
        //Instantiate a Food object
        //Call Food default no-arg constructor
        food = new Food();
        this.specificType = "";
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
     * @param specificType
     */
    public Fat(String name, String description, int calories, int caloriesFromFat, double servingSize,
            double protein, double fat, double carbs, String specificType) {
        //Instantiate a Food object
        //call Food class overloaded constructor.
        food = new Food(name, description, calories, caloriesFromFat, servingSize, protein, fat, carbs);
        this.specificType = specificType;
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
     * Getter for calories
     *
     * @return
     */
    @Override
    public int getCalories() {
        return food.getCalories();
    }

    /**
     * Setter for calories.
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
     * Setter protein
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
     * Getter for name
     *
     * @return
     */
    @Override
    public String getName() {
        return food.getName();
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

    /**
     * Getter for specificType
     *
     * @return
     */
    public String getSpecificType() {
        return specificType;
    }

    /**
     * Setter for specificType
     *
     * @param specificType
     */
    public void setSpecificType(String specificType) {
        this.specificType = specificType;

    }
}
