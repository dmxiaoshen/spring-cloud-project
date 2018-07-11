package com.dmxiaoshen.a.controller;

import com.dmxiaoshen.a.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/config")
    public Object showConfig(){
        return appConfig;
    }
}
