package com.revature;

import com.revature.bean.SchoolUser;
import com.revature.bean.UserRole;
import com.revature.dao.DAO;
import com.revature.dao.DAOImpl;

public class Driver {

	public static void main(String[] args) {
		DAO dao = new DAOImpl();
		
		/* CREATE */
		SchoolUser student = new SchoolUser(5, dao.getRoleById(1), "will", "bill", "gill", "123", "gill@school.edu");
		dao.addSchoolUser(student);
		SchoolUser teacher = new SchoolUser(3, dao.getRoleById(2), "jim", "john", "james", "123", "james@job.edu");
		dao.addSchoolUser(teacher);

		/* READ */
		for (SchoolUser su : dao.getAllSchoolUsersByRole(dao.getRoleById(1))) {
			System.out.println(su);
		}
		for (SchoolUser su : dao.getAllSchoolUsersByRole(dao.getRoleById(2))) {
			System.out.println(su);
		}
		
		System.out.println("----------");
		System.out.println();
		
		/* UPDATE */
		student = new SchoolUser(5, dao.getRoleById(1), "gwillg", "bill", "gill", "123", "gill@school.edu");
		dao.updateSchoolUserByID(student);
		teacher = new SchoolUser(3, dao.getRoleById(2), "gjimg", "john", "james", "123", "james@job.edu");
		dao.updateSchoolUserByID(teacher);
		
		/* READ */
		for (SchoolUser su : dao.getAllSchoolUsersByRole(dao.getRoleById(1))) {
			System.out.println(su);
		}
		for (SchoolUser su : dao.getAllSchoolUsersByRole(dao.getRoleById(2))) {
			System.out.println(su);
		}
		
		System.out.println("----------");
		System.out.println();
		
		/* DELETE */
		dao.deleteSchoolUserByID(student);
		
		dao.deleteSchoolUserByID(teacher);
		
		/* READ */
		for (SchoolUser su : dao.getAllSchoolUsersByRole(dao.getRoleById(1))) {
			System.out.println(su);
		}
		for (SchoolUser su : dao.getAllSchoolUsersByRole(dao.getRoleById(2))) {
			System.out.println(su);
		}
		
		System.out.println("----------");
		System.out.println();

	}
	
}
