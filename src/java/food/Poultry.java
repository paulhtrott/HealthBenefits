package food;

/**
 * This class will hold all Poultry specific data.
 * Extends from the Meat abstract class.
 *
 * @author Paul Trott (ptrott) Date: January 26, 2013
 */
public class Poultry extends Meat {
    //Final variabel to hold Poultry FOOD CODE.
    private final String FOOD_CODE = "0004";
    //Instantiate a food object.
    private final Food food;

    /**
     * no-arg Default Constructor
     */
    public Poultry() {
        food = new Food();
    }

    /**
     * Overloaded constructor
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
    public Poultry(String name, String description, int calories, int caloriesFromFat,
            double servingSize, double protein, double fat, double carbs) {
        //call super class overloaded constructor.
        food = new Food(name, description, calories, caloriesFromFat, servingSize, protein, fat, carbs);
    }
    
    /**
     * Getter for FOOD_CODE
     * return FOOD_CODE
     */
    @Override
    public String getFOOD_CODE(){
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
     * Getter for calories.
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
     * Getter for Fat
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
     * @return carbs
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
