package com.example.demo.service;
import java.util.list;
import java.util.Optional;
import com.example.demo.entity.Student;

public interface StudentService{
    Student insertStudent(Student st);
    List<Student>getAllStudents();
    Optional<Student>getOneSrtudent(Long id);
    void deleteStudent(Long id);
}