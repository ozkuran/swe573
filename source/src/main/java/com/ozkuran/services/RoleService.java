package com.ozkuran.services;

import com.ozkuran.model.Role;

/**
 * Created by MahmutAli on 5/22/2016.
 */
public interface RoleService {

    Iterable<Role> listAllRoles();

    Role getRoleById(Integer id);

    Role saveRole(Role role);

    void deleteRole(Integer id);
}
