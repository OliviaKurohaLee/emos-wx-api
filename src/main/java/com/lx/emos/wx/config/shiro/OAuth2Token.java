package com.lx.emos.wx.config.shiro;

import org.apache.shiro.authc.AuthenticationToken;
//用于封装令牌的封装类
public class OAuth2Token implements AuthenticationToken {

    private String token;

    public OAuth2Token(String token){
        this.token=token;

    }

    public Object getPrincipal(){

        return token;


    }

    public Object getCredentials(){
        return token;


    }




}
