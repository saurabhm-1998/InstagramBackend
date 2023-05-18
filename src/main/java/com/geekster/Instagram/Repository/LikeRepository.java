package com.geekster.Instagram.Repository;

import com.geekster.Instagram.Model.PostLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<PostLike, Long> {
}
