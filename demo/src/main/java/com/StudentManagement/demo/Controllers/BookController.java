package com.StudentManagement.demo.Controllers;

import com.StudentManagement.demo.BookDetails;
import com.StudentManagement.demo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.*;

@RestController
@RequestMapping("/api")
public class BookController {
//    List<BookDetails> bookDetailsList = new ArrayList<>();

    @PutMapping("/books/{ID}")
    public String updateBookDetailswithStudentId(@PathVariable int ID, @RequestBody Student student){
        Optional<BookDetails> bookDetailsOptional = bookRepository.findById(ID);
        if(bookDetailsOptional.isPresent()){
            BookDetails book = bookDetailsOptional.get();
            book.setStudent(student);
            bookRepository.save(book);
            return "Student Id Updated Successfully";
        }
        else return "Error! Something is Wrong";
    }


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
       bookRepository.deleteById(id);
       return "Book deleted successfully";
    }


    @GetMapping("/books/student")
    public Map<String,Student> getStudentfromBook(@RequestParam int ID){
        Optional<BookDetails> bookDetailsOptional = bookRepository.findById(ID);
        if(bookDetailsOptional.isPresent()){
            Map<String,Student> map = new HashMap<>();
            BookDetails book = bookDetailsOptional.get();
            map.put(book.getBookName(),book.getStudent());
            return map;
        }
        return null;
    }

}
