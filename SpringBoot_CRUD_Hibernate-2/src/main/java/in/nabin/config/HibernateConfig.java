package in.nabin.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig
{
    public static SessionFactory getSessionFactory()
    {
        Configuration configuration = new Configuration();
        configuration.configure(" makHibernate.cfg.xml");
        return configuration.buildSessionFactory();
    }
}
