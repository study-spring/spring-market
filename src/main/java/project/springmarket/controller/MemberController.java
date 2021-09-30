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

    @PostMapping("/new-user")
    public String createMember(@RequestParam Map<String, Object> paramMap){
        memberMybatisService.createMember(paramMap);
        return "회원 가입 완료";
    } // http 파라미터 이름과 변수 이름이 같으면 @RequestParam 생략 가능
}
