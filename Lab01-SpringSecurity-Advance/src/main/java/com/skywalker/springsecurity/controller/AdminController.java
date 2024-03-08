package com.skywalker.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author baijj
 * @Date 2024/03/07 13:04
 **/
@RestController
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/demo")
    public String demo() {
        return "示例返回";
    }
}
