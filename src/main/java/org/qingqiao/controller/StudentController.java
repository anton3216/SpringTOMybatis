package org.qingqiao.controller;

import org.qingqiao.bean.Student;
import org.qingqiao.mapper.StudentMapper;
import org.qingqiao.service.StudentServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class StudentController {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentServiceImpl studentService = context.getBean(StudentServiceImpl.class);
        List<Student> students = studentService.queryAll();
        System.out.println(students);
    }
}
