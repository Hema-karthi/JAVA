package com.example.studentcourse.controller;

import com.example.studentcourse.entity.Course;
import com.example.studentcourse.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping ("/details")

public class StudentCourseController
{
    @Autowired
    private RestTemplate restTemplate;


    public StudentCourseController (RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }


    @GetMapping ("/student/{studentId}/course/{courseId}")
    public String getDetails (@PathVariable int studentId ,@PathVariable int courseId)
    {
        Student student = restTemplate.getForObject(
                "http://localhost:8081/api/student/" + studentId,
                Student.class);

        Course course = restTemplate.getForObject(
                "http://localhost:8084/api/Course/" + courseId,
                Course.class);

        return "Student :" + student.getName()
                + " | Mark: " + student.getMark()
                + " | Course : " + course.getCoursename()
                + " | Fees : " + course.getFees();
    }

}
