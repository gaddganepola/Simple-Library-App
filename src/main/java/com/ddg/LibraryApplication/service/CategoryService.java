package com.ddg.LibraryApplication.service;

import com.ddg.LibraryApplication.model.Category;
import com.ddg.LibraryApplication.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;
    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    public Category createCategory(Category category) {
        return categoryRepo.save(category);
    }
}
