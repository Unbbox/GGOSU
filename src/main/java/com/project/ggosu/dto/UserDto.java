package com.project.ggosu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    
    private Long userId;

    private String userEmail;

    private String userPassword;

    private String userNickname;

    private String userPhone;
}
