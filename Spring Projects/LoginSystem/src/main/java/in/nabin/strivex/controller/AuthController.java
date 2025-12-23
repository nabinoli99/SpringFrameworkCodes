package in.nabin.strivex.controller;

import in.nabin.strivex.model.User;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Controller
public class AuthController {

    // Database Configuration
    private final String DB_URL = "jdbc:mysql://localhost:3306/mvc_db";
    private final String DB_USER = "root";
    private final String DB_PASS = "nabin904363"; // CHANGE THIS to your MySQL password

    private Connection getConnection() throws Exception
    {
        // Ensure you have the MySQL Connector dependency in pom.xml
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register"; // Looks for src/main/resources/templates/register.html
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user)
    {
        // Now you can just use user.getName(), user.getEmail(), etc.
        // Spring Boot automatically maps the HTML input fields to this bean!
        try (Connection con = getConnection())
        {
            PreparedStatement ps = con.prepareStatement("INSERT INTO register VALUES(?,?,?,?)");
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getCity());
            ps.executeUpdate();
            return "redirect:/login";
        } catch (Exception e)
        {
            return "register";
        }
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
        // Looks for src/main/resources/templates/login.html
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String email,
                            @RequestParam String password,
                            Model model)
    {
        try (Connection con = getConnection())
        {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM register WHERE email=? AND password=?");
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Pass the user's name to profile.html
                model.addAttribute("username", rs.getString("name"));
                return "profile";
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return "login";
    }
}