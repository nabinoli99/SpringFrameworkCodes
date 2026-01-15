package in.nabin;

import in.nabin.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCrudHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCrudHibernateApplication.class, args);

        Configuration configuration = new Configuration();
        configuration.configure("Hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();

        try {
            User user = session.get(User.class, 1L);
            if(user!=null)
            {
                System.out.println("User Details:-");
                System.out.println(user.getName());
                System.out.println(user.getEmail());
            }
            else
            {
                System.out.println("User not found");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
