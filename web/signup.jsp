<%-- 
    Document   : Sign up page for Health Benefits of Foods
    Created on : Feb 9, 2013, 12:22:21 AM
    Author     : Paul Trott (ptrott)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Sign up - Health Benefits</title>
        <meta name="viewport" content="initial-scale = 1.0, maximum-scale = 1.0, user-scalable = no, width = device-width">

        <!--[if lt IE 9]><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
        <link rel="stylesheet" href="css/style.css" media="screen">
        <!--[if lte IE 7]><link rel="stylesheet" href="css/style.ie7.css" media="screen" /><![endif]-->
        <link rel="stylesheet" href="css/style.responsive.css" media="all">
    </head>
    <body>
        <div id="main">
            <div class="sheet clearfix">
                <header class="header clearfix">
                    <a href="index.jsp">
                        <img src="images/logo_Healthfoods.png" alt="Logo for Health Benefits of Foods" title="Logo for Health Benefits of Foods"/>
                    </a>
                </header>
                <div class="layout-wrapper clearfix">
                    <div class="content-layout">
                        <div class="content-layout-row">
                            <div class="layout-cell content clearfix">
                                <article class="post article">
                                    <div class="postcontent postcontent-0 clearfix">
                                        <div class="content-layout-wrapper layout-item-0">
                                            <div class="content-layout layout-item-1">
                                                <div class="content-layout-row">
                                                    <div class="layout-cell layout-item-3 ">
                                                        <div id="centerForm">
                                                            <form class="signinform" action="signup" method="post">
                                                                <%-- Gets the message from the Signup Servlet Attribute --%>
                                                                <%-- If message equals null enter nothing, other null will be displayed --%>
                                                                <%
                                                                    String message = (String) session.getAttribute("message");
                                                                    if (message == null) {
                                                                        message = "";
                                                                    }
                                                                %>
                                                                <h1>Sign Up Today</h1>
                                                                <!--Display error message in case of error -->
                                                                <p class="error"><%= message %></p>
                                                                <h4>What is your first name?</h4>
                                                                My first name is:<input type="text" maxlength="49" size="50" name="firstname">
                                                                <small>max length of 49 characters.</small>

                                                                <h4>What is your email address?</h4>
                                                                My email address is:<input type="text" maxlength="150" size="50" name="emailaddress">
                                                                <small>Example format: johnDoe@gmail.com</small>

                                                                <h4>What username would you like?</h4>
                                                                I'd like the username:<input type="text" maxlength="100" size="50" name="username">
                                                                <small>minimum length of 6 and a max length of 100 characters.</small>

                                                                <h4>What excellent password would you like to use?</h4>
                                                                I'd like my password to be:<input type="password" maxlength="30" size="50" name="password1">
                                                                <small>minimum length of 8 and a max length of 30 characters.</small><br>
                                                                Please confirm your password:<input type="password" maxlength="30" size="50" name="password2">

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
        <script src="js/jquery.js"></script>
        <script src="js/script.js"></script>
        <script src="js/script.responsive.js"></script> 
    </body>
</html>
