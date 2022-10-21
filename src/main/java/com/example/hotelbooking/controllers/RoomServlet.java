package com.example.hotelbooking.controllers;

import com.example.hotelbooking.dao.ChambresDao;
import com.example.hotelbooking.models.Chambre;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "RoomServlet", value = "/RoomServlet")
public class RoomServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get all room from chambresDao
        ChambresDao chambresDao = new ChambresDao();
        try {
            request.setAttribute("rooms", chambresDao.getAll());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String roomType = request.getParameter("roomType");
        String price = request.getParameter("price");
        String promotion = request.getParameter("promotion");
        String[] images = request.getParameterValues("images");
        //create a new room object
        Chambre chambre = new Chambre(roomType, price, promotion, "Disponible", images);
        //insert the room to the database
        try {
            ChambresDao chambresDao = new ChambresDao();
            chambresDao.insertRow(chambre);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        //redirect to the home page
        response.sendRedirect("pages/managerDashboard.jsp");

    }

//    @Override
//    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPut(req, resp);
//    }
//
//    @Override
//    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doDelete(req, resp);
//    }
}
