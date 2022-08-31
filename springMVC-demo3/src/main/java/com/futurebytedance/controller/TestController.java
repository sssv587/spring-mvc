package com.futurebytedance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/31 - 23:47
 * @Description
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
