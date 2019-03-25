package com.fengzhongguji.service;

import com.fengzhongguji.result.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/member")
public interface MemberService {

    @RequestMapping("/register")
    public Result register(@RequestParam("email") String email,@RequestParam("password") String password);
}
