package project.springmarket.mybatis;

import org.apache.ibatis.annotations.Mapper;
import project.springmarket.model.member.Member;
import project.springmarket.model.member.MemberAddressOnly;

import java.util.HashMap;
import java.util.Map;

@Mapper
public interface MemberMapper {

    Member findById(String id);

    void insertMember(Member member);

    void updateMember(Map paramMap);
}

