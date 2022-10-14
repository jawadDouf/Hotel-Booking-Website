package com.example.hotelbooking.models;

import java.time.LocalDate;

public class Reservation {

    private int id ;
    private LocalDate start_date;
    private int nombreDesJours ;
    private  Chambre chambre;
    private Client client;
    private double prix_total;

    public Reservation(int id, LocalDate start_date, int nombreDesJours, Chambre chambre, Client client, double prix_total) {
        this.id = id;
        this.start_date = start_date;
        this.nombreDesJours = nombreDesJours;
        this.chambre = chambre;
        this.client = client;
        this.prix_total = prix_total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public int getNombreDesJours() {
        return nombreDesJours;
    }

    public void setNombreDesJours(int nombreDesJours) {
        this.nombreDesJours = nombreDesJours;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getPrix_total() {
        return prix_total;
    }

    public void setPrix_total(double prix_total) {
        this.prix_total = prix_total;
    }
}
