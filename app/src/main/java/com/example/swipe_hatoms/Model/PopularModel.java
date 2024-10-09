package com.example.swipe_hatoms.Model;

public class PopularModel {
    String name;
    String raiting;
    String rub;
    String price;
    String img_url;
    String type;

    public PopularModel(String img_url) {
        this.img_url = img_url;
    }

    public PopularModel() {

    }


    public PopularModel(String name, String raiting, String rub, String price, String type) {
        this.name = name;
        this.raiting = raiting;
        this.rub = rub;
        this.price = price;
        this.type = type;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
