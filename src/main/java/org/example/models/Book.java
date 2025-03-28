package org.example.models;

public class Book {
    private final String bookID;
    private String title;
    private String author;
    private String genre;
    private String availability;

    public Book(String bookID, String title, String author, String genre, String availability) {
        this.bookID = bookID;
        setTitle(title);
        setAuthor(author);
        this.genre = genre;
        setAvailability(availability);
    }

    public String getBookID() {
        return bookID;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public String getAvailability() {
        return availability;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) throw new IllegalArgumentException("Title cannot be empty!");
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) throw new IllegalArgumentException("Author cannot be empty!");
        this.author = author;
    }

    public void setAvailability(String availability) {
        if (availability.equalsIgnoreCase("Available") || availability.equalsIgnoreCase("Checked Out")) {
            this.availability = availability;
        } else {
            throw new IllegalArgumentException("Invalid availability status!");
        }
    }
//String Representation of a Book
    @Override
    public String toString() {
        return "Book ID: " + bookID + ", Title:" + title + ", Author : " + author + ", Genre: "+ genre + ",Availability: " +availability;

    }
}



