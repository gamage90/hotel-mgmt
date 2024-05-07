/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service.custom.impl;

import edu.ijse.layered.dao.DaoFactory;
import edu.ijse.layered.dao.custom.PackageDao;
import edu.ijse.layered.dto.PackageDto;
import edu.ijse.layered.entity.PackageEntity;

import edu.ijse.layered.service.custom.PackageService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Home
 */
public class PackageServiceImpl implements PackageService {
    
    private PackageDao packageDao = (PackageDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ROOMPACKAGES);

    @Override
    public String addPackage(PackageDto packageDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String updatePackage(PackageDto packageDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String deletePackage(String packageName) throws Exception {
        if (packageDao.delete(packageName)) {
            return "Package Successfully Deleted";
        } else {
            return "Fail to delete Package";
        }
    
    }

    @Override
    public PackageDto getPackage(String packageName) throws Exception {
         PackageEntity packageEntity = packageDao.get(packageName);
         return new PackageDto(packageEntity.getPkgName(),
                 packageEntity.getPkgAmount());
    
    }

    @Override
    public List<PackageDto> getAll() throws Exception {
         ArrayList<PackageEntity> packageEntities = packageDao.getAll();
        
        List<PackageDto> packageDtos = new ArrayList<>();
        
        for (PackageEntity packageEntity : packageEntities) {
            packageDtos.add(new PackageDto(packageEntity.getPkgName(),
                 packageEntity.getPkgAmount()));
        }
        return packageDtos;  
    
    }   
    
}
