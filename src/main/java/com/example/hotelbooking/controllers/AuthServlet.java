package com.example.hotelbooking.controllers;

import com.example.hotelbooking.dao.ManagerDao;
import com.example.hotelbooking.models.Manager;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "AuthServlet", value = "/AuthServlet")
public class AuthServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String matricule = request.getParameter("matricule");
        String password = request.getParameter("password");
        Manager manager = null;
        manager = ManagerDao.getOneItemByEmail(matricule,password);
        if (manager != null){
            HttpSession session = request.getSession();
            session.setAttribute("manager",manager);
            response.sendRedirect("pages/managerDashboard.jsp");
        }
        else {
            response.sendRedirect("pages/login.jsp");
        }
    }
}
