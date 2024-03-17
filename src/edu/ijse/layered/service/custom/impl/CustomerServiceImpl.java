/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service.custom.impl;

import edu.ijse.layered.dao.DaoFactory;
import edu.ijse.layered.dao.custom.CustomerDao;
import edu.ijse.layered.dto.CustomerDto;
import edu.ijse.layered.entity.CustomerEntity;
import edu.ijse.layered.service.custom.CustomerService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.html.parser.DTD;

/**
 *
 * @author Home
 */
public class CustomerServiceImpl implements CustomerService {
    
    private CustomerDao customerDao = (CustomerDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMERS);

    @Override
    public String addCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(customerDto.getCustomerID(), 
                customerDto.getCustomerName(),
                customerDto.getCustomerEmail(),
                customerDto.getCustomerPhone(), 
                customerDto.getCustomerPhone());
        
        if (customerDao.add(customerEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updateCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity categoryEntity = new CustomerEntity(customerDto.getCustomerID(),
                customerDto.getCustomerName(), 
                customerDto.getCustomerEmail(), 
                customerDto.getCustomerPhone(), 
                customerDto.getCustomerAddress());
        if (customerDao.update(categoryEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteCustomer(String customerID) throws Exception {
        if (customerDao.delete(customerID)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public CustomerDto getCustomer(String customerID) throws Exception {
    CustomerEntity entity = customerDao.get(customerID);
    if (entity != null) {
        return new CustomerDto(entity.getCustomerID(),
                entity.getCustomerName(),
                entity.getCustomerEmail(), 
                entity.getCustomerPhone(), 
                entity.getCustomerAddress());
    }
    return null;
    }

    @Override
    public List<CustomerDto> getALL() throws Exception {
        List<CustomerDto> customerDtos = new ArrayList<>();
        List<CustomerEntity> customerEntities = customerDao.getAll();
        for (CustomerEntity entity : customerEntities) {
         customerDtos.add(new CustomerDto(entity.getCustomerID(),
                 entity.getCustomerName(), 
                 entity.getCustomerEmail(),
                 entity.getCustomerPhone(), 
                 entity.getCustomerAddress()));
        }
         return customerDtos;
    }
    
    
}
