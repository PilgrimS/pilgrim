package com.pilgrim.hxy.service.impl;

import com.pilgrim.hxy.entity.WChatUser;
import com.pilgrim.hxy.mapper.UserMapper;
import com.pilgrim.hxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hexy
 * @date 2018/12/1915:18
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int register(WChatUser user) {
        userMapper.insert(user);
        return 0;
    }
}
