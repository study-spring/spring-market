package project.springmarket.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import project.springmarket.model.member.Member;
import project.springmarket.mapper.MemberMapper;

@RequiredArgsConstructor
@Repository
public class MemberRepository {
    private final MemberMapper memberMapper;

    public Member findById(String id) {
        return memberMapper.findById(id);
    }

    public void insertMember(Member member){
        memberMapper.insertMember(member);
    }

    public void updateMember(Member member){
        memberMapper.updateMember(member);
    }
}
