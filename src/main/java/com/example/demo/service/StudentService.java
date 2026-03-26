package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    // Add student
    public Student save(Student s) {
        return repo.save(s);
    }

    // Get all students
    public List<Student> getAll() {
        return repo.findAll();
    }

    // Delete student
    public void delete(Long id) {
        repo.deleteById(id);
    }
}