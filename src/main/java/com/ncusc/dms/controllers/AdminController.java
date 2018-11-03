package com.ncusc.dms.controllers;

import java.util.List;

import com.ncusc.dms.Mapper.AdminMapper;
import com.ncusc.dms.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
    @Autowired
    AdminMapper adminMapper;

    @RequestMapping("/listAdmin")
    public String listAmdin(Model m) throws Exception {

        List<Admin> adminList= adminMapper.list();
        m.addAttribute("adminList", adminList);

        return "listAdmin";
    }
}
