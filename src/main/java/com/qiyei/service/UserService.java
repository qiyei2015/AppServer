package com.qiyei.service;



import com.qiyei.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by qiyei2015 on 2016/12/30.
 */
public interface UserService extends JpaRepository<User,Long> {

    User findById(Long id);

}
