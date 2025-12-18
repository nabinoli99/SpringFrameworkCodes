package in.sp.resources;

import in.sp.beans.Address;
import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile
{
    @Bean
    public Address createAddrObj()
    {
        Address add = new Address();
        add.setHouseno(923);
        add.setCity("Rolpa");
        add.setPincode(44600);
        return add;
    }

    @Bean
    public Student createStdOBj()
    {
        Student std = new Student();
        std.setRollno(19);
        std.setName("Nabin Oli");
        std.setAddress(createAddrObj());
        return std;
    }
}
