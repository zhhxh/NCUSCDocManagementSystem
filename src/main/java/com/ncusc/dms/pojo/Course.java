package com.ncusc.dms.pojo;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author newKey and fxd
 * @version 1.0.0
 * tiem: 2018年12月05日
 * 教师信息 t_teacher_info
 * 
 * 去掉开课班级和开课教室,需要时添加进教师选课表中
 * private String cClass; //课程班级
 * private String classRoom;//课程教室
 * 
 * */
public class Course implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8029636268704038390L;
	private String cId; //课程ID
	private String cName; //课程名字
	private float credit;//学分
	private int semester;//学时
	private Date startDate;//开课时间，对应java.sql.date
	private Date endDate;//结束时间
	
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public float getCredit() {
		return credit;
	}
	public void setCredit(float credit) {
		this.credit = credit;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", credit=" + credit + ", semester=" + semester
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
	
	
	
	
}
