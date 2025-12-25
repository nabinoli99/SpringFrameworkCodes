package in.taskmaster_pro.controller;

import in.taskmaster_pro.dao.TaskDAO;
import in.taskmaster_pro.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskController {

    @Autowired
    private TaskDAO taskDAO;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("tasks", taskDAO.getAllTasks());
        return "index";
    }

    @PostMapping("/save")
    public String saveTask(@ModelAttribute("task") Task task) {
        taskDAO.saveTask(task);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable int id) {
        taskDAO.deleteTask(id);
        return "redirect:/";
    }
}
