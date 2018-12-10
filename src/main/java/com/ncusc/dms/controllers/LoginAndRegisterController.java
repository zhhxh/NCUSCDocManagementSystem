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

/**
 * @author Newkey
 *
 */
@RestController
public class LoginAndRegisterController {
	
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
		model.addAttribute("title", "学生注册");
		return new ModelAndView("login/register1");
	}
	/**
	 * 
	 * @param student
	 * @param request
	 * @return
	 *
	 */
	@PostMapping("register")
    public ModelAndView registerPost(Student student,HttpServletRequest request){
		//student.toString();
		System.out.println(student.toString());
		System.out.println("this is register post");
//		StudentAccount studentAccount = new StudentAccount();
//		studentAccount.setsId(student.getsId());
//		studentAccount.setPassword(request.getParameter("psw"));
//		studentAccount.setTelNum(student.getMobile());
//		studentAccount.setEmail(student.getEmail());
//		studentMapper.add(student);
//		studentAccountMapper.add(studentAccount);
		return new ModelAndView("redirect:/login");
	}
	/**
	 * 
	 * @param request
	 * @return
	 *
	 */
	@GetMapping("registerAjax")
	public String registerIdf(HttpServletRequest request){
		  String reponse;
		  String str = request.getParameter("stuId");
		  //System.out.println(str);
		  Student st = studentMapper.getById(str);
		  if(st == null)
			   reponse = "{\"data\":\"true\"}";
		  else
			  reponse = "{\"data\":\"false\"}";
		  //System.out.println(reponse);
		  return reponse;
	}
}
