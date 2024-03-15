/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.controller;

import edu.ijse.layered.dto.CategoryDto;
import edu.ijse.layered.service.ServiceFactory;
import edu.ijse.layered.service.custom.CategoryService;
import java.util.List;

/**
 *
 * @author Home
 */
public class CategoryController {
    
    private CategoryService categoryService = (CategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOMCATEGORIES);

    public String add(CategoryDto categoryDto)throws Exception{
            return categoryService.addCategory(categoryDto);
    }
    
    public String update(CategoryDto categoryDto)throws Exception{
            return categoryService.updateCategory(categoryDto);
    }
    
    public String delete(String categoryId)throws Exception{
            return categoryService.deleteCategory(categoryId);
    }
    
    public CategoryDto get(String categoryId)throws Exception{
            return categoryService.getCategory(categoryId);
    }
    
    public List<CategoryDto> getAll()throws Exception{
            return categoryService.getAll();
    }
    
}
