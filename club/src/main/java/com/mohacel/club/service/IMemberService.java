package com.mohacel.club.service;

import com.mohacel.club.entity.MemberEntity;

import java.util.List;

public interface IMemberService {
    public String upsert(MemberEntity member);
    public List<MemberEntity> getAllMembers();
    public String delete(Integer id);
}
