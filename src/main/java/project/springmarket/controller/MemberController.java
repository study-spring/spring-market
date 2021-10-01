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
    public int insertMember(@RequestBody Member member){
        // myBatis의 데이터 변경(update, delete, insert)의 리턴값은 정상 변경이 된 레코드의 수
        int insertSuccessCount = memberMybatisService.insertMember(member);
        return insertSuccessCount;
    }
}
