package in.hisabkitab.controller;

import in.hisabkitab.model.expense.Category;
import in.hisabkitab.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/add")
    public ResponseEntity<Category> addCategory(@RequestBody Category category) {
        Category saved = categoryService.saveCategory(category);
        return ResponseEntity.ok(saved);
    }

    // Example: GET /api/categories/all  or /api/categories/all?userId=1
    @GetMapping("/all")
    public ResponseEntity<List<Category>> getAllCategories(@RequestParam(name = "userId", required = false) Integer userId) {
        return ResponseEntity.ok(categoryService.getAllCategories(userId == null ? 0 : userId));
    }
}
