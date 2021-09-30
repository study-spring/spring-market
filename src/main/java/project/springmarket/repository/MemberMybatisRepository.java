package project.springmarket.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import project.springmarket.model.member.Member;
import project.springmarket.mybatis.MemberMapper;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Repository
public class MemberMybatisRepository {
    private final MemberMapper memberMapper;

    public Member findById(String id) {
        return memberMapper.findById(id);
    }

    public void createMember(Map<String, Object> paramMap){
        memberMapper.createMember(paramMap);
        return;
    }
}
