package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Java Derby class that implements the Food Data Provider Interface.
 * This class implements all methods for interacting with Food related database
 * information.
 * @author Paul Trott (ptrott)
 */
public class DerbyFoodDataProvider implements IFoodDataProvider{

    
    public static Connection DerbyFoodDataProvider(){
        String dbaseurl;
        String user = "ptrott";
        String pass = "!@#$%^&*()";
        Connection con = null;
        try {
            // Create the new HashMap Object Here, assigning the
            // address to the reference variable.
            // Step 1: Load the Driver Class into memory
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            
            // Step 2 Define the connection URL
            dbaseurl = "jdbc:derby://localhost:1527/HealthFoods";
            
            // Step 3. Establish the connection.
           return con = DriverManager.getConnection(dbaseurl, user, pass);
            
            
                
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        } finally {
// Step 7 Close the connection.
            try {
                if (con != null) {
                    con.close();
// also closes the statement and resultSet...
                }
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
        return null;
    }

    
    @Override
    public String updateFood() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String addFood() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getFoodByType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String removeFood() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getAllFood() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String showSelectedFood() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String searchFoods() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
}
