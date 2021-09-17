package project.springmarket.repository;

import org.springframework.stereotype.Repository;
import project.springmarket.model.member.Member;

@Repository
public class MemberRepository {

    public Member find(){
        return new Member(1, "test", "1234", 1);
    }
}
