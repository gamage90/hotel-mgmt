/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layered.service.custom;

import edu.ijse.layered.dto.PackageDto;
import edu.ijse.layered.service.SuperService;
import java.util.List;

/**
 *
 * @author Home
 */
public interface PackageService extends SuperService{
    String addPackage(PackageDto packageDto) throws Exception;
    String updatePackage(PackageDto packageDto) throws Exception;
    String deletePackage(String packageName) throws Exception;
    PackageDto getPackage(String packageName)throws Exception;
    List<PackageDto> getAll() throws Exception; 
    
}
