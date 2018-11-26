/**
 * Document.java
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
@Table(name = "t_document_info")
public class Document implements Serializable{
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private String id;//文档id
	 
	 @Column(nullable=false)
	 private String name;//文档名
	 
	 @Column(nullable=false)
	 private String type;//文档类型
	 
	 @Column(nullable=false)
	 private int size;
	 
	 @Column(nullable=false)
	 private String path;
	 private Date uploadDate;//上传时间
	 private int dlTimes;//下载次数
	 private String belongTo;//管理员/学生 id
	 private String belongsName;//上传者姓名
	 private String c_id;//所属课程
	 private String w_id;//所属作业
	 
	 public Document(){
		 
	 }
	 
	 public Document(String id, String name, String type, int size, String path, 
			 Date uploadDate, int dlTimes, String belongTo, String belongsName, String c_id ,String w_id){
		 this.id = id;
		 this.name = name;
		 this.type = type;
		 this.size = size;
		 this.path = path;
		 this.uploadDate = uploadDate;
		 this.dlTimes = dlTimes;
		 this.belongTo = belongTo;
		 this.belongsName = belongsName;
		 this.c_id = c_id;
		 this.w_id = w_id;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public int getDlTimes() {
		return dlTimes;
	}

	public void setDlTimes(int dlTimes) {
		this.dlTimes = dlTimes;
	}

	public String getBelongTo() {
		return belongTo;
	}

	public void setBelongTo(String belongTo) {
		this.belongTo = belongTo;
	}

	public String getBelongsName() {
		return belongsName;
	}

	public void setBelongsName(String belongsName) {
		this.belongsName = belongsName;
	}

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public String getW_id() {
		return w_id;
	}

	public void setW_id(String w_id) {
		this.w_id = w_id;
	}
	 
	 @Override
	 public String toString(){
		 return String.format("id=%s, name=%s, type=%s, size=%d, path=%s, uploadDate=%s, dlTimes=%d"
		 		+ "belongTo=%s, belongsName=%s, c_id=%s, w_id=%s",
		 		id, name, type, size, path, new SimpleDateFormat("yyyy-MM-dd").format(uploadDate), 
		 		dlTimes, belongTo, belongsName, c_id, w_id);
	 }
}
