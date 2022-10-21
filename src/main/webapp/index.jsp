<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <script src="https://cdn.tailwindcss.com"></script>
<%--    <META http-equiv="refresh" content="5;URL=./pages.home.jsp">--%>
</head>
<body>
<%--redirecting to home page --%>
<jsp:forward page="pages/home.jsp"/>
<a href="pages/home.jsp">home</a>



</body>
</html>