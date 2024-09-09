package com.example.my_employee.controller;

import com.example.my_employee.entitiy.SalaryEntity;
import com.example.my_employee.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/salaries")
public class SalaryController {

    @Autowired
    private SalaryService salaryService;

    @GetMapping("/{id}")
    public ResponseEntity<SalaryEntity> getSalaryById(@PathVariable Long id){
        SalaryEntity salary = salaryService.getSalaryById(id);
        if (salary != null){
            return ResponseEntity.ok(salary);
        } else{
            return ResponseEntity.notFound().build();
        }
    }
}
