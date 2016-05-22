package com.ozkuran.repositories;

import com.ozkuran.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by MahmutAli on 5/22/2016.
 */

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
