package org.example.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.example.dto.RegisterDto;
import org.example.etc.Response;

import org.example.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class UserController {


    private final UserService userService;

    @ApiOperation(value = "전체 회원 보기", notes = "전체 회원을 조회한다.")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/users")
    public Response<?> findAll() {
        return new Response<>("true", "조회 성공", userService.findAll());
    }

    @ApiOperation(value="유저 찾기", notes = "개별 유저 조회")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/users/{id}")
    public Response<?> findUser(@PathVariable("id") Integer id) {
        return new Response<>("true", "조회 성공", userService.findUser(id));
    }

    @ApiOperation(value = "회원가입", notes="회원가입 진행")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/auth")
    public Response<?> register(@RequestBody RegisterDto registerDto) {
        return new Response<>("true", "가입 성공", userService.register(registerDto));
    }
}
//https://m.blog.naver.com/sosow0212/222727249905