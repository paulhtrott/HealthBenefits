package database;

import food.IFood;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A class definition for FoodData for making requests to the Database for food
 * related requests.
 *
 * This FoodData Class is in the database package.
 *
 * @author Paul Trott (ptrott) Date: Feb 9, 2012
 */
public class FoodData {

    public String updateFood() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * addFood adds food items to a database. Parameters are an IFood object,
     * and two String objects for food code and serving size measurement (cups
     * ,ounces and grams).
     *
     * @param food
     * @param foodCode
     * @param servingSizeMeasurement
     * @return returns the executed query results to the database.
     */
    public static int addFood(IFood food, String foodCode, String servingSizeMeasurement) {

        //Get a connection to the database through a connection pool.
        //Create an instance of a pool and connection.
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();

        //Instantitate a PreparedStatement
        PreparedStatement statement = null;

        //Instantiate a query to add entered food to database.
        String query = "INSERT INTO FOOD (FOODNAME, DESCRIPTION, CALORIES, "
                + "CALORIESFROMFAT, SERVINGSIZE, PROTEIN, FAT, CARBS, "
                + "SPECIFICFOODTYPE, FOOD_CODE, MEASUREMENT) VALUES "
                + "(?,?,?,?,?,?,?,?,?,?,?)";

        try {
            //Populate the statement with the food information
            //pass in the query as a parameter.
            statement = connection.prepareStatement(query);
            statement.setString(1, food.getName());
            statement.setString(2, food.getDescription());
            statement.setInt(3, food.getCalories());
            statement.setInt(4, food.getCaloriesFromFat());
            statement.setDouble(5, food.getServingSize());
            statement.setDouble(6, food.getProtein());
            statement.setDouble(7, food.getFat());
            statement.setDouble(8, food.getCarbs());
            statement.setString(9, "null");
            statement.setString(10, foodCode);
            statement.setString(11, servingSizeMeasurement);
            //Execute query.
            return statement.executeUpdate();


        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return 0;
        } finally {
            DBUtil.closePreparedStatement(statement);
            pool.freeConnection(connection);
        }

    }

    /**
     * addFood adds food items to a database. Parameters are an IFood object,
     * and two String objects for food code and serving size measurement (cups
     * ,ounces and grams), plus an extra String parameter specificType to store
     * the specific type of food in the database.
     *
     * @param food
     * @param foodCode
     * @param servingSizeMeasurement
     * @param specificType
     * @return returns the executed query results to the database.
     */
    public static int addFood(IFood food, String foodCode,
            String servingSizeMeasurement, String specificType) {

        //Get a connection to the database through a connection pool.
        //Create an instance of a pool and connection.
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();

        //Instantitate a PreparedStatement
        PreparedStatement statement = null;

        //Instantiate a query to add entered food to database.
        String query = "INSERT INTO FOOD (FOODNAME, DESCRIPTION, CALORIES, "
                + "CALORIESFROMFAT, SERVINGSIZE, PROTEIN, FAT, CARBS, "
                + "SPECIFICFOODTYPE, FOOD_CODE, MEASUREMENT) VALUES "
                + "(?,?,?,?,?,?,?,?,?,?,?)";

        try {
            //Populate the statement with the food information
            //pass in the query as a parameter.
            statement = connection.prepareStatement(query);
            statement.setString(1, food.getName());
            statement.setString(2, food.getDescription());
            statement.setInt(3, food.getCalories());
            statement.setInt(4, food.getCaloriesFromFat());
            statement.setDouble(5, food.getServingSize());
            statement.setDouble(6, food.getProtein());
            statement.setDouble(7, food.getFat());
            statement.setDouble(8, food.getCarbs());
            statement.setString(9, specificType);
            statement.setString(10, foodCode);
            statement.setString(11, servingSizeMeasurement);
            //Execute query.
            return statement.executeUpdate();


        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return 0;
        } finally {
            DBUtil.closePreparedStatement(statement);
            pool.freeConnection(connection);
        }

    }

    /**
     * This request will get a list of all food types out of the Database.
     *
     * @return
     */
    public static Iterator<String> getFoodByType() {
        //List object to hold Food Type list.
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

            //Process the results.
            while (queryResults.next()) { // returns false when empty
                //Get the data from the result set.
                foodType = (String) queryResults.getString("TYPEOFFOOD");
                // add it to the List.
                foodTypesList.add(foodType);
            }
            //display foodList in name sorted order.
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

    /**
     * getFoodNames will get a list of food names that are entered in the
     * database.
     *
     * @return Iterator of a list of foods in the database.
     */
    public static Iterator<String> getFoodNames() {
        //Get a connection to a connection pool to connect to a DB.
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();

        //Instantiate Statement object and ResultSet object.
        Statement statement = null;
        ResultSet queryResults = null;

        //Instantiate a List object to hold entered food names.
        List<String> foodNamesList = new ArrayList<String>();
        //String to hold individual food names as they are read out of the database.
        String foodName;

        try {
            //instantiate the statement.
            statement = connection.createStatement();
            //Query for getting names out of database.
            String query = "Select FOODNAME from FOOD";

            //Execute query results.
            queryResults = statement.executeQuery(query);

            //Process the results.
            while (queryResults.next()) {

                //get the data from the result set.
                foodName = (String) queryResults.getString("FOODNAME");
                //add to list.
                foodNamesList.add(foodName);

            }
            //return the iterator.
            return foodNamesList.iterator();

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return null;
        } finally {
            //Close statements, resultsets and free connection pool.
            DBUtil.closeStatement(statement);
            DBUtil.closeResultSet(queryResults);
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
