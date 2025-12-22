package in.nabin.strivex.beans;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student
{
    private int rollno;
    private String name;
    private Address address;

    public void display()
    {
        System.out.println("Rolno: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("Address "+address);
        System.out.println("------------------------");
    }

}
