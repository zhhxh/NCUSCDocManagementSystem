package com.ncusc.dms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ncusc.dms.pojo.StudentAccount;

/**
 * 
 * 以下添加删除时别忘了 info 表的同步
 * */

@Mapper
public interface StudentAccountMapper {
	
	public void add(StudentAccount studentAccount);  
	public List<StudentAccount> list();
	
	public StudentAccount getById(@Param("id")String sId);
	public StudentAccount getByTel(@Param("telNum")String telNum); //根据手机号查询，为了扩展，手机号不能重复 版本2
	public StudentAccount getByEmail(@Param("email")String email); //根据email查询，为了扩展到email登录,不能重复 版本2
	
	public void update(StudentAccount studentAccount); //版本1，实现时where处为 where sId=;后面版本需要加telNum/email
	public void delete(@Param("id")String sId); //此句同上
	

}
