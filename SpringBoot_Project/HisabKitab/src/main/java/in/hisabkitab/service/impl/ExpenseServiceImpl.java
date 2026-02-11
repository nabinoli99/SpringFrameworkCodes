package in.hisabkitab.service.impl;

import in.hisabkitab.model.expense.Expense;
import in.hisabkitab.model.user.User;
import in.hisabkitab.repository.ExpenseRepository;
import in.hisabkitab.repository.UserRepository;
import in.hisabkitab.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public List<Expense> getAllExpensesList(Integer userId) {

        // return all expenses
        if (userId == null) {
            return expenseRepository.findAll();
        }

        // fetch user safely
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        return expenseRepository.findByUser(user);
    }

    @Override
    public List<Expense> getExpenseByUser(int userId) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        return expenseRepository.findByUser(user);
    }

    @Override
    public void deleteExpense(int expenseId) {
        expenseRepository.deleteById(expenseId);
    }
}
