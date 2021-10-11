package project.springmarket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.springmarket.model.member.Member;
import project.springmarket.model.member.MemberAddressOnly;
import project.springmarket.repository.MemberMybatisRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 생성자 주입
 * 롬복을 이용해서 final 키워드가 붙은 필드 대상 생성자 자동 생성
 * 생성자 1개일 경우 @Autowired 생략 가능
 */

@Service
@RequiredArgsConstructor
public class MemberMybatisService {
    private final MemberMybatisRepository memberMybatisRepository;

    public Member findById(String id){
        return memberMybatisRepository.findById(id);
    }

    public void insertMember(Member member){
        memberMybatisRepository.insertMember(member);
    }

    public void updateMember(Map paramMap){
        memberMybatisRepository.updateMember(paramMap);
    }

}

