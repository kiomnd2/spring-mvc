package com.hello.servlet.web.springmvc.v3;

import com.hello.servlet.domain.member.Member;
import com.hello.servlet.domain.member.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller("/springmvc/v3/members")
public class SpringMemberControllerV3 {

    MemberRepository memberRepository = MemberRepository.getInstance();
    @RequestMapping(value = "/new-form", method = RequestMethod.GET)
    public String newForm() {
        return "new-form";
    }



    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestParam String username, @RequestParam int age, Model model) {
        Member member = new Member(username, age);
        memberRepository.save(member);
        model.addAttribute("member", member);
        return "save-result";
    }


    @RequestMapping(method = RequestMethod.GET)
    public String members(Model model) {
        List<Member> members  = memberRepository.findAll();
        ModelAndView mv = new ModelAndView("members");

        model.addAttribute("members", members);
        return "members";
    }
}
