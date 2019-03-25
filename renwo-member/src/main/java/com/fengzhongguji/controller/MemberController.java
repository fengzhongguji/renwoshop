package com.fengzhongguji.controller;

import com.alibaba.fastjson.JSONObject;
import com.fengzhongguji.mq.MessageSender;
import com.fengzhongguji.result.Result;
import com.fengzhongguji.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController implements MemberService {
    @Autowired
    private MessageSender messageSender;
    @Override
    public Result register(String email, String password) {
        JSONObject json = new JSONObject();
        json.put("type","email");
        json.put("to",email);
        System.out.println("email:"+email);
        System.out.println("password:"+password);
        messageSender.send("fengzhongguji_queue",json.toJSONString());
        return new Result(200,"注册成功",null);
    }
}
