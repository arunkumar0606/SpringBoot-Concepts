package com.example.ManyToMany.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Course {
    @Id
    private int courseId;

    private  String courseName;

    /*
    @ManyToMany
     */

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Student_Course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name="course_id")
    )
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /*
    @ManyToMany  ends
     */

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
