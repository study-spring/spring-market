package project.springmarket.mapper;

import org.apache.ibatis.annotations.Mapper;
import project.springmarket.model.member.Member;

@Mapper
public interface MemberMapper {
    Member findById(String id);

    void insertMember(Member member);

    void updateMember(Member member);

    void deleteMember(String id);
}
