package com.StudentManagement.demo.Controllers;

import com.StudentManagement.demo.Student;
import com.StudentManagement.demo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {
    // OLd
//    List<Student> studentList = new ArrayList<>();

    //New
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentRepository.findAll();
//        return studentList;
    }


    //Get Student with ID
    @GetMapping("/students/{ID}")
    public Optional<Student> getStudentById(@PathVariable int ID){
        return studentRepository.findById(ID);
    }




    @PostMapping("/addData")
    public String addStudentData(@RequestBody Student student){

        // OLD
//        studentList.add(student);
//        if(studentList.isEmpty()) return "Error";
//        else return "Student added successfully";

        studentRepository.save(student);
         return "Student added successfully";
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentRepository.deleteById(id);
        return "Student deleted successfully";
    }
}
