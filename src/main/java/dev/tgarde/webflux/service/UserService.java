package dev.tgarde.webflux.service;

import dev.tgarde.webflux.model.UserResponse;
import reactor.core.publisher.Flux;

public interface UserService {

  Flux<UserResponse> getAllUsers();
}
