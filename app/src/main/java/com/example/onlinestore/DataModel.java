package com.example.onlinestore;

public class DataModel {

    private String name;
    private int img;

    int id;


    public DataModel(String name, int img) {
        this.name = name;
        this.img = img;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getImg() {
        return img;
    }

    public void setImg(int img) { this.img = img; }
}
