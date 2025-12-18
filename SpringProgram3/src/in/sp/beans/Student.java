package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student
{
    @Value("Nabin")
    private String name;
    @Value("909")
    private int rollno;
    @Value("90.23")
    private float marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+rollno);
        System.out.println("Marks: "+marks);
    }
}
