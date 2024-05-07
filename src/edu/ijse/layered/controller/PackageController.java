/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.controller;

import edu.ijse.layered.dto.PackageDto;
import edu.ijse.layered.service.ServiceFactory;
import edu.ijse.layered.service.custom.PackageService;
import java.util.List;

/**
 *
 * @author Home
 */
public class PackageController {
    
    private PackageService packageService = (PackageService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOMPACKAGES);
    
    public String addPackage(PackageDto packageDto)throws Exception{
            return packageService.addPackage(packageDto);
    }
    
    public String updatePackage(PackageDto packageDto)throws Exception{
            return packageService.updatePackage(packageDto);
    }
    
    public String deletePackage(String packageName)throws Exception{
            return packageService.deletePackage(packageName);
    }
    
    public PackageDto getPackage(String packageName)throws Exception{
            return packageService.getPackage(packageName);
    }
    
    public List<PackageDto> getAll()throws Exception{
            return packageService.getAll();
    }
}
