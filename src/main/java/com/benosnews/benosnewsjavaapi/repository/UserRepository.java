package com.benosnews.benosnewsjavaapi.repository;

import com.benosnews.benosnewsjavaapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByEmail(String email) throws Exception;
}
