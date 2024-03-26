/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.entity;

/**
 *
 * @author Home
 */
public class ReservationsEntity {
    
    private Integer resId;
    private String date;
    private Integer custId;

    public ReservationsEntity() {
    }

    public ReservationsEntity(Integer resId, String date, Integer custId) {
        this.resId = resId;
        this.date = date;
        this.custId = custId;
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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the custId
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    @Override
    public String toString() {
        return "ReservationsEntity{" + "resId=" + resId + ", date=" + date + ", custId=" + custId + '}';
    }

    
    
    
}
