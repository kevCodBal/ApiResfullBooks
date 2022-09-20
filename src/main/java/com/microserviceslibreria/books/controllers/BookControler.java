package com.microserviceslibreria.books.controllers;

import com.microserviceslibreria.books.models.BooksModel;
import com.microserviceslibreria.books.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/book")
public class BookControler {

    @Autowired
    BookServices bookServices;

    @CrossOrigin
    @GetMapping("/all")
    public ArrayList<BooksModel> getAllBooks(){
        return bookServices.getAllBooks();
    }

    @PostMapping()
    public BooksModel saveBook(@RequestBody BooksModel book){
        return this.bookServices.saveBook(book);
    }


}
