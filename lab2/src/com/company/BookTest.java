package com.company;

public class BookTest {

    //Свойства, поля класса
    private String author;
    private String name;
    private int year;
    private int published;
    private String publishedOffice;

    //Конструктор класса
    public BookTest(String a, String n, int y, int p, String f) {
        author = a;
        name = n;
        year = y;
        published = p;
        publishedOffice = f;
    }

    //Геттеры
    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getPublished() {
        return published;
    }

    public String getPublishedOffice() {
        return publishedOffice;
    }

    //Сеттеры
    public void setAuthor(String a) {
        author = a;
    }

    public void setName(String a) {
        name = a;
    }

    public void setYear(int a) {
        year = a;
    }

    public void setPublished(int a) {
        published = a;
    }

    public void setPublishedOffice(String a) {
        publishedOffice = a;
    }
}