package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.bean.SchoolUser;
import com.revature.bean.UserRole;
import com.revature.dao.DAO;

@Service(value = "appService")
@Transactional
public class AppServiceImpl implements AppService {

	@Autowired
	DAO dao;

	@Transactional
	@Override
	public void createSchoolUser(SchoolUser a_user) {
		dao.addSchoolUser(a_user);
	}

	@Override
	public SchoolUser getSchooluser(SchoolUser a_user) {
		return dao.getSchoolUser(a_user);
	}

	@Override
	public UserRole getUserRole(int a_roleId) {
		return dao.getRoleById(a_roleId);
	}

	@Override
	public List<SchoolUser> getAllSchoolUser(UserRole a_role) {
		return dao.getAllSchoolUsersByRole(a_role);
	}

	@Transactional
	@Override
	public void updateSchoolUser(SchoolUser a_user) {
		dao.updateSchoolUserByID(a_user);
	}

	@Transactional
	@Override
	public void deleteSchoolUser(SchoolUser a_user) {
		dao.deleteSchoolUserByID(a_user);
	}

	@Override
	public SchoolUser SchoolUserWithUsename(String a_username) {
		return dao.getSchoolUserbyUsername(a_username);
	}

}
