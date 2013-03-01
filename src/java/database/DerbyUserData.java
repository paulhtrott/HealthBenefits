package database;

//import user class.

import java.sql.*;
import user.User;

/**
 * A class definition for a DerbyUserData for making requests to the Database for
 * food related requests.
 *
 * @author Paul Trott (ptrott)
 */
public class DerbyUserData {

    /**
     * insertUser adds a user to the database. Takes in a User object as a
     * parameter.
     *
     * @param user
     * @return an integer value of the executedUpdate query.
     */
    public static int insertUser(User user) {

        //To hold a statement object.
        PreparedStatement statement = null;
        //To query to be run when a user is added.
        String query = "INSERT INTO USERS (USERNAME, FIRSTNAME, PASSWORD, "
                + "EMAILADDRESS, USER_TYPE) "
                + "VALUES (?,?,?,?,?)";

        //Get connection to connection pool
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();

        try {
            
            //Populate the statements with the users information
            //to be entered into the database.
            statement = connection.prepareStatement(query);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getFirstName());
            statement.setString(3, user.getPassword());
            statement.setString(4, user.getEmailAddress());
            statement.setString(5, User.getUSER_CODE());
            //Execute insertUser statement.
            return statement.executeUpdate();

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return 0;
        } finally {
            //Free connection pool and close prepared statement.
            DBUtil.closePreparedStatement(statement);
            pool.freeConnection(connection);
        }

    }
    
    /**
     * addToUserCodeTable will add the user required user information into the
     * USERCODE table. This method will be called when a user signs up for an account.
     * 
     * @param user user object parameter.
     * @return an integer value based on the executeUpdate query results.
     */
    public static int addToUserCodeTable(User user){
        
        //Instantiate a connection to a connection pool.
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        
        //To hold a statement object.
        PreparedStatement statement = null;
        
        //Query to insert a user into the UserCode database;        
        String query = "INSERT INTO USERCODE (USER_TYPE, USERNAME) values"
                + "(?, ?)";
        
        try{
            //Populate the statement with thequery and user information
            statement = connection.prepareStatement(query);
            statement.setString(1, User.getUSER_CODE());
            statement.setString(2, user.getUsername());
            //Execute query statement
            return statement.executeUpdate();
            
        }catch(SQLException sqle){
            sqle.printStackTrace();
            return 0;
        }finally {
            //Free pool connection and close prepared statement.
            DBUtil.closePreparedStatement(statement);
            pool.freeConnection(connection);
        }
        
    }

    /**
     * userExists checks to see if a user Exists in the database
     *
     * @param emailAddress
     * @param username
     * @return true if user exists
     * @return false if user does not exist
     */
    public static boolean isUserExisting(String emailAddress, String username) {

        //Get a connection to the database.
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();

        //Instantiate a Prepared statement and ResultSet object
        PreparedStatement statement = null;
        ResultSet rs = null;

        //Query to check users database to see if user already exists. 
        String query = "SELECT EMAILADDRESS, USERNAME FROM USERS WHERE EMAILADDRESS = ? OR USERNAME = ?";

        try {
            //Setup query with the following as parameters in the query.
            statement = connection.prepareStatement(query);
            statement.setString(1, emailAddress);
            statement.setString(2, username);
            //Run query
            rs = statement.executeQuery();
            //If the Result set exists returns true.
            return rs.next();

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        } finally {
            DBUtil.closeStatement(statement);
            DBUtil.closeResultSet(rs);
            pool.freeConnection(connection);
        }


    }

    /**
     * Checks to see if a user is already a member of the site, by checking the database,
     * to see if the users username already exists in the system.
     * @param username
     * @return 
     */
    public static boolean isUserAMember(String username) {
        //Setup database pool connection
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();

        //Variables to hole statements and result sets.
        PreparedStatement statement = null;
        ResultSet rs = null;

        //Query to database to determine if user exists.
        String query = "SELECT USERNAME FROM USERS WHERE USERNAME = ?";

        try {
            //setup query with the following parameters.
            statement = connection.prepareStatement(query);
            statement.setString(1, username);
            //run query
            rs = statement.executeQuery();
            //return true if statement has a value.
            return rs.next();

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        } finally {
            DBUtil.closePreparedStatement(statement);
            DBUtil.closeResultSet(rs);
            pool.freeConnection(connection);
        }
    }

    /**
     * Gets a user out of the database using the username inserted as a parameter.
     * 
     * @param username - Users stored username in the database.
     * @return user - Returns a user with all stored attributes of a user.
     */
    public static User getUserOutOfDB(String username) {

        //Establish a connection ppol connection.
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();

        //Instantiate a PreparedStatement and ResultSet.
        PreparedStatement statement = null;
        ResultSet rs = null;

        //Query based on passed in username parameter.
        String query = "Select USERS.USERNAME, USERS.FIRSTNAME, "
                + "USERS.PASSWORD, USERS.EMAILADDRESS from USERS, "
                + "USERCODE WHERE"
                + " USERCODE.USER_TYPE = 'WebUser' AND USERS.USER_TYPE = 'WebUser' AND "
                + "USERS.USERNAME = ? AND USERCODE.USERNAME = ?";

        try {
            //Instantiate a user object.
            User user = new User();
            //Setup query with the follwing parameters
            statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, username);
            rs = statement.executeQuery();
            //Set results of query into a new user
            while (rs.next()) {
                user.setUsername(rs.getString("USERNAME"));
                user.setFirstName(rs.getString("FIRSTNAME"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setEmailAddress(rs.getString("EMAILADDRESS"));
            }
            System.out.println("User info: \n" + user.getUsername() +"\n"
                    + user.getFirstName() +"\n"+ user.getPassword() +"\n" +
                    user.getEmailAddress());
            return user;
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return null;
        } finally {
            DBUtil.closePreparedStatement(statement);
            DBUtil.closeResultSet(rs);
            pool.freeConnection(connection);
        }

    }
//    //Remove a user
//    public static String removeUser();
//    //For a user to be able to change password.
//    public static String changePassword();
//    //Get username, for users who forget username.
//    public static String getUsername();
}
