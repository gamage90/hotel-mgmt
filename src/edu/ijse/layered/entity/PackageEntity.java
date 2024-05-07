/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.entity;

/**
 *
 * @author Home
 */
public class PackageEntity {
    
    private String pkgName;
    private Double pkgAmount;

    public PackageEntity() {
    }

    public PackageEntity(String pkgName, Double pkgAmount) {
        this.pkgName = pkgName;
        this.pkgAmount = pkgAmount;
    }

    /**
     * @return the pkgName
     */
    public String getPkgName() {
        return pkgName;
    }

    /**
     * @param pkgName the pkgName to set
     */
    public void setPkgName(String pkgName) {
        this.pkgName = pkgName;
    }

    /**
     * @return the pkgAmount
     */
    public Double getPkgAmount() {
        return pkgAmount;
    }

    /**
     * @param pkgAmount the pkgAmount to set
     */
    public void setPkgAmount(Double pkgAmount) {
        this.pkgAmount = pkgAmount;
    }

    @Override
    public String toString() {
        return "PackageEntity{" + "pkgName=" + pkgName + ", pkgAmount=" + pkgAmount + '}';
    }
    
    
    
}
