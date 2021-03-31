package com.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Data
@ConfigurationProperties(prefix = "library")
public class BookProperties {
    @NotEmpty
    private String location;
    private List<Book> books;
    private Map<String, String> price = new HashMap<>();

    @Data
    static class Book {
        String name;
        String description;
    }
}
