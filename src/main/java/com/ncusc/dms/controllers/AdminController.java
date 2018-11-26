package com.ncusc.dms.controllers;

import java.text.SimpleDateFormat;
import java.util.List;

import com.ncusc.dms.pojo.Admin;
import com.ncusc.dms.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncusc.dms.pojo.Student;
import com.ncusc.dms.pojo.Student_Course;
import com.ncusc.dms.repository.StudentRepository;
import com.ncusc.dms.repository.Student_CourseRepository;

/**
 * Admin控制类
 * @author WANGHAO
 * @version 1.0.0
 *
 */
@Controller
@RestController
public class AdminController {
    @Autowired
	AdminService adminService;
    @Autowired
    StudentRepository studentRepositoty;
    @Autowired
    Student_CourseRepository scRepository;
    /**
     * 列出所有管理员
     * @param model
     * @return listAdmin
     * @throws Exception
     */
    @RequestMapping("/listAdmin")
    public String listAmdin(Model model) throws Exception {

        List<Admin> adminList= adminService.list();
        model.addAttribute("adminList", adminList);
        return "test/Admin/listAdmin";//istAdmin.html的路径
    }
    @GetMapping("/test")
    public void test() throws Exception{
    	Student stu = new Student();
    	Student_Course sc = new Student_Course();
    	sc.setSc_id("123456");
    	sc.setC_id("2");
    	sc.setS_id("3");
    	scRepository.save(sc);
    	stu.setId("3");
    	stu.setName("zhangsan");
    	stu.setSex("男");
    	stu.setNation("汉族");
    	stu.setBirthDate(new SimpleDateFormat("yyyy-MM-dd").parse("2018-11-23"));
    	stu.setMajor("Java");
    	stu.setGrade("123123");
    	stu.setS_class("231231");
    	stu.setCardNum("1112121213213");
    	stu.setD_id("null");
    	studentRepositoty.save(stu);

    }
}
