package com.abhijeetroshan.springboot.project.service;

import com.abhijeetroshan.springboot.project.entity.Department;

import java.util.List;

public interface IDepartmentService {

    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();
}
