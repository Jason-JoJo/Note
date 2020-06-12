package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.jason.dao.MemberMapper;
import com.jason.entity.Member;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { MoneyNoteApplication.class })
@Transactional
public class MemberMapperTest {
	@Autowired
    private MemberMapper mapper;

    @Test
    @Rollback
    public void testInsert() {
        Member member = new Member();
        member.setMemberAccount("john@abc.com");
        member.setMemberName("John");
        member.setMemberPassword("12345");
        member.setMemberStatus("1");

        mapper.insert(member); // 新增member
        Member result = mapper.selectByNaturalKey(member.getMemberAccount()); // 查詢member
        Assert.assertEquals(result.getMemberAccount(), member.getMemberAccount()); // 斷言相同
    }

}
