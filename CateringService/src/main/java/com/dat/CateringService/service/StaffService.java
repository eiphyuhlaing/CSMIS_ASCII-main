package com.dat.CateringService.service;

import java.util.List;

import com.dat.CateringService.entity.Staff;

public interface StaffService {
	//add and update
	public void addStaff(Staff staff);
	
	//select staffs
	public List<Staff> getAllStaffs();
	public List<Staff> getActiveStaffs(String status);
	public Staff getStaffById(String id);
	
	//search
	public List<Staff> searchBy(String name, String id, String team);
	
	//filter
	public List<Staff> filterByDivision(String division);
	public List<Staff> filterByDept(String dept);
	public List<Staff> filterByStatus(String status);
	public List<Staff> filterByRole(String role);
	
	//get name of divisions, departments and teams
	public List<String> getTeamNames();
	public List<String> getDivNames();
	public List<String> getDeptNames();
	
	
	//delete
	public void deleteById(String id);
}
