package dev.tgarde.webflux.configuration;

import dev.miku.r2dbc.mysql.MySqlConnectionConfiguration;
import dev.miku.r2dbc.mysql.MySqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

@org.springframework.context.annotation.Configuration
@ComponentScan("dev.tgarde.webflux")
@EnableWebFlux
@EnableR2dbcRepositories
public class DataBaseConfiguration extends AbstractR2dbcConfiguration {

  @Bean
  public ConnectionFactory connectionFactory() {
    return MySqlConnectionFactory.from(MySqlConnectionConfiguration.builder()
        .host("localhost")
        .port(3306)
        .username("root")
        .password("")
        .database("ExampleDB")
        .build());
  }
}
