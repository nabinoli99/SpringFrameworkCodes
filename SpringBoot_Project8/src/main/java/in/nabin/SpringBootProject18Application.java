package in.nabin;

import in.nabin.dao.UserDAO;
import in.nabin.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringBootProject18Application implements CommandLineRunner
{

    @Autowired
    private UserDAO userDAO;

    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootProject18Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {

//        <------------------INSERTION PART---------------->
//        User user1 = new User();
//        user1.setName("Nabin");
//        user1.setEmail("enimnabin@gmail.com");
//        user1.setGender("Male");
//        user1.setCity("Kathmandu");
//
//
//        User user2 = new User();
//        user2.setName("Nabkiran");
//        user2.setEmail("nabkiran12@gmail.com");
//        user2.setGender("Male");
//        user2.setCity("Rolpa");
//        boolean status = userDAO.insertUser(user1);
//
//        if(status)
//        {
//            System.out.println("User Inserted successfullly");
//        }
//        else
//        {
//            System.out.println("User not inserted due to some error ");
//        }


//        ------------------UPDATION 1-------------------
//        User user3 = new User();
//        user3.setName("Nabkiran");
//        user3.setEmail("nabkiran12@gmail.com");
//        user3.setGender("Male");
//        user3.setCity("Tulsipur");
//       boolean status = userDAO.UpdateUser(user3);
//
//       if(status)
//       {
//           System.out.println("Updation Successfull");
//       }
//       else
//       {
//           System.out.println("Updation Unsuccessful due to some eror ");
//       }
//    }
//        UPDATION 2

        User user = userDAO.getUserByEmail("puja.bhattarai56@gmail.com");
        user.setCity("Surkhet");

        boolean status = userDAO.UpdateUser(user);

        if(status)
        {
            System.out.println("Updation success ");
        }
        else
        {
            System.out.println("Updation failed ");
        }

//        ------------DELETION PORTION

//        boolean status = userDAO.DeleteUserByEmail("sneha.gurung77@gmail.com");
//        if(status)
//        {
//            System.out.println("Deletion Success");
//        }
//        else
//        {
//            System.out.println("Deletion Unsuccess");
//        }
//
//    }


//SELECT USER
//        User user = userDAO.getUserByEmail("enimnabin@gmail.com");
//        if (user != null) {
//            System.out.println("Name: " + user.getName());
//            System.out.println("Email: " + user.getEmail());
//            System.out.println("Gender: " + user.getGender());
//            System.out.println("City: " + user.getCity());
//        } else {
//            System.out.println("User not found!");
//        }



//        SELECT ALL USERS
//        List<User> list = userDAO.getAllUsers();
//        for(User user : list)
//        {
//            if (user != null) {
//            System.out.println("Name: " + user.getName());
//            System.out.println("Email: " + user.getEmail());
//            System.out.println("Gender: " + user.getGender());
//            System.out.println("City: " + user.getCity());
//            System.out.println("--------------------");
//        } else {
//            System.out.println("User not found!");
//        }
//        }
    }
}