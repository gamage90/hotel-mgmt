/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service.custom.impl;

import edu.ijse.layered.dao.DaoFactory;
import edu.ijse.layered.dao.custom.CategoryDao;
import edu.ijse.layered.dto.CategoryDto;
import edu.ijse.layered.entity.CategoryEntity;
import edu.ijse.layered.service.custom.CategoryService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Home
 */
public class CategoryServiceImpl implements CategoryService {

    private CategoryDao categoryDao = (CategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ROOMCATEGORIES);

    @Override
    public String addCategory(CategoryDto dto) throws Exception {
        CategoryEntity categoryEntity = new CategoryEntity(dto.getCategoryID(),
                dto.getCategoryName());
        if (categoryDao.add(categoryEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updateCategory(CategoryDto categoryDto) throws Exception {
        CategoryEntity categoryEntity = new CategoryEntity(categoryDto.getCategoryID(),
                categoryDto.getCategoryName());
        if (categoryDao.update(categoryEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteCategory(String categoryID) throws Exception {
        if (categoryDao.delete(categoryID)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public CategoryDto getCategory(String categoryID) throws Exception {
        CategoryEntity categoryEntity = categoryDao.get(categoryID);
         return new CategoryDto(categoryEntity.getCategoryID(),
                 categoryEntity.getCategoryName());
    }

    @Override
    public List<CategoryDto> getAll() throws Exception {
        ArrayList<CategoryEntity> categoryEntities = categoryDao.getAll();
        
        List<CategoryDto> categoryDtos = new ArrayList<>();
        
        for (CategoryEntity categoryEntity : categoryEntities) {
            categoryDtos.add(new CategoryDto(categoryEntity.getCategoryID(),
                 categoryEntity.getCategoryName()));
        }
        return categoryDtos;
    }

}
