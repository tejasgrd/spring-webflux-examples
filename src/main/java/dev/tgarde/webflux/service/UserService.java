package dev.tgarde.webflux.service;

import dev.tgarde.webflux.model.User;
import dev.tgarde.webflux.model.UserResponse;
import reactor.core.publisher.Flux;

public interface UserService {

  Flux<UserResponse> getAllUsers();

  Flux<User> findUserByFirstName(String firstName);
}
