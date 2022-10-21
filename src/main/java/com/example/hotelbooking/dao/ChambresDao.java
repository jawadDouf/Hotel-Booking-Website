package com.example.hotelbooking.dao;

import com.example.hotelbooking.helpers.RoomType;
import com.example.hotelbooking.helpers.Status;
import com.example.hotelbooking.models.Chambre;
<<<<<<< HEAD

=======
//import jdk.internal.org.objectweb.asm.Type;
>>>>>>> master

import javax.management.Query;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChambresDao extends DataAccessObject<Chambre> {
    @Override
    List<Chambre> getAll() throws SQLException {
        return null;
    }

    @Override
    Chambre getOneItem(int id) throws SQLException {
        return null;
    }

    @Override
    public void insertRow(Chambre chambre) throws SQLException {
        //insert data into the database
        String query = "INSERT INTO room (type,prix,promotion,status) values (?,?,?,?)";
        pStmt = con.prepareStatement(query);
        pStmt.setString(1,chambre.getType().toString());
        pStmt.setDouble(2,chambre.getPrix());
        pStmt.setDouble(3,chambre.getPromotions());
        pStmt.setString(4,chambre.getStatus().toString());
        pStmt.executeUpdate();

    }


//    @Override
//    List<Chambre> getAll() throws SQLException {
//        List<Chambre> list = new ArrayList<Chambre>();
//        String query = "SELECT * FROM room";
//        pStmt = con.prepareStatement(query);
//        ResultSet allEntities = pStmt.executeQuery();
//        while (allEntities.next()){
////         list.add(new Chambre(allEntities.getInt(1), RoomType.valueOf(allEntities.getString(2)),allEntities.getInt(3),allEntities.getInt(4), Status.valueOf(allEntities.getString(5))));
//        }
//        return list;
//    }
//
//    @Override
//    Chambre getOneItem(int id) throws SQLException {
//       String query = "SELECT * FROM room WHERE id= ? ";
//       pStmt = con.prepareStatement(query);
//       pStmt.setInt(1,id);
//       ResultSet chambre = pStmt.executeQuery();
////       return new Chambre(chambre.getInt(1), RoomType.valueOf(chambre.getString(2)),chambre.getInt(3),chambre.getInt(4), Status.valueOf(chambre.getString(5)));
//    }
//
//    // Inserting a room to the database => Manager task
//    @Override
//    public static void insertRow(Chambre chambre) throws SQLException {
//       //Query for inserting
//        String query = "INSERT INTO room (type,prix,promotion,status) value (?,?,?,?)";
//        //Preparing the query
//        pStmt = con.prepareStatement(query);
//        //Setting the values
//        pStmt.setString(1,chambre.getType().toString());
//        pStmt.setDouble(2,chambre.getPrix());
//        pStmt.setDouble(3,chambre.getPromotions());
//        pStmt.setString(4,chambre.getStatus().toString());
//        //executing the query
//        pStmt.executeUpdate();
//    }




}
