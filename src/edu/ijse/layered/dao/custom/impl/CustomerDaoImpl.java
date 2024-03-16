/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao.custom.impl;

import edu.ijse.layered.dao.CrudUtil;
import edu.ijse.layered.dao.custom.CustomerDao;
import edu.ijse.layered.entity.CustomerEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class CustomerDaoImpl implements CustomerDao {

    @Override
    public boolean add(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO CUSTOMERS VALUES(?,?,?,?,?)",
                t.getCustomerID(),
                t.getCustomerName(),
                t.getCustomerEmail(),
                t.getCustomerPhone(),
                t.getCustomerAddress());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE CUSTOMERS SET name=?, email=?, phone=?, address=? WHERE customer_id=?",
                t.getCustomerName(),
                t.getCustomerEmail(),
                t.getCustomerPhone(),
                t.getCustomerAddress(),
                t.getCustomerID());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM CUSTOMERS WHERE customer_id=?", id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM CUSTOMERS WHERE customer_id=?", id);
        while (rst.next()) {
            return new CustomerEntity(rst.getInt("customer_id"),
            rst.getString("name"), 
            rst.getString("email"), 
            rst.getString("phone"), 
            rst.getString("address"));
        }
        return null;
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
    ArrayList<CustomerEntity> customerEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM customers");
        while (rst.next()) {
            customerEntities.add(new CustomerEntity(rst.getInt("customer_id"),
            rst.getString("name"),
            rst.getString("email"),
            rst.getString("phone"),
            rst.getString("address")));
        }
        return customerEntities;
    }

}
