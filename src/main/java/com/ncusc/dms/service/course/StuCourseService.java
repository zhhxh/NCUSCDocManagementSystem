package com.ncusc.dms.service.course;

import com.ncusc.dms.mapper.StudentCourseMapper;
import com.ncusc.dms.mapper.StudentMapper;
import com.ncusc.dms.pojo.Student;
import com.ncusc.dms.pojo.StudentCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * studentCourse的service
 * @author  YangLi
 * @version 1.0.0
 */
@Service
public class StuCourseService {
    @Autowired
    private StudentCourseMapper stuCourseMapper;
    @Autowired
    private StudentMapper stuMapper;

    /**
     * 列出当前学生的所有选课
     * @param sId
     */
    @Cacheable(cacheNames = "stuCourse_cache",key = "stuCourselist")
    public List<StudentCourse> ListAllStuCourse(String sId){
        List<StudentCourse> studentCourseList = stuCourseMapper.getBySid(sId);
        return  studentCourseList;
    }
    /**
     *老师添加选了其课程的学生
     * @param sId 学生Id，cId 课程Id ， tId 老师Id
     * @return int 添加的行数 1为添加成功 0为添加失败
     */
    @CachePut(cacheNames = "stuCourse_cache",key = "'scId_' + #scId")
    public int addStu(String sId,String cId,String tId) {
        StudentCourse stuCourse = new StudentCourse();
        String scId = sId.toString() + cId.toString();
        stuCourse.setcId(cId);
        stuCourse.setsId(sId);
        stuCourse.settId(tId);
        stuCourse.setScId(scId);
        int n = stuCourseMapper.add(stuCourse);
        return n;
    }

    /**
     * 根据学生学号获得学生信息
     * @param sId
     * @return 返回学生对象 Student
     */
    //@Cacheable(cacheNames = "stuInfo_cache",key = "'sId_' + #sId")
    public Student getStuBysId(String sId){
        return  stuMapper.getById(sId);
    }

    /**
     * 删除选课学生
     * @param sId 学生学号
     * @param cId 课程号
     * @return int影响行数  大于0删除成功 小于等于0 删除失败
     */
    @CacheEvict(cacheNames = "stuCourse_cache",key = "'scId' + #scId")
    public int deleteStu(String sId,String cId){
        int  n = stuCourseMapper.delete(sId,cId);
        return  n;
    }

    /**
     *获得所有选了相同课程的学生集合
     * @param cId
     * @return List<Student> 学生集合
     */
   // @Cacheable()
    public List<Student> listAllCourseByCid(String cId){
        List<Student> stuList = stuCourseMapper.getByCid(cId);
        return  stuList;
    }

}
