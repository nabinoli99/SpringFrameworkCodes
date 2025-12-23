@Controller
public class PageController {

    @GetMapping("/register")
    public String registerPage() {
        return "register"; // resolves to register.html in templates
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // resolves to login.html in templates
    }
}
