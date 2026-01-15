package in.nabin.service;

import in.nabin.entities.Student;

import java.util.List;

public interface StudentService
{
    public boolean addStudentDetails(Student std);
    public List<Student>getAllStdDetails();
    public Student getStdDetails(long id);
    public boolean UpdateStdDetails(long id,float marks);
    public boolean DeleteStddetails(long id);
}
