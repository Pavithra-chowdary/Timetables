package com.example.timetables.timetable.model;


import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Date;
@Component
@Entity
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long studentId;
    String studentName;
    String studentRollno;
    Date studentDoB;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentRollno() {
        return studentRollno;
    }

    public void setStudentRollno(String studentRollno) {
        this.studentRollno = studentRollno;
    }

    public Date getStudentDoB() {
        return studentDoB;
    }

    public void setStudentDoB(Date studentDoB) {
        this.studentDoB = studentDoB;
    }


}