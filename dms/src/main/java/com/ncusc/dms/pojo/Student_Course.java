/**
 * Student_Course.java
 *  
 * Nov 24, 2018
 * Newkey
 * 
 */
package com.ncusc.dms.pojo;

import java.io.Serializable;

import javax.persistence.Column;
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
@Table(name="t_stu_course")
public class Student_Course implements Serializable{
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name="sc_id")
      private String sc_id;//选课主键
	  @Column(name="s_id")
	  private String s_id;//学生id
	  @Column(name="c_id")
	  private String c_id;//课程id
	  private float marks;//成绩
	  
	  public Student_Course(){
		  
	  }
	  
	  public Student_Course(String sc_id, String s_id, String c_id, float marks){
		  this.sc_id = sc_id;
		  this.s_id = s_id;
		  this.c_id = c_id;
		  this.marks = marks;
	  }

	public String getSc_id() {
		return sc_id;
	}

	public void setSc_id(String sc_id) {
		this.sc_id = sc_id;
	}

	public String getS_id() {
		return s_id;
	}

	public void setS_id(String s_id) {
		this.s_id = s_id;
	}

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	  
	 @Override
	 public String toString(){
		 return String.format("sc_id=%s, s_id=%s, c_id=%s, marks=%f", sc_id, s_id, c_id, marks);
	 }
}
