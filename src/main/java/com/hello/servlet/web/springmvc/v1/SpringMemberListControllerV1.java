package com.hello.servlet.web.springmvc.v1;


import com.hello.servlet.domain.member.Member;
import com.hello.servlet.domain.member.MemberRepository;
import com.hello.servlet.web.frontcontroller.ModelView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class SpringMemberListControllerV1 {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @RequestMapping("/springmvc/v1/members/save")
    public ModelAndView process(Map<String, String> paramMap) {
        List<Member> members  = memberRepository.findAll();
        ModelAndView mv = new ModelAndView("members");

        mv.addObject("members", members);
        return mv;
    }
}
