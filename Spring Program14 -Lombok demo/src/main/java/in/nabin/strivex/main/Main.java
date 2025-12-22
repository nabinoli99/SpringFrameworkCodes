package in.nabin.strivex.main;

import in.nabin.strivex.beans.Student;
import in.nabin.strivex.resources.JavaConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main
{
    public static void main()
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);

        Student std = (Student) context.getBean(Student.class);
        std.display();

    }
}
