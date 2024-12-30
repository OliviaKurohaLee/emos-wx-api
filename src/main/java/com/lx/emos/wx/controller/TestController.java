package com.lx.emos.wx.controller;


import com.lx.emos.wx.common.util.R;
import com.lx.emos.wx.controller.form.TestSayHelloForm;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
//@RequestMapping("/test")

public class TestController {

    @PostMapping("/sayHello")
    @ApiOperation("最简单的测试方法")
    public R sayHello(@Valid @RequestBody TestSayHelloForm testSayHelloForm){
            return R.ok().put("message","HelloWorld");
        }


}
