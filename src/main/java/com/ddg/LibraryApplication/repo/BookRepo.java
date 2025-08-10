package com.ddg.LibraryApplication.repo;

import com.ddg.LibraryApplication.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {
    @Query("SELECT b FROM Book b WHERE LOWER(b.title) LIKE LOWER(CONCAT('%', ?1, '%'))")
    List<Book> findByTitleContaining(String title);

    List<Book> findByCategory_Id(int categoryId);
}
