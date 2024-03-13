/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service.custom.impl;

import edu.ijse.layered.dto.CategoryDto;
import edu.ijse.layered.entity.CategoryEntity;
import edu.ijse.layered.service.custom.CategoryService;
import java.util.List;

/**
 *
 * @author Home
 */
public class CategoryServiceImpl implements CategoryService {

    @Override
    public String addCategory(CategoryDto dto) throws Exception {
        CategoryEntity categoryEntity = new CategoryEntity(dto.getCategoryID(),
                dto.getCategoryName());
        return null;
    }

    @Override
    public String updateCategory(CategoryDto categoryDto) throws Exception {
        return null;
    }

    @Override
    public String deleteCategory(String categoryID) throws Exception {
        return null;
    }

    @Override
    public CategoryDto getCategory(String categoryID) throws Exception {
        return null;
    }

    @Override
    public List<CategoryDto> getAll() throws Exception {
        return null;
    }

}
