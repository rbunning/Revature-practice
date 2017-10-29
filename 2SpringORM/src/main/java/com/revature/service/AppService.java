package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.bean.SchoolUser;
import com.revature.bean.UserRole;
import com.revature.dao.DAO;

@Service(value="appService")
@Transactional
public class AppService {
	
	@Autowired
	DAO dao;

	@Transactional
	public void createSchoolUser(SchoolUser a_user) {
		dao.addSchoolUser(a_user);
	}

	public SchoolUser getSchooluser(SchoolUser a_user) {
		return dao.getSchoolUser(a_user);
	}

	public UserRole getUserRole(int a_roleId) {
		return dao.getRoleById(a_roleId);
	}

	public List<SchoolUser> getAllSchoolUser(UserRole a_role) {
		return dao.getAllSchoolUsersByRole(a_role);
	}

	@Transactional
	public void updateSchoolUser(SchoolUser a_user) {
		dao.updateSchoolUserByID(a_user);
	}

	@Transactional
	public void deleteSchoolUser(SchoolUser a_user) {
		dao.deleteSchoolUserByID(a_user);
	}
	
	public SchoolUser SchoolUserWithUsename(String a_username) {
		return dao.getSchoolUserbyUsername(a_username);
	}

}
