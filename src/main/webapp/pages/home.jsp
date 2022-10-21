<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 14/10/2022
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body>
    <%@ include file="../components/header.jsp" %>
    <div class="w-full h-[90vh]">
        <div class="flex justify-between w-full h-[60vh]  relative">
            <div class="flex justify-center items-center w-1/2">
                <span class="text-3xl font-bold" >
                    Hello from hotel holiday booking page
                    ${dateD}
                    ${dateF}
                </span>
            </div>
            <div class="flex justify-end w-1/2 absolute right-0">
                <img class="border-8 border-white border-white h-[500px] w-full" src="https://digital.ihg.com/is/image/ihg/holiday-inn-youngstown-2532030258-4x3" alt="">
            </div>

        </div>
        <div class="bg-black w-full h-[30vh]"></div>
    </div>
    <%@ include file="../components/footer.jsp" %>
</body>
</html>
