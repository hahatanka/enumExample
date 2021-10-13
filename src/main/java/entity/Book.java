package entity;

import BookGenres.BookGenres;

import java.util.ArrayList;

public class Book {
    private String title;
    private int price;
    private int year;
    private ArrayList<Author> authors;

    private BookGenres genre;

    public Book(String title, int price, int year, BookGenres genre){
        this.title = title;
        this.price = price;
        this.year = year;
        this.genre = genre;
        this.authors = new ArrayList<>();

    }

    public BookGenres getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }



    public String getTitle() {
        return title;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }
    void updateAuthors(Author author){
        authors.add(author);
    }

    public String toString(){
        return "\nName: " + title +
                "\nPrice: " + price +
                "\nGenre: " + genre +
                "\nYear:" + year;

    }
}





