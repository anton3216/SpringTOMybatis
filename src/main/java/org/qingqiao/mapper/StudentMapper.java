package org.qingqiao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qingqiao.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> queryAll();
}
