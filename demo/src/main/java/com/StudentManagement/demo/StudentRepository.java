package com.StudentManagement.demo;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface StudentRepository extends MongoRepository<Student,Integer> {
}
