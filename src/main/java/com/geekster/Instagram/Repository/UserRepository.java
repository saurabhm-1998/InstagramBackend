package com.geekster.Instagram.Repository;

import com.geekster.Instagram.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
