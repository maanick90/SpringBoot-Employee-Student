package com.senthilmaanick.springbootjpa.springbootjpa.student;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {

    public List<Student> findByEmployeeId(Long id);

    public void deleteByIdAndEmployeeId(Long stId, Long empId);
}
