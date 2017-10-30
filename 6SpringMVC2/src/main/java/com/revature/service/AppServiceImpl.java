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

	@Override
	public void createSchoolUser(SchoolUser a_user) {
		dao.addSchoolUser(a_user);
	}

	@Override
	public SchoolUser getSchooluser(SchoolUser a_user) {
		SchoolUser dbUser = dao.getSchoolUser(a_user);
		
		if (dbUser != null) {
			if (dbUser.getUserName().equals(a_user.getUserName())) {
				if (dbUser.getPassWord().equals(a_user.getPassWord())) {
					return dbUser;
				}
			}
		}
		return null;
	}

	@Override
	public UserRole getUserRole(int a_roleId) {
		return dao.getRoleById(a_roleId);
	}

	@Override
	public List<SchoolUser> getAllSchoolUser(UserRole a_role) {
		return dao.getAllSchoolUsersByRole(a_role);
	}

	@Override
	public void updateSchoolUser(SchoolUser a_user) {
		dao.updateSchoolUserByID(a_user);
	}

	@Override
	public void deleteSchoolUser(SchoolUser a_user) {
		dao.deleteSchoolUserByID(a_user);
	}

	@Override
	public SchoolUser SchoolUserWithUsename(String a_username) {
		return dao.getSchoolUserbyUsername(a_username);
	}

}
