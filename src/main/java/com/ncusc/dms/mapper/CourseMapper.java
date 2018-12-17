package com.ncusc.dms.mapper;

import java.util.List;

import com.ncusc.dms.pojo.TeacherCourse;

import org.apache.ibatis.annotations.*;

import com.ncusc.dms.pojo.Course;

/**
 * Course 映射
 * @author Wang Yiqing & Zhang Han & fxd and YangLi
 * @version 1.0.0
 */
@Mapper
public interface CourseMapper {

	/**
	 *管理员添加课程信息
	 * @param course Course对象
	 * @return 插入数据库的条数
	 * */
	@Insert("insert into t_course_info (cId,cName,credit,semester,startDate,endDate) " +
            "values (#{cid},#{cName},#{credit},#{semester},#{startDate},#{endDate})")
	public int addCourse(Course course); //添加
    /**
     * 为某一课程添加老师
     * @param teacherCourse TeacherCourse对象
     * @return 插入数据库的条数
     */
    //TODO 数据库中tcId冗余
    @Insert("insert into t_teacher_course (tcId,tId,cId) values (#{tcId},#{tId},#{cId})")
    public int addTeacher(TeacherCourse teacherCourse);

	/**
	 * 更新课程信息
	 * @param course Course对象
	 * @return 更新的数据库条数
	 * */
   @UpdateProvider(type=CProvider.class,method="updateCourse")
	 public int updateCourse(Course course); //更新

	/**
	 * 获取所有课程信息
	 * @return 课程List对象(List<Course>)
	 * */
    @Select("select cId,cName,credit,semester,startDate,endDate from t_course_info ")
    @Results( id = "courseMap",value = {
            @Result(column = "cId" ,property = "cId",id = true),
            @Result(column = "cName",property = "cName"),
            @Result(column = "credit",property = "credit"),
            @Result(column = "semester",property = "semester"),
            @Result(column = "startDate",property = "startDate"),
            @Result(column = "endDare",property = "endDate")
    })
	  public List<Course> list(); //获取所有
	/**
	 * 通过课程ID删除课程
	 * @param cId 课程号
	 * @return 删除条数
	 * */
	@Delete("delete from t_course_info where cId=#{cId}")
	public int deleteById(@Param("id")String cId); //删除课程by Id
  
	/**
	 * 通过课程名删除课程
	 * @param cName 课程名字
	 * @return 删除条数
	 * */
	@Delete("delete from t_course_info where cName = #{cName}")

	public int deleteByName(@Param("name")String cName);//删除by name
  
	/**
	 * 通过课程号查询课程
	 * @param cId 课程号
	 * @return Course对象
	 * */
	@Select("select cId,cName,credit,semester,startDate,endDate from t_course_info where cId = #{cId} ")
	@ResultMap(value = "courseMap")
	public Course getById(@Param("id")String cId); //查询by Id
  
	/**
	 * 通过课程名查询课程
	 * @param cName 课程名
	 * @return Course对象
	 * */
	@Select("select cId,cName,credit,semester,startDate,endDate from t_course_info where cName= #{cName} ")
  @ResultMap(value = "courseMap")
	public Course getByName(@Param("name")String cName); //查询by name

}
