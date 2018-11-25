/**
 * Teacher.java
 *  
 * Nov 23, 2018
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
@Table(name="t_tea_info")
public class Teacher implements Serializable{
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
      private String id;
      private String name;
      private String sex;
      private String nation;
      private Date birthDate;
      private String cardNum;
      private String position;
      private String d_id;
      
      public Teacher(){
    	  
      }
      
      public Teacher(String id, String name, String sex, String nation, 
    		  Date birthDate, String cardNum, String position, String d_id){
    	  this.id = id;
    	  this.name = name;
    	  this.sex = sex;
    	  this.nation = nation;
    	  this.birthDate = birthDate;
    	  this.cardNum = cardNum;
    	  this.position = position;
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

	public String getD_id() {
		return d_id;
	}

	public void setD_id(String d_id) {
		this.d_id = d_id;
	}
    @Override
    public String toString(){
    	return String.format("id=%s, name=%s, sex=%s, nation=%s, birthDate=%s, cardNum=%s, "
    			+ "postion=%s, d_id=%s", id, name, sex, nation, new SimpleDateFormat("yyyy-MM-dd").format(birthDate) ,
    			cardNum, position, d_id);
    }
}
