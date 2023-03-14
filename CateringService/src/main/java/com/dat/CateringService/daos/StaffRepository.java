package com.dat.CateringService.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dat.CateringService.entity.Staff;

public interface StaffRepository extends JpaRepository<Staff, String> {
	public List<Staff> findByNameContainsAndStaffIDContainsAndTeamContainsAllIgnoreCase(String name, String id, String team);
	public List<Staff> findByDivisionContainsAllIgnoreCase(String division);
	public List<Staff> findByDeptContainsAllIgnoreCase(String dept);
	public List<Staff> findByStatusContainsAllIgnoreCase(String status);
	public List<Staff> findByRoleContainsAllIgnoreCase(String role);
	@Query(value="SELECT DISTINCT team FROM staff WHERE team IS NOT NULL", nativeQuery = true)
	public List<String> findTeamNames();
	@Query(value="SELECT DISTINCT division FROM staff WHERE division IS NOT NULL", nativeQuery = true)
	public List<String> findDivNames();
	@Query(value="SELECT DISTINCT dept FROM staff WHERE dept IS NOT NULL", nativeQuery = true)
	public List<String> findDeptNames();
	@Query(value="SELECT * FROM staff WHERE status = :statusParam", nativeQuery = true)
	public List<Staff> findActiveStaffs(@Param("statusParam")String status);
}
