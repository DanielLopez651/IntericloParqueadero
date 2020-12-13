package Vista;

import Controlador.ControladorEspacio;

import Controlador.ControladorTicket;
import Controlador.ControladorVehiculo;


public class submenu2 extends javax.swing.JInternalFrame {

    private ControladorVehiculo controladorVehiculo;
    private ControladorTicket controladorTicket;
    private ControladorEspacio controladorEspacio;

    public submenu2(ControladorTicket controladorTicket, ControladorVehiculo controladorVehiculo,
            ControladorEspacio controladorEspacio) {
        initComponents();
        this.controladorTicket = controladorTicket;
        this.controladorVehiculo = controladorVehiculo;
        this.controladorEspacio = controladorEspacio;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        salidaTxt = new javax.swing.JTextArea();
        listV = new javax.swing.JButton();
        listT = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnEspacios = new javax.swing.JButton();

        setClosable(true);

        salidaTxt.setColumns(20);
        salidaTxt.setRows(5);
        jScrollPane1.setViewportView(salidaTxt);

        listV.setText("Listar Vehiculos");
        listV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listVActionPerformed(evt);
            }
        });

        listT.setText("Listar Tickets");
        listT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listTActionPerformed(evt);
            }
        });

        btnReportes.setText("Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        btnEspacios.setText("listar espacios");
        btnEspacios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspaciosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(listV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReportes)
                .addGap(30, 30, 30)
                .addComponent(btnEspacios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(listT)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listT)
                    .addComponent(listV)
                    .addComponent(btnReportes)
                    .addComponent(btnEspacios))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listTActionPerformed
        showT();
    }//GEN-LAST:event_listTActionPerformed

    private void listVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listVActionPerformed
        showV();

    }//GEN-LAST:event_listVActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        salidaTxt.setText("");
        salidaTxt.append("Espacios disponibles: " + controladorEspacio.espaciosDisponibles() + "\nIngresosTotales"
                + controladorTicket.reporteDeIngresos());
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnEspaciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspaciosActionPerformed
        salidaTxt.setText("");
        for (int i = 0; i < controladorEspacio.espaciosTotales(); i++) {
            salidaTxt.append(controladorEspacio.regresaEspacio(i).toString() + "\n");
        }
    }//GEN-LAST:event_btnEspaciosActionPerformed

    private void showV() {
        salidaTxt.setText("");
        for (int i = 0; i < controladorVehiculo.numListV(); i++) {
            salidaTxt.append(controladorVehiculo.showListV(i) + "\n");
        }
    }

    private void showT() {
        salidaTxt.setText("");
        for (int i = 0; i < controladorTicket.numListT(); i++) {
            salidaTxt.append(controladorTicket.showListT(i) + "\n");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEspacios;
    private javax.swing.JButton btnReportes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listT;
    private javax.swing.JButton listV;
    private javax.swing.JTextArea salidaTxt;
    // End of variables declaration//GEN-END:variables
}
