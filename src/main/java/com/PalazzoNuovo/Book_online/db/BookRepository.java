package com.PalazzoNuovo.Book_online.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PalazzoNuovo.Book_online.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}