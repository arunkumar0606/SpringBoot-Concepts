package com.example.ManyToMany.Service;

import com.example.ManyToMany.Entity.Student;
import com.example.ManyToMany.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public List<Student> addStudents(List<Student> students) {
        return studentRepository.saveAll(students);
    }
}
