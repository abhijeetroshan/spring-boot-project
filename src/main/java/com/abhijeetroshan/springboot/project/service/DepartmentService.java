package com.abhijeetroshan.springboot.project.service;

import com.abhijeetroshan.springboot.project.entity.Department;
import com.abhijeetroshan.springboot.project.repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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
        return iDepartmentRepository.findById(departmentId).orElse(new Department());
    }

    @Override
    public List<Department> saveAlldepartments(List<Department> departmentList) {
        return iDepartmentRepository.saveAll(departmentList);
    }

    @Override
    public String deleteDepartmentById(long departmentId) {
        if (getDepartmentById(departmentId).getDepartmentId() != 0) {
            iDepartmentRepository.deleteById(departmentId);
            return "Successfully deleted";
        } else return "Id is not present in Database";
    }

    @Override
    public Department updateDepartment(long departmentId, Department department) {
        Department departDB = getDepartmentById(departmentId);
        if (StringUtils.hasText(departDB.getDepartmentAddress()))
            departDB.setDepartmentAddress(department.getDepartmentAddress());
        else if (StringUtils.hasText(departDB.getDepartmentCode()))
            departDB.setDepartmentCode(department.getDepartmentCode());
        else if (StringUtils.hasText(departDB.getDepartmentName()))
            departDB.setDepartmentName(department.getDepartmentName());
        return null;
    }

    @Override
    public Department fetchByDepartmentName(String departmentName) {
        return iDepartmentRepository.findByDepartmentName(departmentName);
    }
}
