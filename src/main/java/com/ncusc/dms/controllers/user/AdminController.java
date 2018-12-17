package com.ncusc.dms.controllers.user;

import java.util.List;

import com.ncusc.dms.pojo.Admin;
import com.ncusc.dms.service.user.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * Admin控制类
 * @author WANGHAO
 * @version 1.0.0
 *
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
	AdminService adminService;
   
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
        return "test/Admin/listAdmin";//listAdmin.html的路径
    }
  
}
