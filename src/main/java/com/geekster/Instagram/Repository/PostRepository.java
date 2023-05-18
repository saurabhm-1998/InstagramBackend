package com.geekster.Instagram.Repository;

import com.geekster.Instagram.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
