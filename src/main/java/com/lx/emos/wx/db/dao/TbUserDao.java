package com.lx.emos.wx.db.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.Set;

@Mapper
public interface TbUserDao {


    public boolean haveRootUser();

    public int insert(HashMap params);

    public Integer searchIdByOpenId(String openId);


    public Set<String> searchUserPermissions(int userId);

}
