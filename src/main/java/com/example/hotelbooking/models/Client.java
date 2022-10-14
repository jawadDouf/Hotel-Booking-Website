package com.example.hotelbooking.models;

public class Client {

   private int id;

   private String email;

    private String code;

    public Client(int id, String email, String code) {
        this.id = id;
        this.email = email;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
