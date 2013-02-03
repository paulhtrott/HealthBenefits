package food;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * junit Tests of class Food.
 * @author Paul Trott (ptrott)
 * Date: January 24, 2013
 * Date Modified: January 31, 2012
 */
public class FoodTest {
    
    public FoodTest() {
        
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
     * Test of the no-arg Default constructor, of class Food.
     */
    @Test
    public void testFood(){
        System.out.println("Default no-arg constructor");
        Food instance = new Food();
        
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
     * Test of the Overloaded constructor, of class Food.
     */
    @Test
    public void testOverloadedFood(){
        System.out.println("Overloaded constructor");
        Food instance = new Food("Herring", "According to the American Heart Association, "
                + "herring is rich in two fatty acids called eicosapentaenoic acid "
                + "and decosahexaenoic acid. Eicosapentaenoic acid, or EPA is "
                + "clinically shown to reduce triglycerides, inflammation and "
                + "may reduce risk of heart disease. EPA may also help to reduce "
                + "blood pressure for people who have hypertension.", 245, 126, 4, 
            27.8, 14, 0);
        
        //Test name value
        String expResult = "Herring";
        String result = instance.getName();
        assertEquals(expResult, result);
        
        //Test description value
        String expResultDesc = "According to the American Heart Association, "
                + "herring is rich in two fatty acids called eicosapentaenoic "
                + "acid and decosahexaenoic acid. Eicosapentaenoic acid, or EPA "
                + "is clinically shown to reduce triglycerides, inflammation and"
                + " may reduce risk of heart disease. EPA may also help to "
                + "reduce blood pressure for people who have hypertension.";
        String resultDesc = instance.getDescription();
        assertEquals(expResultDesc, resultDesc);
        
        //Test calories value
        int expResultCal = 245;
        int resultCal = instance.getCalories();
        assertEquals(expResultCal, resultCal);
        
        //Test caloriesFromFat value
        int expResultCalsFromFat = 126;
        int resultCalsFromFat = instance.getCaloriesFromFat();
        assertEquals(expResultCalsFromFat, resultCalsFromFat);
        
        //Test servingSize value
        double expResultServingSize = 4;
        double resultServingSize = instance.getServingSize();
        assertEquals(expResultServingSize, resultServingSize, 0.0);
        
        //Test protein value
        double expResultProtein = 27.8;
        double resultProtein = instance.getProtein();
        assertEquals(expResultProtein, resultProtein, 0.0);
        
        //Test fat value
        double expResultFat = 14;
        double resultFat = instance.getFat();
        assertEquals(expResultFat, resultFat, 0.0);
        
        //Test carbs value
        double expResultCarbs = 0;
        double resultCarbs = instance.getCarbs();
        assertEquals(expResultCarbs, resultCarbs, 0.0);
        
    }
    
    /**
     * Test of getCODE method, of class Food.
     */
    @Test
    public void testGetFOOD_CODE(){
        System.out.println("getFOOD_CODE");
        Food instance = new Food();
        
        String expResult = "0000";
        String result = instance.getFOOD_CODE();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getCalories method, of class Food.
     */
    @Test
    public void testGetCalories() {
        System.out.println("getCalories");
        Food instance = new Food();
        
        
        // To test a number with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for(int i = 0; i < 1000; i++){
            int randNum = (int) (100 * (Math.random() * 100) );
            instance.setCalories(randNum);
            int expResult = randNum;
            int result = instance.getCalories();
            assertEquals(expResult, result);
        }
        
    }

    /**
     * Test of setCalories method, of class Food.
     */
    @Test
    public void testSetCalories() {
        System.out.println("setCalories");
        Food instance = new Food();        
        //To test a negative entered number.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for(int i = 0; i < 1000; i++){
            int randNum = (int) (-1 * (Math.random() * 1000));
            instance.setCalories(randNum);
            int expResult = 0;
            int result = instance.getCalories();
            assertEquals(expResult, result);
        }
        
        // To test a number with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for(int i = 0; i < 1000; i++){
            int randNum = (int) (100 * (Math.random() * 100) );
            instance.setCalories(randNum);
            int expResult = randNum;
            int result = instance.getCalories();
            assertEquals(expResult, result);
        }
        
        // To test a number with 5 or more digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for(int i = 0; i < 1000; i++){
            int randNum = (int) (1000 * (Math.random() * (100 - 10) + 10) );
            instance.setCalories(randNum);
            int expResult = 0;
            int result = instance.getCalories();
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of getCaloriesFromFat method, of class Food.
     */
    @Test
    public void testGetCaloriesFromFat() {
        System.out.println("getCaloriesFromFat");
        Food instance = new Food();
        
        // To test a number with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for(int i = 0; i < 1000; i++){
            int randNum = (int) (100 * (Math.random() * 100) );
            instance.setCaloriesFromFat(randNum);
            int expResult = randNum;
            int result = instance.getCaloriesFromFat();
            assertEquals(expResult, result);
        }
        
    }

    /**
     * Test of setCaloriesFromFat method, of class Food.
     */
    @Test
    public void testSetCaloriesFromFat() {
        System.out.println("setCaloriesFromFat");
        Food instance = new Food();
        //To test a negative entered number.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for(int i = 0; i < 1000; i++){
            int randNum = (int) (-1 * (Math.random() * 1000));
            instance.setCaloriesFromFat(randNum);
            int expResult = 0;
            int result = instance.getCaloriesFromFat();
            assertEquals(expResult, result);
        }
        
