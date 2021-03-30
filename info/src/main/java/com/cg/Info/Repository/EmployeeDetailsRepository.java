package com.cg.Info.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.Info.Entity.EmployeeDetails;

@Repository
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails,Integer> {
	
	@Query("select ed from EmployeeDetails ed join ed.emp e where e.id= :f")
	EmployeeDetails getBy(@Param("f") int g);

}
