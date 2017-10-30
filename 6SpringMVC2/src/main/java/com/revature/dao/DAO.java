package com.revature.dao;

import java.util.List;

import com.revature.bean.SchoolUser;
import com.revature.bean.UserRole;

public interface DAO {

	/* Create */
	public void addSchoolUser(SchoolUser a_user);

	/* READ */
	public SchoolUser getSchoolUser(SchoolUser a_user);
	
	public UserRole getRoleById(int a_roleId);
	
	public List<SchoolUser> getAllSchoolUsersByRole(UserRole a_role);
	
	public SchoolUser getSchoolUserbyUsername(String a_username);

	/* UPDATE */
	public void updateSchoolUserByID(SchoolUser a_user);

	/* DELETE */
	public void deleteSchoolUserByID(SchoolUser a_user);

}
