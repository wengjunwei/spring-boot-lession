package com.wjw.service;

import com.wjw.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {

    public void insert(User user);

    public User getById(int userId);

    public List<User> list();

    public void update(User user);

    public void delete(int empId);
}
