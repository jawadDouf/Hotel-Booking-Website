package com.example.hotelbooking.dao;

import com.example.hotelbooking.models.Manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ManagerDao extends DataAccessObject<Manager> {
    @Override
    List<Manager> getAll() throws SQLException {
        return null;
    }

    @Override
    Manager getOneItem(int id) throws SQLException {
        return null;
    }

    @Override
    void insertRow(Manager manager) throws SQLException {

    }

    public static Manager getOneItemByEmail(String matricule, String password) {
        String query = "SELECT * FROM manager WHERE matricule= ? AND password = ?";
        try {
            pStmt = con.prepareStatement(query);
            pStmt.setString(1,matricule);
            pStmt.setString(2,password);
            ResultSet manager = pStmt.executeQuery();
            if (manager.next()){
                return new Manager(manager.getInt(1),manager.getString(2),manager.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}