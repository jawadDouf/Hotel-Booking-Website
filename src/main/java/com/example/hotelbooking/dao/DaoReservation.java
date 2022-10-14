package com.example.hotelbooking.dao;

import com.example.hotelbooking.helpers.RoomType;
import com.example.hotelbooking.helpers.Status;
import com.example.hotelbooking.models.Chambre;
import com.example.hotelbooking.models.Reservation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DaoReservation extends DataAccessObject<Reservation> {

    //Dao classes that have relations with Reservation class

    ChambresDao chambresDao = new ChambresDao();
    ClientDao clientDao = new ClientDao();


    @Override
    List<Reservation> getAll() throws SQLException {
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
    Reservation getOneItem(int id) throws SQLException {

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
    void insertRow(Reservation reservation) throws SQLException {

    }
}
