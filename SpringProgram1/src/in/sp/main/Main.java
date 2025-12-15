package in.sp.main;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.sp.beans.Student;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Your bean usage here
        Student std1 = (Student) context.getBean("stdId1");
        std1.display();
        Student std2 = (Student) context.getBean("stdId2");
        std2.display();
//        System.out.println("Roll No: " + std.getRollno());
//        System.out.println("Name: " + std.getName());
    }
}

//1. spring-beans-xxx.jar
//2. spring-core-xxx.jar
//3.spring-contest-xxx.jar
//4. spring