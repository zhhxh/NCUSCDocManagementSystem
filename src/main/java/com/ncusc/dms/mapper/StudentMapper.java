package com.ncusc.dms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ncusc.dms.pojo.Student;

/**
 * Student 映射
 * @author fxd
 * @version 1.0.0
 */
@Mapper
public interface StudentMapper {
	/**
	 * 添加学生
	 * @param student 学生对象
	 * @return 添加条数
	 * */
	@Insert("insert into t_student_info(sId,sName,sex,nation,birthDate,major,grade,sClass,cardNum,fId)"
			+ "values(#{sId},#{sName},#{sex},#{nation},#{birthDate},#{major},#{grade},#{sClass},#{cardNum},#{fId})")
	public void add(Student student);
	/**
	 * 获取所有学生
	 * @return 学生对象List(List<Student>)
	 * */
	public List<Student> list();  
	/**
	 * 删除学生
	 * @param sId 学号
	 * @return 删除条数
	 * */
	public int delete(@Param("id")String sId); //根据学号删除学生
	//在数据库删除的时候为单条语句byId来删除，在后台需要批量删除的时候用循环调用delete
	/**
	 * 更新学生
	 * @param student 学生对象
	 * @return 更新条数
	 * */
	public int update(Student student); //同上
	/**
	 * 通过学号获取学生信息
	 * @param sId 学号
	 * @return 学生对象
	 * */
	public Student getById(@Param("id")String sId); //学号查询
	/**
	 * 通过名字获取学生信息
	 * @param sName 学生姓名
	 * @return 学生对象List(List<Student>)
	 * */
	public List<Student> getByName(@Param("sName")String sName); //根据名字查询  因为可能有重名,故list
	/**
	 * 通过班级获取学生信息
	 * @param sClass 班级
	 * @return 学生对象List(List<Studdeng>)
	 * */
	public List<Student> getByStuClass(@Param("sClass")String sClass); //根据班级查询
	/**
	 * 通过年级获取学生信息
	 * @param grade 年级
	 * @return 学生对象List(List<Student>)*/
	public List<Student> getByStuGrade(@Param("grade")String grade); //根据年级(届别)
	/**
	 * 通过专业获取学生信息
	 * @param major 专业
	 * @return 学生对象List(List<Student>)
	 * */
	public List<Student> getByMajorIn(@Param("major")String major); //根据专业

}
