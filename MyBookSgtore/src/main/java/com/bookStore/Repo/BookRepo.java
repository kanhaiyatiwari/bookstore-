package com.bookStore.Repo;

import java.awt.print.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
