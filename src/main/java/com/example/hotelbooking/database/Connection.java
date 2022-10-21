package com.example.hotelbooking.database;

import java.sql.*;

public class Connection {

    //Connection variable
    private static java.sql.Connection con;

    // Static
    static {
        String url = "jdbc:mysql://localhost:3306/hotelbookings";
        String user = "root";
        String password = "";
        try{

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);

        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public static java.sql.Connection connect(){

        return con;
    }
}
