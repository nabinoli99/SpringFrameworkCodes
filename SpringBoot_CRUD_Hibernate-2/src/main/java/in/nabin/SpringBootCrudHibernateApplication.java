package in.nabin;

import in.nabin.entities.User;
import in.nabin.repository.DbOperations;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootCrudHibernateApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootCrudHibernateApplication.class, args);
        DbOperations dbOperations = context.getBean(DbOperations.class);
        User user = dbOperations.getUserDetails(1L);

        if(user!=null)
        {
            System.out.println("User Details:- ");
            System.out.println(user.getName());
            System.out.println(user.getEmail());
            System.out.println(user.getCity());
        }
        else
        {
            System.out.println("User not found ");
        }
    }

}
