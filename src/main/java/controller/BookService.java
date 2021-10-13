package controller;

import entity.Author;
import entity.Book;
import BookGenres.BookGenres;

import java.util.ArrayList;

public class BookService {
    public ArrayList<Book> bookList = new ArrayList<>();
    public ArrayList<Author> authors;

    public BookService() {
        this.authors = new ArrayList<>();
    }
//add books to the list
    public void addBook(Book book) {
        this.bookList.add(book);
    }
//removing books from the list
    public void removeBook(Book book) {
        this.bookList.remove(book);
    }
//returning list of all availablebooks
    public ArrayList<Book> getBooks() {
        return bookList;
    }
//returning a LIST of books by FANTASY type
    public ArrayList<Book> findFantasy() {
        ArrayList<Book> fantasyBook = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getGenre().equals(BookGenres.FANTASY)) {
                fantasyBook.add(book);
            }
        }
        return fantasyBook;
    }
//returning a list of books released before 19999
    public ArrayList<Book> listYear99() {
        ArrayList<Book> booksBefore1999 = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getYear() < 1999) {
                booksBefore1999.add(book);

            }
        }
        return booksBefore1999;
    }

    //returning most expensive book
//Find the most expensive = loop through the list of books, find one with the greater price > save it into variable

    public Book mostExpensive() {
        //create variable that stores the book thats most expensive
        Book mostExpensive = bookList.get(0);//most expensive book is set as the first in the array
        for (Book book : bookList) {
            if(book.getPrice() > mostExpensive.getPrice()){
                mostExpensive = book;
            }
        } return mostExpensive;//returns only one (theFIRST) most expensive in the array if tehre are several with the same price
    }
//return the cheapest
    public Book theCheapest() {
    //create variable that stores the book thats the cheapest
        Book cheapestBook = bookList.get(0);
        for (Book book : bookList) {
            if(book.getPrice() < cheapestBook.getPrice()){
            cheapestBook = book;
        }
     } return cheapestBook;
}
//return a book written by 3 authors (just ONE book)
    public Book booksByThreeAuthor(){
        for(Book book:bookList){
            if(book.getAuthors().size() == 3){ //checks the number of elements in the arraylist
                return book;
            }
        }
        return null;
    }

    //verifying a book is on the list
    public Boolean verifyBook(Book book){
        //booklist.contains() - is a method in the arraylist that returns true if the item is in the arraylist
        return bookList.contains(book);
    }



        //LIST OF BOOKS WRITTEN BY PROVIDED AUTHOR
        //Create a method that finds a book by provided author
        //creates new list of books " Authorbooks
        //loop through the books in the book list
        //if provided author is among the authors of the current book, then add book to list of authorbooks created
        //if (author belongs to any of the authors in Book.getAuthors)
        //after loop is completed return array list of authorbooks

        public ArrayList<Book> listOfBooksByAuthor (Author providedAuthor){
            //Array list for storing books written by provided author
            ArrayList<Book> authorBooks = new ArrayList<>();

            //loops through the booklist to find books with the author in the list of authors
            for (Book book : bookList) {
                //loops through the list of authors to see if the provided author is among thelist
                for (Author author1 : book.getAuthors()) {
                    if (providedAuthor.equals(author1)) {
                        authorBooks.add(book);
                    }
                }
            }
            return authorBooks;
        }

    }



