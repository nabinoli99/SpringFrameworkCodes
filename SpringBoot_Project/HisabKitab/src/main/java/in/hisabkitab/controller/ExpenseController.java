package in.hisabkitab.controller;

import in.hisabkitab.model.expense.Expense;
import in.hisabkitab.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/add")
    public ResponseEntity<Expense> addExpense(@RequestBody Expense expense) {
        Expense savedExpense = expenseService.addExpense(expense);
        return ResponseEntity.ok(savedExpense);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Expense>> getAllExpenses(
            @RequestParam(name = "userId", required = false) Integer userId) {

        if (userId == null) {
            return ResponseEntity.ok(expenseService.getAllExpensesList(null));
        } else {
            return ResponseEntity.ok(expenseService.getExpenseByUser(userId));
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Expense>> getExpenseByUser(@PathVariable int userId) {
        return ResponseEntity.ok(expenseService.getExpenseByUser(userId));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteExpenseById(@PathVariable int id) {
        expenseService.deleteExpense(id);
        return ResponseEntity.ok("Expense with Id :" + id + " Deleted Successfully");
    }
}
