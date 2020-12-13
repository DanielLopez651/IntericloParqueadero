package Vista;

import Controlador.ControladorEspacio;

import Controlador.ControladorTicket;
import Controlador.ControladorVehiculo;
import Modelo.Ticket;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class submenu3 extends javax.swing.JInternalFrame {

    private ControladorVehiculo controladorVehiculo;
    private ControladorTicket controladorTicket;
    private ControladorEspacio controladorEspacio;

    public submenu3(ControladorTicket controladorTicket, ControladorVehiculo controladorVehiculo,
            ControladorEspacio controladorEspacio) {
        initComponents();
        this.controladorTicket = controladorTicket;
        this.controladorVehiculo = controladorVehiculo;
        this.controladorEspacio = controladorEspacio;

    }

    private int h;
    private int m;
    private int s;
    private boolean ver;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFSal = new javax.swing.JLabel();
        fSal = new javax.swing.JTextField();
        hAct = new javax.swing.JButton();
        calc = new javax.swing.JButton();
        lblTot = new javax.swing.JLabel();
        pago = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        lblplac = new javax.swing.JLabel();
        lblefechin = new javax.swing.JLabel();
        plac = new javax.swing.JLabel();
        fechin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pagar = new javax.swing.JButton();
        lblplac1 = new javax.swing.JLabel();
        espacio = new javax.swing.JLabel();

        setClosable(true);

        lblFSal.setText("Fecha Salida:");

        hAct.setText("Hora Actual");
        hAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActActionPerformed(evt);
            }
        });

        calc.setText("Calcular");
        calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcActionPerformed(evt);
            }
        });

        lblTot.setText("Total a Pagar:");

        pago.setText("0");

        lblCod.setText("Codigo :");

        cod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codKeyPressed(evt);
            }
        });

        lblplac.setText("Placa");

        lblefechin.setText("Fecha Entrada");

        jLabel1.setText("Aplaste ENTER para cargar los datos");

        pagar.setText("Pagar");
        pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarActionPerformed(evt);
            }
        });

        lblplac1.setText("Espacio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lblCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFSal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fSal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hAct))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblplac)
                                    .addGap(65, 65, 65)
                                    .addComponent(plac, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblefechin)
                                    .addGap(18, 18, 18)
                                    .addComponent(fechin, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblplac1)
                                .addGap(18, 18, 18)
                                .addComponent(espacio, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(calc)
                                .addGap(79, 79, 79)
                                .addComponent(pagar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTot)
                                .addGap(51, 51, 51)
                                .addComponent(pago)))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCod)
                        .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblplac)
                    .addComponent(plac, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblplac1)
                    .addComponent(espacio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblefechin, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hAct)
                    .addComponent(lblFSal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTot)
                    .addComponent(pago))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calc)
                    .addComponent(pagar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hActActionPerformed
        horaActual();
    }//GEN-LAST:event_hActActionPerformed

    private void calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcActionPerformed
        try {
            calcular();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_calcActionPerformed

    private void codKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrBusq1();

        }
    }//GEN-LAST:event_codKeyPressed

    private void pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarActionPerformed
        pagar();
        
    }//GEN-LAST:event_pagarActionPerformed

    private void calcular() throws Exception {
        double tot;
        int codigo = 0;
        try {
            if (!ver) {
                String g = fSal.getText();
                h = Integer.parseInt(g.substring(0, 1));
                m = Integer.parseInt(g.substring(3, 4));
                s = Integer.parseInt(g.substring(6, 7));
            }
            codigo = Integer.parseInt(cod.getText());
            tot = controladorTicket.pagar(h, m, s, codigo);
            pago.setText(tot + "");
            controladorEspacio.deuda(Integer.parseInt(espacio.getText()));
        } catch (NumberFormatException e) {
            throw new Exception("Ingrese solo numeros");
        } catch (StringIndexOutOfBoundsException e) {
            throw new Exception("Ingrese la fecha correctamente");
        }

    }

    private void horaActual() {
        Date d = new Date();
        h = (int) d.getHours();
        m = (int) d.getMinutes();
        s = (int) d.getSeconds();
        ver = true;
        fSal.setText(h + ":" + m + ":" + s);
    }

    private void entrBusq1() {
        int num = Integer.parseInt(cod.getText());
        Ticket h = controladorTicket.buscTick(num);
        if (h != null) {
            plac.setText(h.getVeh().getPlaca());
            fechin.setText(h.getFechaHoraIinicio());
            for (int i = 0; i < controladorEspacio.espaciosTotales(); i++) {
                if (controladorEspacio.regresaEspacio(i).getVehiculo() != null) {
                    if (controladorEspacio.regresaEspacio(i).getVehiculo().getPlaca().equals(h.getVeh().getPlaca())) {
                        espacio.setText((i + 1) + "");
                    }
                }
            }

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calc;
    private javax.swing.JTextField cod;
    private javax.swing.JLabel espacio;
    private javax.swing.JTextField fSal;
    private javax.swing.JLabel fechin;
    private javax.swing.JButton hAct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblFSal;
    private javax.swing.JLabel lblTot;
    private javax.swing.JLabel lblefechin;
    private javax.swing.JLabel lblplac;
    private javax.swing.JLabel lblplac1;
    private javax.swing.JButton pagar;
    private javax.swing.JLabel pago;
    private javax.swing.JLabel plac;
    // End of variables declaration//GEN-END:variables

    private void pagar() {
        if (!cod.getText().equalsIgnoreCase("")) {
            if (!fSal.getText().equalsIgnoreCase("")) {
                controladorEspacio.quitarArriendo(Integer.parseInt(espacio.getText()));
                controladorEspacio.quitarDeuda(Integer.parseInt(espacio.getText()));
                controladorTicket.editTicket(Integer.parseInt(cod.getText()), controladorTicket.getSub1(),
                        controladorTicket.getSal());
                JOptionPane.showMessageDialog(this, "Pagado Ticket " + cod.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese una fecha valida");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un codigo");
        }
        try {
            controladorTicket.guardar();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
