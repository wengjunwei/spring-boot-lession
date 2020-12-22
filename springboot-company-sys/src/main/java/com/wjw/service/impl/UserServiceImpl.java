package com.wjw.service.impl;

import com.wjw.mapper.UserMapper;
import com.wjw.model.User;
import com.wjw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public User getById(int userId) {
        return userMapper.getById(userId);
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(int empId) {
        userMapper.delete(empId);
    }
}
