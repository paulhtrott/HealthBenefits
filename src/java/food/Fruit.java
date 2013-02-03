package food;

/**
 * This class will hold all fruit specific data.
 * Implements the Food Interface class.
 *
 * @author Paul Trott (ptrott) Date: January 23, 2013 Date Modified: January 30,
 * 2012 (Changed to implement Interface)
 */
public class Fruit implements IFood {
    
    //FINAL instance variable for Fruit code.
    private final String FOOD_CODE = "0001";

    //instance variables
    private boolean sweet;
    private boolean sour;
    //Instantiate a food object.
    private final Food food;

    /**
     * Default no-arg constructor for Fruit class.
     */
    public Fruit() {
        //call super class no-arg constructor.
        food = new Food();
        this.sweet = false;
        this.sour = false;
    }

    /**
     * Overloaded constructor for Fruit class.
     *
     * @param name
     * @param description
     * @param calories
     * @param caloriesFromFat
     * @param servingSize
     * @param protein
     * @param fat
     * @param carbs
     * @param sweet
     */
    public Fruit(String name, String description, int calories, int caloriesFromFat, double servingSize, double protein, double fat,
            double carbs, boolean sweet) {
        //call Food overloaded constructor.
        food = new Food(name, description, calories, caloriesFromFat, servingSize, protein, fat, carbs);

        if (sweet == true) {
            this.sweet = sweet;
            this.sour = false;
        } else {
            this.sour = true;
            this.sweet = false;
        }

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
     * Getter for name.
     *
     * @return name
     */
    @Override
    public String getName() {
        return food.getName();
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
     * Getter for calories
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
        return food.getServingSize();
    }

    /**
     * Setter for protein
     *
     * @param protein
     */
    @Override
    public void setProtein(double protein) {
        food.setServingSize(protein);
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
     * Getter for description
     * @return description
     */
    @Override
    public String getDescription(){
        return food.getDescription();
    }
    
    /**
     * Setter for description
     * @param description 
     */
    @Override
    public void setDescription(String description){
           food.setDescription(description);
    }

    /**
     * Getter for sweet
     *
     * @return
     */
    public boolean isSweet() {
        return this.sweet;
    }

    /**
     * Setter for sweet
     *
     * @param bool
     */
    public void setSweet(boolean bool) {
        if (bool) {
            this.sweet = true;
            this.sour = false;
        } else {
            this.sweet = false;
            this.sour = true;
        }
    }

    /**
     * Getter for sour.
     *
     * @return sour
     */
    public boolean isSour() {
            return sour;
    }

    /**
     * Setter for sour.
     *
     * @param sour
     */
    public void setSour(boolean sour) {
        if (sour) {
            this.sour = sour;
            this.sweet = false;
        } else {
            this.sour = false;
            this.sweet = true;
        }
    }
    
    
    /*
     public static void main(String[] args) {
     //Test for fruit class.
     IFood apple = new Fruit("Apple", "Happy Birthday to me! Apple works.", 235, 112, 1.5, 13.4, 12.54, 23.22, false);

     Fruit apple2 = (Fruit) apple;
     
//     String happy = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4("\"Happy Birthday\" \"&\" \"Merry Christma's\"");
//     System.out.println(happy);
     
     System.out.println("Name: " + apple2.getName() + "\nDescription: " + apple2.getDescription()
             + "\nCalories: "
     + apple2.getCalories() + "\nCalorie from Fat: " + apple2.getCaloriesFromFat()
     + "\nServing Size: " + apple2.getServingSize()
     + "\nProtein: " + apple2.getProtein()
     + "\nFat: " + apple2.getFat()
     + "\nCarbs: " + apple2.getCarbs() + "\nSweet: " + apple2.isSweet() + "\nSour: " + apple2.isSour() );

//     //ECRYPTION TEST..................
//     String pw = "paul";
//     String pw_hash = BCrypt.hashpw(pw, BCrypt.gensalt(15));
//
//     System.out.println(pw_hash);
//
//     if (BCrypt.checkpw("paul", pw_hash)) {
//     System.out.println("It matches!");
//     } else {
//     System.out.println("It does not match!");
//     }


     }*/
}
