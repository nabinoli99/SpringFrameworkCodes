package in.nabin.strivex.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFIle
{
    @Bean
    public DriverManagerDataSource myDatasource()
    {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_db");
        dataSource.setUsername("root");
        dataSource.setPassword("nabin904363");

        return dataSource;
    }

    @Bean
    public NamedParameterJdbcTemplate npJdbcTemplate()
    {
//      NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(myDatasource());
        return new NamedParameterJdbcTemplate(myDatasource());
    }
}
