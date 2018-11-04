package com.ncusc.dms.pojo;

/**
 * Admin的实体类
 * @author WANGHAO
 * @version 1.0.0
 *
 */
public class Admin {

    private int aId;		//ID
    private String aPassword;	//姓名
    private String aName;	//姓名
    private String aSex;	//性别
    private String aPhoNum;	//手机
    private String aAddr;	//地址
    private int aLimit;	//权限 0->管理员
    private String aDate;	//注册日期
    public int getaId() {
        return aId;
    }
    public void setaId(int aId) {
        this.aId = aId;
    }
    public String getaName() {
        return aName;
    }
    public void setaName(String aName) {
        this.aName = aName;
    }
    public String getaSex() {
        return aSex;
    }
    public void setaSex(String aSex) {
        this.aSex = aSex;
    }
    public String getaPhoNum() {
        return aPhoNum;
    }
    public void setaPhoNum(String aPhoNum) {
        this.aPhoNum = aPhoNum;
    }
    public String getaAddr() {
        return aAddr;
    }
    public void setaAddr(String aAddr) {
        this.aAddr = aAddr;
    }
    public int getaLimit() {
        return aLimit;
    }
    public void setaLimit(int aLimit) {
        this.aLimit = aLimit;
    }
    public String getaDate() {
        return aDate;
    }
    public void setaDate(String aDate) {
        this.aDate = aDate;
    }
    public String getaPassword() {
        return aPassword;
    }
    public void setaPassword(String aPassword) {
        this.aPassword = aPassword;
    }

}
