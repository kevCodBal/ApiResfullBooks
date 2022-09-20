package com.microserviceslibreria.books.repositories;


import com.microserviceslibreria.books.models.BooksModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<BooksModel, Long> {
}
