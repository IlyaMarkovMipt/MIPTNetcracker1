<%@ page import="javax.naming.*" %>
<%@ page import="java.io.IOException" %>
<%@ page import="java.io.PrintWriter" %>


<html>
<head>
    <title>Test JSP</title>
</head>
<body>
    <h1>Hello, there are <%=request.getAttribute("userNumber")%> users on the server now</h1>
</body>