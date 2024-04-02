/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.controller;

import edu.ijse.layered.dto.ReservationsDto;
import edu.ijse.layered.service.ServiceFactory;
import edu.ijse.layered.service.custom.ReservationsService;
import java.util.List;

/**
 *
 * @author Home
 */
public class ReservationsController {
    
    private ReservationsService reservationsService = (ReservationsService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RESERVATIONS);
    
    public String saveReservations(ReservationsDto reservationsDto) throws Exception{
        return reservationsService.addReservations(reservationsDto);
    }
    
    public String updateReservations(ReservationsDto reservationsDto) throws Exception{
        return reservationsService.updateReservations(reservationsDto);
    }
    
    public String deleteReservations(String id) throws Exception{
        return reservationsService.deleteReservations(id);
    }
    
    public ReservationsDto getReservations(String id) throws Exception{
        return reservationsService.getReservations(id);
    }
    
    public List<ReservationsDto> getAllReservations() throws Exception{
        return reservationsService.getALL();
    }
    
}
