package in.sp.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("in.sp.beans")
@ComponentScan(basePackages = {"in.sp.beans"})
public class SpringConfigFile

{

}
