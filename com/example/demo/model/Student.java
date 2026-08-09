package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int mark;

    public Student() {}

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
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


    public void setName(String  name)
    {
        this.name=name;
    }

    public String getName()
    {
        return this.name;
    }


    public void setMark(int  mark)
    {
        this.mark=mark;
    }

    public int getMark()
    {
        return this.mark;
    }


}


