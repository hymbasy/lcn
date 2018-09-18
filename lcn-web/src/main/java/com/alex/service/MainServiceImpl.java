package com.alex.service;

import com.alex.model.Student;
import com.alex.model.User;
import com.codingapi.tx.annotation.TxTransaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class MainServiceImpl implements MainService {

    @Resource
    private UserService userService;

    @Resource
    private StudentService studentService;


    @Transactional
    @TxTransaction(isStart = true)
    @Override
    public int saveUserAndStu(User user, Student student) {
        int userId = userService.saveUser(user);
        student.setUserId(userId);
        int i = studentService.saveStudent(student);
//        int a = 1/0;
        return i;
    }
}
