package com.futurebytedance.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/24 - 18:09
 * @Description
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("param")
    public String param() {
        return "test_param";
    }
}
