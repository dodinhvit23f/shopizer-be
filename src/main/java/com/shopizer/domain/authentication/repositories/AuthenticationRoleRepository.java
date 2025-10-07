package com.shopizer.domain.authentication.repositories;

import com.shopizer.entities.Role;
import java.math.BigInteger;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthenticationRoleRepository extends JpaRepository<Role, BigInteger> {

    Optional<Role> findByName(String roleName);
}
