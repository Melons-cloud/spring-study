package com.hemukeji.service;

import com.hemukeji.dao.UserDao;
import com.hemukeji.dao.UserDaoImpl;
import com.hemukeji.dao.UserDaoMysqlImpl;
import com.hemukeji.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao;


    //set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }



    public void getUser() {

        userDao.getUser();

    }
}
