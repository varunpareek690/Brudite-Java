package com.StudentManagement.demo.Controllers;

import com.StudentManagement.demo.BookDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<BookDetails,Integer> {
}
