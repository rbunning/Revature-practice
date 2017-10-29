package com.revature.service;

import java.util.List;

import com.revature.bean.SchoolUser;
import com.revature.bean.UserRole;

public interface AppService{
	
	public void createSchoolUser(SchoolUser a_user);

	public SchoolUser getSchooluser(SchoolUser a_user);

	public UserRole getUserRole(int a_roleId);

	public List<SchoolUser> getAllSchoolUser(UserRole a_role);

	public void updateSchoolUser(SchoolUser a_user);

	public void deleteSchoolUser(SchoolUser a_user);
	
	public SchoolUser SchoolUserWithUsename(String a_username);

}
