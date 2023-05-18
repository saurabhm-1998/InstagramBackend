package com.geekster.Instagram.Repository;

import com.geekster.Instagram.Model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<AuthenticationToken, Long> {
}
