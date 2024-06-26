package com.luv2code.employeeDirectoryCrud.dao;

import com.luv2code.employeeDirectoryCrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "employeemembers")
//if u want to change path use above annpot for custome oath
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //thats is no need to wirte morecode
    //no need of implimentaiooin class also

}
