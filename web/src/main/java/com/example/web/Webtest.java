package com.example.web;

import com.example.service.ServiceTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Description: 测试web端
 *
 * @author gan.jin@ucarinc.com
 * @version 1.0
 * @Date 2019/10/31 11:08
 */
@RestController
public class Webtest {
    @Resource
    private ServiceTest serviceTest;
    @RequestMapping("/test")
    public String getWebString(){
        return serviceTest.getServiceString()+"Web";
    }
}
