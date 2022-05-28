package com.example.booksy;

public class Book {
   private int img;
   private String title;
   private String rate;


    public Book(int img, String title) {
        this.img = img;
        this.title = title;
    }

    public Book(int img, String title, String rate) {
        this.img = img;
        this.title = title;
        this.rate = rate;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
