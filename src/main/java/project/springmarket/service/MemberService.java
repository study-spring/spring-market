package project.springmarket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.springmarket.model.member.Member;
import project.springmarket.repository.MemberRepository;

/**
 * 생성자 주입
 * 롬복을 이용해서 final 키워드가 붙은 필드 대상 생성자 자동 생성
 * 생성자 1개일 경우 @Autowired 생략 가능
 */

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Member findById(String id){
        return memberRepository.findById(id);
    }

    public void insertMember(Member member){
        memberRepository.insertMember(member);
    }

    public void updateMember(Member member){
        memberRepository.updateMember(member);
    }
}

