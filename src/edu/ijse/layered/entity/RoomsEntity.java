/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.entity;

/**
 *
 * @author Home
 */
public class RoomsEntity {
    
    private Integer roomID;
    private Integer roomCatagory;
    private String roomNumber;
    private Integer roomAvailability;
    private Double roomRate;

    public RoomsEntity() {
    }

    public RoomsEntity(Integer roomID, Integer roomCatagory, String roomNumber, Integer roomAvailability, Double roomRate) {
        this.roomID = roomID;
        this.roomCatagory = roomCatagory;
        this.roomNumber = roomNumber;
        this.roomAvailability = roomAvailability;
        this.roomRate = roomRate;
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
     * @return the roomCatagory
     */
    public Integer getRoomCatagory() {
        return roomCatagory;
    }

    /**
     * @param roomCatagory the roomCatagory to set
     */
    public void setRoomCatagory(Integer roomCatagory) {
        this.roomCatagory = roomCatagory;
    }

    /**
     * @return the roomNumber
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * @param roomNumber the roomNumber to set
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * @return the roomAvailability
     */
    public Integer getRoomAvailability() {
        return roomAvailability;
    }

    /**
     * @param roomAvailability the roomAvailability to set
     */
    public void setRoomAvailability(Integer roomAvailability) {
        this.roomAvailability = roomAvailability;
    }

    /**
     * @return the roomRate
     */
    public Double getRoomRate() {
        return roomRate;
    }

    /**
     * @param roomRate the roomRate to set
     */
    public void setRoomRate(Double roomRate) {
        this.roomRate = roomRate;
    }

    @Override
    public String toString() {
        return "RoomsEntity{" + "roomID=" + roomID + ", roomCatagory=" + roomCatagory + ", roomNumber=" + roomNumber + ", roomAvailability=" + roomAvailability + ", roomRate=" + roomRate + '}';
    }
    
    
    
}
