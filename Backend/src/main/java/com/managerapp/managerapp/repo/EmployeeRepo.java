package com.managerapp.managerapp.repo;

import java.util.Optional;

import com.managerapp.managerapp.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);

    

    
}

