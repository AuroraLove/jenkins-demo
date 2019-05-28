package com.jenkins.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * jenkins测试接口
 *
 * @author yuzh
 * @date 2019/5/27
 */
@RestController
public class JenkinsController {

    @GetMapping("/hello")
    public String hello(){
        return "jenkins hello";
    }
}
