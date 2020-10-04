package com.bd.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/get")
    public Object get(){
        return "哈哈";
    }

    @GetMapping("/")
    public Object index(){
        return "主页111";
    }
}
