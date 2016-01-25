package com.jvosantos.examples.services;

import com.jvosantos.examples.domain.User;

public interface UserService {
  User findByEmail(String email);
}
