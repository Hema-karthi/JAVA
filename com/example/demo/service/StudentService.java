package com.example.demo.service;
import com.example.demo.model.Student;
import org.springframework.stereotype.Service;
import com.example.demo.repository.StudentRepository;
import java.util.List;

@Service
public class StudentService
{
    private final StudentRepository repo;
    public StudentService(StudentRepository repo)
    {
        this.repo= repo;
    }
    public List<Student> findAll()
    {
      return this.repo.findAll();
    }
}
