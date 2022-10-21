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
        //format the date to parse it
        String formatedDateD = request.getParameter("dateD").split("/")[2] + "-"+ request.getParameter("dateD").split("/")[0] + "-" + request.getParameter("dateD").split("/")[1];
        String formatedDateF = request.getParameter("dateF").split("/")[2] + "-"+ request.getParameter("dateF").split("/")[0] + "-"+ request.getParameter("dateF").split("/")[1];
        //we parse the string entered by the user to a local date
        LocalDate dateD = request.getParameter("dateD") != null ? LocalDate.parse(formatedDateD) : null;
        LocalDate dateF = request.getParameter("dateF") != null ? LocalDate.parse(formatedDateF) : null;
        //get all the values of the extras selected
        String[] extras = request.getParameterValues("chosenExtra");
        //Add to the totla price
        for (String extra: extras
             ) {
            System.out.println(extra);
        }
    }
}
