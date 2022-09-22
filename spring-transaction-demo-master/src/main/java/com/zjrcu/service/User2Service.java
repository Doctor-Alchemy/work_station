package com.zjrcu.service;

import com.zjrcu.model.User;


public interface User2Service {

  void addUser(User user);

  void addUserException(User user) throws Exception;

  void addUserTransactionalRequiresNewException(User user) throws Exception;

  void addUserTransactionalException(User user) throws Exception;

  void addUserMandatory(User user);

  void addUserTransactionalSupportsException(User user);

  void addUserTransactionalNotSupportsException(User user);

  void addUserTransactionalNever(User user);

  void addUserTransactionalNested(User user);
}
