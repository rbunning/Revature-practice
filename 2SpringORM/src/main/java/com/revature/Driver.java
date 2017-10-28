package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.bean.SchoolUser;
import com.revature.bean.UserRole;
import com.revature.service.AppService;

public class Driver {

	private static UserRole studentRole;
	private static UserRole teacherRole;
	private static AppService app;

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		app = (AppService) ac.getBean("appService");

		studentRole = app.getUserRole(1);
		teacherRole = app.getUserRole(2);

		/* CREATE */
		SchoolUser student = new SchoolUser(5, studentRole, "will", "bill", "gill", "123", "gill@school.edu");
		app.createSchoolUser(student);
		SchoolUser teacher = new SchoolUser(3, teacherRole, "jim", "john", "james", "123", "james@job.edu");
		app.createSchoolUser(teacher);

		/* READ */
		print();

		/* UPDATE */
		student = new SchoolUser(5, studentRole, "gwillg", "bill", "gill", "123", "gill@school.edu");
		app.updateSchoolUser(student);
		teacher = new SchoolUser(3, teacherRole, "gjimg", "john", "james", "123", "james@job.edu");
		app.updateSchoolUser(teacher);

		/* READ */
		print();

		/* DELETE */
		app.deleteSchoolUser(student);

		app.deleteSchoolUser(teacher);

		/* READ */
		print();

	}

	private static void print() {

		for (SchoolUser su : app.getAllSchoolUser(studentRole)) {
			System.out.println(su);
		}
		for (SchoolUser su : app.getAllSchoolUser(teacherRole)) {
			System.out.println(su);
		}

		System.out.println("----------");
		System.out.println();
	}

}
