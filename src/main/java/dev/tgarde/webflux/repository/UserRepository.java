package dev.tgarde.webflux.repository;

import dev.tgarde.webflux.model.User;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface UserRepository extends ReactiveCrudRepository<User, Long> {

  @Query("SELECT * FROM user WHERE firstname = :firstname")
  Flux<User> findByFirstName(String firstname);
}
