//package in.nabin.configuringsecurity.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    // 1. Define your Users (Replaces application.properties)
//    @Bean
//    public InMemoryUserDetailsManager userDetailsService() {
//        UserDetails admin = User.withDefaultPasswordEncoder()
//                .username("admin")
//                .password("admin")
//                .roles("ADMIN","USER")
//                .build();
//
//        UserDetails normalUser = User.withDefaultPasswordEncoder()
//                .username("user")
//                .password("user")
//                .roles("USER")
//                .build();
//
//        return new InMemoryUserDetailsManager(admin, normalUser);
//    }
//
//    // 2. Define the Security Rules
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//        return httpSecurity
//                .csrf(csrf -> csrf.disable()) // Disable CSRF for easy testing
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/home/public", "/home").permitAll()
//                        .requestMatchers("/home/admin").hasRole("ADMIN")
//                        .requestMatchers("/home/normal").hasRole("USER")
//                        .anyRequest().authenticated()
//                )
//                .formLogin(form -> form
//                        // 'false' ensures if you type /home/admin, it takes you there after login
//                        .defaultSuccessUrl("/home/public", false)
//                )
//                .logout(logout -> logout.logoutSuccessUrl("/home/public"))
//                .build();
//    }
//}