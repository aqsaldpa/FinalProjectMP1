package com.example.finalproject;
public class Book {

    private String Title;
    private String Category;
    private String Deskripsi;
    private String Url;
    private int Images;

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    public int getImages() {
        return Images;
    }

    public void setImages(int images) {
        Images = images;
    }
}


