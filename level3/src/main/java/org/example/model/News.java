package org.example.model;

public abstract class News {

    private String title;
    private String text;
    protected int score;
    protected int price;

    /*Constructor*/
    public News(String title, String text) {
        this.title = title;
        this.text = text;
    }

    /*Getters and Setters*/
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getScore() {
        return score;
    }

    public double getPrice() {
        return price;
    }

    /*Abstract methods*/
    public abstract void calculateNewsPrice();
    public abstract void calculateScore();
}
