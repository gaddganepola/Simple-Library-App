package com.ddg.LibraryApplication.service;

import com.ddg.LibraryApplication.model.Author;
import com.ddg.LibraryApplication.repo.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepo authorRepo;
    public List<Author> getAllAuthors() {
        return authorRepo.findAll();
    }

    public Author createAuthor(Author author) {
        return authorRepo.save(author);
    }
}
