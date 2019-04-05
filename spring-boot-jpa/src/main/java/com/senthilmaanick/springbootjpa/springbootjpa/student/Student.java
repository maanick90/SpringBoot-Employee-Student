package com.senthilmaanick.springbootjpa.springbootjpa.student;

import com.senthilmaanick.springbootjpa.springbootjpa.employee.Employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;

    @ManyToOne
    private Employee employee;

    public Student() {
    }

    public Student(String name, Integer age, Employee employee) {
        this.name = name;
        this.age = age;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
