package com.example.hotelbooking.dao;

import com.example.hotelbooking.helpers.RoomType;
import com.example.hotelbooking.models.Chambre;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChambresDao extends DataAccessObject<Chambre> {


    @Override
    List<Chambre> getAll() throws SQLException {

        List<Chambre> list = new ArrayList<Chambre>();
        String query = "SELECT * FROM room";
        pStmt = con.prepareStatement(query);
        ResultSet allEntities = pStmt.executeQuery();
        while (allEntities.next()){

         list.add(new Chambre(allEntities.getInt(1), RoomType.allEntities.getString(2),allEntities.getInt(3),allEntities.getInt(4),Status.allEntities.getInt(5)));

        }
        return list;
    }

    @Override
    Chambre getOneItem() {

        return null;
    }
}
