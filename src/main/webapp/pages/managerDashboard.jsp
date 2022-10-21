<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 20/10/2022
  Time: 09:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Manager Dashboard</title>
    <script src="https://cdn.tailwindcss.com"></script>

</head>
<body>
<div>
    <div>
        <jsp:include page="../components/header.jsp"></jsp:include>
    </div>
    <div class="flex justify-between w-full">

    <jsp:include page="../components/managerDashboad/sideBar.jsp"></jsp:include>

    <jsp:include page="../components/managerDashboad/rooms.jsp"></jsp:include>

    </div>
</div>
</body>
</html>
