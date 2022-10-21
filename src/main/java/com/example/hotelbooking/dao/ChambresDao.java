package com.example.hotelbooking.dao;

import com.example.hotelbooking.helpers.RoomType;
import com.example.hotelbooking.helpers.Status;
import com.example.hotelbooking.models.Chambre;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ChambresDao extends DataAccessObject<Chambre> {
    @Override
    public List<Chambre> getAll() throws SQLException {
        //get all rooms from the database join with the photos table
        String sql = "SELECT * FROM room JOIN photos ON room.id = photos.room_id";
        ResultSet resultSet = con.createStatement().executeQuery(sql);
//        loop for each row in the result set
        while (resultSet.next()) {
            Chambre chambre = new Chambre();
            chambre.setId(resultSet.getInt("id"));
            chambre.setType(RoomType.valueOf(resultSet.getString("type")));
            chambre.setPrix(resultSet.getDouble("prix"));
            chambre.setPromotions(resultSet.getDouble("promotions"));
            chambre.setStatus(Status.valueOf(resultSet.getString("status")));
            chambre.setImages(resultSet.getString("images"));

            List<Chambre> chambres = null;
            chambres.add(chambre);
        }
        return null;
    }


    @Override
    Chambre getOneItem(int id) throws SQLException {
        return null;
    }

    @Override
    public void insertRow(Chambre chambre) throws SQLException {
        //insert data into the database and return the id of the inserted row
        String sql = "INSERT INTO room (type, prix, promotion, status) VALUES (?,?,?,?)";
        pStmt = con.prepareStatement(sql);
        pStmt.setString(1, chambre.getType().toString());
        pStmt.setDouble(2, chambre.getPrix());
        pStmt.setDouble(3, chambre.getPromotions());
        pStmt.setString(4, chambre.getStatus().toString());
        pStmt.executeUpdate();
        //select last inserted id from the database
        sql = "SELECT LAST_INSERT_ID()";
        pStmt = con.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        int id = 0;
        if (rs.next()) {
            id = rs.getInt(1);
        }
        //insert the images of the room
        for (String image : chambre.getImages()) {
            sql = "INSERT INTO photos (photo, room_id) VALUES (?,?)";
            pStmt = con.prepareStatement(sql);
            pStmt.setString(1, image);
            pStmt.setInt(2, id);
            pStmt.executeUpdate();
        }

    }



}
