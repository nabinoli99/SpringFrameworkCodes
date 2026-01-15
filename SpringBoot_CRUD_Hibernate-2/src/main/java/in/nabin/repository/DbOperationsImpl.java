package in.nabin.repository;
import in.nabin.config.HibernateConfig;
import in.nabin.entities.User;
import in.nabin.repository.DbOperations;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class DbOperationsImpl implements DbOperations
{
    @Override
    public User getUserDetails(Long id)
    {
        User user = null;

        try(Session session = HibernateConfig.getSessionFactory().openSession())
        {
            user = session.get(User.class,id);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return user;
    }
}
