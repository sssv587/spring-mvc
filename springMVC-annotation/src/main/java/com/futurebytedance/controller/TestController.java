package com.futurebytedance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/8 - 23:40
 * @Description
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
