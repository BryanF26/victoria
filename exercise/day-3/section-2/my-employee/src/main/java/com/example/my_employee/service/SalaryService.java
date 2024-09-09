package com.example.my_employee.service;

import com.example.my_employee.entitiy.SalaryEntity;
import org.springframework.stereotype.Component;

@Component
public interface SalaryService {

    SalaryEntity getSalaryById(Long id);

}
