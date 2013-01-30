package food;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test for the Poultry Class methods.
 * @author Paul Trott (ptrott)
 */
public class PoultryTest {
    
    public PoultryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        // run before each set of tests.
        System.out.println("running setup");
    }
    
    @AfterClass
    public static void tearDownClass() {
        // run after all of the tests have run.
        System.out.println("running teardown");
    }
    
    @Before
    public void setUp() {
        //instance method run before each test.
        System.out.println("running setup before each test");
    }
    
    @After
    public void tearDown() {
        //run after each test.
        System.out.println("running teardown after each test");
    }

    /**
     * Default no-arg constructor for Poultry class.
     */
    @Test
    public void testPoultry(){
        System.out.println("Default Constructor");
        Food instance = new Poultry();
        
        //Test name value.
        String expResult = "noname";
        String result = instance.getName();
        assertEquals(expResult, result);
        
        // Test calories value.
        int expResultCal = 0;
        int resultCal = instance.getCalories();
        assertEquals(expResultCal, resultCal);
        
        //Test caloriesFromFat value.
        int expResultCalsFromFat = 0;
        int resultCalsFromFat = instance.getCaloriesFromFat();
        assertEquals(expResultCalsFromFat, resultCalsFromFat);
        
        //Test servingSize value.
        double expResultServingSize = 0.0d;
        double resultServingSize = instance.getServingSize();
        assertEquals(expResultServingSize, resultServingSize, 0.0);
        
        //Test protein value.
        double expResultProtein = 0.0d;
        double resultProtein = instance.getProtein();
        assertEquals(expResultProtein, resultProtein, 0.0);
        
        //Test fat value.
        double expResultFat = 0.0d;
        double resultFat = instance.getFat();
        assertEquals(expResultFat, resultFat, 0.0);
        
        //Test carbs value.
        double expResultCarbs = 0.0d;
        double resultCarbs = instance.getCarbs();
        assertEquals(expResultCarbs, resultCarbs, 0.0);
        
    }
    
    /**
     * Test overloaded constructor for Poultry class.
     */
    @Test
    public void testOverloadedPoultry(){
        System.out.println("Overloaded Constructor");
        Food instance = new Meat("Duck", 235, 112, 1.5, 13.4, 12.54, 23.22);
        
        //Test name value.
        String expResult = "Duck";
        String result = instance.getName();
        assertEquals(expResult, result);
        
        // Test calories value.
        int expResultCal = 235;
        int resultCal = instance.getCalories();
        assertEquals(expResultCal, resultCal);
        
        //Test caloriesFromFat value.
        int expResultCalsFromFat = 112;
        int resultCalsFromFat = instance.getCaloriesFromFat();
        assertEquals(expResultCalsFromFat, resultCalsFromFat);
        
        //Test servingSize value.
        double expResultServingSize = 1.5;
        double resultServingSize = instance.getServingSize();
        assertEquals(expResultServingSize, resultServingSize, 0.0);
        
        //Test protein value.
        double expResultProtein = 13.4;
        double resultProtein = instance.getProtein();
        assertEquals(expResultProtein, resultProtein, 0.0);
        
        //Test fat value.
        double expResultFat = 12.54;
        double resultFat = instance.getFat();
        assertEquals(expResultFat, resultFat, 0.0);
        
        //Test carbs value.
        double expResultCarbs = 23.22;
        double resultCarbs = instance.getCarbs();
        assertEquals(expResultCarbs, resultCarbs, 0.0);
        
    }
    
    /**
     * Test of setName method, of class Poultry.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        Food instance = new Poultry();
        
         String expResult = "";
        
        //Run test 6 times.
        for(int i = 0; i < 6; i++){
            int randNum = (int) ( (Math.random() * (5 - 1) ) + 1);
            //set name to a different value depending on the random number.
            switch(randNum){
                case 1 :
                        instance.setName("Chicken");
                        expResult = "Chicken";
                break;
                case 2 : 
                        instance.setName("Duck");
                        expResult = "Duck";
                break;
                case 3 : 
                        instance.setName("Turkey");
                        expResult = "Turkey";
                break;
                case 4 : 
                        instance.setName("Quail");
                        expResult = "Quail";
                break;
                default :
                        instance.setName("Pheasent");
                        expResult = "Pheasent";
                break;
            }
        }
        
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Meat.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Food instance = new Poultry();
        
         String expResult = "";
         
        //Run test 3 times.
        for(int i = 0; i < 3; i++){
            int randNum = (int) ( (Math.random() * (5 - 1) ) + 1);
            //set name to a different value depending on the random number.
            switch(randNum){
                case 1 :
                        instance.setName("Chicken");
                        expResult = "Chicken";
                break;
                case 2 : 
                        instance.setName("Duck");
                        expResult = "Duck";
                break;
                case 3 : 
                        instance.setName("Turkey");
                        expResult = "Turkey";
                break;
                case 4 : 
                        instance.setName("Quail");
                        expResult = "Quail";
                break;
                default :
                        instance.setName("Pheasent");
                        expResult = "Pheasent";
                break;
            }
        }
        
        String result = instance.getName();
        assertEquals(expResult, result);
    }
}
