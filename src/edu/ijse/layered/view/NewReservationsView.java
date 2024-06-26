/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.layered.view;

import edu.ijse.layered.controller.CustomerController;
import edu.ijse.layered.controller.PackageController;
import edu.ijse.layered.controller.ReservationsController;
import edu.ijse.layered.controller.RoomController;
import edu.ijse.layered.dto.CustomerDto;
import edu.ijse.layered.dto.PackageDto;
import edu.ijse.layered.dto.ReservationsDto;
import edu.ijse.layered.dto.RoomsDto;
import java.awt.Color;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Home
 */
public class NewReservationsView extends javax.swing.JFrame {

    private ReservationsController reservationsController;
    private CustomerController customerController;
    private RoomController roomsController;
    private PackageController packageController;

    /**
     * Creates new form NewReservationsView
     */
    public NewReservationsView() {
        reservationsController = new ReservationsController();
        customerController = new CustomerController();
        roomsController = new RoomController();
        packageController = new PackageController();
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/Icon2.png")));
        this.setLocationRelativeTo(null);
        loadReservations();
        loadComboBox();
        loadComboCustomer();
        loadComboRoom();
        loadDates();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnValidateCust = new javax.swing.JButton();
        btnValidateRoom = new javax.swing.JButton();
        lblCustVal = new javax.swing.JLabel();
        lblRoomVal = new javax.swing.JLabel();
        comboPkg = new javax.swing.JComboBox<>();
        comboCustomer = new javax.swing.JComboBox<>();
        comboRoom = new javax.swing.JComboBox<>();
        lblCheckIn = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblTitleRes = new javax.swing.JLabel();
        lblPkg = new javax.swing.JLabel();
        lblCheckOut = new javax.swing.JLabel();
        lblResID = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblCustID = new javax.swing.JLabel();
        txtResID = new javax.swing.JTextField();
        lblRoomId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReservatons = new javax.swing.JTable();
        lblAmmont = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();
        jDateCheckOut = new com.toedter.calendar.JDateChooser();
        jDateCheckIn = new com.toedter.calendar.JDateChooser();
        btnCustomerView = new javax.swing.JButton();
        btnRoomsView = new javax.swing.JButton();
        btnCatagoryView = new javax.swing.JButton();
        btnPkgView = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Reservations");

        btnValidateCust.setText("Validate");
        btnValidateCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateCustActionPerformed(evt);
            }
        });

        btnValidateRoom.setText("Validate");
        btnValidateRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateRoomActionPerformed(evt);
            }
        });

        lblCustVal.setText("  ");

        lblRoomVal.setText("  ");

        comboPkg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPkg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPkgActionPerformed(evt);
            }
        });

        comboCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRoomActionPerformed(evt);
            }
        });

        lblCheckIn.setText("Check-IN");

        btnSave.setText("CREATE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblTitleRes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitleRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleRes.setText("Create Reservations");

        lblPkg.setText("Package");

        lblCheckOut.setText("Check-OUT");

        lblResID.setText("Reservation ID");

        lblCustID.setText("Customer ID");

        lblRoomId.setText("Room ID");

        tblReservatons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblReservatons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReservatonsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReservatons);

        lblAmmont.setText("Amount");

        jDateCheckOut.setDateFormatString("yyyy-MM-dd");

        jDateCheckIn.setDateFormatString("yyyy-MM-dd");
        jDateCheckIn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateCheckInPropertyChange(evt);
            }
        });

        btnCustomerView.setText("Customers");
        btnCustomerView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerViewActionPerformed(evt);
            }
        });

        btnRoomsView.setText("Rooms");
        btnRoomsView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomsViewActionPerformed(evt);
            }
        });

        btnCatagoryView.setText("Catagories");
        btnCatagoryView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatagoryViewActionPerformed(evt);
            }
        });

        btnPkgView.setText("Packages");
        btnPkgView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPkgViewActionPerformed(evt);
            }
        });

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitleRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAmmont)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResID)
                            .addComponent(lblRoomId)
                            .addComponent(lblCheckIn)
                            .addComponent(lblCheckOut)
                            .addComponent(lblCustID)
                            .addComponent(lblPkg))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtResID)
                                    .addComponent(comboPkg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jDateCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnValidateRoom, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnValidateCust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCustVal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRoomVal, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(btnCalculate)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCatagoryView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRoomsView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCustomerView, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(btnPkgView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))
                    .addComponent(jScrollPane1))
                .addGap(8, 8, 8))
            .addGroup(layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitleRes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResID)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(btnCustomerView)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCustID)
                                .addComponent(btnValidateCust)
                                .addComponent(lblCustVal)
                                .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRoomsView))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoomId)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnValidateRoom)
                                .addComponent(lblRoomVal))
                            .addComponent(btnCatagoryView))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCheckIn)
                            .addComponent(jDateCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPkgView))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCheckOut))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPkg)
                    .addComponent(comboPkg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmmont)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculate))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidateCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateCustActionPerformed
        searchCustomer();
    }//GEN-LAST:event_btnValidateCustActionPerformed

    private void btnValidateRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateRoomActionPerformed
        searchRoom();
    }//GEN-LAST:event_btnValidateRoomActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        saveReservations();//New method created
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblReservatonsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReservatonsMouseClicked
        searchReservations();
    }//GEN-LAST:event_tblReservatonsMouseClicked

    private void jDateCheckInPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateCheckInPropertyChange
        jDateCheckOut.getJCalendar().setMinSelectableDate(jDateCheckIn.getDate());
    }//GEN-LAST:event_jDateCheckInPropertyChange

    private void btnCustomerViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerViewActionPerformed
        new CustomerView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCustomerViewActionPerformed

    private void btnRoomsViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomsViewActionPerformed
        new RoomsView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRoomsViewActionPerformed

    private void btnCatagoryViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatagoryViewActionPerformed
        new RoomCatagoriesView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCatagoryViewActionPerformed

    private void btnPkgViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPkgViewActionPerformed
        new PackageView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPkgViewActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        calculateAmmount();
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void comboRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRoomActionPerformed
        totalAmountColour();
    }//GEN-LAST:event_comboRoomActionPerformed

    private void comboPkgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPkgActionPerformed
        totalAmountColour();
    }//GEN-LAST:event_comboPkgActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(NewReservationsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NewReservationsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NewReservationsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NewReservationsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new NewReservationsView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnCatagoryView;
    private javax.swing.JButton btnCustomerView;
    private javax.swing.JButton btnPkgView;
    private javax.swing.JButton btnRoomsView;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnValidateCust;
    private javax.swing.JButton btnValidateRoom;
    private javax.swing.JComboBox<String> comboCustomer;
    private javax.swing.JComboBox<String> comboPkg;
    private javax.swing.JComboBox<String> comboRoom;
    private com.toedter.calendar.JDateChooser jDateCheckIn;
    private com.toedter.calendar.JDateChooser jDateCheckOut;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAmmont;
    private javax.swing.JLabel lblCheckIn;
    private javax.swing.JLabel lblCheckOut;
    private javax.swing.JLabel lblCustID;
    private javax.swing.JLabel lblCustVal;
    private javax.swing.JLabel lblPkg;
    private javax.swing.JLabel lblResID;
    private javax.swing.JLabel lblRoomId;
    private javax.swing.JLabel lblRoomVal;
    private javax.swing.JLabel lblTitleRes;
    private javax.swing.JTable tblReservatons;
    private javax.swing.JTextField txtResID;
    private javax.swing.JTextField txtTotalAmount;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        txtResID.setText("");
        txtTotalAmount.setText("");
    }

    private void loadReservations() {
        try {
            String[] columns = {"Reservation ID", "Customer ID", "Room ID", "Res Date", "Check In",
                "Check Out", "Package", "Ammount"};
            DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            tblReservatons.setModel(dtm);

            List<ReservationsDto> reservationsDtos = reservationsController.getAllReservations();
            for (ReservationsDto reservationsDto : reservationsDtos) {
                Object[] rowData = {reservationsDto.getReservationsID(),
                    reservationsDto.getCustomerID(),
                    reservationsDto.getRoomID(),
                    reservationsDto.getReservationsDate(),
                    reservationsDto.getCheckInDate(),
                    reservationsDto.getCheckOutDate(),
                    reservationsDto.getResPackage(),
                    reservationsDto.getResAmount()};
                dtm.addRow(rowData);

            }
        } catch (Exception ex) {
            Logger.getLogger(RoomCatagoriesView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }

    private void saveReservations() {

        ReservationsDto reservationsDto = new ReservationsDto();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateIN = sdf.format(jDateCheckIn.getDate());
        String dateOUT = sdf.format(jDateCheckOut.getDate());

        reservationsDto.setReservationsID(Integer.parseInt(txtResID.getText()));
        reservationsDto.setCustomerID(Integer.parseInt((String) comboCustomer.getSelectedItem()));
        reservationsDto.setRoomID(Integer.parseInt((String) comboRoom.getSelectedItem()));
        reservationsDto.setReservationsDate(sdf.format(new Date()));
        reservationsDto.setCheckInDate(dateIN.toString());
        reservationsDto.setCheckOutDate(dateOUT.toString());
        reservationsDto.setResPackage((String) comboPkg.getSelectedItem());
        reservationsDto.setResAmount(Double.parseDouble(txtTotalAmount.getText()));

        try {
            Color rt = txtTotalAmount.getBackground();
            String totalAmount = txtTotalAmount.getText();
            
            if (rt != Color.red && !(totalAmount.isEmpty())) {
                String result = reservationsController.saveReservations(reservationsDto);
                JOptionPane.showMessageDialog(this, result);
                clear();
                loadReservations();
                new ReservationsView().setVisible(true);
                this.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(this, "Calculate the ammount");
            }

        } catch (Exception ex) {
            Logger.getLogger(ReservationsView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void searchReservations() {
        String id = tblReservatons.getValueAt(tblReservatons.getSelectedRow(), 0).toString();
        try {
            ReservationsDto dto = reservationsController.getReservations(id);

            if (dto != null) {
                txtResID.setText(Integer.toString(dto.getReservationsID()));
                //txtCheckIn.setText(dto.getCheckInDate());
                //txtCheckOut.setText(dto.getCheckOutDate());
                //lblLoadPkg.setText(dto.getResPackage());
                txtTotalAmount.setText(Double.toString(dto.getResAmount()));

            } else {
                JOptionPane.showMessageDialog(this, "Reservation Not Found");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void searchCustomer() {
        try {
            //String custId = txtCustID.getText();
            String custId = (String) comboCustomer.getSelectedItem();

            CustomerDto customerDto = customerController.getCustomer(custId);

            if (customerDto != null) {
                lblCustVal.setText(customerDto.getCustomerName());
            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Found");
                lblCustVal.setText("Invalid");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error");
            Logger.getLogger(ReservationsView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void searchRoom() {
        try {
            //String roomId = txtRoomId.getText();
            String roomId = (String) comboRoom.getSelectedItem();
            String roomAvailable;
            RoomsDto roomsDto = roomsController.getRoom(roomId);
            String roomRate = "LKR " + roomsDto.getRoomRate();

            if (roomsDto != null) {
                /////////////
                if (roomsDto.getRoomAvailability() == 1) {
                    roomAvailable = "Available";
                } else {
                    roomAvailable = "Unavailable";
                }
                ////////////                
                lblRoomVal.setText(roomsDto.getRoomNumber() + " | " + roomAvailable + " | " + roomRate);
            } else {
                JOptionPane.showMessageDialog(this, "Rooms Not Found");
                lblRoomVal.setText("Invalid");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error");
            Logger.getLogger(ReservationsView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void loadComboBox() {
        comboPkg.removeAllItems();
        comboPkg.addItem("Full Board");
        comboPkg.addItem("Half Board");
        comboPkg.addItem("Bed and Breakfast");

    }

    private void loadComboCustomer() {
        comboCustomer.removeAllItems();
        try {
            // DefaultComboBoxModel dtm = new DefaultComboBoxModel();
            List<CustomerDto> customerDtos = customerController.getAllCustomer();
            for (CustomerDto customerDto : customerDtos) {
                Integer rowData = customerDto.getCustomerID();
                comboCustomer.addItem(Integer.toString(rowData));
            }

        } catch (Exception ex) {
            Logger.getLogger(ReservationsView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void loadComboRoom() {
        comboRoom.removeAllItems();
        try {
            //DefaultComboBoxModel dtm = new DefaultComboBoxModel();
            List<RoomsDto> roomsDtos = roomsController.getAllRooms();
            for (RoomsDto roomsDto : roomsDtos) {
                Integer rowData = roomsDto.getRoomID();
                comboRoom.addItem(Integer.toString(rowData));
            }

        } catch (Exception ex) {
            Logger.getLogger(ReservationsView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void refreshTable() {
        loadReservations();
    }

    private void loadDates() {
        jDateCheckIn.getJCalendar().setMinSelectableDate((new Date()));
        jDateCheckOut.getJCalendar().setMinSelectableDate((new Date()));
    }

    private void calculateAmmount() {
        try {
            String roomId = (String) comboRoom.getSelectedItem();
            RoomsDto roomsDto = roomsController.getRoom(roomId);

            String packageName = (String) comboPkg.getSelectedItem();
            PackageDto packageDto = packageController.getPackage(packageName);

            if (roomsDto != null) {
                Double roomRate = roomsDto.getRoomRate();
                Double packageRate = packageDto.getPkgAmount();

                Double totalAmmount = roomRate + packageRate;
                txtTotalAmount.setText(totalAmmount.toString());
                txtTotalAmount.setBackground(Color.white);
            } else {
                JOptionPane.showMessageDialog(this, "Error in Total");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error");
            Logger.getLogger(ReservationsView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void totalAmountColour() {
        txtTotalAmount.setBackground(Color.red);
    }

}
