package in.sp.beans;

public class Student
{
    private String name;
    private int rollno;
    private Address address;

//    public void setName(String name)
//    {
//        System.out.println("FInley Simula67 <Demo Practice>");
//        this.name = name;
//    }
//
//    public void setRollno(int rollno) {
//        this.rollno = rollno;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }

    public Student(String name , int rollno, Address address)
    {
        this.name = name;
        this.rollno = rollno;
        this.address = address;
    }
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+rollno);
        System.out.println("Address: "+address);
    }
}
