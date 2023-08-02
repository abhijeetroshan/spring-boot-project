package com.abhijeetroshan.springboot.project.repository;

import com.abhijeetroshan.springboot.project.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartmentRepository extends JpaRepository<Department, Long> {
}
