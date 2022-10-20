package com.example.hotelbooking.controllers;

import com.example.hotelbooking.dao.DaoReservation;
import com.example.hotelbooking.models.Reservation;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Date;

@WebServlet(name = "ReservationServlet", value = "/ReservationServlet")
public class ReservationServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("In init of the servlet");

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        //recieving the data that been send by the user
        //we parse the string entered by the user to a local date
        LocalDate dateD = request.getParameter("dateD") != null ? LocalDate.parse(request.getParameter("dateD")) : null;
        LocalDate dateF = request.getParameter("dateF") != null ? LocalDate.parse(request.getParameter("dateF")) : null;
        //
        double extra = request.getParameter("extra") != null ? Double.parseDouble(request.getParameter("extra")) : null;
        //Check if all the infos entered by the user is valid
        if(dateD == (null) || dateF == (null)){
           // new DaoReservation().insertRow(new Reservation(2,dateD,dateF.minus(dateD),extra));
        }
    }
}
