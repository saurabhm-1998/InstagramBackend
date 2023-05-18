package com.geekster.Instagram.Service;

import com.geekster.Instagram.Model.Post;
import com.geekster.Instagram.Model.User;
import com.geekster.Instagram.Repository.PostRepository;
import com.geekster.Instagram.Repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository postRepo;

    @Autowired
    LikeService likeService;

    @Autowired
    TokenRepository tokenRepo;
    public void addPost(Post post) {
        postRepo.save(post);
    }

    public List<Post> getAllPosts(String token) {
        User user = tokenRepo.findFirstByToken(token).getUser();


        List<Post> postList = postRepo.findByUser(user);

        return postList;


    }

    public long getLikes(Long postId) {

        return likeService.getLikes(postId);
    }
}
