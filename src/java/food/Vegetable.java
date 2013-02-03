package food;

/**
 * This class will hold all vegetable specific data. Implements the IFood
 * interface class.
 *
 * @author Paul Trott(ptrott) Date: January 26, 2013
 */
public class Vegetable implements IFood {

    //Final variable to hold Vegetable code.
    private final String FOOD_CODE = "0002";
    
    //Instance variables
    private boolean greens;
    private boolean stalk;
    private boolean tuber;
    private boolean root;
    private boolean mushroom;
    //Instantiate a food object.
    private final Food food;

    /**
     * Default no-arg constructor.
     */
    public Vegetable() {
        //Call food default constructor.
        food = new Food();
        this.greens = false;
        this.stalk = false;
        this.tuber = false;
        this.root = false;
        this.mushroom = false;
    }

    /**
     * Overloaded Constructor for a Vegetable
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
    public Vegetable(String name, String description, int calories, int caloriesFromFat, double servingSize,
            double protein, double fat, double carbs) {

        //Call food default constructor.
        food = new Food(name, description, calories, caloriesFromFat,
                servingSize, protein, fat, carbs);
        this.greens = false;
        this.stalk = false;
        this.tuber = false;
        this.root = false;
        this.mushroom = false;

    }
    
    /**
     * Getter for FOOD_CODE
     * @return FOOD_CODE
     */
    @Override
    public String getFOOD_CODE(){
        return FOOD_CODE;
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
     * Getter for name
     *
     * @return name
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
     * Getter for greens
     *
     * @return greens
     */
    public boolean isGreens() {
        return greens;
    }

    /**
     * Setter for greens If vegetables is a green it is not any other type.
     *
     * @param greens
     */
    public void setGreens(boolean greens) {
        if (greens) {
            this.greens = greens;
            this.mushroom = false;
            this.root = false;
            this.stalk = false;
            this.tuber = false;
        } else {
            this.greens = false;
        }
    }

    /**
     * Getter for stalk.
     *
     * @return stalk
     */
    public boolean isStalk() {
        return stalk;
    }

    /**
     * Setter for stalk. If vegetable is a stalk it is not any other type.
     *
     * @param stalk
     */
    public void setStalk(boolean stalk) {
        if (stalk) {
            this.stalk = stalk;
            this.greens = false;
            this.mushroom = false;
            this.root = false;
            this.tuber = false;
        } else {
            this.stalk = false;
        }
    }

    /**
     * Getter for tuber.
     *
     * @return tuber
     */
    public boolean isTuber() {
        return tuber;
    }

    /**
     * Setter for tuber. If vegetable is a tuber it is not any other type.
     *
     * @param tuber
     */
    public void setTuber(boolean tuber) {
        if (tuber) {
            this.tuber = tuber;
            this.greens = false;
            this.mushroom = false;
            this.root = false;
            this.stalk = false;
        } else {
            this.tuber = false;
        }
    }

    /**
     * Getter for root.
     *
     * @return root
     */
    public boolean isRoot() {
        return root;
    }

    /**
     * Setter for root If vegetable is a root it is not any other type.
     *
     * @param root
     */
    public void setRoot(boolean root) {
        if (root) {
            this.root = root;
            this.greens = false;
            this.mushroom = false;
            this.stalk = false;
            this.tuber = false;
        } else {
            this.root = false;
        }
    }

    /**
     * Getter for mushroom.
     *
     * @return mushroom
     */
    public boolean isMushroom() {
        return mushroom;
    }

    /**
     * Setter for mushroom. If vegetable is a mushroom it is not any other type.
     *
     * @param mushroom
     */
    public void setMushroom(boolean mushroom) {
        if (mushroom) {
            this.mushroom = mushroom;
            this.greens = false;
            this.root = false;
            this.stalk = false;
            this.tuber = false;
        } else {
            this.mushroom = false;
        }

    }
}
