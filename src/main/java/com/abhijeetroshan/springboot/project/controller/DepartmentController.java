package com.abhijeetroshan.springboot.project.controller;

import com.abhijeetroshan.springboot.project.entity.Department;
import com.abhijeetroshan.springboot.project.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private IDepartmentService iDepartmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return iDepartmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        return iDepartmentService.fetchDepartmentList();
    }
}
