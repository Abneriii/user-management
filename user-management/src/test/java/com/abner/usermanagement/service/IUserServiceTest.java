package com.abner.usermanagement.service;
import java.time.LocalDateTime;

import com.abner.usermanagement.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class IUserServiceTest {

    @Autowired
    IUserService iUserService;

    //测试注册功能
    @Test
    void testSignUp(){
        if(iUserService.singUp("1243@qq.com","nini")!=null){
            System.out.println("注册成功");
        }else{
            System.out.println("注册失败");
        }

    }

    //测试数据库连通性
    @Test
    void testSave() {
        User user = new User();
        user.setUsername("宁哈哈");
        user.setAge(21);
        user.setEmail("1569209119@qq.com");
        user.setPassword("123");
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateTime(LocalDateTime.now());
        user.setAvatarUrl("https://img-blog.csdnimg.cn/img_convert/3eac4e83e02f8ec7b9a4ade51544fdb3.jpeg");
        user.setGender(1);
        user.setIsDeleted(0);
        assertEquals(true, iUserService.save(user));

    }

    //测试登录功能
    @Test
    void testLogin(){
        //【2022.11.10疑问】在以下情景应该如何正确使用Junit完成样例测试？
        User user=iUserService.login("1569209119@qq.com","123");
        if(user!=null){
            System.out.println("登录成功");
        }else{
            System.out.println("失败");
        }

        }

    }
