<%@ page import="java.util.Date" %>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.util.Locale" %><%--
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
    <link href = "https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel = "stylesheet">
    <script src = "https://code.jquery.com/jquery-1.10.2.js"></script>
    <script src = "https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
    <script>


        $(function() {
            $( "#datepicker" ).datepicker({
                beforeShowDay : function (date){
                   // Set date format to yyyy-mm-dd
                     var options = {
                        year: "numeric",
                        month: "2-digit",
                        day: "2-digit"
                     }
                    //filter the date that going to be displayed in the datepicker
                     if(date.toLocaleDateString("en-US",options) < new Date().toLocaleDateString("en-US",options)){
                        return [false];
                      }else {
                        return [true];
                    }
                }
            });
        });
        console.log($("#datepicker").val());
        // Second Calendar
        $(function () {
            $("#datepicker2").datepicker({

                minDate : $("#datepicker").val()
            });
        });
    </script>
</head>
<nav><%@ include file="../components/header.jsp" %></nav>


<body>
<section class="overflow-hidden text-gray-700 flex flex-row">

    <div class="flex m-1 w-[28%]">
        <div class="flex flex-col p-3 w-[100%] border-2 border-black">
            <div class="space-y-3">
                <form class="relative flex flex-col space-y-4" action="../ReservationServlet" method="Get">
                    <div class="form-texts flex flex-col space-y-2">
                        <h1 class="text-center text-[26px] font-medium text-black">Reserver cette Chambre</h1>
                        <p class="text-center text-[14px]">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Eius unde animi minima puezi zeryiur uzriyr a_èàéiz minima puezi zeryiur uzriyr a_èàéiz .</p>
                    </div>
                    <div class="flex flex-col space-y-2">
                        <label class="text-[18px] pl-1.5">Choisisser un date de début .</label>
                        <input type="text" id="datepicker" name="dateD"  placeholder="Date de début"  class="w-full py-2 pl-10 text-sm border-[2px] border-black">

                    </div>
                    <div class="flex flex-col space-y-2">
                        <label class="text-[18px] pl-1.5">Choisisser un date de fin .</label>
                        <input type="text" id="datepicker2" name="dateF" placeholder="Date de fin" class="w-full py-2  pl-10 text-sm border-[2px] border-black">
                    </div>
                    <div class="flex flex-col space-y-2">
                        <p class="text-[18px] pl-1.5">Choisisser des extras : </p>
                        <ul class="w-100 text-sm font-medium bg-white  border-2 border-black">
                            <li class="w-full border-b border-[1px] border-black">
                                <div class="flex items-center pl-3">
                                    <input id="vue-checkbox" type="checkbox" value="" class="w-4 h-4  bg-gray-100 border-[1px] border-black">
                                    <label for="vue-checkbox" class="py-3 ml-2 w-full text-sm font-medium text-black ">Massage</label>
                                </div>
                            </li>
                            <li class="w-full border-b border-[1px] border-black">
                                <div class="flex items-center pl-3">
                                    <input id="react-checkbox" type="checkbox" value="" class="w-4 h-4 text-blue-600 bg-gray-100  border-[1px] border-black">
                                    <label for="react-checkbox" class="py-3 ml-2 w-full text-sm font-medium text-gray-900">Spa</label>
                                </div>
                            </li>
                            <li class="w-full border-b border-[1px] border-black">
                                <div class="flex items-center pl-3">
                                    <input id="angular-checkbox" type="checkbox" value="" class="w-4 h-4 text-blue-600 bg-gray-100 border-[1px] border-black">
                                    <label for="angular-checkbox" class="py-3 ml-2 w-full text-sm font-medium text-black">Diner</label>
                                </div>
                            </li>
                            <li class="w-full border-b border-[1px] border-black">
                                <div class="flex items-center pl-3">
                                    <input id="laravel-checkbox" type="checkbox" value="" class="w-4 h-4 text-blue-600 bg-gray-100 border-[1px] border-black">
                                    <label for="laravel-checkbox" class="py-3 ml-2 w-full text-sm font-medium">excursion</label>
                                </div>
                            </li>
                            <li class="w-full border-b border-[1px] border-black">
                                <div class="flex items-center pl-3">
                                    <input id="laravel-checkbox" type="checkbox" value="" class="w-4 h-4 text-blue-600 bg-gray-100 border-[1px] border-black">
                                    <label for="laravel-checkbox" class="py-3 ml-2 w-full text-sm font-medium">excursion</label>
                                </div>
                            </li>
                            <li class="w-full border-b border-[1px] border-black">
                                <div class="flex items-center pl-3">
                                    <input id="laravel-checkbox" type="checkbox" value="" class="w-4 h-4 text-blue-600 bg-gray-100 border-[1px] border-black">
                                    <label for="laravel-checkbox" class="py-3 ml-2 w-full text-sm font-medium">excursion</label>
                                </div>
                            </li>
                        </ul>
                    </div>

                    <input type="submit" class="inline-block px-6 py-3 border-2 border-black text-black font-medium text-xs leading-tight uppercase  hover:bg-black hover:bg-opacity-5 focus:outline-none focus:ring-0 transition duration-150 ease-in-out"><a href=".jsp"></a></input>
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
