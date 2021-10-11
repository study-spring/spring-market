package project.springmarket.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import project.springmarket.model.member.Member;
import project.springmarket.model.member.MemberAddressOnly;
import project.springmarket.mybatis.MemberMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Repository
public class MemberMybatisRepository {
    private final MemberMapper memberMapper;

    public Member findById(String id) {
        return memberMapper.findById(id);
    }

    public void insertMember(Member member){
        memberMapper.insertMember(member);
    }

    public void updateMember(Map paramMap){
        memberMapper.updateMember(paramMap);
    }
}
