package food;

/**
 *
 * This class will hold all Fat specific data. Implements the IFood Interface
 * class.
 *
 * @author Paul Trott (ptrott) Date: January 28, 2013
 */
public class Fat implements IFood {
    //Final variable to hold the Fat FOOD CODE.

    private final String FOOD_CODE = "0014";
    //Instantiate a food object.
    private final Food food;
    //Instance variables
    private boolean liquid;
    private boolean solid;
    private boolean nut;

    /**
     * no-arg Default constructor.
     */
    public Fat() {
        //Instantiate a Food object
        //Call Food default no-arg constructor
        food = new Food();
        this.liquid = false;
        this.solid = false;
        this.nut = false;
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
    public Fat(String name, String description, int calories, int caloriesFromFat, double servingSize,
            double protein, double fat, double carbs) {
        //Instantiate a Food object
        //call Food class overloaded constructor.
        food = new Food(name, description, calories, caloriesFromFat, servingSize, protein, fat, carbs);
        this.liquid = false;
        this.solid = false;
        this.nut = false;
    }

    /**
     * Getter for FOOD_CODE
     * @return 
     */
    @Override
    public String getFOOD_CODE() {
        return FOOD_CODE;
    }

    /**
     * Getter for calories
     * @return 
     */
    @Override
    public int getCalories() {
        return food.getCalories();
    }

    /**
     * Setter for calories.
     * @param calories 
     */
    @Override
    public void setCalories(int calories) {
        food.setCalories(calories);
    }

    /**
     * Getter for caloriesFromFat
     * @return 
     */
    @Override
    public int getCaloriesFromFat() {
        return food.getCaloriesFromFat();
    }

    /**
     * Setter for caloriesFromFat
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
     * Setter protein
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
     * Getter for name
     * @return 
     */
    @Override
    public String getName() {
        return food.getName();
    }

    /**
     * Setter for name
     * @param name 
     */
    @Override
    public void setName(String name) {
        food.setName(name);
    }

    /**
     * Getter for description
     * @return 
     */
    @Override
    public String getDescription() {
        return food.getDescription();
    }

    /**
     * Setter for description
     * @param description 
     */
    @Override
    public void setDescription(String description) {
        food.setDescription(description);
    }

    /**
     * Getter for liquid
     * @return
     */
    public boolean isLiquid() {
        return liquid;
    }

    /**
     * Setter for liquid. If Fat is a liquid, than it is not any other type of
     * fat.
     *
     * @param liquid
     */
    public void setLiquid(boolean liquid) {
        if (liquid) {
            this.liquid = liquid;
            this.solid = false;
            this.nut = false;
        } else {
            this.liquid = false;
        }

    }

    /**
     * Getter for solid
     *
     * @return
     */
    public boolean isSolid() {
        return solid;
    }

    /**
     * Setter for solid. If fat is solid, than it is not any other type.
     *
     * @param solid
     */
    public void setSolid(boolean solid) {
        if (solid) {
            this.solid = solid;
            this.liquid = false;
            this.nut = false;
        } else {
            this.solid = false;
        }
    }

    /**
     * Getter for nut
     *
     * @return
     */
    public boolean isNut() {
        return nut;
    }

    /**
     * Setter for nut. If fat is nut, than it is not any other type
     *
     * @param nut
     */
    public void setNut(boolean nut) {
        if (nut) {
            this.nut = nut;
            this.liquid = false;
            this.solid = false;
        } else {
            this.nut = false;
        }
    }
}
