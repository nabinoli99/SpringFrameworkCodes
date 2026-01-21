package in.hisabkitab.repository;

import in.hisabkitab.model.expense.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer>
{
    Category findByName(String name);
}