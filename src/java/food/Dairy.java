package food;

/**
 * A class definition for a Dairy Object. This Dairy Class is in the food
 * package. It contains reference variables for FOOD_CODE, three booleans 
 * (milk, cheese, curdledDairy) and instantiates a Food object to hold/process 
 * all common food data. The class includes a default no-arg constructor and 
 * an overloaded constructor.
 * Implemented methods are Overridden.
 * Implements the IFood interface class.
 *
 * @author Paul Trott (ptrott)
 * Date: January 28, 2013
 */
public class Dairy implements IFood {
    //Final variable to hold the Diary Food Code

    private final String FOOD_CODE = "0012";
    //Instantiates a Food object
    private final Food food;
    //Instance variables
    private boolean milk;
    private boolean cheese;
    private boolean curdledDairy;

    /**
     * no-arg Default constructor.
     */
    public Dairy() {
        //Calls the food no-arg default constructor
        food = new Food();
        this.milk = false;
        this.cheese = false;
        this.curdledDairy = false;
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
    public Dairy(String name, String description, int calories, int caloriesFromFat, double servingSize,
            double protein, double fat, double carbs) {
        //call Food class overloaded constructor.
        food = new Food(name, description, calories, caloriesFromFat, servingSize, protein, fat, carbs);
        this.milk = false;
        this.cheese = false;
        this.curdledDairy = false;
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
     * Getter for milk
     *
     * @return
     */
    public boolean isMilk() {
        return milk;
    }

    /**
     * Setter for milk if Dairy product is milk then it is not any other type.
     *
     * @param milk
     */
    public void setMilk(boolean milk) {
        if (milk) {
            this.milk = milk;
            this.cheese = false;
            this.curdledDairy = false;
        } else {
            this.milk = false;
        }
    }

    /**
     * Getter for cheese
     *
     * @return
     */
    public boolean isCheese() {
        return cheese;
    }

    /**
     * Setter for cheese If Dairy product is cheese it is not of any other type.
     *
     * @param cheese
     */
    public void setCheese(boolean cheese) {
        if (cheese) {
            this.cheese = cheese;
            this.milk = false;
            this.curdledDairy = false;
        } else {
            this.cheese = false;
        }
    }

    /**
     * Setter for curdledDairy
     *
     * @return
     */
    public boolean isCurdledDairy() {
        return curdledDairy;
    }

    /**
     * Setter for curdledDairy
     * If Dairy product is curdledDairy it is not of any other type.
     * @param curdledDairy
     */
    public void setCurdledDairy(boolean curdledDairy) {
        if (curdledDairy) {
            this.curdledDairy = curdledDairy;
            this.milk = false;
            this.cheese = false;
        } else {
            this.curdledDairy = false;
        }
    }
}
