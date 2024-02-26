package net.javaguide.saidur.ems.repository;

import jakarta.persistence.Id;
import net.javaguide.saidur.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
