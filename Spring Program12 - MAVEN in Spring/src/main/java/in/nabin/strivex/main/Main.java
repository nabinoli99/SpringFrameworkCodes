package in.nabin.strivex.main;

import in.nabin.strivex.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    static void main()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/in/nabin/strivex/resources/applicationContext.xml");
        Student std = (Student) context.getBean("stdId");
        std.display();

    }
}
