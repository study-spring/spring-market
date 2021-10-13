package project.springmarket.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import project.springmarket.model.member.Member;
import project.springmarket.repository.MemberMybatisRepository;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    private MemberMybatisRepository memberMybatisRepository;

    // given when then
    @Test
    @Transactional
    public void findByIdTest(){
        Member insertMember = new Member(0, "testCode", "Test1234", 1);
        memberMybatisRepository.insertMember(insertMember);

        Member findByIdMember = memberMybatisRepository.findById(insertMember.getMemberLoginID());

        assertThat(findByIdMember.getMemberLoginID()).isEqualTo(insertMember.getMemberLoginID());
        assertThat(findByIdMember.getMemberLoginPW()).isEqualTo(insertMember.getMemberLoginPW());
        assertThat(findByIdMember.getAddressCodeNo()).isEqualTo(insertMember.getAddressCodeNo());
    }

    @Test
    @Transactional
    public void insertMemberTest(){

    }

    // addressCode만 바꾸는 경우, PW는 NULL
    @Test
    @Transactional
    public void updateMemberAddressTest(){
        Member insertMember = new Member(0, "testCode", "Test1234", 1);
        memberMybatisRepository.insertMember(insertMember);

        int updateAddressCode = 500;
        Member updateOnlyAddress = new Member(0, "testCode", null, updateAddressCode);
        memberMybatisRepository.updateMember(updateOnlyAddress);

        Member updateMember = memberMybatisRepository.findById(insertMember.getMemberLoginID());
        assertThat(updateMember.getAddressCodeNo()).isEqualTo(updateAddressCode);
    }

    // PW만 바꾸는 경우, addressCode는 0
    @Test
    @Transactional
    public void updateMemberPWTest(){
        Member insertMember = new Member(0, "testCode", "Test1234", 1);
        memberMybatisRepository.insertMember(insertMember);

        String updatePW = "test0000";
        Member updateOnlyPW = new Member(0, "testCode", updatePW, 1);
        memberMybatisRepository.updateMember(updateOnlyPW);

        Member updateMember = memberMybatisRepository.findById(insertMember.getMemberLoginID());
        assertThat(updateMember.getMemberLoginPW()).isEqualTo(updatePW);
    }

    // addressCode, PW 모두 바꾸는 경우
    @Test
    @Transactional
    public void updateMemberTest(){
        Member insertMember = new Member(0, "testCode", "Test1234", 1);
        memberMybatisRepository.insertMember(insertMember);

        int updateAddressCode = 500;
        String updatePW = "test0000";
        Member updateAll = new Member(0, "testCode", updatePW, updateAddressCode);
        memberMybatisRepository.updateMember(updateAll);

        Member updateMember = memberMybatisRepository.findById(insertMember.getMemberLoginID());
        assertThat(updateMember.getAddressCodeNo()).isEqualTo(updateAddressCode);
        assertThat(updateMember.getMemberLoginPW()).isEqualTo(updatePW);
    }
}
