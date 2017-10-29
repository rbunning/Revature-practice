package com.revature.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SCHOOL_USER")
public class SchoolUser implements Serializable {

	/**
	 * SCHOOL_USER -table
	 * S_ID -column
	 * UR_ID -column
	 * S_FNAME -column
	 * S_LNAME -column
	 * S_UNAME -column
	 * S_PWORD -column
	 * S_EMAIL -column
	 */
	private static final long serialVersionUID = 8935601299540575044L;

	@Id
	//@SequenceGenerator(sequenceName = "SCHOOL_USER_SEQ", name = "SU_SEQ")
	//@GeneratedValue(generator = "SU_SEQ", strategy = GenerationType.SEQUENCE)
	@Column(name="S_ID")
	private int schoolUserID;
	
	@ManyToOne
	@JoinColumn(name="UR_ID")
	private UserRole userRole;
	
	@Column(name="S_FNAME")
	private String lastName;
	
	@Column(name="S_LNAME")
	private String fisrtName;
	
	@Column(name="S_UNAME")
	private String userName;
	
	@Column(name="S_PWORD")
	private String passWord;
	
	@Column(name="S_EMAIL")
	private String email;

	public SchoolUser() {
		super();
	}

	public SchoolUser(int schoolUserID, UserRole userRole, String lastName, String fisrtName, String userName,
			String passWord, String email) {
		super();
		this.schoolUserID = schoolUserID;
		this.userRole = userRole;
		this.lastName = lastName;
		this.fisrtName = fisrtName;
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
	}

	public int getSchoolUserID() {
		return schoolUserID;
	}

	public void setSchoolUserID(int schoolUserID) {
		this.schoolUserID = schoolUserID;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "SchoolUser [schoolUserID=" + schoolUserID + ", userRole=" + userRole + ", lastName=" + lastName
				+ ", fisrtName=" + fisrtName + ", userName=" + userName + ", passWord=" + passWord + ", email=" + email
				+ "]";
	}

}
