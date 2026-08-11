package com.example.studentcourse.entity;

public class Course {

    private Long id;
    private String coursename;
    private int fees;

    public Course() {}

    public Course(String coursename) {
        this.coursename = coursename;
        this.coursename = coursename;
    }

    //getters and setters
    public void setId(Long  id)
    {
        this.id=id;
    }

    public Long getId()
    {
        return this.id;
    }

    public void setCoursename(String coursename)
    {
        this.coursename = coursename;
    }

    public String getCoursename()
    {
        return this.coursename;
    }

    public void setFees(int fees)
    {
        this.fees = fees;
    }

    public int getFees ()
    {
        return this.fees;
    }

}