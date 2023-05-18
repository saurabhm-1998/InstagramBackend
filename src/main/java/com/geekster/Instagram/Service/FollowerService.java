package com.geekster.Instagram.Service;

import com.geekster.Instagram.Model.InstagramFollower;
import com.geekster.Instagram.Model.User;
import com.geekster.Instagram.Repository.FollowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowerService {

    @Autowired
    FollowerRepository followerRepo;

    public void saveFollower(User myUser, User otherUser) {


        InstagramFollower follower = new InstagramFollower(null,myUser,otherUser);

        followerRepo.save(follower);
    }
}
