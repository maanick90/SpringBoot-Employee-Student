package com.senthilmaanick.springbootjpa.springbootjpa.student;

import com.senthilmaanick.springbootjpa.springbootjpa.employee.Employee;
import com.senthilmaanick.springbootjpa.springbootjpa.util.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(Long empId) {
        return studentRepository.findByEmployeeId(empId);
    }

    public Student getStudent(Long empId, Long stId) {
        return studentRepository.findByEmployeeId(empId).stream()
                .filter(student -> student.getId().equals(stId))
                .findFirst().get();
    }

    public void createStudent(Student student, Long empId) {
        student.setEmployee(new Employee(empId, "", null));
        studentRepository.save(student);
    }

    public void updateStudent(Long empId, Long stId, Student student) {
        student.setEmployee(new Employee(empId, "", null));
        studentRepository.save(student);
    }

    public void deleteStudent(Long empId, Long stId) {

        studentRepository.deleteByIdAndEmployeeId(stId, empId);
    }

}
