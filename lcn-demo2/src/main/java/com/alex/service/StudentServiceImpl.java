package com.alex.service;

import com.alex.dao.StudentDao;
import com.alex.model.Student;
import com.codingapi.tx.annotation.TxTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Transactional
    @TxTransaction
    @Override
    public int saveStudent(Student student) {
        return studentDao.saveStudent(student);
    }
}
