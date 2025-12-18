import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
//        Student std = (Student) context.getBean("stdId1");
//        std.display();
//           Student std = (Student) context.getBean("StdObj");
//           std.display()
//           ;

        Student std1 = (Student) context.getBean("StdObj1");
        std1.display();
        System.out.println("--------------------------------------------");

        Student std2 = (Student) context.getBean("StdObj2");
        std2.display();

        }
}