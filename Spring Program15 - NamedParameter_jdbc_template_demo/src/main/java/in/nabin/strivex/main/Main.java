package in.nabin.strivex.main;


import in.nabin.strivex.resources.SpringConfigFIle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.Map;

public class Main
{
    public  static void main()
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFIle.class);

        NamedParameterJdbcTemplate npJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("key_rollno",156);
        map.put("key_name","Nabkiran");
        map.put("key_marks",95.4f);

        String insert_sql_query = "INSERT INTO student VALUES(:key_rollno, :key_name , :key_marks)";
       int count =  npJdbcTemplate.update(insert_sql_query,map);

       if(count>0)
       {
           System.out.println("Insertion Successfull! ");
       }
       else
       {
           System.out.println("Insertion Failed ");
       }
    }
}
