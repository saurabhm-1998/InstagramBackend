package com.geekster.Instagram.Repository;

import com.geekster.Instagram.Model.InstagramFollower;
import com.geekster.Instagram.Model.InstagramFollowing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowingRepository extends JpaRepository<InstagramFollowing, Long> {
}
