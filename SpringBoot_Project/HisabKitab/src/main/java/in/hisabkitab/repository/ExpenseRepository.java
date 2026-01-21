package in.hisabkitab.repository;

import in.hisabkitab.model.expense.Expense;
import in.hisabkitab.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Integer>
{
    List<Expense> findByUser(User user);
}