package in.nabin;

import org.springframework.stereotype.Component;

@Component
public class MyClass
{
    public void printMessageS(String name)
    {
        System.out.println("Hello "+name);
    }
}
