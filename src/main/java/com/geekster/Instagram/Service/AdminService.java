package com.geekster.Instagram.Service;

import com.geekster.Instagram.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    UserService userService;

    @Autowired
    private AdminRepository adminRepo;

    public String toggleBlueTick(Long id, boolean blueTick) {
        return userService.toggleBlueTick(id,blueTick);

    }
}
