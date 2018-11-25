/**
 * Works.java
 *  
 * Nov 24, 2018
 * Newkey
 * 
 */
package com.ncusc.dms.pojo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Newkey
 *
 */
@Entity
@Table(name="t_work_info")
public class Works implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private String w_id;
	
	@Column(nullable=false)
    private String w_name;
	
	@Column(nullable=false)
    private Date wStartTime;
	
    private Date wEndTime;
    
    @Column(nullable=false)
    private String c_id;
    
    @ElementCollection(fetch=FetchType.LAZY, //加载策略,延迟加载
			targetClass=String.class) //指定集合中元素的类型
 	@CollectionTable(name="arrngeTo") //指定集合生成的表
	@OrderColumn(name="S_ID") //指定排序列的名称
    private List<String> arrangeTo;//布置作业的总人数  集合存的学生id
    
    @ElementCollection(fetch=FetchType.LAZY, 
			targetClass=String.class) 
 	@CollectionTable(name="wFinish") 
	@OrderColumn(name="S_ID") 

    private List<String> wFinish;//完成人数
    
    
    @ElementCollection(fetch=FetchType.LAZY, 
			targetClass=String.class) 
 	@CollectionTable(name="wUnFinish") 
	@OrderColumn(name="S_ID") 
    private List<String> wUnFinish;//未完成人数
    private int finishNum; //完成人数
    private int uFinishNum;//未完成人数
    private int allNum;//总人数
    private String description;//描述
    
    public Works(){
    	
    }
    
    public Works(String w_id, String w_name, Date wStartTime, Date wEndTime, String c_id, 
    		List<String> arrngeTo, List<String> wFinish, List<String> wUnFinish, int finishNum, 
    		int uFinishNum, int allNum, String description){
    	this.w_id = w_id;
    	this.w_name = w_name;
    	this.wStartTime = wStartTime;
    	this.wEndTime = wEndTime;
    	this.c_id = c_id;
    	this.arrangeTo = arrangeTo;
    	this.wFinish = wFinish;
    	this.wUnFinish = wUnFinish;
    	this.finishNum = finishNum;
    	this.uFinishNum = uFinishNum;
    	this.allNum = allNum;
    	this.description = description;
    }

	public String getW_id() {
		return w_id;
	}

	public void setW_id(String w_id) {
		this.w_id = w_id;
	}

	public String getW_name() {
		return w_name;
	}

	public void setW_name(String w_name) {
		this.w_name = w_name;
	}

	public Date getwStartTime() {
		return wStartTime;
	}

	public void setwStartTime(Date wStartTime) {
		this.wStartTime = wStartTime;
	}

	public Date getwEndTime() {
		return wEndTime;
	}

	public void setwEndTime(Date wEndTime) {
		this.wEndTime = wEndTime;
	}

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public List<String> getArrangeTo() {
		return arrangeTo;
	}

	public void setArrangeTo(List<String> arrangeTo) {
		this.arrangeTo = arrangeTo;
	}

	public List<String> getwFinish() {
		return wFinish;
	}

	public void setwFinish(List<String> wFinish) {
		this.wFinish = wFinish;
	}

	public List<String> getwUnFinish() {
		return wUnFinish;
	}

	public void setwUnFinish(List<String> wUnFinish) {
		this.wUnFinish = wUnFinish;
	}

	public int getFinishNum() {
		return finishNum;
	}

	public void setFinishNum(int finishNum) {
		this.finishNum = finishNum;
	}

	public int getuFinishNum() {
		return uFinishNum;
	}

	public void setuFinishNum(int uFinishNum) {
		this.uFinishNum = uFinishNum;
	}

	public int getAllNum() {
		return allNum;
	}

	public void setAllNum(int allNum) {
		this.allNum = allNum;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    @Override
    public String toString(){
    	return String.format("w_id=%s, w_name=%s, wStartTime=%s, wEndTime=%s, c_id=%s, arrangeTo=%d, "
    			+ "wFinish=%d, wUnFinish=%d, finishNum=%d, uFinishNum=%d, allNum=%d, description=%s",
    			w_id, w_name, new SimpleDateFormat("yyyy:MM:dd").format(wStartTime),
    			new SimpleDateFormat("yyyy:MM:dd").format(wEndTime),c_id,arrangeTo.size(),wFinish.size(),
    			wUnFinish.size(),finishNum,uFinishNum,allNum,description);
    }
}
