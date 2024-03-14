/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao.custom.impl;

import edu.ijse.layered.dao.CrudUtil;
import edu.ijse.layered.dao.custom.CategoryDao;
import edu.ijse.layered.entity.CategoryEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Home
 */
public class CategoryDaoImpl implements CategoryDao {

    @Override
    public boolean add(CategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO ROOMCATEGORIES VALUES(?,?)",
                t.getCategoryID(),
                t.getCategoryName());
    }

    @Override
    public boolean update(CategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE ROOMCATEGORIES SET category_name=? WHERE category_id=?",
                t.getCategoryName(),
                t.getCategoryID());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM ROOMCATEGORIES WHERE category_id=?", id);
    }

    @Override
    public CategoryEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Roomcategories WHERE category_id=?", id);
        while (rst.next()) {
            return new CategoryEntity(rst.getInt("category_id"),
                    rst.getString("category_name"));
        }
        return null;
    }

    @Override
    public ArrayList<CategoryEntity> getAll() throws Exception {
        ArrayList<CategoryEntity> categoryEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Roomcategories");
        while (rst.next()) {
            categoryEntities.add(new CategoryEntity(rst.getInt("category_id"),
                    rst.getString("category_name")));
        }
        return categoryEntities;
    }
}
