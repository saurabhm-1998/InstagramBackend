package com.geekster.Instagram.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InstagramFollowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long followingTableId;

    @OneToOne
    private User user;

    @OneToOne
    private User following;
}
