package database;

import java.util.*;
import java.sql.*;

/**
 * DerbyJunctionTableData class will have SQL statements related to the junction table
 * data. In this case EnterFoods table. Which will record data from both the
 * Users Table and Food Table to show who entered the food data and when it was added.
 * 
 * @author Paul Trott (ptrott)
 * Date: February 21, 2013
 */
public class DerbyJunctionTableData {
    
    /**
     * addUserAndFood method adds entered Food Name, the username of the user
     * that entered the food and the current date.
     * @param username - name of the user entering the food item.
     * @param foodName - name of the food being entered.
     */
    public static int addUserAndFood(String username, String foodName){
        //Instantitate the current date that will be used in the table date column
        GregorianCalendar currentDate = new GregorianCalendar();
        int currentMonth = currentDate.get(Calendar.MONTH) + 1;
        int currentDay = currentDate.get(Calendar.DAY_OF_MONTH);
        int currentYear = currentDate.get(Calendar.YEAR);
        //Store the date as a String.
        String date = String.valueOf(currentMonth) + "/" + 
                String.valueOf(currentDay) + "/" + String.valueOf(currentYear);
        
        //Instantiate a connection to a connection pool
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        
        //Instaniate objects for PreparedStatment and ResultSet.
        PreparedStatement statement = null;
        
        //Database query statement.
        String query = "Insert into ENTEREDFOOD (USERNAME, FOODNAME, DATEENTERED)"
                + " values (?, ?, ?)";
        
        try{
            //Populate the statement with the passed in parameters and current date.
            statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, foodName);
            statement.setString(3, date);
            //Execute the update.
            return statement.executeUpdate();
            
        } catch(SQLException sqle){
            sqle.printStackTrace();
            return 0;
        } finally{
            //Close all connections.
            DBUtil.closePreparedStatement(statement);
            pool.freeConnection(connection);
        }
        
        
    }
}
