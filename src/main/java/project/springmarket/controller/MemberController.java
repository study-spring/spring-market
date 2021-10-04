package project.springmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import project.springmarket.model.member.Member;
import project.springmarket.service.MemberMybatisService;

import java.util.Map;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberMybatisService memberMybatisService;

    @GetMapping("/{id}")
    public Member findById(@PathVariable("id") String id){
        return memberMybatisService.findById(id);
    }

    @PostMapping("")
    public void insertMember(@RequestBody Member member){
        memberMybatisService.insertMember(member);
    }
}

