package com.ncusc.dms.controllers.course;

import com.ncusc.dms.pojo.Course;
import com.ncusc.dms.pojo.Student;
import com.ncusc.dms.service.course.StuCourseService;
import com.ncusc.dms.service.course.TeacherCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * TeacherCourseCtl教师课程控制
 * @author ZHANGHAN、WANGYIQING
 * @version 1.0.0
 *
 */

@Controller
@RequestMapping(value="/TeacherC")
public class TeacherCourseCtl {
    @Autowired
    private StuCourseService service;
    @Autowired
    private TeacherCourseService service1;

    /**
     * 确认学生信息
     * @param sid,model
     * @return String
     * @throws Exception
     */
    @RequestMapping(value="/checkStu")
    public String checkStudent(@RequestParam("sid")String sid,Model model)
    {
        Student stu = service.getStuBysId(sid);
        model.addAttribute("stuInfo",stu);
        return "test/Course/loadCourse";
    }

    /**
     * 添加学生到课程
     * @param sid,cid,tid,model
     * @return String
     * @throws Exception
     */
    @RequestMapping(value="/addStu")
    public String AddStudent(@RequestParam("sid")String sid, @RequestParam("cid")String cid, @RequestParam("tid")String tid,Model model)
    {
        service.addStu(sid,cid,tid);
        String s = "添加学生成功！";
        model.addAttribute("info",s);
        return "test/Course/loadCourse";
    }

    /**
     * 从课程删除学生
     * @param sid,cid,model
     * @return String
     * @throws Exception
     */
    @RequestMapping(value="/deleteStu")
    public String deleteStudent(@RequestParam("sid")String sid, @RequestParam("cid")String cid,Model model)
    {
        service.deleteStu(sid,cid);
        String s = "删除学生成功！";
        model.addAttribute("info",s);
        return "test/Course/loadCourse";
    }

    /**
     * 显示选了该课程的所有学生
     * @param cid,model
     * @return String
     * @throws Exception
     */
    @RequestMapping(value="/showAllStu")
    public String showAllStu( @RequestParam("cid")String cid,Model model)
    {
        List<Student> stulist ;
        stulist = service.listAllCourseByCid(cid);
        model.addAttribute("stuAll",stulist);
        return "test/Course/loadCourse";
    }

    /**
     * 显示该老师所有开设课程
     * @param tid,model
     * @return String
     * @throws Exception
     */
    @RequestMapping(value="/showAllCou")
    public String showAllCou(@RequestParam("tid")String tid,Model model)
    {
        List<Course> courlist;
        courlist = service1.listAllCourseByTid(tid);
        model.addAttribute("couAll",courlist);
        return "test/Course/loadCourse";
    }
}
