package in.hisabkitab.controller;

import in.hisabkitab.model.expense.Expense;
import in.hisabkitab.model.user.User;
import in.hisabkitab.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController
{

    @Autowired
    private ExpenseService expenseService;


    @PostMapping("/add")
    public ResponseEntity<Expense> addExpense(@RequestBody Expense expense)
    {
        Expense savedExpense = expenseService.addExpense(expense);
        return ResponseEntity.ok(savedExpense);
    }

    @GetMapping("/all")
    public List<Expense> getAllExpenses(int user_Id) {
        // For now, return all. Later you can link this to the logged-in user.
        return expenseService.getAllExpensesList(user_Id);
    }

    @GetMapping("/user{User_id}")
    public List<Expense> getExpenseById(@PathVariable int User_Id)
    {
        return expenseService.getExpenseByUser(User_Id);
    }

    @DeleteMapping("/delte/{id}")
    public String deleteExpenseById(@PathVariable int id)
    {
        expenseService.deleteExpense(id);
        return "Expense with Id :"+id+"Deleted Successfully";
    }
}
