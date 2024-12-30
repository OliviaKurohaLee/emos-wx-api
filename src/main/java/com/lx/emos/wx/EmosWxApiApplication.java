package com.lx.emos.wx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lx.emos.wx.config")
public class EmosWxApiApplication {


    public static void main(String[] args) {
        SpringApplication.run(EmosWxApiApplication.class,args);
    }
}
