package com.example.my_employee.service.impl;

import com.example.my_employee.entitiy.EmployeeEntity;
import com.example.my_employee.entitiy.SalaryEntity;
import com.example.my_employee.repository.SalaryRepository;
import com.example.my_employee.service.SalaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private SalaryRepository salaryRepository;

    public SalaryEntity getEmployeeById(Long id) {
        return salaryRepository.findById(id).orElse(null);
    }

    @Override
    public SalaryEntity getSalaryById(Long id) {
        return null;
    }
}
