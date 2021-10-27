package dev.tgarde.webflux.service;

import dev.tgarde.webflux.model.User;
import dev.tgarde.webflux.pojo.UserResponse;
import dev.tgarde.webflux.pojo.UserSaveRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

  Flux<UserResponse> getAllUsers();

  Flux<User> findUserByFirstName(String firstName);

  Mono<UserSaveRequest> saveUser(UserSaveRequest userSaveRequest);

}
