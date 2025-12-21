package in.nabin.strivex.beans;

public class Student
{
    private String name;
    private int rollnoo;
    private float marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollnoo() {
        return rollnoo;
    }

    public void setRollnoo(int rollnoo) {
        this.rollnoo = rollnoo;
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
        System.out.println("Rollno:" +rollnoo);
        System.out.println("Marks: "+marks);
    }

}
