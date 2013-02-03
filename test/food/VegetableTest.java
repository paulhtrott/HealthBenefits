package food;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * jUnit Test of the Vegetable class.
 * @author Paul Trott (ptrott)
 * Date: January 31, 2013
 */
public class VegetableTest {
    
    public VegetableTest() {
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
     * Test of the no-arg Default constructor, of class Vegetable.
     */
    @Test
    public void testVegetable() {
        System.out.println("Default no-arg constructor");
        Vegetable instance = new Vegetable();

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
     * Test of getCalories method, of class Vegetable.
     */
    @Test
    public void testGetCalories() {
        System.out.println("getCalories");
        Vegetable instance = new Vegetable();


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
     * Test of setCalories method, of class Vegetable.
     */
    @Test
    public void testSetCalories() {
        System.out.println("setCalories");
        Vegetable instance = new Vegetable();
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
     * Test of getCaloriesFromFat method, of class Vegetable.
     */
    @Test
    public void testGetCaloriesFromFat() {
        System.out.println("getCaloriesFromFat");
        Vegetable instance = new Vegetable();

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
     * Test of setCaloriesFromFat method, of class Vegetable.
     */
    @Test
    public void testSetCaloriesFromFat() {
        System.out.println("setCaloriesFromFat");
        Vegetable instance = new Vegetable();
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
     * Test of getServingSize method, of class Vegetable.
     */
    @Test
    public void testGetServingSize() {
        System.out.println("getServingSize");
        Vegetable instance = new Vegetable();

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
     * Test of setServingSize method, of class Vegetable.
     */
    @Test
    public void testSetServingSize() {
        System.out.println("setServingSize");
        Vegetable instance = new Vegetable();
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
     * Test of getProtein method, of class Vegetable.
     */
    @Test
    public void testGetProtein() {
        System.out.println("getProtein");
        Vegetable instance = new Vegetable();

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
     * Test of setProtein method, of class Vegetable.
     */
    @Test
    public void testSetProtein() {
        System.out.println("setProtein");
        Vegetable instance = new Vegetable();
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
     * Test of getFat method, of class Vegetable.
     */
    @Test
    public void testGetFat() {
        System.out.println("getFat");
        Vegetable instance = new Vegetable();
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
     * Test of setFat method, of class Vegetable.
     */
    @Test
    public void testSetFat() {
        System.out.println("setFat");
        Vegetable instance = new Vegetable();
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
     * Test of getCarbs method, of class Vegetable.
     */
    @Test
    public void testGetCarbs() {
        System.out.println("getCarbs");
        Vegetable instance = new Vegetable();

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
     * Test of setCarbs method, of class Vegetable.
     */
    @Test
    public void testSetCarbs() {
        System.out.println("setCarbs");
        Vegetable instance = new Vegetable();
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
     * Test of getName method, of class Vegetable.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Vegetable instance = new Vegetable();
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
                    instance.setName("Pineapple Fruit");
                    expResult = "Pineapple Fruit";
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
     * Test of setName method, of class Vegetable.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        Vegetable instance = new Vegetable();

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
                    instance.setName("Pineapple Fruit");
                    expResult = "Pineapple Fruit";
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
     * Test of getDescription method, of class Vegetable.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Vegetable instance = new Vegetable();

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
     * Test of setDescription method, of class Vegetable.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        Vegetable instance = new Vegetable();
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
     * Test of isGreens method, of class Vegetable.
     */
    @Test
    public void testIsGreens() {
        System.out.println("isGreens");
        //Test the isGreens method 20 times to be sure method is returning a 
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

                Vegetable instance = new Vegetable();
                instance.setGreens(bool);
                boolean expResult = bool;
                boolean result = instance.isGreens();
                assertEquals(expResult, result);
            }
        }
    }

    /**
     * Test of setGreens method, of class Vegetable.
     * If vegetable is a green it is not in any other group.
     */
    @Test
    public void testSetGreens() {
        System.out.println("setGreens");
        //Test the isGreens method 20 times to be sure method is returning a 
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

                Vegetable instance = new Vegetable();
                instance.setGreens(bool);
                boolean expResult = bool;
                boolean result = instance.isGreens();
                assertEquals(expResult, result);
            }
        }
        //Test that isStalk is opposite of isGreens.
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
                
                Vegetable instance = new Vegetable();
                instance.setGreens(bool);
                boolean expResult;
                if(instance.isGreens()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isStalk();
                assertEquals(expResult, result);
            }
    }
        //Test that isTuber is opposite of isGreens.
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
                
                Vegetable instance = new Vegetable();
                instance.setGreens(bool);
                boolean expResult;
                if(instance.isGreens()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isTuber();
                assertEquals(expResult, result);
            }
        }
        //Test that isRoot is opposite of isGreens.
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
                
                Vegetable instance = new Vegetable();
                instance.setGreens(bool);
                boolean expResult;
                if(instance.isGreens()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isRoot();
                assertEquals(expResult, result);
            }
        }
        //Test that isMushroom is opposite of isGreens.
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
                
                Vegetable instance = new Vegetable();
                instance.setGreens(bool);
                boolean expResult;
                if(instance.isGreens()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isMushroom();
                assertEquals(expResult, result);
            }
        }
        
    }

    /**
     * Test of isStalk method, of class Vegetable.
     */
    @Test
    public void testIsStalk() {
        System.out.println("isStalk");
        //Test the isStalk method 20 times to be sure method is returning a 
        //consistantly correct value.
        {
            boolean bool;
            for (int i = 0; i < 20; i++) {
                //random number is either 1 or 2 for test.
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }

                Vegetable instance = new Vegetable();
                instance.setStalk(bool);
                boolean expResult = bool;
                boolean result = instance.isStalk();
                assertEquals(expResult, result);
            }
        }
    }

    /**
     * Test of setStalk method, of class Vegetable.
     * If vegetable type is stalk, it is not any other type.
     */
    @Test
    public void testSetStalk() {
        System.out.println("setStalk");
        //Test the isStalk method 20 times to be sure method is returning a 
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

                Vegetable instance = new Vegetable();
                instance.setStalk(bool);
                boolean expResult = bool;
                boolean result = instance.isStalk();
                assertEquals(expResult, result);
            }
        }
        //Test that isStalk is opposite of isGreens.
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

                Vegetable instance = new Vegetable();
                instance.setStalk(bool);
                boolean expResult;
                if (instance.isStalk()) {
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isGreens();
                assertEquals(expResult, result);
            }
        }
        //Test that isTuber is opposite of isStalk.
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

                Vegetable instance = new Vegetable();
                instance.setStalk(bool);
                boolean expResult;
                if (instance.isStalk()) {
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isTuber();
                assertEquals(expResult, result);
            }
        }
        //Test that isRoot is opposite of isStalk.
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

                Vegetable instance = new Vegetable();
                instance.setStalk(bool);
                boolean expResult;
                if (instance.isStalk()) {
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isRoot();
                assertEquals(expResult, result);
            }
        }
        //Test that isMushroom is opposite of isStalk.
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

                Vegetable instance = new Vegetable();
                instance.setStalk(bool);
                boolean expResult;
                if (instance.isStalk()) {
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isMushroom();
                assertEquals(expResult, result);
            }
        }
    }

    /**
     * Test of isTuber method, of class Vegetable.
     */
    @Test
    public void testIsTuber() {
        System.out.println("isTuber");
        //Test the isTuber method 20 times to be sure method is returning a 
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

                Vegetable instance = new Vegetable();
                instance.setTuber(bool);
                boolean expResult = bool;
                boolean result = instance.isTuber();
                assertEquals(expResult, result);
            }
        }
    }

    /**
     * Test of setTuber method, of class Vegetable.
     * If vegetable is of type tuber it is not any other type.
     */
    @Test
    public void testSetTuber() {
        System.out.println("setTuber");
        //Test the isTuber method 20 times to be sure method is returning a 
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

                Vegetable instance = new Vegetable();
                instance.setTuber(bool);
                boolean expResult = bool;
                boolean result = instance.isTuber();
                assertEquals(expResult, result);
            }
        }
        //Test that isTuber is opposite of isGreens.
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
                
                Vegetable instance = new Vegetable();
                instance.setTuber(bool);
                boolean expResult;
                if(instance.isTuber()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isGreens();
                assertEquals(expResult, result);
            }
    }
        //Test that isTuber is opposite of isStalk.
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
                
                Vegetable instance = new Vegetable();
                instance.setTuber(bool);
                boolean expResult;
                if(instance.isTuber()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isStalk();
                assertEquals(expResult, result);
            }
        }
        //Test that isRoot is opposite of isTuber.
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
                
                Vegetable instance = new Vegetable();
                instance.setTuber(bool);
                boolean expResult;
                if(instance.isTuber()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isRoot();
                assertEquals(expResult, result);
            }
        }
        //Test that isMushroom is opposite of isTuber.
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
                
                Vegetable instance = new Vegetable();
                instance.setTuber(bool);
                boolean expResult;
                if(instance.isTuber()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isMushroom();
                assertEquals(expResult, result);
            }
        }
    }

    /**
     * Test of isRoot method, of class Vegetable.
     */
    @Test
    public void testIsRoot() {
        System.out.println("isRoot");
        //Test the isRoot method 20 times to be sure method is returning a 
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

                Vegetable instance = new Vegetable();
                instance.setRoot(bool);
                boolean expResult = bool;
                boolean result = instance.isRoot();
                assertEquals(expResult, result);
            }
        }
    }

    /**
     * Test of setRoot method, of class Vegetable.
     * If vegetable is a root it is not in any other group.
     * 
     */
    @Test
    public void testSetRoot() {
        System.out.println("setRoot");
        //Test the setRoot method 20 times to be sure method is returning a 
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

                Vegetable instance = new Vegetable();
                instance.setRoot(bool);
                boolean expResult = bool;
                boolean result = instance.isRoot();
                assertEquals(expResult, result);
            }
        }
        //Test that isRoot is opposite of isGreens.
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
                
                Vegetable instance = new Vegetable();
                instance.setRoot(bool);
                boolean expResult;
                if(instance.isRoot()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isGreens();
                assertEquals(expResult, result);
            }
    }
        //Test that isRoot is opposite of isStalk.
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
                
                Vegetable instance = new Vegetable();
                instance.setRoot(bool);
                boolean expResult;
                if(instance.isRoot()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isStalk();
                assertEquals(expResult, result);
            }
        }
        //Test that isRoot is opposite of isTuber.
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
                
                Vegetable instance = new Vegetable();
                instance.setRoot(bool);
                boolean expResult;
                if(instance.isRoot()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isTuber();
                assertEquals(expResult, result);
            }
        }
        //Test that isMushroom is opposite of isRoot.
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
                
                Vegetable instance = new Vegetable();
                instance.setRoot(bool);
                boolean expResult;
                if(instance.isRoot()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isMushroom();
                assertEquals(expResult, result);
            }
        }
    }

    /**
     * Test of isMushroom method, of class Vegetable.
     */
    @Test
    public void testIsMushroom() {
        System.out.println("isMushroom");
        //Test the isMushroom method 20 times to be sure method is returning a 
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

                Vegetable instance = new Vegetable();
                instance.setMushroom(bool);
                boolean expResult = bool;
                boolean result = instance.isMushroom();
                assertEquals(expResult, result);
            }
        }
    }

    /**
     * Test of setMushroom method, of class Vegetable.
     * If vegetable is a mushroom it is not in any other group.
     */
    @Test
    public void testSetMushroom() {
        System.out.println("setMushroom");
        //Test the setMushroom method 20 times to be sure method is returning a 
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

                Vegetable instance = new Vegetable();
                instance.setMushroom(bool);
                boolean expResult = bool;
                boolean result = instance.isMushroom();
                assertEquals(expResult, result);
            }
        }
        //Test that isMushroom is opposite of isGreens.
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
                
                Vegetable instance = new Vegetable();
                instance.setMushroom(bool);
                boolean expResult;
                if(instance.isMushroom()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isGreens();
                assertEquals(expResult, result);
            }
    }
        //Test that isMushroom is opposite of isStalk.
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
                
                Vegetable instance = new Vegetable();
                instance.setMushroom(bool);
                boolean expResult;
                if(instance.isMushroom()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isStalk();
                assertEquals(expResult, result);
            }
        }
        //Test that isMushroom is opposite of isTuber.
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
                
                Vegetable instance = new Vegetable();
                instance.setMushroom(bool);
                boolean expResult;
                if(instance.isMushroom()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isTuber();
                assertEquals(expResult, result);
            }
        }
        //Test that isMushroom is opposite of isRoot.
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
                
                Vegetable instance = new Vegetable();
                instance.setMushroom(bool);
                boolean expResult;
                if(instance.isMushroom()){
                    expResult = false;
                } else {
                    //Doesn't have to be true (could be a different type),
                    //should always be false in this case.
                    expResult = false;
                }

                boolean result = instance.isRoot();
                assertEquals(expResult, result);
            }
        }
    }

    /**
     * Test of getFOOD_CODE method, of class Vegetable.
     */
    @Test
    public void testGetFOOD_CODE() {
        System.out.println("getFOOD_CODE");
        Vegetable instance = new Vegetable();
        String expResult = "0002";
        String result = instance.getFOOD_CODE();
        assertEquals(expResult, result);
    }
}
