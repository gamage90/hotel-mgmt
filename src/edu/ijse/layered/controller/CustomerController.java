/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.controller;

import edu.ijse.layered.dto.CustomerDto;
import edu.ijse.layered.service.ServiceFactory;
import edu.ijse.layered.service.custom.CustomerService;
import java.util.List;

/**
 *
 * @author Home
 */
public class CustomerController {
    
    private CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMERS);
    
    public String saveCustomer(CustomerDto customerDto) throws Exception{
        return customerService.addCustomer(customerDto);
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception{
        return customerService.updateCustomer(customerDto);
    }

    public String deleteCustomer(String id) throws Exception{
        return customerService.deleteCustomer(id);
    }

    public CustomerDto getCustomer(String id) throws Exception{
        return customerService.getCustomer(id);
    }

    public List<CustomerDto> getAllCustomer() throws Exception{
        return customerService.getALL();
    }
    
}
