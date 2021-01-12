package com.datayes.dao;

import com.datayes.domain.User;

import java.util.List;

/**
 * 用户的持久层接口
 */
public interface UserDao {
    /**
     * 查询所有操作
     */
    List<User> findAll();

    String findName();
}
