package kz.dar.university.dar.service;

import kz.dar.university.dar.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    void createEmployee(EmployeeModel employeeModel);
    List<EmployeeModel> getAllEmployees();
    EmployeeModel getEmployeeById(String employeeId);
    void updateEmployeeById(String employeeId, EmployeeModel employeeModel);
    void deleteEmployeeById(String employeeId);
}
