package com.dmxiaoshen.a.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by hzhsg on 2018/7/10.
 */
@Component
@ConfigurationProperties(prefix = "appconfig")
public class AppConfig {

    private String id;
    private String key;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
