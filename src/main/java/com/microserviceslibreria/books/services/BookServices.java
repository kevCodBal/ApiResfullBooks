package com.microserviceslibreria.books.services;


import com.microserviceslibreria.books.models.BooksModel;
import com.microserviceslibreria.books.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookServices {

    @Autowired
    BookRepository bookRepository;

    public ArrayList<BooksModel> getAllBooks(){
        return (ArrayList<BooksModel>) bookRepository.findAll();
    }

    public BooksModel saveBook(BooksModel book){
        return bookRepository.save(book);
    }

    public void deleteBook(Long id){ bookRepository.deleteById(id); }




}
