<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 14/10/2022
  Time: 09:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login page</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body>
    <%@ include file="../components/header.jsp" %>
<%--    <div class="w-full h-[90vh] bg-black">--%>
        <section class="h-full gradient-form bg-gray-200 md:h-screen">
            <div class="container py-12 px-6 h-full">
                <div class="flex justify-center items-center flex-wrap h-full g-6 text-gray-800">
                    <div class="xl:w-10/12">
                        <div class="block bg-white shadow-lg rounded-lg">
                            <div class="lg:flex lg:flex-wrap g-0">
                                <div class="lg:w-6/12 px-4 md:px-0">
                                    <div class="md:p-12 md:mx-6">
                                        <div class="text-center">
<%--                                            <img--%>
<%--                                                    class="mx-auto w-48"--%>
<%--                                                    src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/lotus.webp"--%>
<%--                                                    alt="logo"--%>
<%--                                            />--%>
                                            <h4 class="text-xl font-semibold mt-1 mb-12 pb-1">LOGIN TO YOUR ACCOUNT</h4>
                                        </div>
                                        <form action="../AuthServlet" method="post">
                                            <p class="mb-4">Please login to your account </p>
                                            <div class="mb-4">
                                                <input
                                                        type="text"
                                                        class="form-control block w-full px-3 py-1.5 text-base font-normal text-gray-700 bg-white bg-clip-padding border border-solid border-gray-300 rounded transition ease-in-out m-0 focus:text-gray-700 focus:bg-white focus:border-blue-600 focus:outline-none"
                                                        name="matricule"
                                                        placeholder="Matricule"
                                                        value=""
                                                />
                                            </div>
                                            <div class="mb-4">
                                                <input
                                                        type="password"
                                                        class="form-control block w-full px-3 py-1.5 text-base font-normal text-gray-700 bg-white bg-clip-padding border border-solid border-gray-300 rounded transition ease-in-out m-0 focus:text-gray-700 focus:bg-white focus:border-blue-600 focus:outline-none"

                                                        id="exampleFormControlInput1"
                                                        name="password"

                                                        placeholder="Password"
                                                        value=""
                                                />
                                            </div>
                                            <div class="text-center pt-1 mb-12 pb-1">
                                                <button
                                                        class="bg-gradient-to-r from-cyan-500 to-blue-500  inline-block px-6 py-2.5 text-white font-medium text-xs leading-tight uppercase rounded shadow-md hover:bg-blue-700 hover:shadow-lg focus:shadow-lg focus:outline-none focus:ring-0 active:shadow-lg transition duration-150 ease-in-out w-full mb-3"
                                                        type="submit"
                                                        data-mdb-ripple="true"
                                                        data-mdb-ripple-color="light"

                                                >
                                                    Log in
                                                </button>
                                                <a class="text-gray-500" href="#!">Forgot password?</a>
                                            </div>
                                            <div class="flex items-center justify-between pb-6">
                                                <p class="mb-0 mr-2">Don't have an account?</p>
                                                <button
                                                        type="button"
                                                        class="inline-block px-6 py-2 border-2 border-black text-black font-medium text-xs leading-tight uppercase rounded hover:bg-black hover:bg-opacity-5 focus:outline-none focus:ring-0 transition duration-150 ease-in-out"
                                                        data-mdb-ripple="true"
                                                        data-mdb-ripple-color="light"
                                                >
                                                    <a href="registre.jsp">Register</a>
                                                </button>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                                <div
                                        class="lg:w-6/12 flex items-center lg:rounded-r-lg rounded-b-lg lg:rounded-bl-none bg-gradient-to-r from-cyan-500 to-blue-500 "

                                >
                                    <div class="text-white px-4 py-6 md:p-12 md:mx-6">
                                        <h4 class="text-xl font-semibold mb-6"></h4>
                                        <p class="text-sm">
                                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                                            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                                            quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
                                            consequat.
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

<%--    </div>--%>
    <%@ include file="../components/footer.jsp" %>
</body>
</html>
