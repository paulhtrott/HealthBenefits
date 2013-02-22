package database;

import java.sql.*;

/**
 * A class definition for a DBUtil class allowing for an easier way to 
 * close database query statements and ResultSets.
 * 
 * This DBUtil Class is in the database package.
 * 
 * @author Paul Trott (ptrott)
 * Date: February 9, 2013
 */
public class DBUtil {
    
    /**
     * Close statement connections.
     * @param s 
     */
    public static void closeStatement(Statement s){
        try{
            if(s != null){
                s.close();
            }
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Close Prepared Statement connections.
     * @param ps 
     */
    public static void closePreparedStatement(Statement ps){
        try{
            if(ps != null){
                ps.close();
            } 
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    /**
     * Close ResultSet connections.
     * @param rs 
     */
    public static void closeResultSet(ResultSet rs){
        try{
            if(rs != null){
                rs.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
