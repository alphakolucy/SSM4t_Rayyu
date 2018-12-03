package com.rayyu.ssm4t.mapper;


import com.rayyu.ssm4t.domain.Member;
import org.apache.ibatis.annotations.Select;

public interface IMemberMapper {

    @Select("select * from member where id=#{id}")
    public Member findById(String id) throws Exception;
}
