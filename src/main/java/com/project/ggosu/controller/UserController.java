package com.project.ggosu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.ggosu.dto.UserDto;

import lombok.extern.log4j.Log4j2;


@Controller
@Log4j2
public class UserController {
    
    // 회원가입 버튼 클릭 시
    @GetMapping("/signup")
    public String getRegister() {
        log.info("회원가입 화면 요청");
        return "signup";
    }
    
    // 회원가입 완료 시
    @PostMapping("/signup")
    public String postRegister(UserDto userDto) {
        //TODO: process POST request
        log.info("유저 회원가입 : {}", userDto);
        
        return "login";
    }
    
}
