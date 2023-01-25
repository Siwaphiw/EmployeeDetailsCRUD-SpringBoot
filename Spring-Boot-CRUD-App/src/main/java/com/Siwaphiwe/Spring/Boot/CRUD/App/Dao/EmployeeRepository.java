package com.Siwaphiwe.Spring.Boot.CRUD.App.Dao;

import com.Siwaphiwe.Spring.Boot.CRUD.App.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}