package com.ncusc.dms.controllers.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * 测试images目录下的静态资源
 * @author WANGHAO
 * @version 1.0.0
 */
@Controller
public class ImageTest {
    /**
     * 测试链接：http://localhost:8080/test/imageTest?src=/images/ncu.jpg
     * 注意当前路径为/test/,图像路径为/images，两路径平级，不加image前的/则访问test/images
     * @param src 图片路径，通过url传递参数
     * @param model
     * @return 成功获取参数返回test/loadImage,失败返回errorPage
     * @throws Exception
     */
    @RequestMapping("/test/imageTest")
    public String imageTest(@RequestParam(value = "src", required = false)String src, Model model, HttpServletRequest request) throws Exception {
        if(src!=null){
            model.addAttribute("imageSrc",src);
            return "test/loadImage" ;
        }
        else{
            model.addAttribute("exception", "参数为空，需要加上src参数传入图片路径");
            model.addAttribute("url", request.getRequestURL());
            return "error/errorPage";
        }
    }
}
