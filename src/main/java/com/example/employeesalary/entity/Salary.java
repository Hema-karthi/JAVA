package com.example.employeesalary.entity;

    public class Salary
    {
        private Long id;
        private double salary;
        private int increment;

        public Salary(){}

        public Salary(double salary,int increment)
        {
            this.salary=salary;
            this.increment=increment;
        }
        public void setId(Long id)
        {
            this.id=id;
        }
        public Long getId()
        {
            return this.id;
        }
        public void setSalary(double salary)
        {
            this.salary=salary;
        }
        public double getSalary()
        {
            return this.salary;

        }
        public void setIncrement(int increment)
        {
            this.increment=increment;

        }
        public  int getIncrement()
        {
            return this.increment;
        }
    }


