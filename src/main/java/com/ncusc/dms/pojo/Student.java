package com.ncusc.dms.pojo;

import java.io.Serializable;
import java.sql.Date;


/**
 * @author newKey and fxd
 * @version 1.0.0
 * time: 2018年12月05日
 * 学生信息  t_student_info
 * */
public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -856785958124569747L;
	private String sId;//学号
	private String sName;//姓名
	private String sex;//性别
	private String nation;//民族
	private Date birthDate;//生日
	private String majior;//专业 如软件工程
	private String grade;//年级 如2016级
	private String sClass;//班级 如161班
	private String cardNum;//身份证ID
	private String fId;//文件ID(存的头像路径)
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getMajior() {
		return majior;
	}
	public void setMajior(String majior) {
		this.majior = majior;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getsClass() {
		return sClass;
	}
	public void setsClass(String sClass) {
		this.sClass = sClass;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getfId() {
		return fId;
	}
	public void setfId(String fId) {
		this.fId = fId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sex=" + sex + ", nation=" + nation + ", birthDate="
				+ birthDate + ", majior=" + majior + ", grade=" + grade + ", sClass=" + sClass + ", cardNum=" + cardNum
				+ ", fId=" + fId + "]";
	}
	
	
	
}
