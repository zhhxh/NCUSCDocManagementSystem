/**
 * LoginAndRegisterController.java
 *  
 * Dec 6, 2018
 * Newkey
 * 
 */
package com.ncusc.dms.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ncusc.dms.mapper.StudentAccountMapper;
import com.ncusc.dms.mapper.StudentMapper;
import com.ncusc.dms.pojo.Student;
import com.ncusc.dms.pojo.StudentAccount;
import com.ncusc.dms.service.StudentService;

/**
 * @author Newkey
 *
 */
@RestController
public class LoginAndRegisterController {
	
	@Autowired
	StudentService studentService;
	@Autowired
	StudentMapper studentMapper;
	@Autowired
	StudentAccountMapper studentAccountMapper;
	/**
	 * 登陆
	 * @param model
	 * @return
	 *
	 */
	@GetMapping("login")
    public ModelAndView login(){
    	  return new ModelAndView("login/login1");
      }
	/**
	 *  注册
	 * @param model
	 * @return
	 *
	 */
	@GetMapping("register")
	public ModelAndView registerGet(Model model){
		model.addAttribute("student", new Student());
		model.addAttribute("studentAccount", new StudentAccount());
		model.addAttribute("title", "学生注册");
		return new ModelAndView("login/register1");
	}
    /**
     * 注册提交的表单
     * @param student
     * @param studentAccount
     * @return
     *
     */
	@PostMapping("register")
    public ModelAndView registerPost(Student student,StudentAccount studentAccount){
		studentService.add(student, studentAccount);
		return new ModelAndView("redirect:/login");
	}
	/**
	 * 注册时验证学号是否已被注册
	 * @param request
	 * @return
	 *
	 */
	@GetMapping("registerAjax")
	public String registerIdf(HttpServletRequest request){
		  String reponse;
		  String stuId = request.getParameter("stuId");
		  Student st = studentMapper.getById(stuId);
		  if(st == null)
			   reponse = "{\"reponse\":\"true\"}";
		  else
			  reponse = "{\"reponse\":\"false\"}";
		  return reponse;
	}
	/**
	 * 验证登陆
	 * @param request
	 * @return
	 *
	 */
	@GetMapping("loginAjax")
	public String loginIdf(HttpServletRequest request){
		String reponse;
	    String stuId = request.getParameter("stuId");
	    String password = request.getParameter("stuPsw");
	    StudentAccount studentAccount = studentAccountMapper.getById(stuId);
	    if(studentAccount == null){
	    	reponse = "{\"reponse\":\"Null\"}";
	    }
	    else if(password.equals(studentAccount.getPassword()) == false){
	    	reponse = "{\"reponse\":\"Error\"}";
	    }
	    else{
	    	reponse = "{\"reponse\":\"Succeed\"}";
	    }
	    return reponse;
	}
}
