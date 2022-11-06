package com.abner.usermanagement.service.impl;

import com.abner.usermanagement.entity.User;
import com.abner.usermanagement.mapper.UserMapper;
import com.abner.usermanagement.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author abner
 * @since 2022-11-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
