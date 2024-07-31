package com.areeb.crud.crud.controllers;

import com.areeb.crud.crud.dto.EmployeeDto;
import com.areeb.crud.crud.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeesController {
    private  final EmployeeService employeeService;
    public EmployeesController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping(path="/all")
    public List<EmployeeDto> getEmployee(){
        return employeeService.getEmployee();
    }

    @GetMapping(path="/{id}")

    public EmployeeDto getEmployeeById(@PathVariable("id") Long empId){
        return employeeService.getEmployeeById(empId);
    }


    @PostMapping(path="/addEmployee")

    public EmployeeDto addEmployee(@RequestBody EmployeeDto employeeDto){
        return employeeService.addEmployee(employeeDto);
    }
}
