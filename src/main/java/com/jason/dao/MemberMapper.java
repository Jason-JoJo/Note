package com.jason.dao;

import com.jason.entity.Member;
import java.util.List;

public interface MemberMapper {
    int deleteByPrimaryKey(Long memberId);

    int insert(Member record);

    Member selectByPrimaryKey(Long memberId);
    
    Member selectByNaturalKey(String memberAccount); // <-- 新增此方法

    List<Member> selectAll();

    int updateByPrimaryKey(Member record);
}