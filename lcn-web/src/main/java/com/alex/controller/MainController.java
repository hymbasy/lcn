package com.alex.controller;

import com.alex.model.Student;
import com.alex.model.User;
import com.alex.service.MainService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
public class MainController {

    @Resource
    private MainService mainService;


    @RequestMapping("/save")
    public String save() {
        User u = new User("alex", 1, "18500110022", "12315@qq.com", new Date());
        Student s = new Student("alex", null, new Date());
        int i = mainService.saveUserAndStu(u, s);
        return i + "";
    }
}
