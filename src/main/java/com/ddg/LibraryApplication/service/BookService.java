package com.ddg.LibraryApplication.service;

import com.ddg.LibraryApplication.model.Book;
import com.ddg.LibraryApplication.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public Book createBook(Book book) {
        return bookRepo.save(book);
    }
}
