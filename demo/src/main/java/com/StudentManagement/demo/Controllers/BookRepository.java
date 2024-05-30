package com.StudentManagement.demo.Controllers;

import com.StudentManagement.demo.BookDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookDetails,Integer> {
}
