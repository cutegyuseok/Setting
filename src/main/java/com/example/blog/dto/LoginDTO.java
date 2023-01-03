package com.example.blog.dto;

import com.example.blog.entity.Login;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class LoginDTO {

    private String email;
    private String name;

    public Login toEntity(){
        return Login.builder()
                .email(email)
                .name(name)
                .build();
    }
}
