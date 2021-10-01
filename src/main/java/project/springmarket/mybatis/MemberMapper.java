package project.springmarket.mybatis;

import org.apache.ibatis.annotations.Mapper;
import project.springmarket.model.member.Member;

import java.util.Map;

@Mapper
public interface MemberMapper {

    Member findById(String id);

    int insertMember(Member member);
}
