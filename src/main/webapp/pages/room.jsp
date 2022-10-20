<%--
  Created by IntelliJ IDEA.
  User: YC
  Date: 10/19/2022
  Time: 2:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Room</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<nav><%@ include file="../components/header.jsp" %></nav>


<body>
<section class="overflow-hidden text-gray-700 flex flex-row">

    <div class="flex m-1 w-[28%]">
        <div class="flex flex-col p-3 w-[100%] border-2 border-black">
            <div class="space-y-3">
                <form class="relative flex flex-col space-y-4">
                    <div class="form-texts flex flex-col space-y-2">
                        <h1 class="text-center text-[26px] font-medium text-black">Reserver cette Chambre</h1>
                        <p class="text-center text-[14px]">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Eius unde animi minima puezi zeryiur uzriyr a_èàéiz minima puezi zeryiur uzriyr a_èàéiz .</p>
                    </div>
                    <div class="flex flex-col space-y-2">
                        <label class="text-[18px] pl-1.5">Choisisser un date de début .</label>
                        <input type="date" name="Search" placeholder="Date de début" class="w-full py-2 pl-10 text-sm border-[2px] border-black">

                    </div>
                    <div class="flex flex-col space-y-2">
                        <label class="text-[18px] pl-1.5">Choisisser un date de fin .</label>
                        <input type="date" name="Search" placeholder="Date de fin" class="w-full py-2  pl-10 text-sm border-[2px] border-black">
                    </div>
                    <div class="flex flex-col space-y-2">
                        <label class="text-[18px] pl-1.5">Choisisser un date de fin .</label>
                        <select type="" name="Search"  class="w-full py-2 pl-10 text-sm border-2 border-black">
                            <option value="" selected disabled hidden>Choisisser un extra</option>
                            <option>Spa : +30</option>
                            <option>Massage +50</option>
                        </select>
                    </div>

                    <button type="button" class="inline-block px-6 py-3 border-2 border-black text-black font-medium text-xs leading-tight uppercase  hover:bg-black hover:bg-opacity-5 focus:outline-none focus:ring-0 transition duration-150 ease-in-out"><a href=".jsp">Reserver</a></button>
                </form>

            </div>

        </div>
    </div>
        <div class="container flex flex-col w-100">
                <div class=" p-1 titles-container">
                    <h1 class="text-4xl font-bold text-[#000000]">ROOM One</h1>
                    <p>uiezh uzraeo zaeuhr zahtsdquh çrut zruepit reçzpyt reizup oierh erz^ti.</p>
                </div>
                <div class="flex w-[98%]">
                    <div class="flex flex-wrap w-1/2">
                        <div class="w-1/2 c md:p-2">
                            <img alt="gallery" class="block object-cover object-center w-full h-full"
                                 src="https://mdbcdn.b-cdn.net/img/Photos/Horizontal/Nature/4-col/img%20(70).webp">
                        </div>
                        <div class="w-1/2 p-1 md:p-2">
                            <img alt="gallery" class="block object-cover object-center w-full h-full"
                                 src="https://mdbcdn.b-cdn.net/img/Photos/Horizontal/Nature/4-col/img%20(72).webp">
                        </div>
                        <div class="w-full p-1 md:p-2">
                            <img alt="gallery" class="block object-cover object-center w-full h-full"
                                 src="https://mdbcdn.b-cdn.net/img/Photos/Horizontal/Nature/4-col/img%20(73).webp">
                        </div>
                    </div>
                    <div class="flex flex-wrap w-1/2">
                        <div class="w-full p-1 md:p-2">
                            <img alt="gallery" class="block object-cover object-center w-full h-full"
                                 src="https://mdbcdn.b-cdn.net/img/Photos/Horizontal/Nature/4-col/img%20(74).webp">
                        </div>
                        <div class="w-1/2 p-1 md:p-2">
                            <img alt="gallery" class="block object-cover object-center w-full h-full"
                                 src="https://mdbcdn.b-cdn.net/img/Photos/Horizontal/Nature/4-col/img%20(75).webp">
                        </div>
                        <div class="w-1/2 p-1 md:p-2">
                            <img alt="gallery" class="block object-cover object-center w-full h-full"
                                 src="https://mdbcdn.b-cdn.net/img/Photos/Horizontal/Nature/4-col/img%20(77).webp">
                        </div>
                    </div>
                </div>

        </div>

    </div>
</section>
</body>
<footer><%@ include file="../components/footer.jsp" %></footer>
</html>
