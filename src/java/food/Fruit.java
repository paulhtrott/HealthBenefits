package food;

import encrypt.BCrypt;

/**
 * This class will hold all fruit specific data. Extends from the Food super
 * class.
 *
 * @author Paul Trott (ptrott) Date: January 23, 2013
 */
public class Fruit extends Food {

    //instance variables
    private String name;

    /**
     * Default no-arg constructor for Fruit class.
     */
    public Fruit() {
        //call super class no-arg constructor.
        super();
        this.name = "noname";
    }

    /**
     * Overloaded constructor for Fruit class.
     *
     * @param name
     * @param calories
     * @param caloriesFromFat
     * @param servingSize
     * @param protein
     * @param fat
     * @param carbs
     * @param sweet
     */
    public Fruit(String name, int calories, int caloriesFromFat, double servingSize, double protein, double fat,
            double carbs) {
        //call super class overloaded constructor.
        super(calories, caloriesFromFat, servingSize, protein, fat, carbs);
        this.name = name;
    }

    /**
     * Getter for name.
     *
     * @return name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     *
     * @param name
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    /*
    public static void main(String[] args) {
        //Test for fruit class.
        Food apple = new Fruit("Apple", 235, 112, 1.5, 13.4, 12.54, 23.22);

        System.out.println("Name: " + apple.getName() + "\nCalories: "
                + apple.getCalories() + "\nCalorie from Fat: " + apple.getCaloriesFromFat()
                + "\nServing Size: " + apple.getServingSize()
                + "\nProtein: " + apple.getProtein()
                + "\nFat: " + apple.getFat()
                + "\nCarbs: " + apple.getCarbs() + "\n");

* //ECRYPTION TEST
        String pw = "paul";
        String pw_hash = BCrypt.hashpw(pw, BCrypt.gensalt(15));

        System.out.println(pw_hash);

        if (BCrypt.checkpw("paul", pw_hash)) {
            System.out.println("It matches!");
        } else {
            System.out.println("It does not match!");
        }


    }*/
}
