package in.hisabkitab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .cors(Customizer.withDefaults())
                .csrf(csrf -> csrf.disable()) // Note: Enable this before going to production!

                // 1. CHANGE: Allow sessions so the browser remembers the login
                .sessionManagement(sess -> sess.sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED))

                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/", "/login", "/static/**", "/api/users/register").permitAll()
                        // 2. Ensure your dashboard path matches exactly what you use in the browser
                        .requestMatchers("/dashboard", "/dashboard.html").authenticated()
                        .anyRequest().authenticated()
                )

                // 3. ADD: This enables the standard login form
                .formLogin(form -> form
                        .defaultSuccessUrl("/dashboard", true)
                        .permitAll()
                )

                // Keep this if you also want to test via Postman/API tools
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }
}
