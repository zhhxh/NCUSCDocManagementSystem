package com.ncusc.dms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ncusc.dms.pojo.StudentCourse;

/**
 * Course 映射
 * @author fxd
 * @version 1.0.0
 */
@Mapper
public interface StudentCourseMapper {
	

	public void add(StudentCourse studentCourse);
	public List<StudentCourse> list();
	public void delete(@Param("sId")String sId,@Param("tId")String tId); //删除选课记录不通过scId,
																		//根据当前登录者获取到sId,点击的课程获取到tId
	
	public void update(StudentCourse studentCourse); //只根据学号更新
	
	
	public StudentCourse selectByScid(@Param("id")String scId);
	public List<StudentCourse> getBySid(@Param("id")String sId);  //查询学生选课  选择的是很多课，故List
	public List<StudentCourse> getByCid(@Param("id")String sId);  //查询选了该门课的学生有
	

}
