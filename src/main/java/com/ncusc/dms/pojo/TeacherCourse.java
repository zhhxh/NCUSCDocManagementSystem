package com.ncusc.dms.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author newKey and fxd
 * @version 1.0.0
 * time:2018年12月05日
 * 教师选课表 t_teacher_course
 * 暂不添加选课班级,开课教室
 *
 */

public class TeacherCourse implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 2375678411159570549L;

	private String tcId;//教师工号+课程号
	private String tId;//工号
	private String cId;//课程号
	private Course course; //课程信息
	private List<Student> stuList;

	public List<Student> getStuList() { return stuList; }

	public void setStuList(List<Student> stuList) { this.stuList = stuList; }

	public Course getCourse() { return course; }

	public void setCourse(Course course) { this.course = course; }

	public String getTcId() {
		return tcId;
	}
	public void setTcId(String tcId) {
		this.tcId = tcId;
	}
	public String gettId() {
		return tId;
	}
	public void settId(String tId) {
		this.tId = tId;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "TeacherCourse [tcId=" + tcId + ", tId=" + tId + ", cId=" + cId + "]";
	}



}
