package com.ozkuran.repositories;

import com.ozkuran.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by MahmutAli on 5/22/2016.
 */

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer>{

}
