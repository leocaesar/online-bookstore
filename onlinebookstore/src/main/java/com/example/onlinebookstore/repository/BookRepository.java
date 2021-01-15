package com.example.onlinebookstore.repository;

import com.example.onlinebookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


public interface BookRepository extends JpaRepository<Book,Long> {
}
