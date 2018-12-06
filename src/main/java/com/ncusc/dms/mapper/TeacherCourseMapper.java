package com.ncusc.dms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ncusc.dms.pojo.TeacherCourse;

//如何实现根据课程ID 名字来查询选了该课的教师？？

@Mapper
public interface TeacherCourseMapper {
	
	public void add(TeacherCourse teacherCourse);
	public List<TeacherCourse> list();
	public void delete(@Param("tId")String tId,@Param("cId")String cId); //删除选课记录不通过tcId,
																		//根据当前登录者获取到tId,点击的课程获取到cId
	
	public void update(TeacherCourse teacherCourse); //只根据教师号更新
	
	
	public TeacherCourse getByTcid(@Param("id")String tcId);
	public List<TeacherCourse> getBytId(@Param("id")String tId);  //查询教师选课  教师选择的是很多课，故List
	//public List<TeacherCourse> getByTname(@Param("tName")String tName); 待定
	public List<TeacherCourse> getByCid(@Param("id")String cId);  
	
	
	
	
	
}
