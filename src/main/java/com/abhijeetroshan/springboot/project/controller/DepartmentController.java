package com.abhijeetroshan.springboot.project.controller;

import com.abhijeetroshan.springboot.project.entity.Department;
import com.abhijeetroshan.springboot.project.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") long departmentId) {
        return iDepartmentService.getDepartmentById(departmentId);
    }

    @PostMapping("/alldepartments")
    public List<Department> saveAlldepartments(@RequestBody List<Department> departmentList) {
        return iDepartmentService.saveAlldepartments(departmentList);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") long departmentId) {
        return iDepartmentService.deleteDepartmentById(departmentId);
    }
}
