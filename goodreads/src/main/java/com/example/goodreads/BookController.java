package com.example.goodreads;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.goodreads.Book;
import com.example.goodreads.BookService;

@RestController
public class BookController{
    BookService bookService=new BookService();

    @GetMapping("/book")
    public ArrayList<Book> getBooks(){
        return bookService.getBooks();
    }


}