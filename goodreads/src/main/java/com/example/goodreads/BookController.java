package com.example.goodreads;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.goodreads.BookService;
import java.util.*;

@RestController
public class BookController{
    BookService bookService=new BookService();

    @GetMapping("/book")
    public ArrayList<Book> getBook(){
        return bookService.getBooks();
    }


}