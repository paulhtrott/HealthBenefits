package food;

/**
 * 
 * This abstract class for all meat specific data.
 * Implements from the Food interface class.
 * All methods are abstract having to be implemented by inheriting classes.
 * 
 * @author Paul Trott (ptrott)
 * Date: January 26, 2013
 */

public abstract class Meat implements IFood {
    
    /**
     * Setter for name.
     * @param name 
     */
    @Override
    public abstract void setName(String name);
    
    /**
     * Getter for name.
     * @return name
     */
    @Override
    public abstract String getName();

    /**
     * Getter for calories
     * @return 
     */
    @Override
    public abstract int getCalories();

    /**
     * Setter for calories
     * @param calories 
     */
    @Override
    public abstract void setCalories(int calories);
            
    /**
     * Getter for caloriesFromFat
     * @return  caloriesFromFat
     */
    @Override
    public abstract int getCaloriesFromFat();

    /**
     * Setter for caloriesFromFat
     * @param caloriesFromFat 
     */
    @Override
    public abstract void setCaloriesFromFat(int caloriesFromFat);

    /**
     * Getter for servingSize.
     * @return servingSize
     */
    @Override
    public abstract double getServingSize();

    /**
     * Setter for servingSize
     * @param servingSize 
     */
    @Override
    public abstract void setServingSize(double servingSize);

    /**
     * Getter for protein
     * @return protein
     */
    @Override
    public abstract double getProtein();

    /**
     * Setter for protein
     * @param protein 
     */
    @Override
    public abstract void setProtein(double protein);

    /**
     * Getter for fat
     * @return fat
     */
    @Override
    public abstract double getFat();

    /**
     * Setter for fat
     * @param fat 
     */
    @Override
    public abstract void setFat(double fat);

    /**
     * Getter for carbs
     * @return carbs
     */
    @Override
    public abstract double getCarbs();

    /**
     * Setter for carbs
     * @param carbs 
     */
    @Override
    public abstract void setCarbs(double carbs);

    /**
     * Getter for description
     * @return description
     */
    @Override
    public abstract String getDescription();

    /**
     * Setter for description
     * @param description 
     */
    @Override
    public abstract void setDescription(String description);
    
        
}
