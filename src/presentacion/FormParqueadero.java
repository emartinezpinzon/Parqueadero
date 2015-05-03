package presentacion;

/**
 * @author Emanuel Martínez Pinzón
 */

import negocio.Parqueadero;

public class FormParqueadero extends javax.swing.JFrame {

    private Parqueadero parqueadero;
    
    public FormParqueadero() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.parqueadero = new Parqueadero();
        this.parqueadero.setTarifaHora(Integer.parseInt(this.txtTarifaHora.getText()));
        this.parqueadero.setTarifaFraccion(Integer.parseInt(this.txtTarifaFraccion.getText()));
        this.cmdCambiarTarifa.setEnabled(false);
        this.txtAreaInfo.setText("Parqueadero");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaInfo = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbHoraParquear = new javax.swing.JComboBox();
        cmbMinutoParquear = new javax.swing.JComboBox();
        txtPlaca = new javax.swing.JTextField();
        cmdParquear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbAutoARetirar = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cmbHoraSalida = new javax.swing.JComboBox();
        cmbMinutoSalida = new javax.swing.JComboBox();
        cmdRetirarCarro = new javax.swing.JButton();
        cmdDineroRecaudado = new javax.swing.JButton();
        cmdPuestosOcupados = new javax.swing.JButton();
        cmdPuestosLibres = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTarifaHora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTarifaFraccion = new javax.swing.JTextField();
        cmdCambiarTarifa = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parqueadero");
        setResizable(false);

        txtAreaInfo.setEditable(false);
        txtAreaInfo.setColumns(20);
        txtAreaInfo.setRows(5);
        jScrollPane1.setViewportView(txtAreaInfo);

        jLabel1.setText("Placa: ");

        jLabel2.setText("Hora y minuto de ingreso");

