package com.ncusc.dms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ncusc.dms.pojo.Teacher;

/**
 * Teacher 映射
 * @author fxd
 * @version 1.0.0
 */
@Mapper
public interface TeacherMapper {
	/**
	 *添加教师
	 * @param teacher  教师对象
	 * @return  添加条数
	 * */
	public int add(Teacher teacher);
	/**
	 * 获取所有教师信息
	 * @return 教师List(List<Teachert>)
	 * */
	public List<Teacher> list();
	/**
	 * 删除教师信息
	 * @param tId 工号
	 * @return 删除条数
	 * */
	public int delete(@Param("id")String tId); //根据工号删除教师 //不允许根据姓名删除教师
												//在数据库删除的时候为单条语句byId来删除，在后台需要批量删除的时候用循环调用delete
	/**
	 * 更新教师
	 * @param teacher  教师对象
	 * @return 更新条数
	 * */
	public int update(Teacher teacher); //同上
	/**
	 * 通过工号查询教师
	 * @param tId 工号
	 * @return Teacher对象*/
	public Teacher getById(@Param("id")String tId); //学号查询
	/**
	 * 通教师姓名查询教师
	 * @param tName 教师姓名
	 * @return 教师对象List(List<Teacher>)
	 * */
	public List<Teacher> getByName(@Param("tName")String tName); //根据名字查询  因为可能有重名,故list
	

}
