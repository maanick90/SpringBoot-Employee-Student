package com.senthilmaanick.springbootjpa.springbootjpa.employee;

import com.senthilmaanick.springbootjpa.springbootjpa.util.Gender;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Gender gender;

    public Employee() {
    }

    public Employee(Long id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
