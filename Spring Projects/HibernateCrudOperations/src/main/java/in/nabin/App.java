package in.nabin;

import in.nabin.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main (String[] args)
    {
//
//        User user1 = new User();
//        user1.setId(1);
//        user1.setName("Nabin");
//        user1.setEmail("nabin12@gmail.com");
//        user1.setPassword("nabin12");
//        user1.setGender("Male");
//        user1.setCity("Kathmandu");



//        User user2 = new User();
//        user2.setId(2);
//        user2.setName("Nabkiran");
//        user2.setEmail("nabkiarn45@gmail.com");
//        user2.setPassword("nabkiran34");
//        user2.setGender("Male");
//        user2.setCity("Rolpa");
//
//        User user3 = new User();
//        user3.setId(3);
//        user3.setName("Sushmita");
//        user3.setEmail("sushmita78@gmail.com");
//        user3.setPassword("sush1234");
//        user3.setGender("Female");
//        user3.setCity("Kathmandu");

//        User user5 = new User();
//        user5.setId(5);
//        user5.setName("Rohan Thapa");
//        user5.setEmail("rohan.thapa@gmail.com");
//        user5.setPassword("rohan987");
//        user5.setGender("Male");
//        user5.setCity("Pokhara");

        Configuration config = new Configuration();
        config.configure("Hibernate.cfg.xml");

        SessionFactory sessionFactory = config.buildSessionFactory();  //crete and manages session objects  , heavy weight
        Session session = sessionFactory.openSession();      //provides CRUD Method Operattions
        Transaction transaction = session.beginTransaction();  //conrol th boundaries of a database transsasction ,

        // it is used to begine commit or roll back changes to ensure data integrity
//   Insert Operation
//        try {
//            session.save(user3);
//            transaction.commit();
//            System.out.println("USER DETAILS ADDED SUCCESSFULLY");
//        }
//        catch (Exception e)
//        {
//            transaction.rollback();
//            e.printStackTrace();
//            System.out.println("USER DETAILS NOT ADDED DUE TO SOME ERROR! ");
//        }
        //store permanently the object into the database

        //SELECT OPERATION------------------------------- OR GET OPERATION
//        try
//        {
//
//            User user = session.get(User.class,2L);
//            if(user!=null) {
//                System.out.println("--------------------------------");
//                System.out.println("User Details:-");
//                System.out.println("Id: " + user.getId());
//                System.out.println("Name: " + user.getName());
//                System.out.println("Email: " + user.getEmail());
//                System.out.println("Password: " + user.getPassword());
//                System.out.println("Gender: " + user.getGender());
//                System.out.println("City: " + user.getCity());
//                System.out.println("--------------------------------");
//            }
//            else
//            {
//                System.out.println("USER NOT FOUND !");
//            }
//
//        }
//        catch(NullPointerException e)
//        {
//            System.out.println("Error: "+e.getMessage());
//        }
//        catch (Exception e)
//        {
//
//            e.printStackTrace();
//        }
//TRANSACTION ONLY FOR INSERTING VALUE NOT FOR GET



//        -----UPDATE OPERATION-------
//        try
//        {
//           User user = session.get(User.class,2L);
//           user.setName("Sushmita");
//           user.setEmail("sushmita78@gmail.com");
//           user.setPassword("sushmita24");
//           user.setGender("Female");
//           user.setCity("Pokhara");
//            session.saveOrUpdate(user);
//            transaction.commit();
//            System.out.println("USER DETAILS ADDED SUCCESSFULLY");
//       }
//        catch (Exception e)
//       {
//            transaction.rollback();
//            e.printStackTrace();
//            System.out.println("USER DETAILS NOT ADDED DUE TO SOME ERROR! ");
//       }
//
//    }



//         -----DELETE OPERATION-------
    try
    {
        User user = new User();
        user.setId(3l);

        session.delete(user);
        transaction.commit();
        System.out.println("USER DETAILS DELETED SUCCESSFULLY");
    }
        catch (Exception e)
    {
        transaction.rollback();
        e.printStackTrace();
        System.out.println("USER DETAILS NOT DELETED DUE TO SOME ERROR! ");
    }

}
}