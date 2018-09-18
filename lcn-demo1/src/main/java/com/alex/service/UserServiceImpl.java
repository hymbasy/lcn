package com.alex.service;

import com.alex.dao.UserDao;
import com.alex.model.User;
import com.codingapi.tx.annotation.TxTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Transactional
    @TxTransaction
    @Override
    public int saveUser(User user) {
        return userDao.saveUser(user);
    }
}
