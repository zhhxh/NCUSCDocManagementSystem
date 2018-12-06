package com.ncusc.dms.pojo;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author newKey and fxd
 * @version 1.0.0
 * time: 2018年12月05日
 * 教师信息表 t_teacher_info
 **/
public class Teacher implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8639143297143067723L;
	
	private String tId; //工号
	private String tName;//教师名
	private String sex;//性别
	private String nation;//民族
	private Date birthDate;//生日
	private String cardNum;//身份证
	private String position;//职位 如教授
	private String fId; //文件ID(头像路径)
	public String gettId() {
		return tId;
	}
	public void settId(String tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
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
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
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
		return "Teacher [tId=" + tId + ", tName=" + tName + ", sex=" + sex + ", nation=" + nation + ", birthDate="
				+ birthDate + ", cardNum=" + cardNum + ", position=" + position + ", fId=" + fId + "]";
	}
	
	

}
