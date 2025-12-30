package in.nabin.config;

import in.nabin.beans.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    public CommandLineRunner commandLineRunner()
    {
        return new CommandLineRunner()
        {
            @Override
            public void run(String... args) throws Exception {
                student1().display();
                System.out.println("---------------");
                student2().display();
            }
        };
    }

    @Bean
    public Student student1()
    {
        return new Student(102,"Nabin",96);
    }
    @Bean
    public Student student2()
    {
        return new Student(101,"Nabkiran",92);
    }
}
