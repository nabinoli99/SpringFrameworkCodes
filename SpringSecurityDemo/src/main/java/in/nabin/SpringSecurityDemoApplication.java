package in.nabin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// (scanBasePackages = {"in.nabin.controller", "in.nabin"})
public class SpringSecurityDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityDemoApplication.class, args);
    }
}
