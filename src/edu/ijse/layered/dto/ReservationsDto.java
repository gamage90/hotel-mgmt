/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dto;

/**
 *
 * @author Home
 */
public class ReservationsDto {

    private Integer reservationsID;
    private Integer customerID;
    private Integer roomID;
    private String reservationsDate;
    private String checkInDate;
    private String checkOutDate;
    private String resPackage;
    private Double resAmount;

    public ReservationsDto() {
    }

    public ReservationsDto(Integer reservationsID, Integer customerID, Integer roomID, String reservationsDate, String checkInDate, String checkOutDate, String resPackage, Double resAmount) {
        this.reservationsID = reservationsID;
        this.customerID = customerID;
        this.roomID = roomID;
        this.reservationsDate = reservationsDate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.resPackage = resPackage;
        this.resAmount = resAmount;
    }

    /**
     * @return the reservationsID
     */
    public Integer getReservationsID() {
        return reservationsID;
    }

    /**
     * @param reservationsID the reservationsID to set
     */
    public void setReservationsID(Integer reservationsID) {
        this.reservationsID = reservationsID;
    }

    /**
     * @return the customerID
     */
    public Integer getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the roomID
     */
    public Integer getRoomID() {
        return roomID;
    }

    /**
     * @param roomID the roomID to set
     */
    public void setRoomID(Integer roomID) {
        this.roomID = roomID;
    }

    /**
     * @return the reservationsDate
     */
    public String getReservationsDate() {
        return reservationsDate;
    }

    /**
     * @param reservationsDate the reservationsDate to set
     */
    public void setReservationsDate(String reservationsDate) {
        this.reservationsDate = reservationsDate;
    }

    /**
     * @return the checkInDate
     */
    public String getCheckInDate() {
        return checkInDate;
    }

    /**
     * @param checkInDate the checkInDate to set
     */
    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    /**
     * @return the checkOutDate
     */
    public String getCheckOutDate() {
        return checkOutDate;
    }

    /**
     * @param checkOutDate the checkOutDate to set
     */
    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    /**
     * @return the resPackage
     */
    public String getResPackage() {
        return resPackage;
    }

    /**
     * @param resPackage the resPackage to set
     */
    public void setResPackage(String resPackage) {
        this.resPackage = resPackage;
    }

    /**
     * @return the resAmount
     */
    public Double getResAmount() {
        return resAmount;
    }

    /**
     * @param resAmount the resAmount to set
     */
    public void setResAmount(Double resAmount) {
        this.resAmount = resAmount;
    }

    @Override
    public String toString() {
        return "ReservationsDto{" + "reservationsID=" + reservationsID + ", customerID=" + customerID + ", roomID=" + roomID + ", reservationsDate=" + reservationsDate + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", resPackage=" + resPackage + ", resAmount=" + resAmount + '}';
    }
    
    

}
