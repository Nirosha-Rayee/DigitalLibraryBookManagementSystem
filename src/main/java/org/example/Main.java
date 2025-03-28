package org.example;

import org.example.controller.LibrabyController;

import java.util.Scanner;


public class Main { // Here, Main refers to the entry point of the application, where execution begins (DigitalLibrary is the main entry point)
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        LibrabyController library = new LibrabyController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Digital Library System =====");
            System.out.println("1. Add a Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search for a Book");
            System.out.println("4. Update Book Details");
            System.out.println("5. Delete a Book");
            System.out.println("6. Exit System");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 6.");
                continue;
            }

            switch (choice) {
                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.viewAllBooks();
                    break;
                case 3:
                    library.searchBook();
                    break;
                case 4:
                    library.updateBook();
                    break;
                case 5:
                    library.deleteBook();
                    break;
                case 6:
                    library.exitSystem();
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        }


    }
}