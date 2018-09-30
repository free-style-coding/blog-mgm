package com.love_peace.blogmgm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BlogMgmApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogMgmApplication.class, args);
    }
}
