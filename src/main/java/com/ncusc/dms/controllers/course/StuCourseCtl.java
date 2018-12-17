package com.ncusc.dms.controllers.course;

import com.ncusc.dms.service.course.StuCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;

/**
 * Course的控制类
 * @author  YangLi
 * @version 1.0.0
 */
@Controller
public class StuCourseCtl {
    @Autowired
    private StuCourseService stuCourseService;

    /**
     * 列出学生的所有课程信息(需要提交实验报告的课程)
     * @param sId String
     * @return list<StudentCouse> 学生的课程信息集合
     */
    public String ListAllCourse(@RequestAttribute("stuId") String sId, Model model){
        model.addAttribute("stuCourseList",stuCourseService.ListAllStuCourse(sId));
        return "stuCourse";
    }
}
