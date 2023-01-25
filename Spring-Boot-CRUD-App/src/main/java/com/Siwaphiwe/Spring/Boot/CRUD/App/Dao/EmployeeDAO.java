package com.Siwaphiwe.Spring.Boot.CRUD.App.Dao;


import java.util.List;

import com.Siwaphiwe.Spring.Boot.CRUD.App.Models.Employee;
public interface EmployeeDAO {


    List<Employee> get();

    Employee get(int id);
    Employee update(int id,Employee employee);
    void save(Employee employee);

    void delete(int id);
}
