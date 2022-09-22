package com.zjrcu.dao;

import com.zjrcu.model.User;
import org.apache.ibatis.annotations.Insert;


public interface UserMapper {

  @Insert("insert into user(name,age) value (#{name,jdbcType=VARCHAR},#{age,jdbcType=INTEGER})")
  void addUser(User user);

}
