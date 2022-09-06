package com.futurebytedance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/7 - 0:08
 * @Description 拦截器
 */
@Controller
public class TestController {
    @RequestMapping("/**/testInterceptor")
    public String testInterceptor() {
        return "success";
    }
}
