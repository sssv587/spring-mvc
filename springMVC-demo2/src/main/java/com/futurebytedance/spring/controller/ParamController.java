package com.futurebytedance.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/7/24 - 23:21
 * @Description 测试获取请求参数
 */
@Controller
public class ParamController {
    @RequestMapping("/testServletAPI")
    //形参位置的request表示当前请求
    public String testServletAPI(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:" + username + " password:" + password);
        return "success";
    }

    @RequestMapping("/testParam")
    public String param(
            //required控制value是否必须映射上，如果为true没有映射上会报错，反之会置为null
            @RequestParam(value = "user_name", required = false, defaultValue = "root") String username,
            String password,
            String[] hobby,
            //与@RequestParam参数一致
            @RequestHeader(value = "Host", required = true, defaultValue = "localhost:8080") String host) {
        //多请求参数中出现多个同名的请求参数，可以在控制器方法的形参位置设置字符串类或字符串数组接收此参数
        //若使用字符串类型的形参，最终结果为请求参数的每一个值之间使用逗号进行拼接
        System.out.println("username:" + username + " password:" + password + " hobby:" + Arrays.toString(hobby));
        System.out.println("host:" + host);
        return "success";
    }
}
