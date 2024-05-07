/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao.custom.impl;

import edu.ijse.layered.dao.CrudUtil;
import edu.ijse.layered.dao.custom.PackageDao;
import edu.ijse.layered.entity.PackageEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Home
 */
public class PackageDaoImpl implements PackageDao{

    @Override
    public boolean add(PackageEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO packages VALUES(?,?)",
                t.getPkgName(),
                t.getPkgAmount());
    }

    @Override
    public boolean update(PackageEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE packages SET package_ammount=? WHERE package_name=?",
                t.getPkgAmount(),
                t.getPkgName());

    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM packages WHERE package_name=?", id);
    }

    @Override
    public PackageEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM packages WHERE package_name=?", id);
        while (rst.next()) {
            return new PackageEntity(rst.getString("package_name"), rst.getDouble("package_ammount"));
        }
        return null;
    }

    @Override
    public ArrayList<PackageEntity> getAll() throws Exception {
        ArrayList<PackageEntity> packageEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM packages");
        while (rst.next()) {
            packageEntities.add(new PackageEntity(rst.getString("package_name"), 
                    rst.getDouble("package_ammount")));
        }
        return packageEntities;
    
    }
    
}
