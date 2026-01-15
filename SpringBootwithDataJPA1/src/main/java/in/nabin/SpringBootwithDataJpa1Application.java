package in.nabin;

import in.nabin.entities.Student;
import in.nabin.service.StudentService;
import in.nabin.service.StudentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootwithDataJpa1Application {

    public static void main(String[] args)
    {
       ApplicationContext context = SpringApplication.run(SpringBootwithDataJpa1Application.class, args);
       StudentService studentService = context.getBean(StudentServiceImpl.class);

//       Insert operation
//       Student std = new Student();
//       std.setName("Nabkiran");
//       std.setRollno(22);
//       std.setMarks(96.3f);
//
//       boolean status = studentService.addStudentDetails(std);
//
//       if(status)
//       {
//           System.out.println("Student Inserted Successfully ");
//       }
//       else
//       {
//           System.out.println("Student not inserted due to same error ");
//       }



//        Select Operation
//        List<Student> studentList = studentService.getAllStdDetails();
//        for(Student std : studentList)
//        {
//            System.out.println("------------------------------");
//            System.out.println("Student Details:- ");
//            System.out.println("Id:"+std.getId());
//            System.out.println("Name: "+std.getName());
//            System.out.println("Rollno: "+std.getRollno());
//            System.out.println("Marks: "+std.getMarks());
//            System.out.println("------------------------------");
//        }

//        select by specific id

//        Student std = studentService.getStdDetails(2L);
//        if(std!=null) {
//            System.out.println("------------------------------");
//            System.out.println("Student Details:- ");
//            System.out.println("Id:" + std.getId());
//            System.out.println("Name: " + std.getName());
//            System.out.println("Rollno: " + std.getRollno());
//            System.out.println("Marks: " + std.getMarks());
//            System.out.println("------------------------------");
//        }
//        else
//        {
//            System.out.println("Student not found ");
//        }


        //-----------------Update operation

//        boolean status = studentService.UpdateStdDetails(1L,98.6f);
//        if(status)
//        {
//            System.out.println("Student updated successfully");
//        }
//        else
//        {
//            System.out.println("User not updated sucessfully");
//        }

        //-----------------Delete operation
        boolean status = studentService.DeleteStddetails(1L);
        if(status)
        {
            System.out.println("Student deleted successfully");
        }
        else
        {
            System.out.println("Student not deleted due to some error!");
        }
    }

}
