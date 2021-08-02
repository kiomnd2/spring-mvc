package com.hello.servlet.web.frontcontroller.v1.controller;

import com.hello.servlet.domain.member.Member;
import com.hello.servlet.domain.member.MemberRepository;
import com.hello.servlet.web.frontcontroller.v1.ControllerV1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberSaveControllerV1 implements ControllerV1 {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("mvcMemberSaveServlet.service");

        String username = req.getParameter("username");
        int age = Integer.parseInt(req.getParameter("age"));
        Member member = new Member(username, age);
        memberRepository.save(member);

        // model 에 데이터를 보관
        req.setAttribute("member", member);

        String viewPath = "/WEB-INF/views/save-result.jsp";
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(viewPath);
        requestDispatcher.forward(req, res);
    }
}
