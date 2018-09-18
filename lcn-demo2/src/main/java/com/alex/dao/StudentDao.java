package com.alex.dao;

import com.alex.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveStudent(Student student) {
        StringBuilder sql = new StringBuilder("insert into student(name,userId,createTime) values(?,?,?)");
        int i = jdbcTemplate.update(sql.toString(), new Object[]{student.getName(),student.getUserId(),student.getCreateTime()});
        return i;
    }
}
