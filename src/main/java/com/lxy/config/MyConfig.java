package com.lxy.config;

import com.lxy.vo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public User user1(){
        User user = new User();
        user.setName("xiaoli");
        user.setAge(22);
        return user;
    }
}
