package com.example.emp_management.service;

import com.example.emp_management.model.EmpRegistration;
import com.example.emp_management.repository.EmpRegistrationRepository;

import java.util.List;

public interface IEmpRegistrationService {
    void saveEmpRegInfo(EmpRegistration empRegistration);
    List<EmpRegistration> findAllEmployee();
}
