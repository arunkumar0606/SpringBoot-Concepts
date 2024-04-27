package com.example.ManyToMany.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {
    @Id
    private int studentId;

    private String name;

    /*
    @ManyToMany unidirectional
     */
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "Student_Course",
//            joinColumns = @JoinColumn(name = "student_id"),
//            inverseJoinColumns = @JoinColumn(name="course_id")
//    )
//    private List<Course> courses;
//
//    public List<Course> getCourses() {
//        return courses;
//    }
//
//    public void setCourses(List<Course> courses) {
//        this.courses = courses;
//    }
//
     /*
    @ManyToMany unidirectional ends
     */


    /*
    @ManyToMany   - Bidirectional

     */

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "students")
    private List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    /*
    @ManyToMany   - Bidirectional ends

     */
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
