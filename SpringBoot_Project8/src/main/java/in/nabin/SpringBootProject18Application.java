package in.nabin;

import in.nabin.dao.UserDAO;
import in.nabin.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProject18Application implements CommandLineRunner {

    @Autowired
    private UserDAO userDAO;
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProject18Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {



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



//        ------------------UPDATION-------------------
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
//    }  User user3 = new User();
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


//        ------------DELETION PORTION

        boolean status = userDAO.DeleteUserByEmail("sneha.gurung77@gmail.com");
        if(status)
        {
            System.out.println("Deletion Success");
        }
        else
        {
            System.out.println("Deletion Unsuccess");
        }

    }
}
