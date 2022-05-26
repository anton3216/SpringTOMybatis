package org.qingqiao.service;

import org.qingqiao.bean.Student;
import org.qingqiao.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> queryAll() {
        return studentMapper.queryAll();
    }
}
