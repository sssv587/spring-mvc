package com.futurebytedance.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/24 - 14:46
 * @Description
 */
@Controller
public class HelloController {
    //"/"-->/WEB-INF/templates/index.html
    @RequestMapping("/")
    public String index() {
        //返回视图名称
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget() {
        return "target";
    }
}
