<%-- 
    Document   : admin home page, where an admin can administer content to the
                 Health Benefits website.
    Created on : Feb 9, 2013, 12:22:21 AM
    Author     : Paul Trott (ptrott)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Admin Home</title>
        <meta name="viewport" content="initial-scale = 1.0, maximum-scale = 1.0, user-scalable = no, width = device-width">

        <!--[if lt IE 9]><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
        <link rel="stylesheet" href="../css/style.css" media="screen">
        <!--[if lte IE 7]><link rel="stylesheet" href="css/style.ie7.css" media="screen" /><![endif]-->
    </head>
    <body>
        <div id="main">
            <div class="sheet clearfix">
                <header class="header clearfix">
                    <a href="../index.jsp">
                        <img src="../images/logo_Healthfoods.png" alt="Logo for Health Benefits of Foods" title="Logo for Health Benefits of Foods"/>
                    </a>
                </header>
                <div class="layout-wrapper clearfix">
                    <div class="content-layout">
                        <div class="content-layout-row">
                            <div class="layout-cell sidebar1 clearfix">
                                <div class="block clearfix">
                                    <div class="blockheader">
                                        <h3 class="t">Admin Home</h3>
                                    </div>
                                    <div class="blockcontent">
                                        <h4>Welcome...</h4>
                                        <p>
                                            From this page you can add,
                                            edit and delete food items.<br>
                                            As well as, see users and add SubAdmin
                                            users. <br>
                                        <h6>What's a SubAdmin?</h6>
                                            SubAdmin users can add,
                                             edit and see all foods.<br>
                                             SubAdmin users are only used for 
                                             populating your website with food 
                                             items.
                                             <h6>Want to go to public page?</h6>
                                             <a href="../index.jsp">Go to main home page</a>
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
                                                            <a href="enterfood.jsp" class="button">
                                                                Enter a new food
                                                            </a>
                                                            &nbsp;
                                                            <a href="editfood.jsp" class="button">
                                                                Edit a food
                                                            </a>
                                                            &nbsp;
                                                            <a href="allfood.jsp" class="button">
                                                                See all food
                                                            </a>
                                                            &nbsp;
                                                            <br><br>
                                                            <a href="users.jsp" class="button">
                                                                See all users
                                                            </a>
                                                            &nbsp;
                                                            <a href="addSubAdmin.jsp" class="button">
                                                                Add SubAdmin user
                                                            </a>
                                                            
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
