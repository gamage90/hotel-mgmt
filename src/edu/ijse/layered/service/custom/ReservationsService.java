/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layered.service.custom;

import edu.ijse.layered.dto.ReservationsDto;
import edu.ijse.layered.service.SuperService;
import java.util.List;

/**
 *
 * @author Home
 */
public interface ReservationsService extends SuperService{
    String addReservations(ReservationsDto reservationsDto) throws Exception;
    String updateReservations(ReservationsDto reservationsDto) throws Exception;
    String deleteReservations(String reservationsID) throws Exception;
    ReservationsDto getReservations(String reservationsID) throws Exception;
    List<ReservationsDto> getALL() throws Exception; 
}
