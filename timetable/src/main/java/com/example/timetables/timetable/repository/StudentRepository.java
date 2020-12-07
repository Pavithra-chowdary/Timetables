package com.example.timetables.timetable.repository;


import com.example.timetables.timetable.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


public interface StudentRepository extends JpaRepository<Student, Long> {
}

