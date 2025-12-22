package in.nabin.strivex.main;

import in.nabin.strivex.beans.Student;
import in.nabin.strivex.mappers.StudentRowMapper;
import in.nabin.strivex.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class App
{
    public static void main(String[] args)
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

//        INSERTION OPERATION
//        int std_rollno = 299;
//        String std_name = "Amrit";
//        float std_marks = 93.6f;

//        String insert_sql_query = "INSERT INTO student VALUES (? , ? ,? )";
//        int count = jdbcTemplate.update(insert_sql_query,std_rollno,std_name , std_marks);
//        if(count > 0)
//        {
//            System.out.println("Insertion success ");
//        }
//        else
//        {
//            System.out.println("Insertion failed ");
//        }

//        UPDATE OPERATION
//        float marks = 94.3f;
//        int rollno = 299;
//        String update_sql_query = "UPDATE student SET std_marks=?  WHERE std_roll=?";
//        int count =jdbcTemplate.update(update_sql_query,marks,rollno);
//        if(count>0)
//        {
//            System.out.println("Updation success");
//        }
//        else
//        {
//            System.out.println("Updatioon failed");
//        }


//        DELTE OPERATION//
//        int rollno = 299;
//
//        String delet_sql_query = "DELETE FROM student WHERE std_roll =?";
//        int count = jdbcTemplate.update(delet_sql_query,rollno);
//
//        if(count>0)
//        {
//            System.out.println("Deletion successful ");
//        }
//        else
//        {
//            System.out.println("Deletion failed ");
//        }


//        SELECT OPERATION
        String select_sql_query = "SELECT * FROM student";
        List<Student> std_list = jdbcTemplate.query(select_sql_query, new StudentRowMapper());
        for(Student std : std_list)
        {
            System.out.println("Roll no: "+std.getRollno());
            System.out.println("Name: "+std.getName());
            System.out.println("Marks: "+std.getMarks());
            System.out.println("-----------------------------");
        }

    }
}
