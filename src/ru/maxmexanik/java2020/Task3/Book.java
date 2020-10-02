package ru.maxmexanik.java2020.Task3;

public class Book {
    private String author;
    private String title;
    private int year;
    private String genre;
    private int pages;

    public Book(String author, String title, int year, String genre, int pages) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.pages = pages;
    }

    public String GetAuthor() {
        return author;
    }

    public void SetAuthor(String author) {
        this.author = author;
    }

    public String GetTitle() {
        return title;
    }

    public void SetTitle(String title) {
        this.title = title;
    }

    public int GetYear() {
        return year;
    }

    public void SetYear(int year) {
        this.year = year;
    }

    public String GetGenre() {
        return genre;
    }

    public void SetGenre(String genre) {
        this.genre = genre;
    }

    public int GetPages() {
        return pages;
    }

    public void SetPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" + "author='" + author + '\'' + ", title='" + title + '\'' + ", year=" + year + ", genre='" + genre + '\'' + ", pages=" + pages + '}';
    }
}
