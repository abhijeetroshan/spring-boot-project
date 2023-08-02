package com.abhijeetroshan.springboot.project.service;

import com.abhijeetroshan.springboot.project.entity.Department;
import com.abhijeetroshan.springboot.project.repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements IDepartmentService {

    @Autowired
    private IDepartmentRepository iDepartmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return iDepartmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return iDepartmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(long departmentId) {
        return iDepartmentRepository.findById(departmentId).get();
    }

    @Override
    public List<Department> saveAlldepartments(List<Department> departmentList) {
        return iDepartmentRepository.saveAll(departmentList);
    }
}
