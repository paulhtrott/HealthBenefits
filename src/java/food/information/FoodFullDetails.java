package food.information;

import java.text.DecimalFormat;

/**
 * FoodFullDetails bean will process all information stored in the Food Database
 * on a particular food item. FOODNAME, DESCRIPTION, CALORIES, CALORIESFROMFAT,
 * SERVINGSIZE, PROTEIN, FAT, CARBS, SPECIFICFOODTYPE, MEASUREMENT (serving size
 * measurement - grams, ounces, cups, tablespoons)
 *
 * @author Paul Trott (ptrott) Date: March 1, 2013
 */
public class FoodFullDetails {
    //Private fields to hold food information
    private String foodName;
    private String description;
    private int calories;
    private int caloriesFromFat;
    private double servingSize;
    private double protein;
    private double fat;
    private double carbs;
    private String specificFoodType;
    private String measurement;

    /**
     * 
     * @param foodName - String of food name.
     * @param description - String of food description.
     * @param calories - integer of food calories.
     * @param caloriesFromFat - integer of food calories from fat.
     * @param servingSize - double of food serving size.
     * @param protein - double of food protein.
     * @param fat - double of food fat.
     * @param carbs - double of food carbohydrates.
     * @param specificFoodType - String for specific food types.
     * @param measurement - String for measurement of serving size.
     */
    public FoodFullDetails(String foodName, String description, int calories,
            int caloriesFromFat, double servingSize, double protein,
            double fat, double carbs, String specificFoodType, String measurement) {

        this.foodName = foodName;
        this.description = description;
        this.calories = calories;
        this.caloriesFromFat = caloriesFromFat;
        setServingSize(servingSize);
        setProtein(protein);
        setFat(fat);
        setCarbs(carbs);
        this.specificFoodType = specificFoodType;
        setMeasurement(measurement);
        
    }

    /**
     * Getter for foodName
     * @return foodName - name of a food
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * Setter for foodName
     * @param foodName - name of a food
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * Getter for description
     * @return description - description of a food
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for description
     * @param description - description of a food.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for calories
     * @return calories - calories of a food.
     */
    public int getCalories() {
        return calories;
    }

    /**
     * Setter for calories
     * @param calories - calories of a food.
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }

    /**
     * Getter for caloriesFromFat
     * @return caloriesFromFat - Calories from Fat of a food.
     */
    public int getCaloriesFromFat() {
        return caloriesFromFat;
    }

    /**
     * Setter for caloriesFromFat
     * @param caloriesFromFat - Calories from fat of a food
     */
    public void setCaloriesFromFat(int caloriesFromFat) {
        this.caloriesFromFat = caloriesFromFat;
    }

    /**
     * Getter for servingSize
     * @return servingSize - serving size of a food
     */
    public double getServingSize() {
        return servingSize;
    }

    /**
     * Setter for servingSize
     * Sets servingSize to a formatter value with two decimal places.
     * @param servingSize - serving size of a food
     */
    public final void setServingSize(double servingSize) {
        //Set servingSize to a formated double with two decial places.
        DecimalFormat df = new DecimalFormat("#.00");
        this.servingSize = Double.parseDouble(df.format(servingSize));
    }

    /**
     * Getter for protein
     * @return protein - protein of a food
     */
    public double getProtein() {
        return protein;
    }

    /**
     * Setter for protein
     * Sets protein to a double value with two decimal places.
     * @param protein - protein of a food.
     */
    public final void setProtein(double protein) {
        //Set protein to a formated double with two decimal places.
        DecimalFormat df = new DecimalFormat("#.00");
        this.protein = Double.parseDouble(df.format(protein));
    }

    /**
     * Getter for fat
     * @return fat - fat of a food.
     */
    public double getFat() {
        return fat;
    }

    /**
     * Setter for fat.
     * Sets fat to a decimal value formatted to two decimal places.
     * @param fat - fat of a food.
     */
    public final void setFat(double fat) {
        //Set fat to a formattr double with two decimal places.
        DecimalFormat df = new DecimalFormat("#.00");
        this.fat = Double.parseDouble(df.format(fat));
    }

    /**
     * Getter for carbs
     * @return carbs - carbs of a food.
     */
    public double getCarbs() {
        return carbs;
    }

    /**
     * Setter for carbs.
     * Sets carbs to a double value formatted to two decimal places.
     * @param carbs 
     */
    public final void setCarbs(double carbs) {
        //Set carbs to a formatted double with two decimal places.
        DecimalFormat df = new DecimalFormat("#.00");
        this.carbs = Double.parseDouble(df.format(carbs));
    }

    /**
     * Getter for specificFoodType
     * @return specificFoodType
     */
    public String getSpecificFoodType() {
        return specificFoodType;
    }

    /**
     * Setter for specificFoodType
     * @param specificFoodType 
     */
    public void setSpecificFoodType(String specificFoodType) {
        this.specificFoodType = specificFoodType;
    }

    /**
     * Getter for measurement
     * @return measurement - a string as cups, tablespoons, ounces, grams.
     */
    public String getMeasurement() {
        return measurement;
    }

    /**
     * Setter for measurement.
     * Sets measurement based on serving size, for better wording, removes 's'
     * when necessary.
     * @param measurement  - a string as cups, tablespoons, ounces and grams
     * 
     */
    public final void setMeasurement(String measurement) {
        //Set measurement based on serving size, for better wording.
        //Remove 's' when necessary.
        if(servingSize == 1 && measurement.compareTo("cups") == 0){
            this.measurement = "cup";
        } else if(servingSize == 1 && measurement.compareTo("ounces") == 0){
            this.measurement = "ounce";
        }else if(servingSize == 1 && measurement.compareTo("grams") == 0){
            this.measurement = "gram";
        } else if(servingSize == 1 && measurement.compareTo("tablespoons") == 0){
            this.measurement = "tablespoon";
        }
        else {
            this.measurement = measurement;
        }
    }
    
}
