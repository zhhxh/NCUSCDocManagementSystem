package com.ncusc.dms.mapper;

import java.util.List;

import com.ncusc.dms.pojo.Course;
import com.ncusc.dms.pojo.Student;
import com.ncusc.dms.pojo.Teacher;
import org.apache.ibatis.annotations.*;

import com.ncusc.dms.pojo.TeacherCourse;

//如何实现根据课程ID 名字来查询选了该课的教师？？

/**
 * TeacherCourse 映射
 * @author fxd and YangLi
 * @version 1.0.0
 */
@Mapper
public interface TeacherCourseMapper {
	/**
	 * 添加教师选课信息
	 * @param teacherCourse 教师选课对象
	 * @return 添加条数
	 * */
	@Select("insert into t_teacher_course(tcId,tId,cId) " +
			"values(#{tcId},#{tId},#{cId})")
	public int add(TeacherCourse teacherCourse);

	/**
	 * 获取所有教师选课信息
	 * @return 教师选课对象List(List<TeacherCourse>)
	 * */
	@Select("select tcId,tId,cId from t_teacher_course")
	@Results(id = "teaCourseMap", value = {
			@Result(column = "tcId",property ="tcId",id = true),
			@Result(column = "tId",property ="tId"),
			@Result(column = "cId",property ="cId"),
			@Result(column = "cId",property = "course",
					one = @One(select = "com.ncusc.dms.mapper.CourseMapper.getById"))
	})
	public List<TeacherCourse> list();

	/**
	 * 删除教师选课
	 * @param tId 工号
	 * @param cId 课程号
	 * @return 删除条数
	 * */
	@Delete("delete from t_teacher_course where tId = #{tId} and cId = #{cId}")
	public int delete(@Param("tId")String tId,@Param("cId")String cId); //删除选课记录不通过tcId,
																		//根据当前登录者获取到tId,点击的课程获取到cId

	/**
	 * 通过选课号查询教师选课
	 * @param tcId 选课号
	 * @return 教师选课对象
	 * */
	@Select("select tt.tId,tt.tName,tt.sex,tt.nation,tt.birthDate,tt.cardNum,tt.position,tt.fId" +
			"from t_teacher_info tt ,t_teacher_course ttc where tt.tId = ttc.tId and ttc.tcId = #{id} ")
	@Results(id = "teaMap",value = {
			@Result(column = "tId",property = "tId",id = true),
			@Result(column = "tName",property = "tName"),
			@Result(column = "sex",property = "sex"),
			@Result(column = "nation",property = "nation"),
			@Result(column = "birthDate",property = "birthDate"),
			@Result(column = "cardNum",property = "cardNum"),
			@Result(column = "position",property = "position"),
			@Result(column = "fId",property = "fId")
	})
	public Teacher getByTcid(@Param("id")String tcId);

	/**
	 * 通过教师工号查询选课
	 * @param tId 工号
	 * @return 教师选课信息List(List<Course>)
	 * */
	@Select("select tcInfo.cId,tcInfo.cName,tcInfo.credit,tcInfo.semester," +
			"tcInfo.startDate,tcInfo.endDate from t_course_info tcInfo ," +
			" t_teacher_course ttC where tcInfo.cId = ttC.cId and ttC.tId = #{id}")
	@Results( id = "courseMap",value = {
			@Result(column = "cId" ,property = "cId",id = true),
			@Result(column = "cName",property = "cName"),
			@Result(column = "credit",property = "credit"),
			@Result(column = "semester",property = "semester"),
			@Result(column = "startDate",property = "startDate"),
			@Result(column = "endDare",property = "endDate")
	})
	public List<Course> getBytId(@Param("id")String tId);  //查询教师选课  教师选择的是很多课，故List

	/**通过课程号查询选课
	 * @param cId 课程号
	 * @return 教师选课信息List(List<TeacherCourse>)
	 * */
	@Select("select * from t_teacher_course tt where cId = #{id}")
	@ResultMap(value = "teacherMap")
	public List<TeacherCourse> getTeaByCid(@Param("id")String cId);

	/**
	 * 根据课程号获取学生选课信息
	 * @param cId 课程号
	 * @return 学生选课信息List(List<StudentCourse>)
	 * */
	@Select("select t_stu.sId, t_stu.sName, t_stu.sex,t_stu.nation, " +
			"t_stu.birthDate,t_stu.major,t_stu.sClass,t_stu.cardNum,t_stu.fId" +
			"from t_student_info t_stu join t_stu_course stuC on " +
			"t_stu.sId = stuC.sId join t_teacher_course teaC on " +
			"stuC.tId = teaC.tId where teaC.tId = #{id}")
	@Results(id = "stuMap",value = {
			@Result(column = "sId",property = "sId"),
			@Result(column = "sName",property = "sName"),
			@Result(column = "sex",property = "sex"),
			@Result(column = "nation",property = "nation"),
			@Result(column = "birthDate",property = "birthDate"),
			@Result(column = "major",property = "major"),
			@Result(column = "grade",property = "grade"),
			@Result(column = "sClass",property = "sClass"),
			@Result(column = "cardNum",property = "cardNum"),
			@Result(column = "fId",property = "fId"),
	})
	public List<Student> getStuByCid(@Param("id")String cId);  //查询选了该门课的学生有



	// TODO: 2018-12-07  public List<TeacherCourse> getByTname(@Param("tName")String tName); 待定




}
