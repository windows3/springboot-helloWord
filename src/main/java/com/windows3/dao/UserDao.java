package com.windows3.dao;

import com.windows3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 3 on 2018/11/6.
 */
@Repository
public interface UserDao  extends JpaRepository<User, Integer> {
}
