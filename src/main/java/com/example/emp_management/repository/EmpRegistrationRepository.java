package com.example.emp_management.repository;

import com.example.emp_management.model.EmpRegistration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRegistrationRepository extends CrudRepository<EmpRegistration,Long> {

}
