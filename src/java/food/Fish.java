package food;

/**
 *
 * This class will hold all Fish specific data. Extends from the Meat abstract
 * class.
 *
 * @author Paul Trott (ptrott) Date: January 26, 2013
 *
 */
public class Fish extends Meat {

    //Instance variable
    private Food food;
    private boolean saltwater;
    private boolean freshwater;
    private boolean freshAndSaltwater;

    /**
     * no-arg Default constructor.
     */
    public Fish() {
        //Calls food default constructor.
        food = new Food();
        saltwater = false;
        freshwater = false;
        freshAndSaltwater = false;
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
    public Fish(String name, String description, int calories, int caloriesFromFat, double servingSize, double protein, double fat,
            double carbs) {
        //call food class overloaded constructor.
        food = new Food(name, description, calories, caloriesFromFat, servingSize, protein, fat, carbs);
        saltwater = false;
        freshwater = false;
        freshAndSaltwater = false;
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
     * Getter for saltwater
     *
     * @return saltwater
     */
    public boolean isSaltwater() {
        return saltwater;
    }

    /**
     * Setter for saltwater
     *
     * @param saltwater
     */
    public void setSaltwater(boolean saltwater) {
        if (saltwater) {
            this.saltwater = saltwater;
            this.freshwater = false;
            this.freshAndSaltwater = false;
        } else {
            this.saltwater = false;
        }
    }

    /**
     * Getter for freshwater
     *
     * @return freshwater
     */
    public boolean isFreshwater() {
        return freshwater;
    }

    /**
     * Setter for freshwater
     *
     * @param freshwater
     */
    public void setFreshwater(boolean freshwater) {
        if (freshwater) {
            this.freshwater = freshwater;
            this.saltwater = false;
            this.freshAndSaltwater = false;
        } else {
            this.freshwater = false;
        }
    }

    /**
     * Getter for freshAndSaltwater
     *
     * @return freshAndSaltwater
     */
    public boolean isFreshAndSaltwater() {
        return freshAndSaltwater;
    }

    /**
     * Setter for freshAndSaltwater
     *
     * @param freshAndSaltwater
     */
    public void setFreshAndSaltwater(boolean freshAndSaltwater) {
        if (freshAndSaltwater) {
            this.freshAndSaltwater = freshAndSaltwater;
            this.freshwater = false;
            this.saltwater = false;
        } else {
            this.freshAndSaltwater = false;
        }
    }
}
