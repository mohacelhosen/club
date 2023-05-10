package com.mohacel.club.controller;

import com.mohacel.club.entity.MemberEntity;
import com.mohacel.club.service.impl.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberRestController {
    @Autowired
    private MemberServiceImpl service;
    @GetMapping("/members")
    public ResponseEntity<List<MemberEntity>> getAllMembers(){
        List<MemberEntity> allMembers = service.getAllMembers();
        return new ResponseEntity<>(allMembers, HttpStatus.OK);
    }

    @PostMapping("/member")
    public ResponseEntity<String> saveMember(@RequestBody MemberEntity member){
        String saveMsg = service.upsert(member);
        return  new ResponseEntity<>(saveMsg, HttpStatus.CREATED);
    }

    @PutMapping("/member")
    public ResponseEntity<String> updateMember(@RequestBody MemberEntity member){
        String updateMsg = service.upsert(member);
        return  new ResponseEntity<>(updateMsg, HttpStatus.OK);
    }

    @DeleteMapping("/member/{id}")
    public ResponseEntity<String> deleteMember(@PathVariable Integer id){
        String deleteMsg = service.delete(id);
        return  new ResponseEntity<>(deleteMsg, HttpStatus.OK);
    }
}
