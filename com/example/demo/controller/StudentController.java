package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController
{
    private final StudentService service;
    public StudentController(StudentService service)
    {
        this.service=service;
    }
    @GetMapping
    public List<Student> findAll()
    {
        //return "Method called for GetRequest";
        return this.service.findAll();
    }
}
