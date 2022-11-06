package com.abner.usermanagement.controller;


import com.abner.usermanagement.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author abner
 * @since 2022-11-06
 */
@RestController
@RequestMapping("/usermanagement/user")
public class UserController  {

    @Autowired
    IUserService iUserService;





}
