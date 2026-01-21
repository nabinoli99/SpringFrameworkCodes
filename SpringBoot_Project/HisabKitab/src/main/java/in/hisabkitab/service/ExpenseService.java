package in.hisabkitab.service;

import in.hisabkitab.model.expense.Expense;

import java.util.List;

public interface ExpenseService
{
    Expense addExpense(Expense expense);
    List<Expense> getExpenseByUser(int user_id);
    void deleteExpense(int Expense_Id);

//    List<Expense> getAllExpenses(int user_Id);

    List<Expense> getAllExpensesList(int userId);
}
