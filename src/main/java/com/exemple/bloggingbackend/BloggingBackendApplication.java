package com.exemple.bloggingbackend;

import com.exemple.bloggingbackend.entities.User;
import com.exemple.bloggingbackend.repositories.ArticleRepository;
import com.exemple.bloggingbackend.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class BloggingBackendApplication {

    public static void main(String[] args) {

        SpringApplication.run(BloggingBackendApplication.class, args);
    }
    @Bean
    CommandLineRunner start(UserRepository userRepository) {
        return args -> {
            Stream.of("joe","jhon","joey").forEach(name -> {
                    User user = new User();
                    user.setUsername(name);
                    user.setEmail(name+"@gmail.com");
                    userRepository.save(user);
            });
        };
    }

}
