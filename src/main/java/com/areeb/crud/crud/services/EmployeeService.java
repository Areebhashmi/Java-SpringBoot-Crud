package com.areeb.crud.crud.services;

import com.areeb.crud.crud.dto.EmployeeDto;
import com.areeb.crud.crud.entity.EmployeeEntity;
import com.areeb.crud.crud.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    final ModelMapper modelMapper;
    final EmployeeRepository employeeRepository;

    public EmployeeService(ModelMapper modelMapper, EmployeeRepository employeeRepository) {
        this.modelMapper = modelMapper;
        this.employeeRepository = employeeRepository;
    }


public EmployeeDto getEmployeeById(Long id){
    EmployeeEntity employeeEntity=employeeRepository.getById(id);
        return modelMapper.map(employeeEntity,EmployeeDto.class);
    }


public List<EmployeeDto> getEmployee(){
    return employeeRepository.findAll().
            stream()
            .map(employeeEntity->modelMapper.map(employeeEntity,EmployeeDto.class)).collect(Collectors.toList());

}

    public EmployeeDto addEmployee(EmployeeDto employeeDto){
        EmployeeEntity employeeEntity=modelMapper.map(employeeDto,EmployeeEntity.class);
        return modelMapper.map(employeeRepository.save(employeeEntity),EmployeeDto.class);

    }

}
