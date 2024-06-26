/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.layered.view;

import edu.ijse.layered.controller.PackageController;
import edu.ijse.layered.dto.PackageDto;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Home
 */
public class PackageView extends javax.swing.JFrame {
    
    private PackageController packageController;

    /**
     * Creates new form PackageView
     */
    public PackageView() {
        packageController = new PackageController();
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/Icon2.png")));
        this.setLocationRelativeTo(null);
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReservationsView = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRoomsView = new javax.swing.JButton();
        lblPkgName = new javax.swing.JLabel();
        btnCustomersView = new javax.swing.JButton();
        txtPkgName = new javax.swing.JTextField();
        lblPkgRate = new javax.swing.JLabel();
        txtPkgRate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPackages = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Package Management");

        btnReservationsView.setText("Reservations");
        btnReservationsView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservationsViewActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Packages");

        btnRoomsView.setText("Rooms");
        btnRoomsView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomsViewActionPerformed(evt);
            }
        });

        lblPkgName.setText("Package Name");

        btnCustomersView.setText("Customers");
        btnCustomersView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomersViewActionPerformed(evt);
            }
        });

        lblPkgRate.setText("Rate");

        tblPackages.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPackages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPackagesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPackages);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPkgName)
                                    .addComponent(lblPkgRate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPkgRate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPkgName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnReservationsView, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                    .addComponent(btnRoomsView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCustomersView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPkgName)
                    .addComponent(txtPkgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReservationsView))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPkgRate)
                            .addComponent(txtPkgRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnRoomsView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCustomersView)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservationsViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservationsViewActionPerformed
        new ReservationsView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReservationsViewActionPerformed

    private void btnRoomsViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomsViewActionPerformed
        new RoomsView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRoomsViewActionPerformed

    private void btnCustomersViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomersViewActionPerformed
        new CustomerView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCustomersViewActionPerformed

    private void tblPackagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPackagesMouseClicked
        searchPackage();
    }//GEN-LAST:event_tblPackagesMouseClicked

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
//            java.util.logging.Logger.getLogger(PackageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PackageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PackageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PackageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PackageView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomersView;
    private javax.swing.JButton btnReservationsView;
    private javax.swing.JButton btnRoomsView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPkgName;
    private javax.swing.JLabel lblPkgRate;
    private javax.swing.JTable tblPackages;
    private javax.swing.JTextField txtPkgName;
    private javax.swing.JTextField txtPkgRate;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        try {
            String[] columns = {"Package Name", "Package Rate"};
            DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            tblPackages.setModel(dtm);

            List<PackageDto> packageDtos = packageController.getAll();
            for (PackageDto packageDto : packageDtos) {
                Object[] rowData = {packageDto.getPkgName(), packageDto.getPkgAmount()};
                dtm.addRow(rowData);

            }
        } catch (Exception ex) {
            Logger.getLogger(PackageView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    
    
    }

    private void searchPackage() {
        String id = tblPackages.getValueAt(tblPackages.getSelectedRow(), 0).toString();
        try {
            PackageDto dto = packageController.getPackage(id);

            if (dto != null) {
                txtPkgName.setText(dto.getPkgName());
                txtPkgRate.setText("LKR " + Double.toString(dto.getPkgAmount()));

            } else {
                JOptionPane.showMessageDialog(this, "Package Not Found");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    
    }
}
