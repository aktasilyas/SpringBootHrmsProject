package akt.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import akt.hrms.entities.concretes.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer> {

}