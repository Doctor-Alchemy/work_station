package com.zjrcu.service;

import com.zjrcu.model.User;


public interface UserService {

  void addUser(User user);

  void addUserException(User user) throws Exception;

  void addUserMandatory(User user);

  void addUserNested(User user);

  void addUserTransactionalRequired(User user) throws Exception;

  void addUserTransactionalRequiresNew(User user) throws Exception;

  void addUserSupports(User user);

  void addUserNotSupports(User user);

  void addUserNever(User user);
}
