package food;

/**
 * A class definition for a Fish Object. This Fish Class is in the food package.
 * It contains reference variables for FOOD_CODE, String to hold a specific type
 * of either three possible values (saltwater, freshwater, freshAndSaltwater)
 * and instantiates a Food object to hold/process all common food data. The
 * class includes a default no-arg constructor and an overloaded constructor.
 * Abstract methods are Overridden. Extends from the Meat abstract class.
 *
 * @author Paul Trott (ptrott) Date: January 26, 2013
 *
 */
public class Fish extends Meat {

    //Final variable to hold Fish FOOD CODE
    private final String FOOD_CODE = "0005";
    //Instantiate a food object.
    private final Food food;
    //Instance variable
    private String specificType;

    /**
     * no-arg Default constructor.
     */
    public Fish() {
        //Calls food default constructor.
        food = new Food();
        specificType = "";
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
    public Fish(String name, String description, int calories, int caloriesFromFat, double servingSize, double protein, double fat,
            double carbs, String specificType) {
        //call food class overloaded constructor.
        food = new Food(name, description, calories, caloriesFromFat, servingSize, protein, fat, carbs);
        this.specificType = specificType;
    }

    /**
     * Getter for FOOD_CODE
     *
     * @return FOOD_CODE
     */
    @Override
    public String getFOOD_CODE() {
        return FOOD_CODE;
    }

    /**
     * Setter for name.
     *
     * @param name
     */
    @Override
    public void setName(String name) {
        food.setName(name);
    }

    /**
     * Getter for name.
     *
     * @return name
     */
    @Override
    public String getName() {
        return food.getName();
    }

    /**
     * Getter for calories
     *
     * @return calories
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
     * @return caloriesFromFat
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
     * @return servingSize
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
     * @return protein
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
     * @return fat
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
     * @return description
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
     * @return specificType
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