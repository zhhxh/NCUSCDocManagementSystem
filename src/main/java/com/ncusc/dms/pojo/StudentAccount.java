package com.ncusc.dms.pojo;

import java.io.Serializable;
/**
 * @author newKey and fxd
 * @version 1.0.0
 * time: 2018年12月05日
 * 学生账户信息  t_stu_account
 * */

public class StudentAccount implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7185588668768364225L;

	private String sId; //学号
	private String telNum;//手机号
	private String email;//邮箱
	private String password; //密码
	
	public StudentAccount(){
		
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getTelNum() {
		return telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "StudentAccount [sId=" + sId + ", telNum=" + telNum + ", email=" + email + ", password=" + password
				+ "]";
	}
	
	
}
