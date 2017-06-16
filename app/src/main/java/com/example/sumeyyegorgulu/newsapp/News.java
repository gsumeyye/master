package com.example.sumeyyegorgulu.newsapp;

/**
 * Created by sumeyye.gorgulu on 6/16/2017.
 */

public class News {

    int newName;
    int newImg;

    public News(int newName, int newImg) {
        this.newName = newName;
        this.newImg = newImg;
    }

    public int getNewName() {
        return newName;
    }

    public void setNewName(int newName) {
        this.newName = newName;
    }

    public int getNewImg() {
        return newImg;
    }

    public void setNewImg(int newImg) {
        this.newImg = newImg;
    }
}
