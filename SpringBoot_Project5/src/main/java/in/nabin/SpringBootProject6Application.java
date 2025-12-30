package in.nabin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootProject6Application implements CommandLineRunner
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootProject6Application.class, args);
//        Hard Coding
//        ApplicationContext context = SpringApplication.run(SpringBootProject6Application.class, args);
//        MyClass myClass = (MyClass) context.getBean(MyClass.class);
//        myClass.printMessageS("Nabin");
    }

    @Override
    public void run(String... args) throws Exception
    {
        myClass().printMessageS("Nabkiran");
    }
    @Bean
    public MyClass myClass()
    {
        return new MyClass();
    }
}

