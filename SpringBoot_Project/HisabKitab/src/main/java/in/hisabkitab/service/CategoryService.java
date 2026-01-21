package in.hisabkitab.service;

import in.hisabkitab.model.expense.Category;

import java.util.List;

public interface CategoryService
{
    Category saveCategory(Category category);
    List<Category> getAllCategories(int id);
}
