package com.senthilmaanick.springbootjpa.springbootjpa.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/employee/{empId}/getAllStudents")
    public List<Student> getAllStudents(@PathVariable Long empId) {
        return studentService.getAllStudents(empId);
    }

    @GetMapping("/employee/{empId}/getStudent/{stId}")
    public Student getStudent(@PathVariable Long empId, @PathVariable Long stId) {
        return studentService.getStudent(empId, stId);
    }

    @PostMapping("/employee/{empId}/createStudent")
    public void createStudent(@RequestBody Student student, @PathVariable Long empId) {
        studentService.createStudent(student, empId);
    }

    @PutMapping("/employee/{empId}/updateStudent/{stId}")
    public void updateStudent(@RequestBody Student student, @PathVariable Long empId, @PathVariable Long stId) {
        studentService.updateStudent(empId, stId, student);
    }

    @DeleteMapping("/employee/{empId}/deleteStudent/{stId}")
    public void deleteStudent(@PathVariable Long empId, @PathVariable Long stId) {
        studentService.deleteStudent(empId, stId);
    }

}
