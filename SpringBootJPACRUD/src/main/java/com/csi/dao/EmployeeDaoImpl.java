package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeDaoImpl {
    @Autowired
    EmployeeRepository empRepositoryImpl;

    public Employee saveData(Employee employee){
        return empRepositoryImpl.save(employee);
    }
    public List<Employee>getAllData(){
        return  empRepositoryImpl.findAll();
    }
    public Employee updateData(Employee employee){
        return empRepositoryImpl.save(employee);
    }
    public void deleteData(int empId){
        empRepositoryImpl.deleteById(empId);
    }
    public List<Employee> getDataByName(String empFirstName){
        return empRepositoryImpl.findByempFirstName(empFirstName);
    }
}
