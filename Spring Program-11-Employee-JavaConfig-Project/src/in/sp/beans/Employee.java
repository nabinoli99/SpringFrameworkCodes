package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee
{
    private int employee_id;
    private String employee_name;

    @Autowired
    private Address address;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display()
    {
        System.out.println("Employee Details:- ");
        System.out.println("Id: "+employee_id);
        System.out.println("Name: "+employee_name);
        System.out.println("Address : "+address);
    }
}
