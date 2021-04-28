package dev.tgarde.webflux.service;

import dev.tgarde.webflux.model.UserResponse;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
  @Override
  public Flux<UserResponse> getAllUsers() {
    return Flux.fromIterable(generateUsers());
  }

  private List<UserResponse> generateUsers() {
    return Arrays.asList(UserResponse.builder()
            .userId(1)
            .userName("User-1")
            .build(),
        UserResponse.builder()
            .userId(2)
            .userName("User-3")
            .build(),
        UserResponse.builder()
            .userId(3)
            .userName("User-3")
            .build(),
        UserResponse.builder()
            .userId(4)
            .userName("User-4")
            .build());
  }
}
