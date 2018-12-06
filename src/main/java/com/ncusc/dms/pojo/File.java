package com.ncusc.dms.pojo;

import java.io.Serializable;
import java.sql.Date;
 /**
  * @author newKey and fxd
  * @version 1.0.0
  * time: 2018年12月05日
  * 文件信息  t_file_info
  */
public class File implements Serializable{

	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = -1589624274684520710L;
	
	private String fId; //文件ID
	private String fName;//文件名字 注意mysql中name为关键字
	private String fType; //文件类型
	private String size;//文件大小
	private String path; //文件路径
	private Date startDate;//该文件布置开始时间
	private Date endDate;//该文件的最晚上传时间
	private Date uploadDate;//上传时间
	private String owner;//上传者 sId,tId
	private String tcId; //teracer_course 文件所谓教师及课程
	private String dId; //dateSetId 文件的要求信息
	public String getfId() {
		return fId;
	}
	public void setfId(String fId) {
		this.fId = fId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getfType() {
		return fType;
	}
	public void setfType(String fType) {
		this.fType = fType;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
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
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getTcId() {
		return tcId;
	}
	public void setTcId(String tcId) {
		this.tcId = tcId;
	}
	public String getdId() {
		return dId;
	}
	public void setdId(String dId) {
		this.dId = dId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "File [fId=" + fId + ", fName=" + fName + ", fType=" + fType + ", size=" + size + ", path=" + path
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", uploadDate=" + uploadDate + ", owner="
				+ owner + ", tcId=" + tcId + ", dId=" + dId + "]";
	}
	
	
	
	

}
