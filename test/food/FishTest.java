package food;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * jUnit Test for Fish class.
 * @author Paul Trott (ptrott)
 */
public class FishTest {
    
    public FishTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of the no-arg Default constructor, of class Fish.
     */
    @Test
    public void testFish() {
        System.out.println("Default no-arg constructor");
        Meat instance = new Fish();

        //Test name value
        String expResult = "no name";
        String result = instance.getName();
        assertEquals(expResult, result);

        //Test calories value
        int expResultCal = 0;
        int resultCal = instance.getCalories();
        assertEquals(expResultCal, resultCal);

        //Test caloriesFromFat value
        int expResultCalsFromFat = 0;
        int resultCalsFromFat = instance.getCaloriesFromFat();
        assertEquals(expResultCalsFromFat, resultCalsFromFat);

        //Test servingSize value
        double expResultServingSize = 0.0d;
        double resultServingSize = instance.getServingSize();
        assertEquals(expResultServingSize, resultServingSize, 0.0);

        //Test protein value
        double expResultProtein = 0.0d;
        double resultProtein = instance.getProtein();
        assertEquals(expResultProtein, resultProtein, 0.0);

        //Test fat value
        double expResultFat = 0.0d;
        double resultFat = instance.getFat();
        assertEquals(expResultFat, resultFat, 0.0);

        //Test carbs value
        double expResultCarbs = 0.0d;
        double resultCarbs = instance.getCarbs();
        assertEquals(expResultCarbs, resultCarbs, 0.0);

    }

