package dev.tgarde.webflux.controller;

import dev.tgarde.webflux.pojo.UserResponse;
import dev.tgarde.webflux.pojo.UserSaveRequest;
import dev.tgarde.webflux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static dev.tgarde.webflux.utils.Constants.*;


@RestController
@RequestMapping(USER_API_V1+SLASH+USERS)
public class UserController {
  @Autowired
  private UserService userService;

  @GetMapping
  public Flux<UserResponse> getValue(){
    return userService.getAllUsers();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Mono<UserSaveRequest> add(@RequestBody UserSaveRequest userSaveRequest) {
    return userService.saveUser(userSaveRequest);
  }

}
