package com.futurebytedance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/31 - 23:58
 * @Description 域对象共享数据
 */
@Controller
public class ScopeController {

    //1.使用ServletAPI向request域对象共享数据
    @RequestMapping("/testRequestByServletAPI")
    public String testRequestByServletAPI(HttpServletRequest request) {
        request.setAttribute("testRequestScope", "hello,servletAPI");
        return "success";
    }

    //2.使用ModelAndView向request域对象共享数据
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView mav = new ModelAndView();
        //处理模型数据，即向请求request共享数据
        mav.addObject("testRequestScope", "hello,ModelAndView");
        //设置视图名称
        mav.setViewName("success");
        return mav;
    }

    //3.使用Model向request域对象共享数据
    @RequestMapping("testModel")
    public String testModel(Model model) {
        model.addAttribute("testRequestScope", "hello,model");
        System.out.println(model.getClass().getName());
        return "success";
    }

    //4.使用map向request域对象共享数据
    @RequestMapping("testMap")
    public String testMap(Map<String, Object> map) {
        map.put("testRequestScope", "hello,map");
        System.out.println(map.getClass().getName());
        return "success";
    }

    //5.使用ModelMap向request域对象共享数据
    @RequestMapping("testModelMap")
    public String testModelMap(ModelMap modelMap) {
        modelMap.addAttribute("testRequestScope", "hello,ModelMap");
        System.out.println(modelMap.getClass().getName());
        return "success";
    }

    //通过ServletAPI向Session域对象共享数据
    @RequestMapping("testSession")
    public String testSession(HttpSession session) {
        session.setAttribute("testSessionScope", "hello,session");
        return "success";
    }

    //通过ServletAPI向Application域对象共享数据
    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session) {
        ServletContext application = session.getServletContext();
        application.setAttribute("testApplicationScope", "hello,application");
        return "success";
    }
}
