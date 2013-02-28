package database;

//Imports.
import food.*;
import food.information.FoodInfo;
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
 * A class definition for DerbyFoodData for making requests to the Database for
 * food related requests.
 *
 * This DerbyFoodData Class is in the database package.
 *
 * @author Paul Trott (ptrott) Date: Feb 9, 2012
 */
public class DerbyFoodData {

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

    public static List<FoodInfo> getListOfFoods(String foodType) {
        //Instantiate a HashMap for food items
        List<FoodInfo> foodList = new ArrayList<FoodInfo>();
        //Instantiate an IFood
        IFood food = null;
        //Instantiate String objects to hold Food name and Description.
        String foodName;
        String foodDescription;

        //Instantiate a ConnectionPool and Connection Object
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();

        //Instantiate a PreparedStatement and ResultSet
        PreparedStatement statement = null;
        ResultSet queryResults = null;

        //Query for getting food information out of the database.
        String query = "Select FOOD.FOODNAME, FOOD.DESCRIPTION FROM FOOD, FOODCODE  "
                + "WHERE FOODCODE.FOOD_CODE = ? AND FOOD.FOOD_CODE = ?";

        try {

            //instantiate the PreparedStatement
            statement = connection.prepareStatement(query);

            //If food has a specificType associated then have to use a different mapping
            //that includes the specificType.
            if (foodType.compareTo("fruits") == 0) {
                //Instantite a new IFood as a fruit.
                food = new Fruit();

            } else if (foodType.compareTo("vegetables") == 0) {
                //Instantiate a new IFood object as a vegetable
                food = new Vegetable();

            } else if (foodType.compareTo("fruitveg") == 0) {
                //Instantiate a new IFood object as a fruitveg
                food = new FruitVeg();

            } else if (foodType.compareTo("poultry") == 0) {
                //Instantiate a new IFood object as a poultry
                food = new Poultry();

            } else if (foodType.compareTo("fish") == 0) {
                //Instantiate a new IFood object as a fish
                food = new Fish();

            } else if (foodType.compareTo("wildgame") == 0) {
                //Instantiate a new IFood object as a wildgame
                food = new WildGame();

            } else if (foodType.compareTo("redmeat") == 0) {
                //instantiate a new IFood object as a redmeat
                food = new RedMeat();

            } else if (foodType.compareTo("bread") == 0) {
                //Instantiate a new IFood object as a bread
                food = new Bread();

            } else if (foodType.compareTo("cereal") == 0) {
                //Instantiate a new IFood object as a cereal
                food = new Cereal();

            } else if (foodType.compareTo("rice") == 0) {
                //Instantiate a new IFood object as a rice
                food = new Rice();

            } else if (foodType.compareTo("pasta") == 0) {
                //instantiate a new IFood object as a pasta
                food = new Pasta();

            } else if (foodType.compareTo("dairy") == 0) {
                //Instantiate a new IFood object as a dairy
                food = new Dairy();

            } else if (foodType.compareTo("legumes") == 0) {
                //Instantiate a new IFood object as a legumes
                food = new Legume();

            } else if (foodType.compareTo("fats") == 0) {
                //Instantiate a new IFood object as a fats
                food = new Fat();

            } else if (foodType.compareTo("herbs") == 0) {
                //Instantiate a new IFood object as a herbs
                food = new Herb();
            }

            //Set parameters in the query, based on food type.
            statement.setString(1, food.getFOOD_CODE());
            statement.setString(2, food.getFOOD_CODE());

            //Execute the query store results in a result set
            queryResults = statement.executeQuery();

            //Process Results
            while (queryResults.next()) {

                //Store food name
                foodName = (String) queryResults.getString("FOODNAME");
                //Store food description
                foodDescription = (String) queryResults.getString("DESCRIPTION");
                //Add food name and description to HashMap object.
                foodList.add(new FoodInfo(foodName, foodDescription));

            }
            //Return the food list based on type.
            return foodList;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return null;
        } finally {
            //Close statments, results and free the connection pool.
            DBUtil.closePreparedStatement(statement);
            DBUtil.closeResultSet(queryResults);
            pool.freeConnection(connection);
        }
    }
    
    
    public static List<FoodInfo> searchFoods(String search) {
        //Instantiate a List Object to hole food Information
        List<FoodInfo> foodList = new ArrayList<FoodInfo>();
        
        //Instantiate a FoodInfo object to hold food name and description.
        FoodInfo foodInfo;
        //Instantiate String objects to hold food name and description.
        String foodName;
        String foodDescription;
        
        //Setup a Connection and a ConnectionPool
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        
        //Instantiate an object for a Statement and query ResultSet
        Statement statement = null;
        ResultSet queryResults = null;
        
        //String to hold query to database to find foods based on search string.
        String query = "SELECT FOODNAME, DESCRIPTION FROM FOOD"
                + " WHERE FOODNAME LIKE '%" + search + "%' OR DESCRIPTION LIKE '%" + search + "%'";
        
        try{
            //instantiate the prepared statement, pass in the query
            statement = connection.createStatement();
            
            //Execute the query
            queryResults = statement.executeQuery(query);
            
            //Iterate throught the results. Add the results in a list,
            //with name and description.
            while(queryResults.next()){
                //Store the food name
                foodName = (String) queryResults.getString("FOODNAME");
                //Store the food description
                foodDescription = (String) queryResults.getString("DESCRIPTION");
                //Insert name and description into FoodInfo object
                foodInfo = new FoodInfo(foodName, foodDescription);
                //Store FoodInfo object in the list.
                foodList.add(foodInfo);
            }
            //Return the foodList
            return foodList;
            
        }catch(SQLException sqle){
            //Handle Exception
            sqle.printStackTrace();
            return null;
        }finally {
            //Close all database connections and result sets.
            DBUtil.closePreparedStatement(statement);
            DBUtil.closeResultSet(queryResults);
            //Close connection pool (free connection)
            pool.freeConnection(connection);
        }
        
        
    }

    public static String removeFood() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static String showSelectedFood() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
