package in.nabin.beans;

public class Student
{
    private int rollno;
    private String name;
    private float marks;


    public Student(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        System.out.println("Rollno: "+rollno);
        System.out.println("Marks: "+marks);
    }
}