        cmbHoraParquear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        cmbMinutoParquear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        cmdParquear.setText("Parquear");
        cmdParquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdParquearActionPerformed(evt);
            }
        });

        jLabel3.setText("Auto: ");

        jLabel6.setText("Hora y minuto de la salida");

        cmbHoraSalida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        cmbMinutoSalida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        cmdRetirarCarro.setText("Retirar");
        cmdRetirarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRetirarCarroActionPerformed(evt);
            }
        });

        cmdDineroRecaudado.setText("Total de dinero recaudado");
        cmdDineroRecaudado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDineroRecaudadoActionPerformed(evt);
            }
        });

        cmdPuestosOcupados.setText("Puestos ocupados");
        cmdPuestosOcupados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPuestosOcupadosActionPerformed(evt);
            }
        });

        cmdPuestosLibres.setText("Puestos libres");
        cmdPuestosLibres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPuestosLibresActionPerformed(evt);
            }
        });

        jLabel7.setText("Cambiar tarifa de parqueo");

        txtTarifaHora.setText("1000");
        txtTarifaHora.setToolTipText("");

        jLabel4.setText("Hora: ");

        jLabel5.setText("Fracción: ");

        txtTarifaFraccion.setText("500");

        cmdCambiarTarifa.setText("Establecer");
        cmdCambiarTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCambiarTarifaActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Off");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbAutoARetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmdParquear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbHoraParquear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMinutoParquear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdRetirarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMinutoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPlaca))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmdPuestosLibres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdPuestosOcupados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdDineroRecaudado, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTarifaHora)
                                .addComponent(txtTarifaFraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jToggleButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdCambiarTarifa))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbHoraParquear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMinutoParquear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdParquear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbAutoARetirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbMinutoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdRetirarCarro)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmdDineroRecaudado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdPuestosOcupados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdPuestosLibres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTarifaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTarifaFraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdCambiarTarifa)
                            .addComponent(jToggleButton1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdParquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdParquearActionPerformed
        String placa = this.txtPlaca.getText();
        String hora = this.cmbHoraParquear.getSelectedItem().toString();
        String minuto = this.cmbMinutoParquear.getSelectedItem().toString();
        
        if(placa.isEmpty()){
            Ventana.imp("Debe ingresar la placa del vehiculo", "Sistema");
            return;
        }
        
        String mensaje = this.parqueadero.parquearCarro(placa, hora, minuto);
        Ventana.imp(mensaje, "Sistema");
        this.txtAreaInfo.setText("Parqueadero\n\n"+this.parqueadero.concatenarInfoCarros());
        this.txtPlaca.setText("");
        this.llenarComboCarro();
    }//GEN-LAST:event_cmdParquearActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if(this.jToggleButton1.isSelected()){
            this.jToggleButton1.setText("On");
            this.cmdCambiarTarifa.setEnabled(true);
        }else{
            this.jToggleButton1.setText("Off");
            this.cmdCambiarTarifa.setEnabled(false);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void cmdRetirarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRetirarCarroActionPerformed
        String placa = this.cmbAutoARetirar.getSelectedItem().toString();
        String hora = this.cmbHoraSalida.getSelectedItem().toString();
        String minuto = this.cmbMinutoSalida.getSelectedItem().toString();
        
        if(placa.isEmpty()){
            Ventana.imp("No hay ningún carro parqueado", "Sistema");
            return;
        }
        
        String mensaje = this.parqueadero.retirarCarro(placa, hora, minuto);
        Ventana.imp(mensaje, "Sistema");
        this.llenarComboCarro();
        this.txtAreaInfo.setText("Parqueadero\n\n"+this.parqueadero.concatenarInfoCarros());
    }//GEN-LAST:event_cmdRetirarCarroActionPerformed

    private void cmdPuestosOcupadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPuestosOcupadosActionPerformed
        this.txtAreaInfo.setText("Parqueadero\n\n"+this.parqueadero.concatenarInfoCarros());
    }//GEN-LAST:event_cmdPuestosOcupadosActionPerformed

    private void cmdDineroRecaudadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDineroRecaudadoActionPerformed
        this.txtAreaInfo.setText("Total recaudado: "+this.parqueadero.getTotalRecaudado());
    }//GEN-LAST:event_cmdDineroRecaudadoActionPerformed

    private void cmdCambiarTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCambiarTarifaActionPerformed
        String tarifaHora = this.txtTarifaHora.getText();
        String tarifaFraccion = this.txtTarifaFraccion.getText();
        
        int hora = 0;
        int fraccion = 0;
        
        try{
            hora = Integer.parseInt(tarifaHora);
            fraccion = Integer.parseInt(tarifaFraccion);
        }catch(NumberFormatException nfe){
            Ventana.imp("Debe ingresar valores numericos", "Sistema");
            return;
        }
        
        this.parqueadero.setTarifaHora(hora);
        this.parqueadero.setTarifaFraccion(fraccion);
        
        Ventana.imp("Ha actualizado el precio de la tarifa de cobro", "Sistema");
    }//GEN-LAST:event_cmdCambiarTarifaActionPerformed

    private void cmdPuestosLibresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPuestosLibresActionPerformed
        this.txtAreaInfo.setText("Puestos libres\n\n"+this.parqueadero.InfoPuestosLibres());
    }//GEN-LAST:event_cmdPuestosLibresActionPerformed

    public void llenarComboCarro(){
        String []carro = this.parqueadero.concatenarPlacasCarros().split("~");
        this.cmbAutoARetirar.removeAllItems();
        for(String c: carro)
            this.cmbAutoARetirar.addItem(c);
    }
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormParqueadero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbAutoARetirar;
    private javax.swing.JComboBox cmbHoraParquear;
    private javax.swing.JComboBox cmbHoraSalida;
    private javax.swing.JComboBox cmbMinutoParquear;
    private javax.swing.JComboBox cmbMinutoSalida;
    private javax.swing.JButton cmdCambiarTarifa;
    private javax.swing.JButton cmdDineroRecaudado;
    private javax.swing.JButton cmdParquear;
    private javax.swing.JButton cmdPuestosLibres;
    private javax.swing.JButton cmdPuestosOcupados;
    private javax.swing.JButton cmdRetirarCarro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextArea txtAreaInfo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtTarifaFraccion;
    private javax.swing.JTextField txtTarifaHora;
    // End of variables declaration//GEN-END:variables
}
