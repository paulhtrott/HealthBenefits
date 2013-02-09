<%-- 
    Document   : admin
    Created on : Feb 9, 2013, 12:22:21 AM
    Author     : Paul Trott (ptrott)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Admin - Login Page</title>
        <meta name="viewport" content="initial-scale = 1.0, maximum-scale = 1.0, user-scalable = no, width = device-width">

        <!--[if lt IE 9]><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
        <link rel="stylesheet" href="css/style.css" media="screen">
        <!--[if lte IE 7]><link rel="stylesheet" href="css/style.ie7.css" media="screen" /><![endif]-->
        <link rel="stylesheet" href="css/style.responsive.css" media="all">
    </head>
    <body>
        <div id="main">
            <nav class="nav clearfix">
                <ul class="hmenu">
                    <li><a href="index.jsp" class="active">Home</a></li>
                    <li><a href="starter-kits.html">Fruits</a></li>
                    <li><a href="batteries.html">Vegetables</a></li>
                    <li><a href="omizers.html">Fruit-veggies</a></li>
                    <li><a href="tanks-pieces.html">Meats</a></li>
                    <li><a href="drip-tips.html">Grains</a></li>
                    <li><a href="accessories.html">Dairy</a></li>
                    <li><a href="e-liquid.html">Legumes</a></li>
                    <li><a href="clearance.html">Fats</a></li>
                    <li><a href="clearance.html">Herbs</a></li>
                    <li><a href="clearance.html">Sign Up</a></li>
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
                                        <h3 class="t">Hello. (Your Name Here.)</h3>
                                    </div>
                                    <div class="blockcontent">
                                        <form action="j_security_check" method="get">
                                            admin username:
                                            <input type="text" name="j_username">
                                            admin password:
                                            <input type="password" name="j_password">
                                            <p><a href="/">forgot username/password?</a></p>
                                        
                                            <p style="margin-top: 5px">
                                                <a href="#" class="button">Sign in</a>
                                            </p>
                                        </form>
                                        <p>
                                            <a href="/">sign up now</a>
                                        </p>
                                    </div>
                                </div>
                                <div class="block clearfix">
                                    <div class="blockheader">
                                        <h3 class="t">Search</h3>
                                    </div>
                                    <div class="blockcontent">
                                        <p>
                                            <input type="text" name="login">
                                        </p>
                                        <p style="margin-top: 5px">
                                            <a href="#" class="button">Find</a>
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
                                                    <div class="layout-cell layout-item-3 " style="width: 100%" >
                                                        <div class="image-caption-wrapper" style="width: 55%; float: left">
                                                            <img title="Broken Apart Raw Food Image" alt="Broken Apart Raw Food Image" style="width: 100%; " class="lightbox" src="images/rawFood_broken.png">
                                                        </div>
                                                        <h2>PUT TOGETHER A CLEAN LIFE</h2>
                                                        <p>
                                                            Learn about the health benefits of all kinds of raw fruits,
                                                            vegetables, herbs and clean meats. Also, see how much calories,
                                                            carbohydrates, protein and fats are in your favorite foods.
                                                            You will also be able to put together meal plans and see the total
                                                            amount of calories, carbs, proteins and fats that are in the meals.
                                                        </p>
                                                        <p>
                                                            <a href="#">Get Started &#62;</a>
                                                        </p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="content-layout-wrapper layout-item-0">
                                            <div class="content-layout layout-item-1">
                                                <div class="content-layout-row">
                                                    <div class="layout-cell layout-item-2" style="width: 50%" >
                                                        <ul>
                                                            <li>Suspendisse pharetra auctor pharetra. Nunc a sollicitudin est.</li>
                                                            <li>Donec vel neque in neque porta venenatis sed sit amet lectus.</li>
                                                            <li>Curabitur ullamcorper gravida felis, sit amet scelerisque lorem iaculis sed.</li>
                                                        </ul>
                                                    </div>
                                                    <div class="layout-cell layout-item-2" style="width: 50%" >
                                                        <blockquote style="margin: 10px 0">
                                                            Nunc a sollicitudin est. Curabitur ullamcorper gravida felis,
                                                            sit amet scelerisque lorem iaculis sed. Donec vel neque in 
                                                            neque porta venenatis sed sit amet lectus.
                                                        </blockquote>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="content-layout-wrapper layout-item-0">
                                            <div class="content-layout layout-item-1">
                                                <div class="content-layout-row">
                                                    <div class="layout-cell layout-item-2" style="width: 100%" >
                                                        <h1>H1</h1>
                                                        <h2>H2</h2>
                                                        <h3>H3</h3>
                                                        <h4>H4</h4>
                                                        <h5>H5</h5>
                                                        <h6>H6</h6>
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
        <script src="js/jquery.js"></script>
        <script src="js/script.js"></script>
        <script src="js/script.responsive.js"></script> 
    </body>
</html>
