package com.geekster.Instagram.Service;

import com.geekster.Instagram.Model.InstagramFollowing;
import com.geekster.Instagram.Model.User;
import com.geekster.Instagram.Repository.FollowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowingService {

    @Autowired
    FollowingRepository followingRepo;

    public void saveFollowing(User myUser, User otherUser) {
        InstagramFollowing followingRecord = new InstagramFollowing(null,myUser,otherUser);
        followingRepo.save(followingRecord);
    }
}
