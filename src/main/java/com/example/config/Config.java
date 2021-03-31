package com.example.config;

import com.example.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public BookService initService(BookProperties bookProperties) {
        return new BookService(bookProperties);
    }
}
