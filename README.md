**📚 Digital Library Book Management System**

**📝 Objective**

A simple Java-based Library Management System that allows librarians to efficiently add, update, search, and remove books while maintaining their availability status.

**🚀 Requirements**

✅ Add a Book (ID, Title, Author, Genre, Availability)

✅ View All Books

✅ Search a Book (by ID or Title)

✅ Update Book Details (Title, Author, Genre, Availability)

✅ Delete a Book

✅ Exit System

**⚠ Constraints & Assumptions**

✅ Book ID must be unique

✅ Title & Author cannot be empty

✅ Availability status must be Available or Checked Out

✅ Case-insensitive search for books

**🛠 Tech Stack**

* Followed MVC Pattern

* Java (Core)

* HashMap (For storing book data)

* OOP Principles (Encapsulation, SRP, etc.)

**🏰 Project Structure**

📆 DigitalLibrary(Main)

 ├── 📄 Main.java        # Entry point of the application, where execution begins
 
 ├── 📄 LibraryController.java  # Controls the flow of operations (CRUD operations)
 
 ├── 📄 Book.java        # Model class for Book attributes
 
 ├── 📄 README.md        # Documentation

 
**🔧 Setup & Run Instructions**

1️⃣ Clone the Repository
git clone[ https://github.com/Nirosha-Rayee/DigitalLibraryBookManagementSystem.git  ]

2️⃣ Compile the Code
javac Main.java

3️⃣ Run the Application
java Main



**🔥 Challenges Faced & Future Improvements**

**✨ Challenges**

* Managing book storage efficiently without a database

* Ensuring scalability while keeping the design modular

**✨ Future Improvements**

✅ We can implement a database using MySQL.

✅ We can add a Graphical User Interface (GUI) 

✅ Deploy in AWS Cloud.
