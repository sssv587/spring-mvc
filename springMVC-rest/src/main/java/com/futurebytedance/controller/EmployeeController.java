package com.futurebytedance.controller;

import com.futurebytedance.bean.Employee;
import com.futurebytedance.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/3 - 20:00
 * @Description
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDAO employeeDAO = null;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmployee(Model model) {
        Collection<Employee> employeeList = employeeDAO.getAll();
        model.addAttribute("employeeList", employeeList);
        return "employee_list";
    }
}