        // To test a number with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for(int i = 0; i < 1000; i++){
            int randNum = (int) (100 * (Math.random() * 100) );
            instance.setCaloriesFromFat(randNum);
            int expResult = randNum;
            int result = instance.getCaloriesFromFat();
            assertEquals(expResult, result);
        }
        
        // To test a number with 5 or more digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for(int i = 0; i < 1000; i++){
            int randNum = (int) (1000 * (Math.random() * (100 - 10) + 10) );
            instance.setCaloriesFromFat(randNum);
            int expResult = 0;
            int result = instance.getCaloriesFromFat();
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of getServingSize method, of class Food.
     */
    @Test
    public void testGetServingSize() {
        System.out.println("getServingSize");
        Food instance = new Food();
        
        //To test numbers with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for(int i = 0; i < 1000; i++){
            double randNum = (10 * (Math.random() * 500));
            String strDouble = String.format("%.2f", randNum);
            double expResult = (Double) Double.parseDouble(strDouble);
            instance.setServingSize(expResult);
            double result = instance.getServingSize();
            assertEquals(expResult, result, 0.0);
        }
        
    }

    /**
     * Test of setServingSize method, of class Food.
     */
    @Test
    public void testSetServingSize() {
        System.out.println("setServingSize");
        Food instance = new Food();
        //To test negative numbers.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for(int i = 0; i < 1000; i++){
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
        for(int i = 0; i < 1000; i++){
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
        for(int i = 0; i < 1000; i++){
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
     * Test of getProtein method, of class Food.
     */
    @Test
    public void testGetProtein() {
        System.out.println("getProtein");
        Food instance = new Food();
               
        //To test numbers with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for(int i = 0; i < 1000; i++){
            double randNum = (10 * (Math.random() * 500));
            String strDouble = String.format("%.2f", randNum);
            double expResult = (Double) Double.parseDouble(strDouble);
            instance.setProtein(expResult);
            double result = instance.getProtein();
            assertEquals(expResult, result, 0.0);
        }
        
    }

    /**
     * Test of setProtein method, of class Food.
     */
    @Test
    public void testSetProtein() {
        System.out.println("setProtein");        
        Food instance = new Food();
        //To test negative numbers.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for(int i = 0; i < 1000; i++){
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
        for(int i = 0; i < 1000; i++){
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
        for(int i = 0; i < 1000; i++){
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
     * Test of getFat method, of class Food.
     */
    @Test
    public void testGetFat() {
        System.out.println("getFat");
        Food instance = new Food();
        //To test numbers with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for(int i = 0; i < 1000; i++){
            double randNum = (10 * (Math.random() * 500));
            String strDouble = String.format("%.2f", randNum);
            double expResult = (Double) Double.parseDouble(strDouble);
            instance.setFat(expResult);
            double result = instance.getFat();
            assertEquals(expResult, result, 0.0);
        }
        
    }

    /**
     * Test of setFat method, of class Food.
     */
    @Test
    public void testSetFat() {
        System.out.println("setFat");
        Food instance = new Food();
        //To test negative numbers.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for(int i = 0; i < 1000; i++){
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
        for(int i = 0; i < 1000; i++){
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
        for(int i = 0; i < 1000; i++){
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
     * Test of getCarbs method, of class Food.
     */
    @Test
    public void testGetCarbs() {
        System.out.println("getCarbs");
        Food instance = new Food();
        
        //To test numbers with 4 or less digits.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for(int i = 0; i < 1000; i++){
            double randNum = (10 * (Math.random() * 500));
            String strDouble = String.format("%.2f", randNum);
            double expResult = (Double) Double.parseDouble(strDouble);
            instance.setCarbs(expResult);
            double result = instance.getCarbs();
            assertEquals(expResult, result, 0.0);
        }
    }

    /**
     * Test of setCarbs method, of class Food.
     */
    @Test
    public void testSetCarbs() {
        System.out.println("setCarbs");
        Food instance = new Food();
        //To test negative numbers.
        //for loop to run test with a random number 1000 times
        //giving an opportunity for the test to fail.
        for(int i = 0; i < 1000; i++){
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
        for(int i = 0; i < 1000; i++){
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
        for(int i = 0; i < 1000; i++){
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
     * Test of getName method, of class Food.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Food instance = new Food();
        String expResult = "";
        
        //Run test 3 times.
        for(int i = 0; i < 3; i++){
            int randNum = (int) ( (Math.random() * (5 - 1) ) + 1);
            //set name to a different value depending on the random number.
            switch(randNum){
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
     * Test of setName method, of class Food.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        Food instance = new Food();
        
         String expResult = "";
        
        //Run test 6 times.
        for(int i = 0; i < 6; i++){
            int randNum = (int) ( (Math.random() * (5 - 1) ) + 1);
            //set name to a different value depending on the random number.
            switch(randNum){
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
     * Test of getDescription method, of class Food.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Food instance = new Food();
        
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
     * Test of setDescription method, of class Food.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        Food instance = new Food();
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
    
}
