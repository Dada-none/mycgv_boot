package com.springboot.mycgv.controller;

import com.springboot.mycgv.dto.MemberDto;
import com.springboot.mycgv.dto.SessionDto;
import com.springboot.mycgv.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @Autowired
    MemberService memberService;

    /* login process */
    @PostMapping("login")
    public String login_proc(MemberDto memberDto, Model model){
        SessionDto sessionDto = memberService.login(memberDto);
        if(sessionDto.getLoginresult() == 1){
            model.addAttribute("login_result", "ok");
        }

        return "index";
    }

    /* login form */
    @GetMapping("login")
    public String login(){
        return "/login/login";
    }
}