<%-- 
    Document   : Enter food page for admin to enter food items.
    Created on : Feb 9, 2013, 12:22:21 AM
    Author     : Paul Trott (ptrott)
--%>
<%-- import of packages needed for the enterfood page --%>

<%@page import="database.FoodData, java.util.Iterator" 
        contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Enter a Food - Admin</title>
        <meta name="viewport" content="initial-scale = 1.0, maximum-scale = 1.0, user-scalable = no, width = device-width">

        <!--[if lt IE 9]><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
        <link rel="stylesheet" href="../css/style.css" media="screen">
        <!--[if lte IE 7]><link rel="stylesheet" href="css/style.ie7.css" media="screen" /><![endif]-->
    </head>
    <body>
        <div id="main">
            <div class="sheet clearfix">
                <header class="header clearfix">
                    <a href="adminhome.jsp">
                        <img src="../images/logo_Healthfoods.png" alt="Logo for Health Benefits of Foods" title="Logo for Health Benefits of Foods"/>
                    </a>
                </header>
                <div class="layout-wrapper clearfix">
                    <div class="content-layout">
                        <div class="content-layout-row">
                            <div class="layout-cell sidebar1 clearfix">
                                <div class="block clearfix">
                                    <div class="blockheader">

                                        <h3 class="t">Add Food Items</h3>
                                    </div>
                                    <div class="blockcontent">
                                        <h5>Done Adding Food?</h5>
                                        <p>
                                            <a href="adminhome.jsp">Go Home</a>
                                        </p>
                                    </div>
                                </div>
                                <div class="block clearfix">
                                    <div class="blockheader">
                                        <h3 class="t">Foods Added To System</h3>
                                    </div>
                                    <div class="blockcontent scrollBox">
                                        <ul>
                                            <%-- Get a list of entered items from database --%>
                                            <%
                                                if (FoodData.getFoodNames() != null) {
                                                    //Instantiate an iterator
                                                    Iterator it = FoodData.getFoodNames();
                                                    //Add list items to the HTML list.
                                                    while (it.hasNext()) {
                                                        String foodEntered = (String) it.next();
                                                        out.print("<li>" + foodEntered + "</li>");
                                                    }

                                                }
                                            %>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="layout-cell content clearfix">
                                <article class="post article">
                                    <div class="postcontent postcontent-0 clearfix">
                                        <div class="content-layout-wrapper layout-item-0">
                                            <div class="content-layout layout-item-1">
                                                <div class="content-layout-row">
                                                    <div class="layout-cell layout-item-3 ">
                                                        <div id="centerForm">
                                                            <form class="signinform" action="AddFoodServlet" method="get">
                                                                <h1>Enter a new Food</h1>
                                                                <h4>Choose Food:</h4>
                                                                <!--Code to Get a List of food from the DB for the drop down menu-->
                                                                <select name="foodType">
                                                                    <%
                                                                        if (FoodData.getFoodByType() != null) {

                                                                            // Create an iterator to get a list of food items	
                                                                            Iterator it = FoodData.getFoodByType();

                                                                            //Fill in form with database data of food types.
                                                                            while (it.hasNext()) {
                                                                                String currentName = (String) it.next();
                                                                                out.println("<option value=" + currentName + ">" + currentName + "</option>)");
                                                                            }
                                                                        }
                                                                    %>
                                                                </select>

                                                                <!-- Enter a food name -->
                                                                <h4>Name:</h4>
                                                                <input type="text" maxlength="50" size="51" name="foodName" required>
                                                                <small>max length of 50 characters</small>

                                                                <!-- jQuery area for specific type of certain foods -->
                                                                <h4 class="type">Specific Type:</h4>
                                                                <select name="specificType" required>
                                                                    <option value="Sweet"> Sweet </option>
                                                                    <option value="Acidic"> Acidic </option>
                                                                    <option value="Greens"> Greens </option>
                                                                    <option value="Stalk"> Stalk </option>
                                                                    <option value="Tuber"> Tuber </option>
                                                                    <option value="Root"> Root </option>
                                                                    <option value="Mushroom"> Mushroom </option>
                                                                    <option value="Saltwater"> Salt Water</option>
                                                                    <option value="Freshwater"> Fresh Water</option>
                                                                    <option value="SaltFreshwater"> Salt &amp; Fresh Water</option>
                                                                    <option value="Liquid"> Liquid </option>
                                                                    <option value="Solid"> Solid </option>
                                                                    <option value="Nut"> Nut </option>
                                                                </select>

                                                                <h4>Calories:</h4>
                                                                <input type="text" maxlength="4" size="5" name="calories" required>
                                                                <small>max length of 4 numbers.</small><br>

                                                                <!--Enter calories from fat-->
                                                                <h4>Calories from fat:</h4>
                                                                <input type="text" maxlength="4" size="5" name="caloriesFromFat" required>
                                                                <small>max length of 4 characters.</small><br>

                                                                <!-- Enter for serving size-->
                                                                <h4>Serving size:</h4>
                                                                <input type="text" maxlength="6" size="7" name="servingSize" required>
                                                                <small>max length of 6 characters.</small><br>
                                                                <!--Select value for serving size: cups, ounces or grams -->
                                                                <select name="size">
                                                                    <option value="cups">cup</option>
                                                                    <option value="ounces">ounce</option>
                                                                    <option value="grams">gram</option>
                                                                    <option value="grams">tablespoon</option>
                                                                </select>

                                                                <!-- Enter value for carbs-->
                                                                <h4>Carbohydrates:</h4>
                                                                <input type="text" maxlength="6" size="7" name="carbs" required>
                                                                <small>max length of 6 characters.</small><br>

                                                                <!-- Enter value for protein -->
                                                                <h4>Protein:</h4>
                                                                <input type="text" maxlength="6" size="7" name="protein" required>
                                                                <small>max length of 6 characters.</small><br>

                                                                <!-- Enter value for Fat-->
                                                                <h4>Fat:</h4>
                                                                <input type="text" maxlength="6" size="7" name="fat" required>
                                                                <small>max length of 6 characters.</small><br>

                                                                <!-- Enter description -->
                                                                <h4>Description:</h4>
                                                                <textarea rows="15" cols="50" maxlength="3000" name="description" required></textarea>
                                                                <small>minimum of 20 characters and max length of 3000 characters.</small>
                                                                <br>
                                                                <br>
                                                                <!-- Submit button -->
                                                                <input type="submit" value="Add Food to System">
                                                            </form>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </article>
                            </div>
                        </div>
                    </div>
                </div>
                <footer class="footer clearfix">
                    <p>
                        Copyright &copy; 2013 -- All Rights Reserved.
                    </p>
                </footer>
            </div>
        </div>
        <!--JQuery/JavaScript Imports-->
        <script src="../js/jquery.js"></script>
        <script src="../js/script.js"></script>
    </body>
</html>
