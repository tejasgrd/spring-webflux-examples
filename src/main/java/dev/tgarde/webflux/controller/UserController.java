package dev.tgarde.webflux.controller;

import dev.tgarde.webflux.model.UserResponse;
import dev.tgarde.webflux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

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
}
