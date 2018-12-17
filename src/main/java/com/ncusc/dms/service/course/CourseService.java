package com.ncusc.dms.service.course;

import com.ncusc.dms.mapper.CourseMapper;
import com.ncusc.dms.pojo.Course;
import com.ncusc.dms.pojo.TeacherCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* CourseService
* @author Wang Yiqing
* @version 1.0.0
*/
@Service
public class CourseService {
    @Autowired
    CourseMapper coursemapper;
    /**
     * 管理员添加课程信息
     * @param course
     * @return 插入数据库的条数
     */
    public boolean addCourse(Course course)
    {
    //TODO 数据库设计不合理
        return true;
    }

    /**
     *为课程添加老师
     * @param tId,cId  老师工号 课程号
     * @return 添加结果
     */
    public boolean addTeacher(String tId,String cId)
    {
        TeacherCourse tCourse = new TeacherCourse();
        tCourse.setcId(cId);
        tCourse.settId(tId);
        coursemapper.addTeacher(tCourse);
        return false;
    }

    /**
     *根据课程id删除课程
     * @param id
     * @return  删除结果
     */
    public boolean deleCourse(String id)
    {
        coursemapper.deleteById(id);
        return false;
    }

    /**
     * 修改课程
     * @param course
     * @return  修改结果
     */
    public boolean updateCourse(Course course)
    {
        coursemapper.updateCourse(course);
        return false;
    }

    /**
     * 查询所有的课程
     * @return 所有的课程
     */
    public List<Course> seleCourse()
    {
        List<Course> lCourse = coursemapper.list();
        return null;
    }

}
