package com.example.ManyToMany.Controller;


import com.example.ManyToMany.Entity.Student;
import com.example.ManyToMany.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    @PostMapping("/addStudent")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return studentService.addStudents(students);
    }
}
