package com.hejumeng.restcrud.controller.emp;


import com.hejumeng.restcrud.dao.EmployeeDao;
import com.hejumeng.restcrud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * 员工控制器
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping(value = "/emps")
    public String listPage(Model model) {
        Collection<Employee> emps = employeeDao.getAll();
        model.addAttribute("emps", emps);
        return "emp/list";
    }
}
