package in.hisabkitab.service.impl;

import in.hisabkitab.model.expense.Category;
import in.hisabkitab.repository.CategoryRepository;
import in.hisabkitab.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService
{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(Category category)
    {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategories(int id)
    {
        return categoryRepository.findAll();
    }
}
