package com.ncusc.dms.mapper;

import java.util.List;

import com.ncusc.dms.pojo.Course;
import com.ncusc.dms.pojo.Student;
import org.apache.ibatis.annotations.*;

import com.ncusc.dms.pojo.StudentCourse;

/**
 * StudentCourse 映射
 * @author fxd and YangLi
 * @version 1.0.0
 */
@Mapper
public interface StudentCourseMapper {
	/**
	 * 添加学生选课信息
	 * @param studentCourse 学生选课对象
	 * @return 添加条数
	 * */
	@Insert("insert into t_stu_course_info(scId,sId,cId,tId) values(#{scId},#{sId},#{cId},#{tId})")
	public int add(StudentCourse studentCourse);

	/**
	 * 获得所有学生选课信息
	 * @return 学生选课对象List(List<StudentCourse>)
	 * */
	@Select("select scId,sId,cId,tId from t_stu_course_info")
    @Results( id = "stuCourseMap", value= {
        @Result(column = "scId",property = "scId",id = true),
        @Result(column = "sId",property = "sId"),
        @Result(column = "cId",property = "cId"),
        @Result(column = "tId",property = "tId"),
		@Result(column = "tId",property = "teacher",one = @One(
				select = "com.ncusc.dms.mapper.TeacherMapper.getById"))
    })
	public List<StudentCourse> list();

	/**
	 * 删除选课记录
	 * @param sId 学号
	 * @param cId 课程号
	 * @return 删除的条数
	 * */
	@Delete("delete from t_stu_course_info where sId = #{sId} ADN cId = #{cId}")
	public int delete(@Param("sId")String sId,@Param("cId")String cId); //删除选课记录不通过scId,

	/**
	 * 根据选课号获取选课信息
	 * @param scId 选课号
	 * @return StdudentCourse 学生选课对象
	 * */

	@Select("select scId,sId,cId,tId  from t_stu_course where scId = #{id}")
    @ResultMap(value = "stuCourseMap")
	public StudentCourse getByScid(@Param("id")String scId);

	/**
	 * 通过学号获取学生选课信息
	 * @param sId 学号
	 * @return 学生选课信息List(List<StudentCourse>)
	 * */
    @Select("select scId,sId,cId,tId  from t_stu_course where sId = #{id}")
    @ResultMap(value = "stuCourseMap")
	public List<StudentCourse> getBySid(@Param("id")String sId);  //查询学生选课  选择的是很多课，故List

	/**
	 * 通过学号获取学生选课信息
	 * @param cId 课程号
	 * @return 学生选课信息List(List<StudentCourse>)
	 * */
	@Select("select t_stu.sId, t_stu.sName, t_stu.sex,t_stu.nation, "+
			"t_stu.birthDate,t_stu.major,t_stu.sClass,t_stu.cardNum,t_stu.fId " +
			"from t_student_info t_stu,t_stu_course t_stuC where t_stu.sId = t_stuC.sId and t_stuC.cId = #{id}")
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
	public List<Student> getByCid(@Param("id")String cId);  //查询学生选课  选择的是很多课，故List



}
