package food;

/**
 * A class definition for a Herb Object. This Herb Class is in the food
 * package. It contains reference variables for FOOD_CODE and instantiates a 
 * Food object to hold/process all common food data. The class includes a 
 * default no-arg constructor and an overloaded constructor.
 * Implemented methods are Overridden.
 * Implements from the IFood interface class.
 * @author Paul Trott (ptrott)
 * Date: Feb. 5, 2012
 */
public class Herb implements IFood{
    //Final variable to hold Food Code.
    private final String FOOD_CODE = "0015";
    //Instance variables.
    private final Food food;
    
    /**
     * Default no-arg constructor.
     */
    public Herb(){
        //Call food no-arg default constructor.
        food = new Food();
    }
    
    /**
     * Overloaded constructor.
     * @param name
     * @param description
     * @param calories
     * @param caloriesFromFat
     * @param servingSize
     * @param protein
     * @param fat
     * @param carbs 
     */
    public Herb(String name, String description, int calories, 
            int caloriesFromFat, double servingSize, double protein, double fat,
            double carbs){
        //Call Food overloaded constructor.
        food = new Food(name, description, calories, caloriesFromFat, 
                servingSize, protein, fat, carbs);
    }
    
    /**
     * Getter for FOOD_CODE.
     * @return 
     */
    @Override
    public String getFOOD_CODE() {
        return this.FOOD_CODE;
    }

    /**
     * Getter for calories.
     * @return 
     */
    @Override
    public int getCalories() {
       return food.getCalories();
    }

    /**
     * Setter for calories
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
     * Getter for carbs.
     * @return 
     */
    @Override
    public double getCarbs() {
        return food.getCarbs();
    }

    /**
     * Setter for carbs.
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
    
    
    
}
