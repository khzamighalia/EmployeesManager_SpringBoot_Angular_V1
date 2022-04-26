package com.managerapp.managerapp.controllers;

import java.util.List;

import com.managerapp.managerapp.model.Employee;
import com.managerapp.managerapp.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){

        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees,HttpStatus.OK);


    }

    @GetMapping(path="/{id}")
    public ResponseEntity<Employee> findEmployeeById(@PathVariable("id") Long id){
        Employee employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee,HttpStatus.OK);


    }

    @PostMapping()
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee newemployee= employeeService.addEmployee(employee);
        return new ResponseEntity<>(newemployee,HttpStatus.OK);


    }
    @PutMapping()
    public ResponseEntity<Employee> updateEmployeeById(@RequestBody Employee employee){
        Employee updatedemployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updatedemployee,HttpStatus.OK);


    }
    @DeleteMapping(path="/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable("id") Long id){
        employeeService.deleteEmployeeById(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
    
}

