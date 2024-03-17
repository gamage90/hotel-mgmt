/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layered.service.custom;

import edu.ijse.layered.dto.CustomerDto;
import edu.ijse.layered.service.SuperService;
import java.util.List;

/**
 *
 * @author Home
 */
public interface CustomerService extends SuperService {
    String addCustomer(CustomerDto customerDto) throws Exception;
    String updateCustomer(CustomerDto customerDto) throws Exception;
    String deleteCustomer(String customerID) throws Exception;
    CustomerDto getCustomer(String customerID) throws Exception;
    List<CustomerDto> getALL() throws Exception;   
    
}
