package com.rojatech.socialapp.avatar.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rojatech.socialapp.avatar.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
