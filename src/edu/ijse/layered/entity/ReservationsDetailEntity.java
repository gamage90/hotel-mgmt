/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.entity;

/**
 *
 * @author Home
 */
public class ReservationsDetailEntity {
    
    private Integer resId;
    private Integer roomId;
    private String checkinDate;
    private String checkoutDate;
    private String packageName;
    private Double amount;

    public ReservationsDetailEntity() {
    }

    public ReservationsDetailEntity(Integer resId, Integer roomId, String checkinDate, String checkoutDate, String packageName, Double amount) {
        this.resId = resId;
        this.roomId = roomId;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        this.packageName = packageName;
        this.amount = amount;
    }

    /**
     * @return the resId
     */
    public Integer getResId() {
        return resId;
    }

    /**
     * @param resId the resId to set
     */
    public void setResId(Integer resId) {
        this.resId = resId;
    }

    /**
     * @return the roomId
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * @param roomId the roomId to set
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * @return the checkinDate
     */
    public String getCheckinDate() {
        return checkinDate;
    }

    /**
     * @param checkinDate the checkinDate to set
     */
    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
    }

    /**
     * @return the checkoutDate
     */
    public String getCheckoutDate() {
        return checkoutDate;
    }

    /**
     * @param checkoutDate the checkoutDate to set
     */
    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    /**
     * @return the packageName
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * @param packageName the packageName to set
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * @return the amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ReservationsDetailEntity{" + "resId=" + resId + ", roomId=" + roomId + ", checkinDate=" + checkinDate + ", checkoutDate=" + checkoutDate + ", packageName=" + packageName + ", amount=" + amount + '}';
    }
    
    

}
