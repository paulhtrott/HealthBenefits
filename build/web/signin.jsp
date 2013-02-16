<%-- 
    Document   : Sign in page for Health Benefits of Foods.
    Created on : Feb 9, 2013, 12:22:21 AM
    Author     : Paul Trott (ptrott)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Sign in - Health Benefits</title>
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
                                                            <form class="signinform" action="SignInServlet" method="get">
                                                                <%-- 
                                                                    Get Cookies to pre-fill username of sign-in form.
                                                                    Make user fill in password.
                                                                --%>
                                                                <%
                                                                    Cookie[] cookies = request.getCookies();
                                                                    String username = util.CookieUtil.getCookieValue(cookies, "usernameCookie");
                                                                %>
                                                                <h2>Sign In</h2>
                                                                <h4>What is your username?</h4>
                                                                My username is:<input type="text" maxlength="20" size="25" name="username"
                                                                                      value ="<%= username %>" >
                                                                <h4>What is your password?</h4>
                                                                My password is:<input type="password" maxlength="20" size="50" name="password">
                                                                <p></p>
                                                                <input type="submit" value="Sign into your account">
                                                            </form>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <br>
                                        <div class="content-layout-wrapper layout-item-0">
                                            <div class="content-layout layout-item-1">
                                                <div id="centerForm">
                                                    <div class="content-layout-row">
                                                        <div class="layout-cell layout-item-2">
                                                            <h4>Don't have an account? Sign up now.</h4>
                                                            <a href="signup.jsp" class="button">Sign up</a>
                                                            <br>
                                                            <h4>Sign In Help</h4>
                                                            <p>Forgot your password? <a>Get password help.</a><br>
                                                                Would you like to change your email address? <a>Update it here.</a></p>
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
