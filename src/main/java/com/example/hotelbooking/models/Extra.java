package com.example.hotelbooking.models;

public class Extra {

    private int id;

    private double prix;

    private String nom;

    public Extra(int id, double prix, String nom) {
        this.id = id;
        this.prix = prix;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
