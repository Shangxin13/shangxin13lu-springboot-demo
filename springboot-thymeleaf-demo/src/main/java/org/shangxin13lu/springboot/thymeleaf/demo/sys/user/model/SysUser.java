package org.shangxin13lu.springboot.thymeleaf.demo.sys.user.model;

import lombok.Data;

import java.util.Date;

@Data
public class SysUser {

    private Long id;

    private String userID;

    private String userName;

    private String password;

    private Integer age;

    private Date birthday;

    private Date createTime;

    private Date updateTime;
}
