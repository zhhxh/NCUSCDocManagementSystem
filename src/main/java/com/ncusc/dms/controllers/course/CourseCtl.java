package com.ncusc.dms.controllers.course;

import com.ncusc.dms.pojo.Course;
import com.ncusc.dms.service.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
import java.text.ParseException;


/**
 * Course控制类
 * @author ZhangHan & YangLi
 * @version 1.0.0
 *
 */
@Controller
@RequestMapping(value="/CourseCtl")
public class CourseCtl {
    @Autowired
    private CourseService service;
    /**
     * 管理员添加课程
     * @param cName,credit,semester,startDate,endDate,model
     * @return String
     * @throws Exception
     */
    @RequestMapping(value="/addCou")
    public String addCou(@RequestParam("cName") String cName, @RequestParam("credit") String credit, @RequestParam("semester") String semester,
                         @RequestParam("startDate") String startDate, @RequestParam("endDate") String endDate, Model model) throws ParseException {
        Course course = new Course();
        course.setcName(cName);
        course.setCredit(Float.parseFloat(credit));
        course.setSemester(Integer.parseInt(semester));
        Date date = Date.valueOf(startDate);
        course.setStartDate(date);
        date = Date.valueOf(endDate);
        course.setStartDate(date);
        if(service.addCourse(course))
            model.addAttribute("info","课程添加成功");
        else
            model.addAttribute("info","课程添加失败");
        return "添加课程页面";
    }

    /**
     *为课程添加老师
     * @param tid,cid
     * @param model
     * @return
     */
    @RequestMapping(value="/addTea")
    public String addTeacher(@RequestParam("tid") String tid,@RequestParam("cid") String cid,Model model)
    {
        if(service.addTeacher(tid,cid))
            model.addAttribute("info","课程教师成功");
        else
            model.addAttribute("info","课程教师失败");
        return "添加教师页面";
    }

    /**
     *根据课程id删除课程
     * @param cid
     * @param model
     * @return
     */
    @RequestMapping(value="/deleteCou")
    public String deleteCourse(@RequestParam("cid") String cid,Model model)
    {
        if(service.deleCourse(cid))
            model.addAttribute("info","删除课程成功");
        else
            model.addAttribute("info","删除课程失败");
        return "添加教师页面";

    }

    /**
     * 修改课程信息
     * @param cId
     * @param cName
     * @param credit
     * @param semester
     * @param startDate
     * @param endDate
     * @param model
     * @return
     */
    public String updateCourse(@RequestParam("cId") String cId,@RequestParam("cName") String cName, @RequestParam("credit") String credit, @RequestParam("semester") String semester,
                               @RequestParam("startDate") String startDate, @RequestParam("endDate") String endDate, Model model)
    {
        Course course = new Course();
        course.setcId(cId);
        course.setcName(cName);
        course.setCredit(Float.parseFloat(credit));
        course.setSemester(Integer.parseInt(semester));
        Date date = Date.valueOf(startDate);
        course.setStartDate(date);
        date = Date.valueOf(endDate);
        course.setStartDate(date);
        if(service.updateCourse(course))
            model.addAttribute("info","课程更新成功");
        else
            model.addAttribute("info","课程更新失败");
        return "添加课程页面";
    }
}
