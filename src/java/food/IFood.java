package food;

/**
 * An interface for Food objects.
 * All required methods for all food classes that are created.
 * 
 * @author Paul Trott (ptrott)
 * Date: January 30, 2013
 */
public interface IFood {
    
    //Methods for all food objects to be required to use.
    /**
     * Getter for calories.
     * @return calories 
     */
    public int getCalories();
    
    /**
     * Setter for calories.
     * @param calories 
     */
    public void setCalories(int calories);
    
    /**
     * Getter for caloriesFromFat.
     * @return caloriesFromFat
     */
    public int getCaloriesFromFat();

    /**
     * Setter for caloriesFromFat.
     * @param caloriesFromFat 
     */
    public void setCaloriesFromFat(int caloriesFromFat);

    /**
     * Getter for servingSize.
     * @return servingSize
     */
    public double getServingSize();

    /**
     * Setter for servingSize.
     * @param servingSize 
     */
    public void setServingSize(double servingSize);

    /**
     * Getter for protein.
     * @return protein
     */
    public double getProtein();

    /**
     * Setter for protein.
     * @param protein 
     */
    public void setProtein(double protein);

    /**
     * Getter for fat.
     * @return fat
     */
    public double getFat();

    /**
     * Setter for fat.
     * @param fat 
     */
    public void setFat(double fat);

    /**
     * Getter for carbs
     * @return carbs
     */
    public double getCarbs();

    /**
     * Setter for carbs
     * @param carbs 
     */
    public void setCarbs(double carbs);
    
    /**
     * Getter for food name
     * @param food
     * @return food name
     */
    public String getName();
    
    /**
     * Setter for food name
     * @param name 
     */
    public void setName(String name);
    
    /**
     * Getter for food description
     * @return description
     */
    public String getDescription();
    
    /**
     * Setter for food description
     * @param description 
     */
    public void setDescription(String description);
}
