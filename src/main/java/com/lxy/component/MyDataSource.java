package com.lxy.component;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("data")
@Data
public class MyDataSource {
    private String username;
    private String password;
}
