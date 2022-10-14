package com.example.hotelbooking.dao;

import com.example.hotelbooking.helpers.RoomType;
import com.example.hotelbooking.helpers.Status;
import com.example.hotelbooking.models.Chambre;
import com.example.hotelbooking.models.Client;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientDao extends DataAccessObject<Client> {
    @Override
    List<Client> getAll() throws SQLException {
        List<Client> list = new ArrayList<Client>();
        String query = "SELECT * FROM user";
        pStmt = con.prepareStatement(query);
        ResultSet allEntities = pStmt.executeQuery();
        while (allEntities.next()){
            list.add(new Client(allEntities.getInt(1),allEntities.getString(2),allEntities.getString(3)));
        }
        return list;
    }

    @Override
    Client getOneItem(int id) throws SQLException {
        String query = "SELECT * FROM user WHERE id= ? ";
        pStmt = con.prepareStatement(query);
        pStmt.setInt(1,id);
        ResultSet user = pStmt.executeQuery();
        return new Client(user.getInt(1),user.getString(2),user.getString(3));
    }

    @Override
    void insertRow(Client client) throws SQLException {

    }
}
