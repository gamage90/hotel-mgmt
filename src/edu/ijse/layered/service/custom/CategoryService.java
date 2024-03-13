/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layered.service.custom;

import edu.ijse.layered.dto.CategoryDto;
import edu.ijse.layered.service.SuperService;
import java.util.List;

/**
 *
 * @author Home
 */
public interface CategoryService extends SuperService {
    String addCategory(CategoryDto categoryDto) throws Exception;
    String updateCategory(CategoryDto categoryDto) throws Exception;
    String deleteCategory(String categoryID) throws Exception;
    CategoryDto getCategory(String categoryID)throws Exception;
    List<CategoryDto> getAll() throws Exception;    
}