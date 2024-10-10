package com.example.swipe_hatoms.Model;

public class ViewAllModel {

    String name;
    String description;
    String raiting;
    String price;
    String type;
    String img_url;

    public ViewAllModel() {
    }

    public ViewAllModel(String name, String description, String raiting, String price, String type, String img_url) {
        this.name = name;
        this.description = description;
        this.raiting = raiting;
        this.price = price;
        this.type = type;
        this.img_url = img_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRaiting() {
        return raiting;
    }

    public void setRaiting(String raiting) {
        this.raiting = raiting;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
}

