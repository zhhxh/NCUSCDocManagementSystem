package com.ncusc.dms.pojo;

import java.io.Serializable;
import java.sql.Date;

/**
 * Admin的实体类
 * 实体类必须实现Serializable接口才能放入Redis缓冲
 * @author WANGHAO
 * @version 1.0.0
 *
 */
public class Admin implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3798147576141988856L;
	private String id;		        //ID
    private String password;	    //密码
    private String aName;	        //姓名
    private String sex;	        //性别
    private String phoNum;	    //手机
    private String email;         //邮箱
    private String addr;	        //地址
    private int level;	        //权限 0->管理员
    private Date regDate;	        //注册日期
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhoNum() {
		return phoNum;
	}
	public void setPhoNum(String phoNum) {
		this.phoNum = phoNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", password=" + password + ", aName=" + aName + ", sex=" + sex + ", phoNum=" + phoNum
				+ ", email=" + email + ", addr=" + addr + ", level=" + level + ", regDate=" + regDate + "]";
	}
    
    

   

}
