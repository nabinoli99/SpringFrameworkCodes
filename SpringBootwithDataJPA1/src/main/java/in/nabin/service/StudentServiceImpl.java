package in.nabin.service;

import in.nabin.entities.Student;
import in.nabin.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService
{
    @Autowired
    private StudentRepository studentRepository;

//    Add method
    @Override
    public boolean addStudentDetails(Student std)
    {
        boolean status = false;
        try {
            studentRepository.save(std);
            status = true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            status = false;
        }
        return status;

    }

//   Select method
    @Override
    public List<Student> getAllStdDetails() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStdDetails(long id)
    {
        Optional<Student> optional = studentRepository.findById(id);
        if(optional.isPresent())
        {
            return optional.get();
        }
        else
        {
            return null;
        }
    }

//  Update Method
    @Override
    public boolean UpdateStdDetails(long id, float marks)
    {
        Student std = getStdDetails(id);
        if(std!=null)
        {
            std.setMarks(98);
            studentRepository.save(std);
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean DeleteStddetails(long id)
    {
        boolean status = false;
     try
     {
         studentRepository.deleteById(id);
         status = true;
     } catch (Exception e)
     {
         e.printStackTrace();
         status = false;
     }
     return status;
    }
}
