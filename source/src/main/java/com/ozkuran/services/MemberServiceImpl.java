package com.ozkuran.services;

import com.ozkuran.repositories.MemberRepository;
import com.ozkuran.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MahmutAli on 5/22/2016.
 */

@Service
public class MemberServiceImpl implements MemberService{
    private MemberRepository memberRepository;

    @Autowired
    public void setMemberRepository(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Iterable<Member> listAllMembers() {
        return memberRepository.findAll();
    }

    @Override
    public Member getMemberById(Integer id) {
        return memberRepository.findOne(id);
    }

    @Override
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public void deleteMember(Integer id) {
        memberRepository.delete(id);
    }
}
