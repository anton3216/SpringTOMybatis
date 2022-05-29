package org.qingqiao.controller;

import org.qingqiao.bean.Student;
import org.qingqiao.mapper.StudentMapper;
import org.qingqiao.service.StudentService;
import org.qingqiao.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("stu")
public class StudentController {
    @Autowired
    private StudentService ss;

    @RequestMapping("queryAll")
    public String queryAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> students = ss.queryAll();
        req.setAttribute("list",students);
        return "list";
    }
}
