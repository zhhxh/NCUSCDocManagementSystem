package com.ncusc.dms.pojo;

import java.io.Serializable;
/**
 * @author newKey and fxd
 * @version 1.0.0
 * time:2018年12月05日
 * 教师账户 t_teacher_account
 * */

public class TeacherAccount implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2564115963509042534L;
	private String tId;//工号
	private String telNum;//手机号
	private String email; //邮箱
	private String password;//密码
	private boolean isAdmin; //是否是管理员
	
	public String gettId() {
		return tId;
	}
	public void settId(String tId) {
		this.tId = tId;
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
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	@Override
	public String toString() {
		return "TeacherAccount [tId=" + tId + ", telNum=" + telNum + ", email=" + email + ", password=" + password
				+ ", isAdmin=" + isAdmin + "]";
	}
	
	
	

}
