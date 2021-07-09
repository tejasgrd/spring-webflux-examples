package dev.tgarde.webflux.configuration;

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
    ConnectionFactory connectionFactory = ConnectionFactories.get(
        "r2dbcs:mysql://localhost:3306/ExampleDB?"+
            "zeroDate=use_round&"+
            "sslMode=disabled");

    return connectionFactory;
  }
}
