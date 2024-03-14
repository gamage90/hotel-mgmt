/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dto;

/**
 *
 * @author Home
 */
public class CategoryDto {
    
     private Integer categoryID;
    private String categoryName;
    
    public CategoryDto() {
    }

    public CategoryDto(Integer categoryID, String categoryName) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
    }

     // public CategoryDto(int parseInt, String text) {
   // }

    /**
     * @return the categoryID
     */
    public Integer getCategoryID() {
        return categoryID;
    }

    /**
     * @param categoryID the categoryID to set
     */
    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    /**
     * @return the categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "CategoryDto{" + "categoryID=" + categoryID + ", categoryName=" + categoryName + '}';
    }
    
    
    
    
}
