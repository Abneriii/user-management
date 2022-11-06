package com.abner.usermanagement.service;

import com.abner.usermanagement.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author abner
 * @since 2022-11-06
 */
public interface IUserService extends IService<User> {

    User login(String email,String password);

    User singUp(String eamil,String password);

}
