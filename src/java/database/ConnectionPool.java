package database;

import java.sql.*;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * The Connection Pool class for the derby database connection. A connection
 * pool is needed to control database connections. Settings for the Class are
 * set in the config file. Two static instance variables are assigned to the
 * Class: ConnectionPool pool and DataSource dataSource. The class also contains
 * a private constructor.
 *
 * @author Paul Trott (ptrott)
 */
public class ConnectionPool {

    //Instance variables.
    private static ConnectionPool pool = null;
    private static DataSource dataSource = null;

    /**
     * private constructor that establishes a ConnectionPool for a derby
     * database connection.
     */
    private ConnectionPool() {
        try {
            InitialContext ic = new InitialContext();
            dataSource = (DataSource)ic.lookup("java:/comp/env/jdbc/healthbenefits");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Static method to get an instance of a ConnectionPool.
     *
     * @return pool - a ConnectionPool
     */
    public static ConnectionPool getInstance() {
        if (pool == null) {
            pool = new ConnectionPool();
        }
        return pool;
    }
    
    /**
     * Returns a connection object to be used for a connection to access the database.
     * @return dataSource connection
     */
    public Connection getConnection(){
        try{
            return dataSource.getConnection();
        }catch(SQLException sqle){
            sqle.printStackTrace();
            return null; 
        }
    }
    
    /**
     * Used to close the Connection object.
     * @param c - a connection to close.
     */
    public void freeConnection(Connection c){
        try{
            c.close();
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}
