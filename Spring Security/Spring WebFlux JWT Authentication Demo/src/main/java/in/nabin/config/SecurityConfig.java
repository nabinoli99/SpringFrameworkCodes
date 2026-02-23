package in.nabin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.jwt.NimbusReactiveJwtDecoder;
import org.springframework.security.oauth2.jwt.ReactiveJwtDecoder;
import org.springframework.security.web.server.SecurityWebFilterChain;

import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

@Configuration
public class SecurityConfig {

    private static final String SECRET = "my-super-secret-key-which-should-be-long";

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        return http
                .csrf(ServerHttpSecurity.CsrfSpec::disable)
                .authorizeExchange(exchange -> exchange
                        .pathMatchers("/auth/**", "/public/**").permitAll() // CRITICAL: Allow auth routes
                        .anyExchange().authenticated()
                )
                .oauth2ResourceServer(oauth ->
                        oauth.jwt(jwt -> jwt.jwtDecoder(jwtDecoder()))
                )
                .build();
    }
    @Bean
    public ReactiveJwtDecoder jwtDecoder() {

        SecretKeySpec key = new SecretKeySpec(
                SECRET.getBytes(StandardCharsets.UTF_8),
                "HmacSHA256"
        );

        return NimbusReactiveJwtDecoder.withSecretKey(key).build();
    }
}