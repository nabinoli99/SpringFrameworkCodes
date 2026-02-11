package in.hisabkitab.service;

import in.hisabkitab.model.expense.Expense;
import java.util.List;

public interface ExpenseService {

    Expense addExpense(Expense expense);

    List<Expense> getExpenseByUser(int userId);

    void deleteExpense(int expenseId);

    // allow null when fetching all expenses
    List<Expense> getAllExpensesList(Integer userId);
}
