package com.example.ManyToMany.Controller;


import com.example.ManyToMany.Entity.Course;
import com.example.ManyToMany.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;
    @PostMapping("/addCourse")
    public List<Course> addCourses(@RequestBody List<Course> courses){
        return courseService.addCourses(courses);
    }
}
