package com.capstone.moayo.service.concrete;

import com.capstone.moayo.entity.Category;
import com.capstone.moayo.service.CategoryService;
import com.capstone.moayo.storage.CategoryStorage;

import java.util.List;

public class ConcreteCategoryService implements CategoryService {
    private CategoryStorage categoryStorage;

    public ConcreteCategoryService() {

    }

    @Override
    public String createCategory(Category category) {
        return null;
    }

    @Override
    public List<Category> findCategoryByTitle(String title) {
        return null;
    }

    @Override
    public Category findCategoryById(int id) {
        return null;
    }

    @Override
    public String modifyCategory(Category category) {
        return null;
    }

    @Override
    public String deleteCategory(int id) {
        return null;
    }
}
