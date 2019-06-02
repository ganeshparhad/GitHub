package com.spring.training.rest.resource.repository;
import org.springframework.data.jpa.repository.
JpaRepository;
import com.spring.training.rest.resource.repository.
EmployeeEntity;
public interface EmployeeRepository extends
JpaRepository<EmployeeEntity,Long>
{
}