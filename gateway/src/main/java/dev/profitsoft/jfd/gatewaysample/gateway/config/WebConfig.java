package dev.profitsoft.jfd.gatewaysample.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.server.session.WebSessionManager;
import reactor.core.publisher.Mono;

@Configuration
public class WebConfig {

  @Bean
  public WebSessionManager webSessionManager() {
    // Emulate SessionCreationPolicy.STATELESS
    return exchange -> Mono.empty();
  }
}
