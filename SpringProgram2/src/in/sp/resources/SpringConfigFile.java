package in.sp.resources;

import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile
{
    @Bean("StdObj1")
    public Student createStdBeanObj1()
    {
        Student std = new Student();
        std.setName("Asmita");
        std.setRollno(8);
        std.setEmail("asmita23@gmail.com");

        return std;
    }
    @Bean("StdObj2")
    public Student createStdBeanObj()
    {
        Student std = new Student();
        std.setName("Nabin");
        std.setRollno(18);
        std.setEmail("nabin73@gmail.com");

        return std;
    }
}
