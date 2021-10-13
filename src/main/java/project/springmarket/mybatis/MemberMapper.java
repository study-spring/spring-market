package project.springmarket.mybatis;

import org.apache.ibatis.annotations.Mapper;
import project.springmarket.model.member.Member;

@Mapper
public interface MemberMapper {
    Member findById(String id);

    void insertMember(Member member);

    void updateMember(Member member);
}

