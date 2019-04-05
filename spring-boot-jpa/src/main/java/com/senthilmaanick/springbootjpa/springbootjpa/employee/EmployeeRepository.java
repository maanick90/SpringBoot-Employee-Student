package com.senthilmaanick.springbootjpa.springbootjpa.employee;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
