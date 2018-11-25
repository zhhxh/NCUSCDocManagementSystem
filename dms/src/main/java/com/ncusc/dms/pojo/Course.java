/**
 * Course.java
 *  
 * Nov 23, 2018
 * Newkey
 * 
 */
package com.ncusc.dms.pojo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

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
@Table(name="t_course_info")
public class Course implements Serializable{
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
      private String id;//课程号
	  
	  @Column(nullable=false)
      private String name;//课程名
      private float credit;//学分
      private int semester;//学时
      private Date cStartTime;//开课时间
      private Date cEndTime;//结课时间
      private String t_id;//外键 教师id
      
      public Course(){
    	  
      }
      
      public Course(String id, String name, float credit, int semester, Date cStartTime, 
    		  Date cEndTime, String t_id){
    	   this.id = id;
    	   this.name = name;
    	   this.credit = credit;
    	   this.semester = semester;
    	   this.cStartTime = cStartTime;
    	   this.cEndTime = cEndTime;
    	   this.t_id = t_id;
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

	public Date getcStartTime() {
		return cStartTime;
	}

	public void setcStartTime(Date cStartTime) {
		this.cStartTime = cStartTime;
	}

	public Date getcEndTime() {
		return cEndTime;
	}

	public void setcEndTime(Date cEndTime) {
		this.cEndTime = cEndTime;
	}

	public String getT_id() {
		return t_id;
	}

	public void setT_id(String t_id) {
		this.t_id = t_id;
	}
     @Override
     public String toString(){
    	 return String.format("id=%s, name=%s, credit=%f, semester=%d, cStartTime=%s, cEndTime=%s"
    	 		+ "t_id=%s", id, name, credit, semester, new SimpleDateFormat("yyyy:MM:dd").format(cStartTime),
    	 		new SimpleDateFormat("yyyy:MM:dd").format(cEndTime), t_id);
     }
}
