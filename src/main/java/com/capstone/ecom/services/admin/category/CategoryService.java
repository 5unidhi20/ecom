package com.capstone.ecom.services.admin.category;

import com.capstone.ecom.dto.CategoryDto;
import com.capstone.ecom.entity.Category;

import java.util.List;

public interface CategoryService {
    public Category createcategory(CategoryDto categoryDto);

    List<Category> getAllCategories();
}
