package com.ncusc.dms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ncusc.dms.pojo.TeacherAccount;

@Mapper
public interface TeacherAccountMapper {

	
	public void add(TeacherAccount teacherAccount);  
	public List<TeacherAccount> list();
	
	public TeacherAccount getById(@Param("id")String sId);
	public TeacherAccount getByTel(@Param("telNum")String telNum); //根据手机号查询，为了扩展，手机号不能重复 版本2
	public TeacherAccount getByEmail(@Param("email")String email); //根据email查询，为了扩展到email登录,不能重复 版本2
	
	public void update(TeacherAccount teacherAccount); //版本1，实现时where处为 where sId=;后面版本需要加telNum/email
	public void delete(@Param("id")String sId); //此句同上
}
