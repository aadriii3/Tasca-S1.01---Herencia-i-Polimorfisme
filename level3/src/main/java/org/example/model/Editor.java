package org.example.model;

import java.util.List;

public class Editor {

    private static final double SALARY = 1500;
    private final String dni;
    private String name;

    private List<News> publishedNews;

    public Editor(String dni, String name) {
        this.dni = dni;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void addNews(News news) {
        this.publishedNews.add(news);
        System.out.println(this.name + " ha publicat la notícia: " +  news.getTitle());
    }

    public void deleteNews(News news) {
        this.publishedNews.remove(news);
        System.out.println("S'ha esborrat la notícia");
    }

    public void showAllNews() {
        System.out.println("Llista de notícies del redactor " + name);
        for (News news : publishedNews) {
            System.out.println(news.getTitle());
        }
    }
}
