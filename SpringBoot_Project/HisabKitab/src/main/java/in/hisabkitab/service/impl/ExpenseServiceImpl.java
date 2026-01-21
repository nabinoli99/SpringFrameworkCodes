package in.hisabkitab.service.impl;

import in.hisabkitab.model.expense.Expense;
import in.hisabkitab.repository.ExpenseRepository;
import in.hisabkitab.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService
{
    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public Expense addExpense(Expense expense)
    {
        return expenseRepository.save(expense);
    }

    @Override
    public List<Expense> getAllExpensesList(int user_Id) {
        return expenseRepository.findAll().stream()
                .filter(e -> e.getUser().getId() == user_Id).toList();
    }

    @Override
    public List<Expense> getExpenseByUser(int user_id)
    {
        return expenseRepository.findAll().stream()
                .filter(e -> e.getUser().getId() == user_id).toList();
    }

    @Override
    public void deleteExpense(int Expense_Id)
    {
        expenseRepository.deleteById(Expense_Id);
    }
}
