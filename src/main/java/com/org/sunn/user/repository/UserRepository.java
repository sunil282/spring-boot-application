package com.org.sunn.user.repository;

import com.org.sunn.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {


    User getUserByUserId(Long userId);
}
