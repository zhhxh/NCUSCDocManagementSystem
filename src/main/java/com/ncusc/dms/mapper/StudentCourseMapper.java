package com.ncusc.dms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ncusc.dms.pojo.StudentCourse;

/**
 * StudentCourse 映射
 * @author fxd
 * @version 1.0.0
 */
@Mapper
public interface StudentCourseMapper {
	/**
	 * 添加学生选课信息
	 * @param studentCourse 学生选课对象
	 * @return 添加条数
	 * */
	public int add(StudentCourse studentCourse);
	/**
	 * 获得所有学生选课信息
	 * @return 学生选课对象List(List<StudentCourse>)
	 * */
	public List<StudentCourse> list();
	/**
	 * 删除选课记录
	 * @param sId 学号
	 * @param cId 课程号
	 * @return 删除的条数
	 * */
	public int delete(@Param("sId")String sId,@Param("cId")String cId); //删除选课记录不通过scId,
																		//根据当前登录者获取到sId,点击的课程获取到cId
	/**
	 * 更新学生选课信息
	 * @param studentCourse 学生选课对象
	 * @return 更新的条数
	 * */
	public int update(StudentCourse studentCourse); //只根据学号更新
	/**
	 * 根据选课号获取选课信息
	 * @param scId 选课号
	 * @return StdudentCourse 学生选课对象
	 * */
	public StudentCourse getByScid(@Param("id")String scId);
	/**
	 * 通过学号获取学生选课信息
	 * @param sId 学号
	 * @return 学生选课信息List(List<StudentCourse>)
	 * */
	public List<StudentCourse> getBySid(@Param("id")String sId);  //查询学生选课  选择的是很多课，故List
	/**
	 * 根据课程号获取学生选课信息
	 * @param cId 课程号
	 * @return 学生选课信息List(List<StudentCourse>)
	 * */
	public List<StudentCourse> getByCid(@Param("id")String cId);  //查询选了该门课的学生有
	

}
