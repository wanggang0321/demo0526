package com.leyou.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author wanggang
 * @Date 2021年05月26日
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello, spring boot!";
    }

}
