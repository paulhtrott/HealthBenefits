package database;


/**
 * Interface for all of the needed method interactions needed to work
 * with a food storage location.
 * @author Paul Trott (ptrott)
 * Date: Feb 5, 2013
 */
public interface IFoodDataProvider {
    
    //Update a food item.
    public String updateFood();
    //Add a food item.
    public String addFood();
    //Get a food by type
    public String getFoodByType();
    //Remove a food item
    public String removeFood();
    //Get all food items
    public String getAllFood();
    //Show selected food item.
    public String showSelectedFood();
    //Search food items.
    public String searchFoods();
    
}
