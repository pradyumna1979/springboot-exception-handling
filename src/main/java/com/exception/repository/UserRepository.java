package com.exception.repository;

import com.exception.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Integer> {
    User findAllByUserId(int userId);
}
