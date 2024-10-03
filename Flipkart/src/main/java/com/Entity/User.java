package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	int uid;
	String name;
	int MobileNo;
	String Email;
	String Pass;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(int mobileNo) {
		MobileNo = mobileNo;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	public User(int uid, String name, int mobileNo, String email, String pass) {
		super();
		this.uid = uid;
		this.name = name;
		MobileNo = mobileNo;
		Email = email;
		Pass = pass;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", MobileNo=" + MobileNo + ", Email=" + Email + ", Pass=" + Pass
				+ "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
}
