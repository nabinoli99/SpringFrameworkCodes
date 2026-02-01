package in.nabin.configuringsecurity.controllers;

import in.nabin.configuringsecurity.entities.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping("/home")
public class AppController
{
//    @GetMapping("")
//    public ResponseEntity<String> welcome() {
//        return ResponseEntity.ok("Welcome to the Home Page!");
//    }
    private List<Employee> list = new ArrayList<>
            (List.of(
            new Employee(101,"Nabin",18)
    ));
//    @GetMapping("/normal")
//    public ResponseEntity<String> normalUser() {
//        return ResponseEntity.ok("Yes, I am normal user");
//    }
//
//    @GetMapping("/admin")
//    public ResponseEntity<String> adminUser() {
//        return ResponseEntity.ok("Yes, I am admin user");
//    }

     @GetMapping("/employee")
    public List<Employee> getEmployee() {
        return list;
    }

//    @GetMapping("/public")
//    public ResponseEntity<String> publicUser() {
//        return ResponseEntity.ok("Yes, I am public user");
//    }

    @PostMapping("/add")
    public void add(@RequestBody Employee employee)
    {
        list.add(employee);
    }

    @GetMapping("/csrf")
    public CsrfToken session ()
}