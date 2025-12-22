package in.nabin.strivex.resources;

import in.nabin.strivex.beans.Address;
import in.nabin.strivex.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigFile
{

    @Bean
    public Address AddrObjId()
    {
        Address adr = new Address();
        adr.setHouseno(956);
        adr.setCity("kathmandu");
        adr.setPincode(44600);
        return adr;
    }
    @Bean
    public Student StdObjId()
    {
        Student std = new Student();
        std.setRollno(19);
        std.setName("Nabin Oli");
        std.setAddress(AddrObjId());
        return std;
    }
}
