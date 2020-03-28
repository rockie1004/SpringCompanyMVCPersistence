package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
