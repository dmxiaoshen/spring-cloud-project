package com.dmxiaoshen.a.service.impl;


import com.dmxiaoshen.a.dao.UserDao;
import com.dmxiaoshen.a.model.User;
import com.dmxiaoshen.a.service.UserService;
import com.dmxiaoshen.common.utils.IdGenUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hzhsg on 2018/1/9.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(String id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public int addUser(User user) {
        user.setId(IdGenUtils.getUUID());
        return userDao.insertSelective(user);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateByPrimaryKeySelective(user);
    }

    @Override
    public PageInfo<User> page(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);

        return new PageInfo<>(userDao.selectAll());
    }
}
