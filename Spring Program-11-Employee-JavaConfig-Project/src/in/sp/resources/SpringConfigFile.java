package in.sp.resources;

import in.sp.beans.Address;
import in.sp.beans.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile
{
    @Bean
    public Address createAddr()
    {
        Address adr = new Address();
        adr.setHouseno(256);
        adr.setCity("Kathmandu");
        adr.setPincode(44600);
        return adr;
    }
    @Bean
    public Employee createStd()
    {
        Employee emp = new Employee();
        emp.setEmployee_id(2789);
        emp.setEmployee_name("Nabin Oli");
        emp.setAddress(createAddr());
        return emp;
    }
}
