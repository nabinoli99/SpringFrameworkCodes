package in.nabin.Controller;

import in.nabin.model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController
{
    @ModelAttribute
    public void modelData(Model m)
    {
        m.addAttribute("name","Aliens");
    }
    @RequestMapping("/")
    public String home()
    {
        return "index";
    }

    @RequestMapping("add")
    public String add (@RequestParam("num1") int i , @RequestParam("num2")  int j , ModelMap m)
    {
        int num3 = i+j;
        m.addAttribute("num3",num3);

        return "result";

    }

    @GetMapping("getAliens")
    public String getAlliens(Model m)
    {
        List<Alien> aliens = Arrays.asList(new Alien(101,"Nabkiran"),new Alien(102,"Nabin"));
        m.addAttribute("result",aliens);
        return "aliens";
    }
    @PostMapping( value = "addAlien")
    public String addAlien( @ModelAttribute  Alien a)
    {
        return "result";
    }


}
