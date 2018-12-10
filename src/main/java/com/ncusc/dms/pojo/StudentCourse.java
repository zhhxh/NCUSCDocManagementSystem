package com.ncusc.dms.pojo;

import java.io.Serializable;

/**
 * @author newKey and fxd
 * @version 1.0.0
 * time:2018年12月05日
 * 学生选课表 t_stu_course
 * */
public class StudentCourse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3888485904391428135L;

	private String scId;//学号+cId 作为选课主键
	private String sId;//学号
	private String cId;//课程号
	private String tId;//任课教师
	public String getScId() {
		return scId;
	}
	public void setScId(String scId) {
		this.scId = scId;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String gettId() {
		return tId;
	}
	public void settId(String tId) {
		this.tId = tId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "StudentCourse [scId=" + scId + ", sId=" + sId + ", cId=" + cId + ", tId=" + tId + "]";
	}
	
	
}
