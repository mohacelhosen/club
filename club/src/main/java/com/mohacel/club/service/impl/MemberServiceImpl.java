package com.mohacel.club.service.impl;

import com.mohacel.club.entity.MemberEntity;
import com.mohacel.club.repository.MemberRepository;
import com.mohacel.club.service.IMemberService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements IMemberService {
    private MemberRepository repository;

    public MemberServiceImpl(MemberRepository repository) {
        this.repository = repository;
    }

    @Override
    public String upsert(MemberEntity member) {
        Integer id = member.getId();
        if(id==null){
            repository.save(member);
            return "Inserted Successfully...✅";
        }else{
            repository.save(member);
            return "Updated Successfully...✅";
        }
    }

    @Override
    public List<MemberEntity> getAllMembers() {
        return repository.findAll();
    }

    @Override
    public String delete(Integer id) {
        Optional<MemberEntity> member = repository.findById(id);
        if (member.isEmpty()){
            return "Invalid Id";
        }else {
            repository.deleteById(id);
            return "Deleted Successfully...⚰️";
        }
    }
}
