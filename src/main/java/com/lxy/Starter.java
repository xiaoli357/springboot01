package com.lxy;

import com.lxy.vo.User;
import javafx.scene.input.InputMethodTextRun;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Starter {
    public static void main(String[] args){
        ConfigurableApplicationContext run = SpringApplication.run(Starter.class, args);
        User user1 = run.getBean("user1", User.class);
        User user2 = run.getBean("user1", User.class);
        System.out.println(user1);
        System.out.println(user2);
    }
}
