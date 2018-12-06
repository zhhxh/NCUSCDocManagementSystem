package com.ncusc.dms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ncusc.dms.pojo.Student;

/**
 * 
 * 
 * */
@Mapper
public interface StudentMapper {
	
	public void add(Student student);   
	public List<Student> list();  
	
	//不允许根据姓名删除学生
	public void delete(@Param("id")String sId); //根据学号删除学生
	//在数据库删除的时候为单条语句byId来删除，在后台需要批量删除的时候用循环调用delete
	
	public void update(Student student); //同上
	public Student getById(@Param("id")String sId); //学号查询
	public List<Student> getByName(@Param("sName")String sName); //根据名字查询  因为可能有重名,故list
	public List<Student> getByStuClass(@Param("sClass")String sClass); //根据班级查询
	public List<Student> getByStuGrade(@Param("grade")String grade); //根据年级(届别)
	public List<Student> getByMajorIn(@Param("major")String major); //根据专业
	

}
