package food;



/**
 * This class will hold data for a super class of Food.
 * Class holds all common information for all food types.
 *  
 * @author Paul Trott (ptrott)
 * Date: January 23, 2013
 * Date Modified: January 25, 2013
 */

public class Food implements IFood{
    
    //Instance variables.
    private String name;
    private int calories;
    private int caloriesFromFat;
    private double servingSize;
    private double protein;
    private double fat;
    private double carbs;
    
    /**
     * Default no-arg constructor for Food Super Class.
     */
    public Food(){
        name = "noname";
        calories = 0;
        caloriesFromFat = 0;
        servingSize = 0.0d;
        protein = 0.0d;
        fat = 0.0d;
        carbs = 0.0d;
    }
    
    /**
     * Overloaded constructor for Food Super Class.
     * Name is set to "noname" - will be set in by Inheriting Classes.
     * @param calories
     * @param caloriesFromFat 
     * @param servingSize
     * @param protein
     * @param fat
     * @param carbs 
     */
    public Food(String name, int calories, int caloriesFromFat, double servingSize, 
            double protein, double fat, double carbs){
        this.name = name;
        this.setCalories(calories);
        this.setCaloriesFromFat(caloriesFromFat);
        this.setServingSize(servingSize);
        this.setProtein(protein);
        this.setFat(fat);
        this.setCarbs(carbs);
        
    }

    /**
     * Getter for calories.
     * @return calories
     */
    @Override
    public int getCalories() {
        return calories;
    }

    /**
     * Setter for calories.
     * @param calories 
     */
    @Override
    public final void setCalories(int calories) {
        String str = "" + calories ;// form string for compare..
        //if calories is less than zero.
        if (calories < 0) {
            this.calories = 0;
        } else {
            if (str.length() <= 4) {
                // check that there are no more than four integers in a row.
                this.calories = calories;
            } else {
                this.calories = 0;
            }
        }
        
    }
    
    /**
     * Getter for caloriesFromFat.
     * @return caloriesFromFat
     */
    @Override
    public int getCaloriesFromFat() {
        return caloriesFromFat;
    }

    /**
     * Setter for caloriesFromFat.
     * @param caloriesFromFat 
     */
    @Override
    public final void setCaloriesFromFat(int caloriesFromFat) {
        String str = "" + caloriesFromFat;// form string for compare..
        //if caloriesFromFat is less than zero.
        if (caloriesFromFat < 0) {
            this.caloriesFromFat = 0;
        } else {
            if (str.length() <= 4) {
                // check that there are no more than four integers in a row.
                this.caloriesFromFat = caloriesFromFat;
            } else {
                this.caloriesFromFat = 0;
            }
        }
        
    }

    /**
     * Getter for servingSize.
     * @return servingSize
     */
    @Override
    public double getServingSize() {
        return servingSize;
    }

    /**
     * Setter for servingSize.
     * @param servingSize 
     */
    @Override
    public final void setServingSize(double servingSize) {
        //if serving size is less than zero.
        if (servingSize < 0) {
            this.servingSize = 0.0d;
        } else {
            String str = "" + servingSize;// form string for compare..
            // check that servingSize is less than or equal to 4 integers long.
            String strArray[] = str.split("\\."); // split on dot.
            // element 0 is the integer numbers.
            // element 1 is the decimal places.
            if (strArray[0].length() <= 4) {
                // check that there are no more than two.
                this.servingSize = servingSize;
            } else {
                this.servingSize = 0.0d;
            }
        }
    }

    /**
     * Getter for protein.
     * @return protein
     */
    @Override
    public double getProtein() {
        return protein;
    }

    /**
     * Setter for protein.
     * @param protein 
     */
    @Override
    public final void setProtein(double protein) {
        //if protein is less than zero.
        if (protein < 0) {
            this.protein = 0.0d;
        } else {
            String str = "" + protein;// form string for compare..
            // check that protein is less than or equal to 4 integers long.
            String strArray[] = str.split("\\."); // split on dot.
            // element 0 is the integer numbers.
            // element 1 is the decimal places.
            if (strArray[0].length() <= 4) {
                // check that there are no more than two.
                this.protein = protein;
            } else {
                this.protein = 0.0d;
            }
        }
    }

    /**
     * Getter for fat.
     * @return fat
     */
    @Override
    public double getFat() {
        return fat;
    }

    /**
     * Setter for fat.
     * @param fat 
     */
    @Override
    public final void setFat(double fat) {
        //if fat is less than zero.
        if (fat < 0) {
            this.fat = 0.0d;
        } else {
            String str = "" + fat;// form string for compare..
            // check that fat is less than or equal to 4 integers long.
            String strArray[] = str.split("\\."); // split on dot.
            // element 0 is the integer numbers.
            // element 1 is the decimal places.
            if (strArray[0].length() <= 4) {
                // check that there are no more than two.
                this.fat = fat;
            } else {
                this.fat = 0.0d;
            }
        }
    }

    /**
     * Getter for carbs
     * @return carbs
     */
    @Override
    public double getCarbs() {
        return carbs;
    }

    /**
     * Setter for carbs
     * @param carbs 
     */
    @Override
    public final void setCarbs(double carbs) {
        //if carbs is less than zero.
        if (carbs < 0) {
            this.carbs = 0.0d;
        } else {
            String str = "" + carbs;// form string for compare..
            // check that carbs is less than or equal to 4 integers long.
            String strArray[] = str.split("\\."); // split on dot.
            // element 0 is the integer numbers.
            // element 1 is the decimal places.
            if (strArray[0].length() <= 4) {
                // check that there are no more than two.
                this.carbs = carbs;
            } else {
                this.carbs = 0.0d;
            }
        }
        
    }
    
    /**
     * Getter for food name
     * @param food
     * @return food name
     */
    @Override
    public String getName(){
        return name;
    }
    
    /**
     * Setter for food name
     * @param name 
     */
    @Override
    public void setName(String name){
        this.name = name;
    }
    
    
}
