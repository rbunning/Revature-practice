package com.revature.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.bean.SchoolUser;
import com.revature.bean.UserRole;

@Repository
public class DAOImpl implements DAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addSchoolUser(SchoolUser a_user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(a_user);
	}

	public SchoolUser getSchoolUser(SchoolUser a_user) {
		Session session = sessionFactory.getCurrentSession();
		return (SchoolUser) session.get(SchoolUser.class, a_user.getSchoolUserID());
	}

	public UserRole getRoleById(int a_roleId) {
		Session session = sessionFactory.getCurrentSession();
		return (UserRole) session.get(UserRole.class, a_roleId);
	}

	@SuppressWarnings("unchecked")
	public List<SchoolUser> getAllSchoolUsersByRole(UserRole a_role) {
		Session session = sessionFactory.getCurrentSession();
		return (List<SchoolUser>) session.createCriteria(SchoolUser.class)
				.add(Restrictions.eq("userRole", a_role))
				.list();
	}

	public void updateSchoolUserByID(SchoolUser a_user) {
		Session session = sessionFactory.getCurrentSession();
		session.update(a_user);
	}

	public void deleteSchoolUserByID(SchoolUser a_user) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(a_user);
	}

	@Override
	public SchoolUser getSchoolUserbyUsername(String a_username) {
		Session session = sessionFactory.getCurrentSession();
		return (SchoolUser) session.createCriteria(SchoolUser.class)
				.add(Restrictions.eq("userName", a_username)).uniqueResult();
	}
	
}
