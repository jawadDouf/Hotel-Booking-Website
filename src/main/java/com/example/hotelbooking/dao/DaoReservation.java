package com.example.hotelbooking.dao;

import com.example.hotelbooking.helpers.RoomType;
import com.example.hotelbooking.helpers.Status;
import com.example.hotelbooking.models.Chambre;
import com.example.hotelbooking.models.Reservation;

import java.sql.ResultSet;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DaoReservation extends DataAccessObject<Reservation> {

    //Dao classes that have relations with Reservation class

    ChambresDao chambresDao = new ChambresDao();
    ClientDao clientDao = new ClientDao();


    @Override
    public List<Reservation> getAll() throws SQLException {
        List<Reservation> list = new ArrayList<>();
        String query = "SELECT * FROM reservation";
        pStmt = con.prepareStatement(query);
        ResultSet reservations = pStmt.executeQuery();
        while (reservations.next()){
            list.add(new Reservation(reservations.getInt(1),reservations.getDate(2).toLocalDate(),reservations.getInt(3),reservations.getDouble(4)));
            list.get(list.size()-1).setChambre(chambresDao.getOneItem(reservations.getInt(5)));
            list.get(list.size()-1).setClient(clientDao.getOneItem(reservations.getInt(6)));
        }
        return list;
    }

    @Override
    public Reservation getOneItem(int id) throws SQLException {

        String query = "SELECT * FROM reservation WHERE id= ? ";
        pStmt = con.prepareStatement(query);
        pStmt.setInt(1,id);
        ResultSet reservation = pStmt.executeQuery();
        Reservation reservation1 = new Reservation(reservation.getInt(1),reservation.getDate(2).toLocalDate(),reservation.getInt(3),reservation.getDouble(4));
        reservation1.setChambre(chambresDao.getOneItem(reservation.getInt(5)));
        reservation1.setClient(clientDao.getOneItem(reservation.getInt(6)));
        return reservation1;
    }

    @Override
    public void insertRow(Reservation reservation) throws SQLException {
        //The query for inserting the element in the database .
        String query = "INSERT INTO reservation (start_date,nombres_des_jours,prix_total,room_id,user_id) values (?,?,?,?,?)";
        //prepare the query
        pStmt = con.prepareStatement(query);
        //replace the params
        pStmt.setDate(1, java.sql.Date.valueOf(reservation.getStart_date()));
        pStmt.setInt(2, reservation.getNombreDesJours());
        pStmt.setDouble(3, reservation.getPrix_total());
        pStmt.setInt(4, reservation.getChambre().getId());
        pStmt.setInt(5, reservation.getClient().getId());
        //Insert the element
        pStmt.executeUpdate();
    }
}
