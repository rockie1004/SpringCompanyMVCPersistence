package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
