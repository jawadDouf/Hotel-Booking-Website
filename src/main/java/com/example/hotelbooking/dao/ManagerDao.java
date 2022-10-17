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

    @Override
    Manager getOneItemByEmail(String matricule, String password) throws SQLException {
        String query = "SELECT * FROM manager where matricule = ?";
        pStmt = con.prepareStatement(query);
        pStmt.setString(1, matricule);
        ResultSet manager = pStmt.executeQuery();
        Manager manager1 = null;
        while (manager.next()) {
            String matrucule = manager.getString(1);
            String passwordDb = manager.getString(2);
            if (!matrucule.equals(null)) {
                if (passwordDb.equals(password)) {
                    manager1 = new Manager(manager.getInt(1), matricule, password);
                    break;
                }
            } else {
                manager1 = null;
            }
        }
        return manager1;
    }
}