    /**
     * Test of getCalories method, of class Fish.
     */
    @Test
    public void testGetCalories() {
        System.out.println("getCalories");
        Meat instance = new Fish();


        // To test a number with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            int randNum = (int) (100 * (Math.random() * 100));
            instance.setCalories(randNum);
            int expResult = randNum;
            int result = instance.getCalories();
            assertEquals(expResult, result);
        }

    }

    /**
     * Test of setCalories method, of class Fish.
     */
    @Test
    public void testSetCalories() {
        System.out.println("setCalories");
        Meat instance = new Fish();
        //To test a negative entered number.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            int randNum = (int) (-1 * (Math.random() * 1000));
            instance.setCalories(randNum);
            int expResult = 0;
            int result = instance.getCalories();
            assertEquals(expResult, result);
        }

        // To test a number with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            int randNum = (int) (100 * (Math.random() * 100));
            instance.setCalories(randNum);
            int expResult = randNum;
            int result = instance.getCalories();
            assertEquals(expResult, result);
        }

        // To test a number with 5 or more digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            int randNum = (int) (1000 * (Math.random() * (100 - 10) + 10));
            instance.setCalories(randNum);
            int expResult = 0;
            int result = instance.getCalories();
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of getCaloriesFromFat method, of class Fish.
     */
    @Test
    public void testGetCaloriesFromFat() {
        System.out.println("getCaloriesFromFat");
        Meat instance = new Fish();

        // To test a number with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            int randNum = (int) (100 * (Math.random() * 100));
            instance.setCaloriesFromFat(randNum);
            int expResult = randNum;
            int result = instance.getCaloriesFromFat();
            assertEquals(expResult, result);
        }

    }

    /**
     * Test of setCaloriesFromFat method, of class Fish.
     */
    @Test
    public void testSetCaloriesFromFat() {
        System.out.println("setCaloriesFromFat");
        Meat instance = new Fish();
        //To test a negative entered number.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            int randNum = (int) (-1 * (Math.random() * 1000));
            instance.setCaloriesFromFat(randNum);
            int expResult = 0;
            int result = instance.getCaloriesFromFat();
            assertEquals(expResult, result);
        }

        // To test a number with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            int randNum = (int) (100 * (Math.random() * 100));
            instance.setCaloriesFromFat(randNum);
            int expResult = randNum;
            int result = instance.getCaloriesFromFat();
            assertEquals(expResult, result);
        }

        // To test a number with 5 or more digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            int randNum = (int) (1000 * (Math.random() * (100 - 10) + 10));
            instance.setCaloriesFromFat(randNum);
            int expResult = 0;
            int result = instance.getCaloriesFromFat();
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of getServingSize method, of class Fish.
     */
    @Test
    public void testGetServingSize() {
        System.out.println("getServingSize");
        Meat instance = new Fish();

        //To test numbers with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            double randNum = (10 * (Math.random() * 500));
            String strDouble = String.format("%.2f", randNum);
            double expResult = (Double) Double.parseDouble(strDouble);
            instance.setServingSize(expResult);
            double result = instance.getServingSize();
            assertEquals(expResult, result, 0.0);
        }

    }

    /**
     * Test of setServingSize method, of class Fish.
     */
    @Test
    public void testSetServingSize() {
        System.out.println("setServingSize");
        Meat instance = new Fish();
        //To test negative numbers.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            double randNum = (-10 * (Math.random() * 100));
            String strDouble = String.format("%.2f", randNum);
            double testNumber = (Double) Double.parseDouble(strDouble);
            instance.setServingSize(testNumber);
            double expResult = 0.0d;
            double result = instance.getServingSize();
            assertEquals(expResult, result, 0.0);
        }

        //To test numbers with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            double randNum = (10 * (Math.random() * 500));
            String strDouble = String.format("%.2f", randNum);
            double expResult = (Double) Double.parseDouble(strDouble);
            instance.setServingSize(expResult);
            double result = instance.getServingSize();
            assertEquals(expResult, result, 0.0);
        }

        //To test numbers with 5 or more digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            double randNum = (1000 * (Math.random() * (500 - 10) + 10));
            String strDouble = String.format("%.2f", randNum);
            double testNumber = (Double) Double.parseDouble(strDouble);
            instance.setServingSize(testNumber);
            double expResult = 0.0d;
            double result = instance.getServingSize();
            assertEquals(expResult, result, 0.0);
        }
    }

    /**
     * Test of getProtein method, of class Fish.
     */
    @Test
    public void testGetProtein() {
        System.out.println("getProtein");
        Meat instance = new Fish();

        //To test numbers with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            double randNum = (10 * (Math.random() * 500));
            String strDouble = String.format("%.2f", randNum);
            double expResult = (Double) Double.parseDouble(strDouble);
            instance.setProtein(expResult);
            double result = instance.getProtein();
            assertEquals(expResult, result, 0.0);
        }

    }

    /**
     * Test of setProtein method, of class Fish.
     */
    @Test
    public void testSetProtein() {
        System.out.println("setProtein");
        Meat instance = new Fish();
        //To test negative numbers.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            double randNum = (-10 * (Math.random() * 100));
            String strDouble = String.format("%.2f", randNum);
            double testNumber = (Double) Double.parseDouble(strDouble);
            instance.setProtein(testNumber);
            double expResult = 0.0d;
            double result = instance.getProtein();
            assertEquals(expResult, result, 0.0);
        }

        //To test numbers with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            double randNum = (10 * (Math.random() * 500));
            String strDouble = String.format("%.2f", randNum);
            double expResult = (Double) Double.parseDouble(strDouble);
            instance.setProtein(expResult);
            double result = instance.getProtein();
            assertEquals(expResult, result, 0.0);
        }

        //To test numbers with 5 or more digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            double randNum = (1000 * (Math.random() * (500 - 10) + 10));
            String strDouble = String.format("%.2f", randNum);
            double testNumber = (Double) Double.parseDouble(strDouble);
            instance.setProtein(testNumber);
            double expResult = 0.0d;
            double result = instance.getProtein();
            assertEquals(expResult, result, 0.0);
        }
    }

    /**
     * Test of getFat method, of class Fish.
     */
    @Test
    public void testGetFat() {
        System.out.println("getFat");
        Meat instance = new Fish();
        //To test numbers with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            double randNum = (10 * (Math.random() * 500));
            String strDouble = String.format("%.2f", randNum);
            double expResult = (Double) Double.parseDouble(strDouble);
            instance.setFat(expResult);
            double result = instance.getFat();
            assertEquals(expResult, result, 0.0);
        }

    }

    /**
     * Test of setFat method, of class Fish.
     */
    @Test
    public void testSetFat() {
        System.out.println("setFat");
        Meat instance = new Fish();
        //To test negative numbers.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            double randNum = (-10 * (Math.random() * 100));
            String strDouble = String.format("%.2f", randNum);
            double testNumber = (Double) Double.parseDouble(strDouble);
            instance.setFat(testNumber);
            double expResult = 0.0d;
            double result = instance.getFat();
            assertEquals(expResult, result, 0.0);
        }

        //To test numbers with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            double randNum = (10 * (Math.random() * 500));
            String strDouble = String.format("%.2f", randNum);
            double expResult = (Double) Double.parseDouble(strDouble);
            instance.setFat(expResult);
            double result = instance.getFat();
            assertEquals(expResult, result, 0.0);
        }

        //To test numbers with 5 or more digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            double randNum = (1000 * (Math.random() * (500 - 10) + 10));
            String strDouble = String.format("%.2f", randNum);
            double testNumber = (Double) Double.parseDouble(strDouble);
            instance.setFat(testNumber);
            double expResult = 0.0d;
            double result = instance.getFat();
            assertEquals(expResult, result, 0.0);
        }

    }

    /**
     * Test of getCarbs method, of class Fish.
     */
    @Test
    public void testGetCarbs() {
        System.out.println("getCarbs");
        Meat instance = new Fish();

        //To test numbers with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            double randNum = (10 * (Math.random() * 500));
            String strDouble = String.format("%.2f", randNum);
            double expResult = (Double) Double.parseDouble(strDouble);
            instance.setCarbs(expResult);
            double result = instance.getCarbs();
            assertEquals(expResult, result, 0.0);
        }
    }

    /**
     * Test of setCarbs method, of class Fish.
     */
    @Test
    public void testSetCarbs() {
        System.out.println("setCarbs");
        Meat instance = new Fish();
        //To test negative numbers.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            double randNum = (-10 * (Math.random() * 100));
            String strDouble = String.format("%.2f", randNum);
            double testNumber = (Double) Double.parseDouble(strDouble);
            instance.setCarbs(testNumber);
            double expResult = 0.0d;
            double result = instance.getCarbs();
            assertEquals(expResult, result, 0.0);
        }

        //To test numbers with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            double randNum = (10 * (Math.random() * 500));
            String strDouble = String.format("%.2f", randNum);
            double expResult = (Double) Double.parseDouble(strDouble);
            instance.setCarbs(expResult);
            double result = instance.getCarbs();
            assertEquals(expResult, result, 0.0);
        }

        //To test numbers with 5 or more digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for (int i = 0; i < 1000; i++) {
            double randNum = (1000 * (Math.random() * (500 - 10) + 10));
            String strDouble = String.format("%.2f", randNum);
            double testNumber = (Double) Double.parseDouble(strDouble);
            instance.setCarbs(testNumber);
            double expResult = 0.0d;
            double result = instance.getCarbs();
            assertEquals(expResult, result, 0.0);
        }
    }

    /**
     * Test of getName method, of class Fish.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Meat instance = new Fish();
        String expResult = "";

        //Run test 3 times.
        for (int i = 0; i < 3; i++) {
            int randNum = (int) ((Math.random() * (5 - 1)) + 1);
            //set name to a different value depending on the random number.
            switch (randNum) {
                case 1:
                    //Test if name is less then 2 characters.
                    instance.setName("H");
                    expResult = "no name";
                    break;
                case 2:
                    instance.setName("Apple");
                    expResult = "Apple";
                    break;
                case 3:
                    instance.setName("Chicken Wings");
                    expResult = "Chicken Wings";
                    break;
                case 4:
                    instance.setName("Carrot");
                    expResult = "Carrot";
                    break;
                default:
                    instance.setName("Beans");
                    expResult = "Beans";
                    break;
            }
        }

        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Fish.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        Meat instance = new Fish();

        String expResult = "";

        //Run test 6 times.
        for (int i = 0; i < 6; i++) {
            int randNum = (int) ((Math.random() * (5 - 1)) + 1);
            //set name to a different value depending on the random number.
            switch (randNum) {
                case 1:
                    //Test if name is less then 2 characters.
                    instance.setName("H");
                    expResult = "no name";
                    break;
                case 2:
                    instance.setName("Apple");
                    expResult = "Apple";
                    break;
                case 3:
                    instance.setName("Chicken Wings");
                    expResult = "Chicken Wings";
                    break;
                case 4:
                    instance.setName("Carrot");
                    expResult = "Carrot";
                    break;
                default:
                    instance.setName("Beans");
                    expResult = "Beans";
                    break;
            }
        }

        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class Fish.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Meat instance = new Fish();

        //Test the result of a description of less than 20 characters.
        //Should return "no description.
        {
            instance.setDescription("Less then 20 chars");
            String expResult = "no description";
            String result = instance.getDescription();
            assertEquals(expResult, result);
        }

        //Test the result of a description of 20 or more characters.
        {
            instance.setDescription("This is more then 20 characters");
            String expResult = "This is more then 20 characters";
            String result = instance.getDescription();
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of setDescription method, of class Fish.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        Meat instance = new Fish();
        //Test the result of a description of less than 20 characters.
        //Should return "no description.
        {
            instance.setDescription("Less then 20 chars");
            String expResult = "no description";
            String result = instance.getDescription();
            assertEquals(expResult, result);
        }

        //Test the result of a description of 20 or more characters.
        {
            instance.setDescription("This is more then 20 characters");
            String expResult = "This is more then 20 characters";
            String result = instance.getDescription();
            assertEquals(expResult, result);
        }
    }
    
    /**
     * Test of isSaltwater method, of class Fish.
     */
    @Test
    public void testIsSaltwater() {
        System.out.println("isSaltwater");
        //Test the isSaltwater method 20 times to be sure method is returning a 
        //consistantly correct value.
        {
            boolean bool;
            for (int i = 0; i < 20; i++) {
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }

                Meat instance = new Fish();
                //Cast instance to a fish.
                Fish instance2 = (Fish) instance;
                instance2.setSaltwater(bool);
                boolean expResult = bool;
                boolean result = instance2.isSaltwater();
                assertEquals(expResult, result);
            }
        }
    }

    /**
     * Test of setSaltwater method, of class Fish.
     * If fish is a saltwater species it is not in any other group.
     */
    @Test
    public void testSetSaltwater() {
        System.out.println("setSaltwater");
        //Test the setSaltwater method 20 times to be sure method is returning a 
        //consistantly correct value.
        {
            boolean bool;
            for (int i = 0; i < 20; i++) {
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }

                Meat instance = new Fish();
                //Cast instance to a Fish.
                Fish instance2 = (Fish) instance;
                instance2.setSaltwater(bool);
                boolean expResult = bool;
                boolean result = instance2.isSaltwater();
                assertEquals(expResult, result);
            }
        }
        //Test that isSaltwater is opposite of isFreshwater.
        //Testing 5 times to be sure method is returning a 
        //consistantly correct false value.
        {
            boolean bool;
            for (int i = 0; i < 5; i++) {
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }
                
                Fish instance = new Fish();
                instance.setSaltwater(bool);
                boolean expResult;
                if(instance.isSaltwater()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isFreshwater();
                assertEquals(expResult, result);
            }
    }
        //Test that isSaltwater is opposite of isFreshAndSaltwater.
        //Testing 5 times to be sure method is returning a 
        //consistantly correct false value.
        {
            boolean bool;
            for (int i = 0; i < 5; i++) {
                //random number is always 1 or 2.
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }
                
                Fish instance = new Fish();
                instance.setSaltwater(bool);
                boolean expResult;
                if(instance.isSaltwater()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isFreshAndSaltwater();
                assertEquals(expResult, result);
            }
        }
    }
    
    /**
     * Test of isFreshwater method, of class Fish.
     */
    @Test
    public void testIsFreshwater() {
        System.out.println("isFreshwater");
        //Test the isFreshwater method 20 times to be sure method is returning a 
        //consistantly correct value.
        {
            boolean bool;
            for (int i = 0; i < 20; i++) {
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }

                Meat instance = new Fish();
                //Cast instance to a fish.
                Fish instance2 = (Fish) instance;
                instance2.setFreshwater(bool);
                boolean expResult = bool;
                boolean result = instance2.isFreshwater();
                assertEquals(expResult, result);
            }
        }
    }

    /**
     * Test of setFreshwater method, of class Fish.
     * If fish is a freshwater species it is not in any other group.
     */
    @Test
    public void testSetFreshwater() {
        System.out.println("setFreshwater");
        //Test the setFreshwater method 20 times to be sure method is returning a 
        //consistantly correct value.
        {
            boolean bool;
            for (int i = 0; i < 20; i++) {
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }

                Meat instance = new Fish();
                //Cast instance to a Fish.
                Fish instance2 = (Fish) instance;
                instance2.setFreshwater(bool);
                boolean expResult = bool;
                boolean result = instance2.isFreshwater();
                assertEquals(expResult, result);
            }
        }
        //Test that isFreshwater is opposite of isSaltwater.
        //Testing 5 times to be sure method is returning a 
        //consistantly correct false value.
        {
            boolean bool;
            for (int i = 0; i < 5; i++) {
                //random number, either 2 or 1
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }
                
                Fish instance = new Fish();
                instance.setFreshwater(bool);
                boolean expResult;
                if(instance.isFreshwater()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isSaltwater();
                assertEquals(expResult, result);
            }
    }
        //Test that isFreshwater is opposite of isFreshAndSaltwater.
        //Testing 5 times to be sure method is returning a 
        //consistantly correct false value.
        {
            boolean bool;
            for (int i = 0; i < 5; i++) {
                //random number is 1 or 2.
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }
                
                Fish instance = new Fish();
                instance.setFreshwater(bool);
                boolean expResult;
                if(instance.isFreshwater()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isFreshAndSaltwater();
                assertEquals(expResult, result);
            }
        }
    }
    
    /**
     * Test of isFreshAndSaltwater method, of class Fish.
     */
    @Test
    public void testIsFreshAndSaltwater() {
        System.out.println("isFreshAndSaltwater");
        //Test the isFreshAndSaltwater method 20 times to be sure method is returning a 
        //consistantly correct value.
        {
            boolean bool;
            for (int i = 0; i < 20; i++) {
                //random number is either 1 or 2.
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }

                Meat instance = new Fish();
                //Cast instance to a fish.
                Fish instance2 = (Fish) instance;
                instance2.setFreshAndSaltwater(bool);
                boolean expResult = bool;
                boolean result = instance2.isFreshAndSaltwater();
                assertEquals(expResult, result);
            }
        }
    }

    /**
     * Test of setFreshAndSaltwater method, of class Fish.
     * If fish is a fresh and saltwater species it is not in any other group.
     */
    @Test
    public void testSetFreshAndSaltwater() {
        System.out.println("setFreshAndSaltwater");
        //Test the setFreshAndSaltwater method 20 times to be sure method is returning a 
        //consistantly correct value.
        {
            boolean bool;
            for (int i = 0; i < 20; i++) {
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }

                Meat instance = new Fish();
                //Cast instance to a Fish.
                Fish instance2 = (Fish) instance;
                instance2.setFreshAndSaltwater(bool);
                boolean expResult = bool;
                boolean result = instance2.isFreshAndSaltwater();
                assertEquals(expResult, result);
            }
        }
        //Test that isFreshAndSaltwater is opposite of isSaltwater.
        //Testing 5 times to be sure method is returning a 
        //consistantly correct false value.
        {
            boolean bool;
            for (int i = 0; i < 5; i++) {
                //random number, either 2 or 1
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }
                
                Fish instance = new Fish();
                instance.setFreshAndSaltwater(bool);
                boolean expResult;
                if(instance.isFreshAndSaltwater()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isSaltwater();
                assertEquals(expResult, result);
            }
    }
        //Test that isFreshAndSaltwater is opposite of isFreshwater.
        //Testing 5 times to be sure method is returning a 
        //consistantly correct false value.
        {
            boolean bool;
            for (int i = 0; i < 5; i++) {
                //random number is 1 or 2.
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }
                
                Fish instance = new Fish();
                instance.setFreshAndSaltwater(bool);
                boolean expResult;
                if(instance.isFreshAndSaltwater()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isFreshwater();
                assertEquals(expResult, result);
            }
        }
    }

    /**
     * Test of getFOOD_CODE method, of class Fish.
     */
    @Test
    public void testGetFOOD_CODE() {
        System.out.println("getFOOD_CODE");
        Fish instance = new Fish();
        String expResult = "0005";
        String result = instance.getFOOD_CODE();
        assertEquals(expResult, result);
    }
}
