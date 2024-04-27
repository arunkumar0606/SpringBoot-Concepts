package com.example.ManyToMany.Service;

import com.example.ManyToMany.Entity.Course;
import com.example.ManyToMany.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;
    public List<Course> addCourses(List<Course> courses) {
        return courseRepository.saveAll(courses);
    }
}
