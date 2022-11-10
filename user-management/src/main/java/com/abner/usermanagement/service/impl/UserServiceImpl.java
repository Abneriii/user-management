package com.abner.usermanagement.service.impl;

import com.abner.usermanagement.entity.User;
import com.abner.usermanagement.mapper.UserMapper;
import com.abner.usermanagement.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
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
     * @param email
     * @param password [代码逻辑思考]
     *                 返回值是什么类型。登陆功能是不是一般把User返回回去,应该是要把数据脱敏后返回，不能直接全返回。
     *                 看看优秀的登录功能代码如何写的。
     *                 记录用户登录状态，即用session。
     *                 [Java语法]
     *                 判空：Java8中判空，参考https://java-8-tips.readthedocs.io/en/stable/optional.html。
     */
    @Override
    public User login(String email, String password) {
        User user = userMapper.selectById(email);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;

    }

    /**
     * @param email
     * @param password
     * @return  User
     * [代码逻辑思考]:注册返回用户id
     * if 邮箱格式不正确，返回错误
     * if 邮箱已被注册过，返回错误
     * if 密码格式校验不通过 返回错误
     * else
     * 对密码进行加密并向数据库插入一条数据
     */
    @Override
    public User singUp(String email, String password) {

        //if 邮箱格式不正确，返回错误


        // if 邮箱已被注册过，返回错误
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("email", email);
        //邮箱已被注册
        if (userMapper.selectCount(wrapper) > 0) {
            return null;
        }
       


        //if 邮箱已被注册过，返回错误


        else{
            User user = new User();
            user.setUsername("");
            user.setEmail(email);
            user.setPassword(password);
            userMapper.insert(user);
            return user;
        }

    }
}