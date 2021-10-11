package project.springmarket.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import project.springmarket.model.member.Member;
import project.springmarket.model.member.MemberAddressOnly;
import project.springmarket.service.MemberMybatisService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberMybatisService memberMybatisService;
    ObjectMapper objectMapper;

    @GetMapping("/{id}")
    public Member findById(@PathVariable("id") String id){
        return memberMybatisService.findById(id);
    }

    @PostMapping("")
    public void insertMember(@RequestBody Member member){
        memberMybatisService.insertMember(member);
    }

    @PatchMapping(path = "/{id}")
    public void updateMemberAddress(@RequestBody MemberAddressOnly memberAddressOnly, @PathVariable("id") String id) {
        // pathVariable String으로 받고, body의 json은 객체로 받았는데 이걸 mybatis param으로 각각 다른 형식을 어떻게 보내야할지 몰라서
        // map을 사용했습니다.
        // 회원 정보에서 id, pw, 주소 중에 주소 업데이트 하는 경우
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("addressCodeNo", memberAddressOnly.getAddressCodeNo());
        paramMap.put("id", id);
        memberMybatisService.updateMember(paramMap);
    }
}

