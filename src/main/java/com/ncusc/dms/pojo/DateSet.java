package com.ncusc.dms.pojo;

import java.io.Serializable;
import java.sql.Date;

/**
 * 
 * @author newKey and fxd
 * @version 1.0.0
 * time: 2018年12月05日
 * 要求信息 t_dateSet_info
 * 记录的是每此设定的时间以及实验类型
 * */

public class DateSet implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -946590931746810426L;
	
	private String dId;
	private String dType; //布置类 实验类/期中/毕业设计等
	private String tcId;//教师选课表，即记录布置teacher+course
	private Date startTime; //记录布置开始时间
	private Date endTime;//记录结束时间
	public String getdId() {
		return dId;
	}
	public void setdId(String dId) {
		this.dId = dId;
	}
	public String getdType() {
		return dType;
	}
	public void setdType(String dType) {
		this.dType = dType;
	}
	public String getTcId() {
		return tcId;
	}
	public void setTcId(String tcId) {
		this.tcId = tcId;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "DateSet [dId=" + dId + ", dType=" + dType + ", tcId=" + tcId + ", startTime=" + startTime + ", endTime="
				+ endTime + "]";
	}
	
	
	
}
