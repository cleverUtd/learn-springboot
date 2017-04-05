package com.zclau.dao;

import com.zclau.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by liuzicong on 5/4/2017.
 */
@Mapper
public interface UserMapper {

    void insertUser(User user);
    User findUserById(Integer id);
    User findByName(String name);
    List<User> findAllUsers();
}
