package com.example.hotelbooking.dao;

import com.example.hotelbooking.database.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class DataAccessObject<T> {

    static java.sql.Connection con = Connection.connect();
    PreparedStatement pStmt ;

    //Crud Methods

    abstract List<T> getAll() throws SQLException ;

    abstract T getOneItem(int id) throws SQLException;

    abstract void insertRow(T t) throws SQLException;



}
