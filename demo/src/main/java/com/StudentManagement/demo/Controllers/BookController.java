package com.StudentManagement.demo.Controllers;

import com.StudentManagement.demo.BookDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookController {
//    List<BookDetails> bookDetailsList = new ArrayList<>();


    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    public List<BookDetails> getBookDetails(){
       return bookRepository.findAll();
    }

    @PostMapping("/addBook")
    public String addBook(@RequestBody BookDetails book){

        bookRepository.save(book);
        return "Book Added Successfully";
//        bookDetailsList.add(book);
//        return "Book added Successfully";
    }

    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable int id) {
        Optional<BookDetails> book = bookRepository.findById(id);
        if (book.isPresent()) {
            bookRepository.delete(book.get());
            return "Book deleted successfully";
        } else {
            return "Book not found";
        }
    }

}
