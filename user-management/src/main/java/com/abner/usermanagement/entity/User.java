package com.abner.usermanagement.entity;


import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author abner
 * @since 2022-11-06
 */
@Data
public class User {

    private static final long serialVersionUID = 1L;

    /**
     * 姓名
     */
    private String username;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 头像链接
     */
    private String avatarUrl;

    /**
     * 性别
     * o为女，1为男
     */
    private Integer gender;

    /**
     * 是否删除
     */
    private Integer isDeleted;


}
