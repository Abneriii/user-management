package com.abner.usermanagement.service.impl;

import com.abner.usermanagement.entity.User;
import com.abner.usermanagement.mapper.UserMapper;
import com.abner.usermanagement.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    UserMapper userMapper;

    /**
     *
     * @param email
     * @param password
     *
     * [代码逻辑思考]
     * 返回值是什么类型。登陆功能是不是一般把User返回回去,应该是要把数据脱敏后返回，不能直接全返回。
     * 看看优秀的登录功能代码如何写的。
     * [Java语法]
     * 判空：Java8中判空，参考https://java-8-tips.readthedocs.io/en/stable/optional.html。
     *
     *
     *
     */
    @Override
    public User login(String email, String password) {
        User user=userMapper.selectById(email);
        if(user!=null){
            if(user.getPassword().equals(password)){
                return user;
            }

        }
        return null;

    }
}
