package com.rojatech.socialapp.avatar.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rojatech.socialapp.avatar.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
