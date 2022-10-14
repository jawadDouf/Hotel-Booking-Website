package com.example.hotelbooking.models;

public class Manager {

   private int id;

   private String matricule;

    private String password;


    public Manager(int id, String matricule, String password) {
        this.id = id;
        this.matricule = matricule;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
