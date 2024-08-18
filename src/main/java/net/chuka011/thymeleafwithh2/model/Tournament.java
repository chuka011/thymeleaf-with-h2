package net.chuka011.thymeleafwithh2.model;

import org.springframework.data.annotation.Id;

public record Tournament (
        @Id Integer id,
        String title,
        Integer tyear
){
}
