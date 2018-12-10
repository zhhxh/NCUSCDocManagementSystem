package com.ncusc.dms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ncusc.dms.pojo.Course;

/**
 * Course 映射
 * @author fxd
 * @version 1.0.0
 */
@Mapper
public interface CourseMapper {
	/**
	 * 添加课程信息
	 * @param course Course对象
	 * @return 插入数据库的条数
	 * */
	public int add(Course course); //添加
	/**
	 * 更新课程信息
	 * @param course Course对象
	 * @return 更新的数据库条数
	 * */
	public int update(Course course); //更新
	/**
	 * 获取所有课程信息
	 * @return 课程List对象(List<Course>)
	 * */
	public List<Course> list(); //获取所有
	/**
	 * 通过课程ID删除课程
	 * @param cId 课程号
	 * @return 删除条数
	 * */
	public int deleteById(@Param("id")String cId); //删除课程by Id
	/**
	 * 通过课程名删除课程
	 * @param cName 课程名字
	 * @return 删除条数
	 * */
	public int deleteByName(@Param("name")String cName);//删除by name
	/**
	 * 通过课程号查询课程
	 * @param cId 课程号
	 * @return Course对象
	 * */
	public Course getById(@Param("id")String cId); //查询by Id
	/**
	 * 通过课程名查询课程
	 * @param cName 课程名
	 * @return Course对象
	 * */
	public Course getByName(@Param("name")String cName); //查询by name

}
