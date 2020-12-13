package Vista;

import Controlador.ControladorEspacio;

import Controlador.ControladorTicket;
import Controlador.ControladorVehiculo;
import java.io.IOException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class submenu1 extends javax.swing.JInternalFrame {

    private ControladorVehiculo controladorVehiculo;
    private ControladorTicket controladorTicket;
    private ControladorEspacio controladorEspacio;

    public submenu1(ControladorTicket controladorTicket, ControladorVehiculo controladorVehiculo,
            ControladorEspacio controladorEspacio) {
        this.controladorTicket = controladorTicket;
        this.controladorVehiculo = controladorVehiculo;
        this.controladorEspacio = controladorEspacio;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTit = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        lblCod = new javax.swing.JLabel();
        lblPlac = new javax.swing.JLabel();
        plac = new javax.swing.JTextField();
        lblMarc = new javax.swing.JLabel();
        marc = new javax.swing.JTextField();
        lblMod = new javax.swing.JLabel();
        mod = new javax.swing.JTextField();
        nuevo = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        lblCod1 = new javax.swing.JLabel();
        espacio = new javax.swing.JTextField();

        setClosable(true);

        lblTit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTit.setText("Ingreso de Vehiculos");

        cod.setEnabled(false);

        lblCod.setText("Codigo:");

        lblPlac.setText("Placa:");

        plac.setEnabled(false);

        lblMarc.setText("Marca:");

        marc.setEnabled(false);

        lblMod.setText("Modelo:");

        mod.setEnabled(false);

        nuevo.setText(" Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        ingresar.setText("Ingresar");
        ingresar.setEnabled(false);
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        lblCod1.setText("Espacio");

        espacio.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPlac)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plac, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(nuevo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMarc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(marc, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCod1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(espacio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ingresar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(lblTit)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTit)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCod)
                    .addComponent(lblPlac)
                    .addComponent(plac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarc)
                    .addComponent(marc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMod)
                    .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCod1)
                    .addComponent(espacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo)
                    .addComponent(ingresar))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        plac.setEnabled(true);
        mod.setEnabled(true);
        marc.setEnabled(true);
        ingresar.setEnabled(true);
        espacio.setEnabled(true);
        cod.setText((controladorTicket.numListT() + 1) + "");
    }//GEN-LAST:event_nuevoActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        nuevo();
    }//GEN-LAST:event_ingresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cod;
    private javax.swing.JTextField espacio;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblCod1;
    private javax.swing.JLabel lblMarc;
    private javax.swing.JLabel lblMod;
    private javax.swing.JLabel lblPlac;
    private javax.swing.JLabel lblTit;
    private javax.swing.JTextField marc;
    private javax.swing.JTextField mod;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField plac;
    // End of variables declaration//GEN-END:variables

    private void nuevo() {
        if (!plac.getText().equalsIgnoreCase("")) {
            if (!mod.getText().equalsIgnoreCase("")) {
                if (!marc.getText().equalsIgnoreCase("")) {
                    if (controladorVehiculo.validarPlca(plac.getText())) {
                        if (!controladorEspacio.regresaEspacio(Integer.parseInt(espacio.getText())).isArrendado()) {
                            controladorTicket.ingNuevTick(Integer.parseInt(cod.getText()), plac.getText(), mod.getText(), marc.getText());
                            controladorEspacio.arrendarEspacio(plac.getText(), Integer.parseInt(espacio.getText()));
                            cod.setText("");
                            plac.setText("");
                            marc.setText("");
                            mod.setText("");
                            espacio.setText("");
                            plac.setEnabled(false);
                            marc.setEnabled(false);
                            mod.setEnabled(false);
                            cod.setEnabled(false);

                            JOptionPane.showMessageDialog(this, "Ingresado correctamente");
                            ingresar.setEnabled(false);
                            try {
                                controladorVehiculo.guardar();
                            } catch (IOException ex) {
                                Logger.getLogger(submenu1.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Espacio ocupado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, controladorVehiculo.getErr());
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Ingrese una marca");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese un modelo");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese una placa");
        }
    }

}
