package com.Siwaphiwe.Spring.Boot.CRUD.App.Controllers;


import java.util.List;

import com.Siwaphiwe.Spring.Boot.CRUD.App.Services.EmployeeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Siwaphiwe.Spring.Boot.CRUD.App.Models.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    @ApiOperation(value= "Saves new record of an employee")
    public Employee save(@RequestBody Employee employeeObj) {
        employeeService.save(employeeObj);
        return employeeObj;
    }

    @GetMapping("/employee")
    @ApiOperation(value= "Retrieves all employees on the table")
    public List<Employee> get(){

        return employeeService.get();
    }

    @GetMapping("/employee/{id}")
    @ApiOperation(value= "Gets the records of the employee by ID")
    public Employee get(@PathVariable int id) {
        Employee employeeObj = employeeService.get(id);
        if(employeeObj == null) {
            throw new RuntimeException("Employee not found for the Id:"+id);
        }
        return employeeObj;
    }

    @PutMapping("/employee/{id}")
    @ApiOperation(value= "Updates the existing record of an employee")
    public Employee updateEmployee(@PathVariable int id,@RequestBody Employee employee ) {
        employee.setId(id);
        return employeeService.update(id,employee);
    }

    @DeleteMapping("/employee/{id}")
    @ApiOperation(value= "Delete employee by ID")
    public String delete(@PathVariable int id) {
        employeeService.delete(id);
        return "Employee has been deleted with id:"+id;
    }
}
