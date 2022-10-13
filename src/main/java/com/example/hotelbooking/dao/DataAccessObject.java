package com.example.hotelbooking.dao;

import com.example.hotelbooking.database.Connection;

import java.sql.PreparedStatement;
import java.util.List;

public abstract class DataAccessObject<T> {

    static java.sql.Connection con = Connection.connect();
    PreparedStatement pStmt ;

    //Crud Methods

    abstract List<T> getAll();

    abstract T getOneItem();

}
