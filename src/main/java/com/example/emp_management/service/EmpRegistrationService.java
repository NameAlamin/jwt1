package com.example.emp_management.service;

import com.example.emp_management.model.EmpRegistration;
import com.example.emp_management.repository.EmpRegistrationRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmpRegistrationService implements IEmpRegistrationService{
    private final EmpRegistrationRepository empRegistrationRepository;

    public EmpRegistrationService(EmpRegistrationRepository empRegistrationRepository) {
        this.empRegistrationRepository = empRegistrationRepository;
    }

    @Override
    public void saveEmpRegInfo(EmpRegistration empRegistration) {
        empRegistrationRepository.save(empRegistration);
    }

    @Override
    public List<EmpRegistration> findAllEmployee() {
        return (List<EmpRegistration>) empRegistrationRepository.findAll();
    }
}
