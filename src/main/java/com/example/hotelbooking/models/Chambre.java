package com.example.hotelbooking.models;

import com.example.hotelbooking.helpers.RoomType;
import com.example.hotelbooking.helpers.Status;

public class Chambre {

    // Chambre fields

    private int id;
    private RoomType type;
    private double prix;
    private double promotions;
    private Status status;
    private String[] images;

    public Chambre(String type, String prix, String promotions, String status, String[] images) {
        this.type = RoomType.valueOf(type);
        this.prix = Double.parseDouble(prix);
        this.promotions = Double.parseDouble(promotions);
        this.status = Status.valueOf(status);
        this.images = images;
    }
    public Chambre() {
    }



    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getPromotions() {
        return promotions;
    }

    public void setPromotions(double promotions) {
        this.promotions = promotions;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    public String[] getImages() {
        return images;
    }

    public void setImages(String images) {
    }
}
