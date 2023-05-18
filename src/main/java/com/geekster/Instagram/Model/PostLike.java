package com.geekster.Instagram.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostLike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long likeId;


    @ManyToOne
    @JoinColumn(nullable = false , name = "fk_post_ID")
    private Post post;

    @ManyToOne
    @JoinColumn(nullable = false , name = "fk_user_ID")
    private User user;
}
