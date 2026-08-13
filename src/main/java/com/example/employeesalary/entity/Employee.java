package com.example.employeesalary.entity;


    public class Employee
    {

        private long id;
        private String name;
        private String status;

        public Employee(){}

        public Employee(String name,String status)
        {
            this.name =name;
            this.status=status;
        }
        public void setId(long id)
        {
            this.id=id;
        }
        public long getId()
        {
            return this.id;
        }
        public void setName(String name)
        {
            this.name=name;
        }
        public String getName()
        {
            return this.name;
        }
        public void setStatus(String status)
        {
            this.status=status;
        }
        public String getStatus()
        {
            return this.status;
        }
    }


