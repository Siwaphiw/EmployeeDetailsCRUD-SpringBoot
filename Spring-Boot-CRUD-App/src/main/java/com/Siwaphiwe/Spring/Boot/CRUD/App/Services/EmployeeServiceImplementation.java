package com.Siwaphiwe.Spring.Boot.CRUD.App.Services;

import java.util.List;

import com.Siwaphiwe.Spring.Boot.CRUD.App.Dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Siwaphiwe.Spring.Boot.CRUD.App.Dao.EmployeeDAO;
import com.Siwaphiwe.Spring.Boot.CRUD.App.Models.Employee;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    @Override
    public List<Employee> get() {
        return employeeDAO.get();
    }

    @Transactional
    @Override
    public Employee get(int id) {
        return employeeDAO.get(id);
    }

    @Transactional
    @Override
    public void save(Employee employee) {
        employeeDAO.save(employee);
    }

    @Override
    public Employee update( int id,Employee employee) {
        return employeeRepository.save(employee);

    }

    @Transactional
    @Override
    public void delete(int id) {
        employeeDAO.delete(id);
    }
}
