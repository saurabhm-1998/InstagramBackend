package com.geekster.Instagram.Repository;

import com.geekster.Instagram.Model.InstagramFollower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowerRepository extends JpaRepository<InstagramFollower, Long> {
}
