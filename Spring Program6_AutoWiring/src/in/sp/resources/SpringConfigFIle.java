package in.sp.resources;

import in.sp.beans.Address;
import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFIle
{
    @Bean
    public Address createAddrObj()
    {
        Address addr = new Address();
        addr.setHouseno(236);
        addr.setCity("Rolpa");
        addr.setPincode(44600);
        return addr;
    }
    @Bean
    public Student createStdObj()
    {
        Student std = new Student();
        std.setName("Nabin Oli");
        std.setRollno(19);
        return std;
    }
}
