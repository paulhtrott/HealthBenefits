<%-- 
    Document   : rice jsp page to display rice foods.
    Created on : Feb 23, 2013, 2:31:02 PM
    Author     : Paul Trott (ptrott)
--%>

<%@page import="java.util.*"%>
<%@page import="food.information.FoodInfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-US">
    <head>
        <meta charset="utf-8">
        <title>Rice - Health Benefits of Foods</title>
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
                            <li><a href="foods?foodType=rice" class="active">Rice</a></li>
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
                                    <div class="blockheader">
                                        <h3 class="t">
                                            <%--Show user's name if name exists in the session--%>
                                            <%-- otherwise show generic message --%>
                                            <%
                                                String firstName = (String) session.getAttribute("firstName");
                                                if (firstName == null || firstName.equals("") || firstName == "no name") {
                                                    out.println("Hello, Guest!");
                                                    out.println("</h3>");
                                                    out.println("</div>");
                                                    out.println("<div class=\"blockcontent\">");
                                                    out.println("<p style=\"margin-top: 5px\">");
                                                    out.println("<a href=\"signin.jsp\" class=\"button\">Sign in</a><br>");
                                                    out.println("<a href=\"signup.jsp\">New user? Start here.</a>");
                                                    out.println("</p>");
                                                    out.println("</div>");
                                                } else {
                                                    out.println("Hello, " + firstName);
                                                    out.println("</h3>");
                                                    out.println("</div>");
                                                    out.println("<div class=\"blockcontent\">");
                                                    out.println("<p>");
                                                    out.println("<a href=\"SignOutServlet\" class=\"button\">Sign Out</a><br>");
                                                    out.println("</p>");
                                                    out.println("</div>");

                                                }
                                            %>

                                    </div>
                                    <div class="block clearfix">
                                        <div class="blockheader">
                                            <h3 class="t">Search</h3>
                                        </div>
                                        <div class="blockcontent">
                                            <p>
                                                <input type="text" name="search">
                                            </p>
                                            <p style="margin-top: 5px">
                                                <a href="#" class="button">Find</a>
                                            </p>
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
                                                        <div class="layout-cell layout-item-3 " style="width: 100%" >
                                                            <h1>Healthy Rices</h1>
                                                            <ul>
                                                                <%--Code to get foodInfo to display foods on page--%>
                                                                <%
                                                                    List<FoodInfo> foodInfo = (List) session.getAttribute("foodInfo");
                                                                    //Instantiate an iterator
                                                                    Iterator it = foodInfo.iterator();
                                                                    while (it.hasNext()) {
                                                                        FoodInfo food = (FoodInfo) it.next();
                                                                        out.print("<li><h4><a param=" + food.getFoodName() + ">" + food.getFoodName() + "</a></h4></li>");
                                                                        out.print("<li>" + food.getFoodDescription() + "</li><br>");
                                                                    }
                                                                %>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="content-layout-wrapper layout-item-0">
                                                <div class="content-layout layout-item-1">
                                                    <div class="content-layout-row">
                                                        <div class="layout-cell layout-item-2" style="width: 50%" >
                                                            <h3>Watermelon</h3>
                                                            <p>
                                                                This wonderful summer time treat is a fabulous aid for weight loss, 
                                                                lowering cholesterol, avoiding strokes and controlling your blood 
                                                                pressure. <em>So eat up</em>!
                                                            </p>
                                                        </div>
                                                        <div class="layout-cell layout-item-2" style="width: 50%" >
                                                            <h3>Raw Foodism</h3>
                                                            <p>
                                                                The fundamental principle behind raw foodism 
                                                                is that plant foods in their most natural state &mdash; not cooked and 
                                                                not processed &mdash; are the most wholesome for the body. The raw food 
                                                                diet is a <em>lifestyle choice</em>, not a weight loss plan.
                                                            </p>
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