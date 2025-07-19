package com.example.goodreads;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import com.example.goodreads.Book;
import com.example.goodreads.BookRepository;

public class BookService implements BookRepository {
    private HashMap<Integer, Book> hmap = new HashMap<>();

    public BookService() {
        Book b1 = new Book(1, "harry potter", "https://kids.scholastic.com/content/kids64/en/books/harry-potter/_jcr_content/root/responsivegrid/responsivegrid_67347_1686851476/responsivegrid/responsivegrid/responsivegrid/image.coreimg.100.1285.png/1739916395765/9781546154419-3d.png");
        Book b2 = new Book(2, "Rise",
                "https://d28hgpri8am2if.cloudfront.net/book_images/onix/cvr9781925452877/a-reason-to-rise-9781925452877_hr.jpg");
        hmap.put(b1.getId(), b1);
        hmap.put(b2.getId(), b2); 
    }

    @Override
    public ArrayList<Book> getBooks(){
        Collection<Book> bookCollection = hmap.values();
        ArrayList<Book> books=new ArrayList<>(bookCollection);
        return books;
    }
}