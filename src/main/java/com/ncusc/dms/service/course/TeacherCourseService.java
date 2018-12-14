package com.ncusc.dms.service.course;

import com.ncusc.dms.mapper.TeacherCourseMapper;
import com.ncusc.dms.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TeacherCourse的service
 * @author YangLi and WangYiQing
 * @version 1.0.0
 */
@Service
public class TeacherCourseService {
    @Autowired
    private TeacherCourseMapper teacherCourseMapper;

    /**
     * 获得该老师的所有课程
     * @param tId
     * @return List<Course>集合
     */
    public List<Course> listAllCourseByTid(String tId){
        List<Course> teaCourseList = teacherCourseMapper.getBytId(tId);
        return  teaCourseList;

    }

}
