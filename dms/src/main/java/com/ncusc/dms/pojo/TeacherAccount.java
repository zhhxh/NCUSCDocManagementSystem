/**
 * TeacherAccount.java
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
@Table(name="t_teacher_account")
public class TeacherAccount implements Serializable{
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
      private String id;//工号
      private String telNum;
      private String email;
      
      @Column(nullable=false)
      private String password;
      
      @Column(nullable=false)
      private int isAdmin;//1代表是，0代表不是
      
      public TeacherAccount(){
    	  
      }
      
      public TeacherAccount(String id, String telNum, String email, String password, int isAdmin){
    	    this.id = id;
    	    this.telNum = telNum;
    	    this.email = email;
    	    this.password = password;
    	    this.isAdmin = isAdmin;
      }
      @Override
      public String toString(){
    	  return String.format("id=%s, telNum=%s, email=%s, password=%s, isAdmin=%d", id, 
    			  telNum, email, password, isAdmin);
      }
}
