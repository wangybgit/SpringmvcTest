package com.wyb.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wyb.service.UserServiceI;

@Controller
@RequestMapping("/testController")
public class TestController {

	@Autowired
	private UserServiceI userService; 
	
    private static final Logger logger = Logger.getLogger(TestController.class);
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String method(){
    	System.out.println("根方法");
    	return "";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String index(HttpServletRequest request, HttpServletResponse response,Model m) {
        //ModelAndView view = new ModelAndView("manage/login");
       // view.addObject("c", "好 ");
        request.setAttribute("param1", "hello");
        userService.test();
        //System.out.println("path:"+request.getContextPath());
    	m.addAttribute("param2", "test");
        logger.info("开始进入页面");

       // return view;
        return "jsp/hello";
    }
    
    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String login(){
    	
    	return "jsp/login";
    }

    @RequestMapping(value="loginCheck",method=RequestMethod.POST )
    public String loginCheck(){
    	return "";
    }
}