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
	public void add(Course course); //添加
	public void update(Course course); //更新
	public List<Course> list(); //获取所有
	public void deleteById(@Param("id")String id); //删除课程by Id
	public void deleteByName(@Param("name")String name);//删除by name
	public Course getById(@Param("id")String id); //查询by Id
	public Course getByName(@Param("name")String name); //查询by name

}
