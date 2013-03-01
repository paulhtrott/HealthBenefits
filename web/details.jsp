<%-- 
    Document   : details jsp page to show the details of which ever food is picked.
    Created on : Feb 28, 2013, 12:40:58 PM
    Author     : Paul Trott (ptrott)
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Food Details - Health Benefits of Foods</title>
        <meta name="viewport" content="initial-scale = 1.0, maximum-scale = 1.0, user-scalable = no, width = device-width">

        <!--[if lt IE 9]><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
        <link rel="stylesheet" href="css/style.css" media="screen">
        <!--[if lte IE 7]><link rel="stylesheet" href="css/style.ie7.css" media="screen" /><![endif]-->

    </head>
    <body>
        <div id="main">
            <nav class="nav clearfix">
                <ul class="hmenu">
                    <li><a href="index.jsp" >Home</a></li>
                    <li><a href="foods?foodType=fruits">Fruits</a></li>
                    <li><a href="foods?foodType=vegetables">Vegetables</a></li>
                    <li><a href="foods?foodType=fruitveg">Fruit-Veggies</a></li>
                    <li><a href="#">Meats</a>
                        <ul>
                            <li><a href="foods?foodType=poultry">Poultry</a></li>
                            <li><a href="foods?foodType=fish">Fish</a></li>
                            <li><a href="foods?foodType=wildgame">Wild Game</a></li>
                            <li><a href="foods?foodType=redmeat">Red Meat</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Grains</a>
                        <ul>
                            <li><a href="foods?foodType=bread">Bread</a></li>
                            <li><a href="foods?foodType=cereal">Cereal</a></li>
                            <li><a href="foods?foodType=rice">Rice</a></li>
                            <li><a href="foods?foodType=pasta">Pasta</a></li>
                        </ul>
                    </li>
                    <li><a href="foods?foodType=dairy">Dairy</a></li>
                    <li><a href="foods?foodType=legumes">Legumes</a></li>
                    <li><a href="foods?foodType=fats">Fats</a></li>
                    <li><a href="foods?foodType=herbs">Herbs</a></li>
                </ul> 
            </nav>
            <div class="sheet clearfix">
                <header class="header clearfix">
                    <a href="index.jsp">
                        <img src="images/logo_Healthfoods.png" alt="Logo for Health Benefits of Foods" title="Logo for Health Benefits of Foods"/>
                    </a>
                </header>
                <div class="layout-wrapper clearfix">
                    <div class="content-layout">
                        <div class="content-layout-row">
                            <div class="layout-cell sidebar1 clearfix">
                                <div class="block clearfix">
                                    <%--Show user's name if name exists in the session--%>
                                    <%-- otherwise show generic message --%>
                                    <c:choose>
                                        <c:when test="${firstName == null || firstName.equals('') || firstName == 'no name'}">

                                            <div class="blockheader">
                                                <h3 class="t">Hello, Guest!</h3>
                                            </div>
                                            <div class="blockcontent">
                                                <p style="margin-top: 5px">
                                                    <a href="signin.jsp" class="button">Sign in</a><br>
                                                    <a href="signup.jsp">New user? Start here.</a>
                                                </p>
                                            </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="blockheader">
                                                <h3 class="t">Hello, ${firstName}</h3>
                                            </div>
                                            <div class="blockcontent">
                                                <p>
                                                    <a href="signout" class="button">Sign Out</a><br>
                                                </p>
                                            </div>
                                        </c:otherwise>
                                    </c:choose>
                                </div>

                                <div class="block clearfix">
                                    <div class="blockheader">
                                        <h3 class="t">Search For Food</h3>
                                    </div>
                                    <div class="blockcontent">
                                        <!--Search Website for Food-->
                                        <form action="searchresults" method="get">
                                            <input type="text" name="search" required>
                                            <input type="submit" class="button" value="Find">
                                        </form>
                                    </div>
                                </div>
                                <div class="vmenublock clearfix">
                                    <div class="vmenublockcontent">
                                        <div class="blockheader">
                                            <h3 class="t">Healthy Living</h3>
                                        </div>
                                        <ul class="vmenu">
                                            <li><a href="/index.jsp">Fitness Tips</a></li>
                                            <li><a href="/index.jsp">Breakfast Ideas</a></li>
                                            <li><a href="/index.jsp">Lunch Ideas</a></li>
                                            <li><a href="/index.jsp">Dinner Ideas</a></li>
                                            <li><a href="/index.jsp">Snack Ideas</a></li>
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
                                                    <div class="layout-cell layout-item-3" style="width: 70%" >
                                                        <h1>${food.foodName}</h1>
                                                        <p>${food.description}</p>
                                                    </div>
                                                    <div class="layout-cell layout-item-2" style="width: 30%" >
                                                        <h2>Nutritional Facts</h2>
                                                        <%--Choice based on the value of specificFoodType--%>
                                                        <c:choose>
                                                            <c:when test="${food.specificFoodType != 'null'}">
                                                                <h6>${food.foodName}&nbsp;&#124;&nbsp;${food.specificFoodType}</h6>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <h6>${food.foodName}</h6>
                                                            </c:otherwise>
                                                        </c:choose>
                                                        <table>
                                                            <tr>
                                                                <td><h5>Serving Size</h5></td>
                                                                <td><h5>${food.servingSize}&nbsp;${food.measurement}</h5></td>
                                                            </tr>
                                                            <tr class="alt">
                                                                <td><h5>Calories</h5></td>
                                                                <td><h5>${food.calories}</h5></td>
                                                            </tr>
                                                            <tr>
                                                                <td><h5>Calories from fat</h5></td>
                                                                <td><h5>${food.caloriesFromFat}</h5></td>
                                                            </tr>
                                                            <tr class="alt">
                                                                <td><h5>Total fat</h5></td>
                                                                <td><h5>${food.fat}&nbsp;g</h5></td>
                                                            </tr>
                                                            <tr>
                                                                <td><h5>Total carbs</h5></td>
                                                                <td><h5>${food.carbs}&nbsp;g</h5></td>
                                                            </tr>
                                                            <tr class="alt">
                                                                <td><h5>Protein</h5></td>
                                                                <td><h5>${food.protein}&nbsp;g</h5></td>
                                                            </tr>
                                                        </table>
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
                        <a href="https://twitter.com/NickiTrott" title="Health Benefits of Foods Twitter Page">
                            <img src="images/twitter.gif" alt="Logo for Health Benefits of Foods Twitter Page" title="Logo for Health Benefits of Foods Twitter Page" />
                            Follow on Twitter 
                        </a>
                        &nbsp;&nbsp;&nbsp;Copyright &copy; 2013 -- All Rights Reserved.
                    </p>
                    <p><a href="admin/adminhome.jsp">Admin Login</a></p>
                </footer>
            </div>
        </div>
        <!--JQuery/JavaScript Imports-->
        <script src="js/jquery.js"></script>
        <script src="js/script.js"></script>
        <script src="js/script.responsive.js"></script> 
    </body>
</html>
