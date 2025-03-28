package org.example.controller;

import org.example.models.Book;

import java.util.HashMap;
import java.util.Scanner;

public class LibrabyController {

    //Uses HashMap for efficient book storage & lookup (O(1) time complexity)
    private HashMap<String, Book> books; // Key is Book ID and Value is Book Object
    private Scanner scanner;

    public LibrabyController() {
        books = new HashMap<>();
        scanner = new Scanner(System.in);
    }
// Add a Book
    public void addBook() {
        System.out.print("Enter Book ID: ");
        String bookID = scanner.nextLine();

        if (books.containsKey(bookID)) {
            System.out.println("Book ID already exists!");
            return;
        }

        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter Availability (Available/Checked Out): ");
        String availability = scanner.nextLine();

        if (title.isEmpty() || author.isEmpty()) {
            System.out.println("Title and Author cannot be empty!");
            return;
        }

        books.put(bookID, new Book(bookID, title, author, genre, availability));
        System.out.println("Book added successfully!");
    }
// View All Books
    public void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }
// Search Book by ID or Title
    public void searchBook() {
        System.out.print("Search by ID or Title? (id/title): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("id")) {
            System.out.print("Enter Book ID: ");
            String bookID = scanner.nextLine();
            if (books.containsKey(bookID)) {
                System.out.println(books.get(bookID));
            } else {
                System.out.println("Book not found.");
            }
        } else if (choice.equalsIgnoreCase("title")) {
            System.out.print("Enter Title: ");
            String title = scanner.nextLine();
            for (Book book : books.values()) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    System.out.println(book);
                    return;
                }
            }
            System.out.println("Book not found.");
        } else {
            System.out.println("Invalid choice.");
        }
    }
// Update  A Book Details
    public void updateBook() {
        System.out.print("Enter Book ID to update: ");
        String bookID = scanner.nextLine();
        if (!books.containsKey(bookID)) {
            System.out.println("Book not found.");
            return;
        }

        Book book = books.get(bookID);

        System.out.print("Enter new Title (leave blank to keep current): ");
        String newTitle = scanner.nextLine();
        if (!newTitle.isEmpty()) {
            book.setTitle(newTitle);
        }

        System.out.print("Enter new Author (leave blank to keep current): ");
        String newAuthor = scanner.nextLine();
        if (!newAuthor.isEmpty()) {
            book.setAuthor(newAuthor);
        }

        System.out.print("Enter new Availability (Available/Checked Out): ");
        String newAvailability = scanner.nextLine();
        book.setAvailability(newAvailability);

        System.out.println("Book updated successfully!");
    }
//	Delete a Book Record
    public void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        String bookID = scanner.nextLine();
        if (books.remove(bookID) != null) {
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }
// Exit System
    public void exitSystem() {
        System.out.println("Exiting system. Goodbye! and Visit Again");
        scanner.close();
        System.exit(0);
    }
}



