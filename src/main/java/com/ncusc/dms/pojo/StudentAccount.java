/**
 * StudentAccount.java
 *  
 * Nov 23, 2018
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
@Table(name="t_stu_account")
public class StudentAccount implements Serializable{
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
       private String id;
       private String telNum;
       private String email;
       
       @Column(nullable=false)
       private String password;
       
       public StudentAccount(){
    	   
       }
       
       public StudentAccount(String id, String telNum, String email, String password){
    	   this.id = id;
    	   this.telNum = telNum;
    	   this.email = email;
    	   this.password = password;
       }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
      @Override
      public String toString(){
    	  return String.format("id=%s, telNum=%s, email=%s, password=%s", id, telNum, email, password);
      }
}
