package com.ozkuran.services;

import com.ozkuran.model.Member;

/**
 * Created by MahmutAli on 5/22/2016.
 */
public interface MemberService {
    Iterable<Member> listAllMembers();

    Member getMemberById(Integer id);

    Member saveMember(Member member);

    void deleteMember(Integer id);
}
