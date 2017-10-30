package com.revature.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="USER_ROLE")
public class UserRole implements Serializable {

	/**
	 * USER_ROLE -table 
	 * UR_ID -column 
	 * UR_NAME -column
	 */
	private static final long serialVersionUID = -2503944621236675376L;

	@Id
	@Column(name="UR_ID")
	private int userRoleId;
	
	@Column(name="UR_NAME")
	private String userRoleName;

	public UserRole() {
		super();
	}

	public UserRole(int userRoleId, String userRoleName) {
		super();
		this.userRoleId = userRoleId;
		this.userRoleName = userRoleName;
	}

	public int getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getUserRoleName() {
		return userRoleName;
	}

	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "UserRole [userRoleId=" + userRoleId + ", userRoleName=" + userRoleName + "]";
	}

}
