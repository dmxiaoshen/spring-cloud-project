package com.dmxiaoshen.a.controller;

import com.dmxiaoshen.a.config.AppConfig;
import com.dmxiaoshen.a.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.metadata.HikariDataSourcePoolMetadata;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hzhsg on 2018/7/10.
 */
@RestController
@RequestMapping("/a")
public class AppConfigController {
    @Autowired
    private AppConfig appConfig;
    @Autowired
    private UserService userService;

    @GetMapping("/config")
    public Object showConfig(){
        return appConfig;
    }

    @GetMapping("/user_list")
    public Object getPage(){
        return userService.page(1,10);
    }

    @GetMapping("/user/{id}")
    public Object getUser(@PathVariable("id")String id){
        return userService.getUser(id);
    }
}
