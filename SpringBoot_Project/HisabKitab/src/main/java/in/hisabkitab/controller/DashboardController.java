package in.hisabkitab.controller;

import in.hisabkitab.model.expense.Expense;
import in.hisabkitab.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DashboardController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/dashboard")
    public String dashboard(Model model) {

        List<Expense> expenses = expenseService.getAllExpensesList(null);

        double total = expenses.stream()
                .mapToDouble(Expense::getAmount)
                .sum();

        model.addAttribute("expenses", expenses);
        model.addAttribute("totalAmount", total);

        return "dashboard";
    }
}
