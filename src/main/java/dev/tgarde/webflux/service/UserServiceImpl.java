package dev.tgarde.webflux.service;

import dev.tgarde.webflux.model.User;
import dev.tgarde.webflux.model.UserResponse;
import dev.tgarde.webflux.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public Flux<UserResponse> getAllUsers() {
    return Flux.fromIterable(generateUsers());
  }

  @Override
  public Flux<User> findUserByFirstName(String firstName) {
    return userRepository.findByFirstName(firstName);
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
