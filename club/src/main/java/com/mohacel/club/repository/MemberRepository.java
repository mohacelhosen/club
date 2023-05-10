package com.mohacel.club.repository;

import com.mohacel.club.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface MemberRepository extends JpaRepository<MemberEntity, Serializable> {
}
