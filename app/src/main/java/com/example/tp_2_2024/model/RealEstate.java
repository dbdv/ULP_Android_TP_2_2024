package com.example.tp_2_2024.model;

public class RealEstate {
    private String location;
    private int image;
    private double price;

    public RealEstate(String location, int image, double price) {
        this.location = location;
        this.image = image;
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
