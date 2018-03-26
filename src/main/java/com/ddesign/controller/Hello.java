package com.ddesign.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @ApiOperation(value = "欢迎页")   //对接口的说明
    public String Say(){
        return  "你好 JAVA";
    }
}
