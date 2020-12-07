package com.example.timetables.timetable.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Component

public class StudentClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentclassID;
    private String studentName;

    public StudentClass() {
    }

    private String studentCode;


    public Set<Student> getStudentset() {
        return studentset;
    }

    public void setStudentset(Set<Student> studentset) {
        this.studentset = studentset;
    }

    @OneToMany(mappedBy = "studentclass",cascade = CascadeType.ALL)
    private Set<Student> studentset=new HashSet<>();
    public Long getStudentclassID() {

        return studentclassID;
    }

    public void setStudentclassID(Long studentclassID) {
        this.studentclassID = studentclassID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }



}
