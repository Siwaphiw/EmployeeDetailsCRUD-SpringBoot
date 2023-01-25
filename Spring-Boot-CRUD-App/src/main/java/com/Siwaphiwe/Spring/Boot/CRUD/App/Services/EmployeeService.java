package com.Siwaphiwe.Spring.Boot.CRUD.App.Services;

import java.util.List;

import com.Siwaphiwe.Spring.Boot.CRUD.App.Models.Employee;

public interface EmployeeService {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    Employee update(int id,Employee employee);
    void delete(int id);
}