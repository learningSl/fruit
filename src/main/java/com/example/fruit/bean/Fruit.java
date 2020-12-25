package com.example.fruit.bean;

public class Fruit {
    private int fid;
    private String name;
    private double price;
    private String unit;

    public void setFid(int fid) {
        this.fid = fid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getFid() {
        return fid;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getUnit() {
        return unit;
    }
}
