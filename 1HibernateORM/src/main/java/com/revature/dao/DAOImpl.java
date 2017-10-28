package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.revature.bean.SchoolUser;
import com.revature.bean.UserRole;
import com.revature.util.HibernateConnectionUtil;

public class DAOImpl implements DAO {

	public void addSchoolUser(SchoolUser a_user) {
		Session session = HibernateConnectionUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(a_user);
		tx.commit();
		session.close();
	}

	public SchoolUser getSchoolUser(SchoolUser a_user) {
		Session session = HibernateConnectionUtil.getSession();
		return (SchoolUser) session.get(SchoolUser.class, a_user.getSchoolUserID());
	}

	public UserRole getRoleById(int a_roleId) {
		Session session = HibernateConnectionUtil.getSession();
		return (UserRole) session.get(UserRole.class, a_roleId);
	}

	@SuppressWarnings("unchecked")
	public List<SchoolUser> getAllSchoolUsersByRole(UserRole a_role) {
		Session session = HibernateConnectionUtil.getSession();
		return (List<SchoolUser>) session.createCriteria(SchoolUser.class)
				.add(Restrictions.eq("userRole", a_role))
				.list();
	}

	public void updateSchoolUserByID(SchoolUser a_user) {
		Session session = HibernateConnectionUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.update(a_user);
		tx.commit();
		session.close();
	}

	public void deleteSchoolUserByID(SchoolUser a_user) {
		Session session = HibernateConnectionUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.delete(a_user);
		tx.commit();
		session.close();
	}
	
}
