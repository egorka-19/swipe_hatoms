package com.example.swipe_hatoms.Model;

public class ViewAllModel {
    String name;
    String img_url;
    String price;
    String raiting;
    String rub;
    String type;

    public ViewAllModel() {
    }

    public ViewAllModel(String name, String img_url, String price, String raiting, String rub, String type) {
        this.name = name;
        this.img_url = img_url;
        this.price = price;
        this.raiting = raiting;
        this.rub = rub;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRaiting() {
        return raiting;
    }

    public void setRaiting(String raiting) {
        this.raiting = raiting;
    }

    public String getRub() {
        return rub;
    }

    public void setRub(String rub) {
        this.rub = rub;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

