package com.ncusc.dms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ncusc.dms.pojo.TeacherCourse;

//如何实现根据课程ID 名字来查询选了该课的教师？？

/**
 * TeacherCourse 映射
 * @author fxd
 * @version 1.0.0
 */
@Mapper
public interface TeacherCourseMapper {
	/**
	 * 添加教师选课信息
	 * @param teacherCourse 教师选课对象
	 * @return 添加条数
	 * */
	public int add(TeacherCourse teacherCourse);
	/**
	 * 获取所有教师选课信息
	 * @return 教师选课对象List(List<TeacherCourse>)
	 * */
	public List<TeacherCourse> list();
	/**
	 * 删除教师选课
	 * @param tId 工号
	 * @param cId 课程号
	 * @return 删除条数
	 * */
	public int delete(@Param("tId")String tId,@Param("cId")String cId); //删除选课记录不通过tcId,
																		//根据当前登录者获取到tId,点击的课程获取到cId
	/**
	 * 更新教师选课信息
	 * @param teacherCourse 教师选课对象
	 * @return 更新条数
	 * */
	public int update(TeacherCourse teacherCourse);
	/**
	 * 通过选课号查询教师选课
	 * @param tcId 选课号
	 * @return 教师选课对象
	 * */
	public TeacherCourse getByTcid(@Param("id")String tcId);
	/**
	 * 通过教师工号查询选课
	 * @param tId 工号
	 * @return 教师选课信息List(List<TeacherCourse>)
	 * */
	public List<TeacherCourse> getBytId(@Param("id")String tId);  //查询教师选课  教师选择的是很多课，故List
	/**通过课程号查询选课
	 * @param cId 课程号
	 * @return 教师选课信息List(List<TeacherCourse>)
	 * */
	public List<TeacherCourse> getByCid(@Param("id")String cId);
	// TODO: 2018-12-07  public List<TeacherCourse> getByTname(@Param("tName")String tName); 待定
	
	
	
	
	
}
