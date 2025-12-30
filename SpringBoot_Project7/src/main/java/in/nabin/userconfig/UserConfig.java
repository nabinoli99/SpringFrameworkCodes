package in.nabin.userconfig;

import in.nabin.beans.Address;
import in.nabin.beans.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig
{
    @Bean
    public CommandLineRunner commandLineRunner()
    {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception
            {
                user1().display();
                System.out.println("-----------------------------------------------");
                user2().display();

            }
        };
    }
    public Address adr1()
    {
        Address adr = new Address();
        adr.setHouseno(256);
        adr.setCity("Kathmandu");
        adr.setPincode(44600);
        return adr;
    }
    public User user1()
    {
       User usr = new User();
       usr.setUserid(9564);
       usr.setUsername("@nabinstrivex");
       usr.setPassword("nbo@99");
       usr.setAddress(adr1());
       return usr;
    }
    public Address adr2()
    {
        Address adr = new Address();
        adr.setHouseno(687);
        adr.setCity("Rolpa");
        adr.setPincode(22100);
        return adr;
    }
    public User user2()
    {
        User usr = new User();
        usr.setUserid(956);
        usr.setUsername("@nabkiranstriver");
        usr.setPassword("nbko@99");
        usr.setAddress(adr2());
        return usr;
    }
}
