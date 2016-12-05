package com.wyb.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    private static final Logger logger = Logger.getLogger(IndexController.class);

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String index(HttpServletRequest request, HttpServletResponse response,Model m) {
        //ModelAndView view = new ModelAndView("manage/login");
       // view.addObject("c", "好 ");
        request.setAttribute("param1", "hello");
      
    	m.addAttribute("param2", "test");
        logger.info("开始进入页面");

       // return view;
        return "jsp/hello";
    }

}