package com.geekster.Instagram.Service;

import com.geekster.Instagram.Model.InstagramComment;
import com.geekster.Instagram.Repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepo;

    public String addComment(InstagramComment comment) {
        InstagramComment rComment = commentRepo.save(comment);
        if(rComment == null)
        {
            return "Comment not saved...!";
        }
        else
        {
            return "Comment saved...!";
        }
    }
}
