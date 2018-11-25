/**
 * Student.java
 *  
 * Nov 21, 2018
 * Newkey
 * 
 */
package com.ncusc.dms.pojo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Newkey
 *
 */
@Entity
@Table(name="t_stu_info")
public class Student implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private String id;
    private String name;
    private String sex;
    private String nation; //民族
    private Date birthDate;//出生日期
    private String major; //专业
    private String grade; //年级
    private String s_class;//班级
    private String cardNum;//身份证号
    private String d_id;//头像(文档id)
    
    public Student(){
    	
    }
    
    public Student(String id, String name, String sex, String nation,
    		Date birthDate, String major, String grade, String s_class, String cardNum, String d_id){
    	this.id = id;
    	this.name = name;
    	this.sex = sex;
    	this.nation = nation;
    	this.birthDate = birthDate;
    	this.major = major;
    	this.grade = grade;
    	this.s_class = s_class;
    	this.cardNum = cardNum;
    	this.d_id = d_id;
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getS_class() {
		return s_class;
	}
	public void setS_class(String s_class) {
		this.s_class = s_class;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getD_id() {
		return d_id;
	}
	public void setD_id(String d_id) {
		this.d_id = d_id;
	}
    @Override
	public String toString(){
		return String.format("id=%s, name=%s, sex=%s, nation=%s, birthDate=%s, major=%s, grade=%s, class=%s,"
				+ "cardNum=%s, d_id=%s", id, name, sex, nation, new SimpleDateFormat("yyyy-MM-dd").format(birthDate)
				, major,grade, s_class, cardNum,d_id);
	}
}
