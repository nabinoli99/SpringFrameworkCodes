package in.hisabkitab.controller;


import in.hisabkitab.model.expense.Category;
import in.hisabkitab.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController
{

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/add")
    public Category addCategory(@RequestBody Category category)
    {
        return categoryService.saveCategory(category);
    }

    @GetMapping("/all")
    public List<Category> getALlCategories(int id)
    {
        return categoryService.getAllCategories(id);
    }
}
