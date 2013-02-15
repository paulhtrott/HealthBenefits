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
        <link rel="stylesheet" href="../css/style.responsive.css" media="all">
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
                            </div>
                            <div class="layout-cell content clearfix">
                                <article class="post article">
                                    <div class="postcontent postcontent-0 clearfix">
                                        <div class="content-layout-wrapper layout-item-0">
                                            <div class="content-layout layout-item-1">
                                                <div class="content-layout-row">
                                                    <div class="layout-cell layout-item-3 ">
                                                        <div id="centerForm">
                                                            <form class="signinform" action="AddFoodToDBServlet" method="get">
                                                                <h1>Enter a new Food</h1>
                                                                <h4>Food Type?</h4>
                                                                <!--Code to Get a List of food from the DB-->
                                                                <select name="foodtypelist">
                                                                    <%
                                                                        if (FoodData.getFoodByType() != null) {

                                                                            // Create an iterator to get a list of food items	
                                                                            Iterator it = FoodData.getFoodByType();

                                                                            //Fill in form with database data of book titles.
                                                                            while (it.hasNext()) {
                                                                                String currentName = (String) it.next();
                                                                    %>
                                                                    <option name="<%= currentName%>"><%= currentName%></option>
                                                                    <% }
                                                                    } else {
                                                                    %>
                                                                    <p>Food Information is Currently Unavailable, Please Check Back Later</p>
                                                                    <%}%>
                                                                </select>

                                                                <h4>Enter food name:</h4>
                                                                <input type="text" maxlength="49" size="50" name="name">
                                                                <small>Example format: johnDoe@gmail.com</small>

                                                                <h4>Enter food description:</h4>
                                                                <input type="" maxlength="19" size="50" name="description">
                                                                <small>minimum length of 7 and a max length of 19 characters.</small>

                                                                <h4>Enter food calories:</h4>
                                                                <input type="text" maxlength="30" size="50" name="calories">
                                                                <small>minimum length of 8 and a max length of 30 characters.</small><br>
                                                                
                                                                <h4>Enter food calories from fat:</h4>
                                                                <input type="text" maxlength="30" size="50" name="caloriesFromFat">
                                                                <small>minimum length of 8 and a max length of 30 characters.</small><br>
                                                                
                                                                <h4>Enter food serving size:</h4>
                                                                <input type="text" maxlength="30" size="50" name="servingSize">
                                                                <select>
                                                                    <option name="cups">cups</option>
                                                                    <option name="ounces">ounces</option>
                                                                    <option name="grams">grams</option>
                                                                </select>
                                                                <small>minimum length of 8 and a max length of 30 characters.</small><br>
                                                                
                                                                <h4>Enter food carbs:</h4>
                                                                <input type="text" maxlength="30" size="50" name="carbs">
                                                                <small>minimum length of 8 and a max length of 30 characters.</small><br>
                                                                
                                                                <h4>Enter food protein:</h4>
                                                                <input type="text" maxlength="30" size="50" name="protein">
                                                                <small>minimum length of 8 and a max length of 30 characters.</small><br>
                                                                
                                                                <h4>Enter food fat:</h4>
                                                                <input type="text" maxlength="30" size="50" name="fat">
                                                                <small>minimum length of 8 and a max length of 30 characters.</small><br>
                                                                
                                                                <h4>Enter food carbs:</h4>
                                                                <input type="text" maxlength="30" size="50" name="carbs">
                                                                <small>minimum length of 8 and a max length of 30 characters.</small><br>
                                                                
                                                                
                                                                

                                                                <p></p>
                                                                <input type="submit" value="Set up my account">
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
        <script src="../js/script.responsive.js"></script> 
    </body>
</html>
