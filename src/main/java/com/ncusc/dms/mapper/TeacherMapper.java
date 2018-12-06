package com.ncusc.dms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ncusc.dms.pojo.Teacher;

/**
 * Course 映射
 * @author fxd
 * @version 1.0.0
 */

@Mapper
public interface TeacherMapper {
	
	public void add(Teacher student);
	public List<Teacher> list();  
	public void delete(@Param("id")String tId); //根据工号删除教师 //不允许根据姓名删除教师
												//在数据库删除的时候为单条语句byId来删除，在后台需要批量删除的时候用循环调用delete
	
	public void update(Teacher teacher); //同上
	public Teacher getById(@Param("id")String tId); //学号查询
	public List<Teacher> getByName(@Param("tName")String tName); //根据名字查询  因为可能有重名,故list
	

}
