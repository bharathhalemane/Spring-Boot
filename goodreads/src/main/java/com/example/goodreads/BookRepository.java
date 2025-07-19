package com.example.goodreads;

import java.util.ArrayList;
import com.example.goodreads.Book;

public interface BookRepository {        
        
        // Get Method
        ArrayList<Book> getBooks();

        // Get Method by ID
        Book getBookById(int id);

        // Post Method
        void addBook(Book book);

        // Put Method
        void updateBook(int id, Book book);

        // Delete Method
        void deleteBook(int id);

}

