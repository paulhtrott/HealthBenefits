package user;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * jUnit Test for user class.
 *
 * @author Paul Trott (ptrott)
 */
public class UserTest {

    public UserTest() {
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
     * Test of no-arg Default Constructor.
     */
    @Test
    public void testUser() {
        System.out.println("no-arg Default Constructor");
        User instance = new User();
        {
            String expResult = "no name";
            String result = instance.getFirstName();
            assertEquals(expResult, result);
        }
        {
            String expResult = "no name";
            String result = instance.getUsername();
            assertEquals(expResult, result);
        }
        {
            String expResult = "password";
            String result = instance.getPassword();
            assertEquals(expResult, result);
        }
        {
            String expResult = "no email";
            String result = instance.getEmailAddress();
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of Overloaded constructor
     */
    @Test
    public void testUserOverloaded() {
        System.out.println("Overloaded Constructor");
        User instance = new User("Paul", "paultrott", "bermuda1!?@", "paultrott@yahoo.com");

        {
            String expResult = "Paul";
            String result = instance.getFirstName();
            assertEquals(expResult, result);
        }
        {
            String expResult = "paultrott";
            String result = instance.getUsername();
            assertEquals(expResult, result);
        }
        {
            boolean expResult = true;
            boolean result;
        }
        {
            String expResult = "paultrott@yahoo.com";
            String result = instance.getEmailAddress();
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of getFirstName method, of class User.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        User instance = new User();
        instance.setFirstName("paul trott");
        String expResult = "paultrott";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class User.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        User instance = new User();
        {
            //Test a first name less than 2 characters.
            instance.setFirstName("T");
            String expResult = "no name";
            String result = instance.getFirstName();
            assertEquals(expResult, result);
        }
        {
            //Test a first name with spaces.
            instance.setFirstName("Paul Trott Henry");
            String expResult = "PaulTrottHenry";
            String result = instance.getFirstName();
            assertEquals(expResult, result);
        }
        {
            //Test a first name with numbers entered in it.
            instance.setFirstName("paul67 trott 56");
            String expResult = "paultrott";
            String result = instance.getFirstName();
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of getUsername method, of class User.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        User instance = new User();
        {
            instance.setUsername("H r $tt-_ +tu");
            String expResult = "Hr$tt-_+tu";
            String result = instance.getUsername();
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of setUsername method, of class User.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        User instance = new User();
        {
            instance.setUsername("pAuLT T$ 1 4 5 6 T 6");
            String expResult = "pAuLTT$1456T6";
            String result = instance.getUsername();
            assertEquals(expResult, result);
        }
        {
            instance.setUsername("r3Rt 56Yts - htr _ o");
            String expResult = "r3Rt56Yts-htr_o";
            String result = instance.getUsername();
            assertEquals(expResult, result);
        }
        {
            instance.setUsername("ty43u4j j2k3 5k2 2 4 5 6 4 3 g pt");
            String expResult = "no name";
            String result = instance.getUsername();
            assertEquals(expResult, result);
        }

    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        User instance = new User();
        {
            instance.setPassword("p4ultr0tt!@~");
            String expResult = "p4ultr0tt!@~";
            String result = instance.getPassword();
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User();
        {
            instance.setPassword("h4ppy b1rthd4y");
            String expResult = "h4ppy b1rthd4y";
            String result = instance.getPassword();
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of getEmailAddress method, of class User.
     */
    @Test
    public void testGetEmailAddress() {
        System.out.println("getEmailAddress");
        User instance = new User();
        {
            instance.setEmailAddress("disposable.style.email.with+symbol@example.com");
            String expResult = "disposable.style.email.with+symbol@example.com";
            String result = instance.getEmailAddress();
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of setEmailAddress method, of class User.
     */
    @Test
    public void testSetEmailAddress() {
        System.out.println("setEmailAddress");
        User instance = new User();
        {
            //test valid email
            instance.setEmailAddress("disposable.style.email.with+symbol@example.com");
            String expResult = "disposable.style.email.with+symbol@example.com";
            String result = instance.getEmailAddress();
            assertEquals(expResult, result);

        }
        {
            //test valid email
            instance.setEmailAddress("niceandsimple@example.com");
            String expResult = "niceandsimple@example.com";
            String result = instance.getEmailAddress();
            assertEquals(expResult, result);

        }
        {
            //test invalid email (not invalid as an email but invalid for this app)
            instance.setEmailAddress("\"much.more unusual\"@example.com");
            String expResult = "no email";
            String result = instance.getEmailAddress();
            assertEquals(expResult, result);

        }
        {
            //test invalid email (truly invalid email address)
            instance.setEmailAddress("A@b@c@example.com");
            String expResult = "no email";
            String result = instance.getEmailAddress();
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of getUSER_CODE method, of class User.
     */
    @Test
    public void testGetUSER_CODE() {
        System.out.println("getUSER_CODE");
        User instance = new User();
        String expResult = "3";
        String result = instance.getUSER_CODE();
        assertEquals(expResult, result);
    }
}
