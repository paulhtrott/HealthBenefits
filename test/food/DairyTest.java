package food;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * jUnit test for Dairy Class.
 *
 * @author Paul Trott (ptrott)
 */
public class DairyTest {

    public DairyTest() {
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
     * Test of the no-arg Default constructor, of class Dairy.
     */
    @Test
    public void testDairy() {
        System.out.println("Default no-arg constructor");
        //Instantiate a Dairy object
        Dairy instance = new Dairy();

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
     * Test of getFOOD_CODE method, of class Dairy.
     */
    @Test
    public void testGetFOOD_CODE() {
        System.out.println("getFOOD_CODE");
        //Instantiate a Dairy object
        Dairy instance = new Dairy();

        String expResult = "0012";
        String result = instance.getFOOD_CODE();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCalories method, of class Dairy.
     */
    @Test
    public void testGetCalories() {
        System.out.println("getCalories");
        //Instantiate a Dairy object
        Dairy instance = new Dairy();


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
     * Test of setCalories method, of class Dairy.
     */
    @Test
    public void testSetCalories() {
        System.out.println("setCalories");
        //Instantiate a Dairy object
        Dairy instance = new Dairy();
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
     * Test of getCaloriesFromFat method, of class Dairy.
     */
    @Test
    public void testGetCaloriesFromFat() {
        System.out.println("getCaloriesFromFat");
        //Instantiate a Dairy object
        Dairy instance = new Dairy();

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
     * Test of setCaloriesFromFat method, of class Dairy.
     */
    @Test
    public void testSetCaloriesFromFat() {
        System.out.println("setCaloriesFromFat");
        //Instantiate a Dairy object
        Dairy instance = new Dairy();
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
     * Test of getServingSize method, of class Dairy.
     */
    @Test
    public void testGetServingSize() {
        System.out.println("getServingSize");
        //Instantiate a Dairy object
        Dairy instance = new Dairy();

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
     * Test of setServingSize method, of class Dairy.
     */
    @Test
    public void testSetServingSize() {
        System.out.println("setServingSize");
        //Instantiate a Dairy object
        Dairy instance = new Dairy();
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
     * Test of getProtein method, of class Dairy.
     */
    @Test
    public void testGetProtein() {
        System.out.println("getProtein");
        //Instantiate a Dairy object
        Dairy instance = new Dairy();

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
     * Test of setProtein method, of class Dairy.
     */
    @Test
    public void testSetProtein() {
        System.out.println("setProtein");
        //Instantiate a Dairy object
        Dairy instance = new Dairy();
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
     * Test of getFat method, of class Dairy.
     */
    @Test
    public void testGetFat() {
        System.out.println("getFat");
        //Instantiate a Dairy object
        Dairy instance = new Dairy();
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
     * Test of setFat method, of class Dairy.
     */
    @Test
    public void testSetFat() {
        System.out.println("setFat");
        //Instantiate a Dairy object
        Dairy instance = new Dairy();
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
     * Test of getCarbs method, of class Dairy.
     */
    @Test
    public void testGetCarbs() {
        System.out.println("getCarbs");
        //Instantiate a Dairy object
        Dairy instance = new Dairy();

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
     * Test of setCarbs method, of class Dairy.
     */
    @Test
    public void testSetCarbs() {
        System.out.println("setCarbs");
        //Instantiate a Dairy object
        Dairy instance = new Dairy();
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
     * Test of getName method, of class Dairy.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        //Instantiate a Dairy object
        Dairy instance = new Dairy();
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
                    instance.setName("Cow Milk");
                    expResult = "Cow Milk";
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
     * Test of setName method, of class Dairy.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        //Instantiate a Dairy object
        Dairy instance = new Dairy();

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
                    instance.setName("Cow Milk");
                    expResult = "Cow Milk";
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
     * Test of getDescription method, of class Dairy.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        //Instantiate a Dairy object
        Dairy instance = new Dairy();

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
     * Test of setDescription method, of class Dairy.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        //Instantiate a Dairy object
        Dairy instance = new Dairy();
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
     * Test of isMilk method, of class Dairy.
     */
    @Test
    public void testIsMilk() {
        System.out.println("isMilk");
        //Test the isMilk method 20 times.
        {
            boolean bool;
            for (int i = 0; i < 20; i++) {
                //Random number is either 1 or 2
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }
                //Instantiate a Dairy object
                Dairy instance = new Dairy();
                instance.setMilk(bool);
                boolean expResult = bool;
                boolean result = instance.isMilk();
                assertEquals(expResult, result);
            }
        }
    }

    /**
     * Test of setMilk method, of class Dairy.
     */
    @Test
    public void testSetMilk() {
        //Test the setMilk method 20 times.
        {
            boolean bool;
            for (int i = 0; i < 20; i++) {
                //Random number is either 1 or 2
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }
                //Instantiate a Dairy object
                Dairy instance = new Dairy();
                instance.setMilk(bool);
                boolean expResult = bool;
                boolean result = instance.isMilk();
                assertEquals(expResult, result);
            }
        }

        //Test to be sure milk is opposite of cheese (20 times).
        {
            boolean bool;
            for (int i = 0; i < 20; i++) {
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }
                //Instantiate a Dairy object
                Dairy instance = new Dairy();
                instance.setMilk(bool);

                boolean expResult;

                //If product is milk other product should be false.
                //If product is not milk expResult should still be false,
                //may be of another type other then one checked here.
                if (instance.isMilk()) {
                    expResult = false;
                } else {
                    expResult = false;
                }

                boolean result = instance.isCheese();
                assertEquals(expResult, result);
            }
        }
        //Test to be sure milk is opposite of curdledDairy (20 times).
        {
            boolean bool;
            for (int i = 0; i < 20; i++) {
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }
                //Instantiate a Dairy object
                Dairy instance = new Dairy();
                instance.setMilk(bool);

                boolean expResult;

                //If product is milk other product should be false.
                //If product is not milk expResult should still be false,
                //may be of another type other then one checked here.
                if (instance.isMilk()) {
                    expResult = false;
                } else {
                    expResult = false;
                }

                boolean result = instance.isCurdledDairy();
                assertEquals(expResult, result);
            }
        }
    }

    /**
     * Test of isCheese method, of class Dairy.
     */
    @Test
    public void testIsCheese() {
        System.out.println("isCheese");
        //Test the isCheese method 20 times.
        {
            boolean bool;
            for (int i = 0; i < 20; i++) {
                //Random number is either 1 or 2
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }
                //Instantiate a Dairy object
                Dairy instance = new Dairy();
                instance.setCheese(bool);
                boolean expResult = bool;
                boolean result = instance.isCheese();
                assertEquals(expResult, result);
            }
        }
    }

    /**
     * Test of setCheese method, of class Dairy.
     */
    @Test
    public void testSetCheese() {
        //Test the setCheese method 20 times.
        {
            boolean bool;
            for (int i = 0; i < 20; i++) {
                //Random number is either 1 or 2
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }
                //Instantiate a Dairy object
                Dairy instance = new Dairy();
                instance.setCheese(bool);
                boolean expResult = bool;
                boolean result = instance.isCheese();
                assertEquals(expResult, result);
            }
        }

        //Test to be sure cheese is opposite of milk (20 times).
        {
            boolean bool;
            for (int i = 0; i < 20; i++) {
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }
                //Instantiate a Dairy object
                Dairy instance = new Dairy();
                instance.setCheese(bool);

                boolean expResult;

                //If product is milk other product should be false.
                //If product is not milk expResult should still be false,
                //may be of another type other then one checked here.
                if (instance.isCheese()) {
                    expResult = false;
                } else {
                    expResult = false;
                }

                boolean result = instance.isMilk();
                assertEquals(expResult, result);
            }
        }
        //Test to be sure cheese is opposite of curdledDairy (20 times).
        {
            boolean bool;
            for (int i = 0; i < 20; i++) {
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }
                //Instantiate a Dairy object
                Dairy instance = new Dairy();
                instance.setCheese(bool);

                boolean expResult;

                //If product is milk other product should be false.
                //If product is not milk expResult should still be false,
                //may be of another type other then one checked here.
                if (instance.isCheese()) {
                    expResult = false;
                } else {
                    expResult = false;
                }

                boolean result = instance.isCurdledDairy();
                assertEquals(expResult, result);
            }
        }
    }

    /**
     * Test of isCurdledDairy method, of class Dairy.
     */
    @Test
    public void testIsCurdledDairy() {
        System.out.println("isCurdledDairy");
        //Test the isCurdledDairy method 20 times.
        {
            boolean bool;
            for (int i = 0; i < 20; i++) {
                //Random number is either 1 or 2
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }
                //Instantiate a Dairy object
                Dairy instance = new Dairy();
                instance.setCurdledDairy(bool);
                boolean expResult = bool;
                boolean result = instance.isCurdledDairy();
                assertEquals(expResult, result);
            }
        }
    }

    /**
     * Test of setCurdledDairy method, of class Dairy.
     */
    @Test
    public void testSetCurdledDairy() {
        //Test the setCurdledDairy method 20 times.
        {
            boolean bool;
            for (int i = 0; i < 20; i++) {
                //Random number is either 1 or 2
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }
                //Instantiate a Dairy object
                Dairy instance = new Dairy();
                instance.setCurdledDairy(bool);
                boolean expResult = bool;
                boolean result = instance.isCurdledDairy();
                assertEquals(expResult, result);
            }
        }

        //Test to be sure curdledDairy is opposite of milk (20 times).
        {
            boolean bool;
            for (int i = 0; i < 20; i++) {
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }
                //Instantiate a Dairy object
                Dairy instance = new Dairy();
                instance.setCurdledDairy(bool);

                boolean expResult;

                //If product is milk other product should be false.
                //If product is not milk expResult should still be false,
                //may be of another type other then one checked here.
                if (instance.isCurdledDairy()) {
                    expResult = false;
                } else {
                    expResult = false;
                }

                boolean result = instance.isMilk();
                assertEquals(expResult, result);
            }
        }
        //Test to be sure curdledDairy is opposite of cheese (20 times).
        {
            boolean bool;
            for (int i = 0; i < 20; i++) {
                int randNum = (int) ((Math.random() * (2)) + 1);
                if (randNum == 1) {
                    bool = true;
                } else {
                    bool = false;
                }

                //Instantiate a Dairy object
                Dairy instance = new Dairy();
                instance.setCurdledDairy(bool);

                boolean expResult;

                //If product is milk other product should be false.
                //If product is not milk expResult should still be false,
                //may be of another type other then one checked here.
                if (instance.isCurdledDairy()) {
                    expResult = false;
                } else {
                    expResult = false;
                }

                boolean result = instance.isCheese();
                assertEquals(expResult, result);
            }
        }
    }
}
