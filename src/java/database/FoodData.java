package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A class definition for FoodData for making requests to the
 * Database for food related requests.
 * 
 * This FoodData Class is in the database package.
 * 
 * @author Paul Trott (ptrott)
 * Date: Feb 9, 2012
 */
public class FoodData {

    
    public String updateFood() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public String addFood() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * This request will get a list of all food types out of the Derby 
     * JDBC.
     * @return 
     */
    public static Iterator<String> getFoodByType() {
        //to hold Food Type list.
        List<String> foodTypesList = new ArrayList<String>();
        //To hold individual food items as they are read out of the database.
        String foodType;
        
        //To hold query statement and query results
        Statement statement = null;
        ResultSet queryResults = null;
        
        //Get connection to connection pool
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        
        
        try {
             //Create a Statement object.
            statement = connection.createStatement();
            String query = "select typeoffood from foodcode";

            //Execute select query.
            queryResults = statement.executeQuery(query);
            
            // Step 6 Process the results.
            while (queryResults.next()) { // returns false when empty
                //Get the data from the result set.
                foodType = (String) queryResults.getString("TYPEOFFOOD");

                // create a new Book Object here,
                // add it to the HashMap.
                foodTypesList.add(foodType);
            }
        //display book title sorted
        Collections.sort(foodTypesList);
        // get the iterator from the set.
        return foodTypesList.iterator();          
            
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return null;
        } finally {
            //Close ResultSet 
            DBUtil.closeResultSet(queryResults);
            //Close Statement
            DBUtil.closeStatement(statement);
            //Free Connection Pool
            pool.freeConnection(connection);
        }
    }

    
    public static String removeFood() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public static String getAllFood() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public static String showSelectedFood() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public static String searchFoods() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
