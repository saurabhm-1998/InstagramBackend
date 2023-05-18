package com.geekster.Instagram.Repository;

import com.geekster.Instagram.Model.InstagramComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<InstagramComment, Long> {
}
