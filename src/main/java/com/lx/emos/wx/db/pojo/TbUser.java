package com.lx.emos.wx.db.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TbUser implements Serializable {

    //主键
    private Integer id;

    //长期授权字符串
    private String openId;

    //昵称
    private String nickname;

    //头像网址
    private String photo;

    //姓名
    private String name;

    //性别
    private Object sex;

    //手机
    private String tel;

    //邮箱
    private String email;

    //入职日期
    private Date hiredate;

    //角色
    private Object role;

    //是否超级管理员
    private Boolean root;

    //部门编号
    private Integer deptId;

    //状态
    private Byte status;

    //创建时间
    private Date createTime;

    private static final long serialVersionUID = 1L;


}
