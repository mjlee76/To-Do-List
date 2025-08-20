package com.hello.ToDoList.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping("/members/login")
    public String login() {
        return "members/memberLogin";
    }

    @GetMapping("/members/signup")
    public String signup() {
        return "members/createMemberForm";
    }
}
