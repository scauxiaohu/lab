package com.lab.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lab.domain.User;
import com.lab.service.UserService;
import com.lab.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 64573
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-06-27 20:03:08
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




