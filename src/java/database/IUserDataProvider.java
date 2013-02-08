package database;

/**
 * Interface for all of the needed method interactions needed to work
 * with a user storage location.
 * @author Paul Trott (ptrott)
 * Date: Feb 5, 2013
 */
public interface IUserDataProvider {
    
    //Add a user
    public String addUser();
    //Remove a user
    public String removeUser();
    //Edit a user
    public String editUser();
    //Show user
    public String showUser();
    
}
