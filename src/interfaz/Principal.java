/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author w8
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();

        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdLlAutomatico, cmdManual, cmdOperar};
        Helper.HabilitarBotones(botonesH);
        Helper.DeshabilitarBotones(botonesD);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroColumnas = new javax.swing.JTextField();
        txtNumeroFilas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatrizFinal = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatrizInicial = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        cmdLlAutomatico = new javax.swing.JButton();
        cmdCrear = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmbOpciones = new javax.swing.JComboBox<>();
        cmdOperar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matriz taller 1");
        setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Matriz", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("N° de columnas");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("N° de filas");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txtNumeroColumnas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtNumeroColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroColumnasKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumeroColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 50, -1));

        txtNumeroFilas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtNumeroFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroFilasKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumeroFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 50, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 190, 120));

        tblMatrizFinal.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblMatrizFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMatrizFinal.setEnabled(false);
        jScrollPane1.setViewportView(tblMatrizFinal);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 190, 100));

        tblMatrizInicial.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblMatrizInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMatrizInicial.setEnabled(false);
        tblMatrizInicial.setFocusCycleRoot(true);
        jScrollPane2.setViewportView(tblMatrizInicial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 190, 100));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Botones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdLlAutomatico.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdLlAutomatico.setText("Automatico");
        cmdLlAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlAutomaticoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, -1));

        cmdCrear.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, -1));

        cmdLimpiar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 70, -1));

        cmdManual.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdManual.setText("Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, -1));

        cmbOpciones.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmbOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diagonal Secundaria", "Triangular Superior", "Triangular Inferior", "Traspuesta", "Letra A", "Letra Z", "Letra T", "Letra V", "Letra E", "Letra F", "Letra P", "Letra I", "Letra N", "Letra Y", "Letra X" }));
        jPanel3.add(cmbOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 70, -1));

        cmdOperar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdOperar.setText("Operar");
        cmdOperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdOperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 70, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 190, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(495, 354));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tm, tm2;
        int nf = 0, nc = 0, sw = 1;

        tm = (DefaultTableModel) tblMatrizInicial.getModel();
        tm2 = (DefaultTableModel) tblMatrizFinal.getModel();

        try {
            nf = Integer.parseInt(txtNumeroFilas.getText());
            nc = Integer.parseInt(txtNumeroColumnas.getText());
        } catch (NumberFormatException e) {
            Helper.mensaje(this, "Por favor digite los datos correctamente", "Error", 2);
            sw = 0;
        }
        if (sw == 1) {

            if (nf > 7) {
                Helper.mensaje(this, "No puede ser superior a 7", "Error", 2);
                txtNumeroFilas.requestFocusInWindow();
                txtNumeroFilas.selectAll();
            } else if (nc > 7) {
                Helper.mensaje(this, "No puede ser superior a 7", "Error", 2);
                txtNumeroColumnas.requestFocusInWindow();
                txtNumeroColumnas.selectAll();
            } else if (nc < 5) {
                Helper.mensaje(this, "No puede ser menor a 5", "Error", 2);
                txtNumeroColumnas.requestFocusInWindow();
                txtNumeroColumnas.selectAll();
            } else if (nf < 5) {
                Helper.mensaje(this, "No puede ser menor a 5", "Error", 2);
                txtNumeroFilas.requestFocusInWindow();
                txtNumeroFilas.selectAll();
            } else if (nc == 0) {
                Helper.mensaje(this, "No puede ser 0", "Error", 2);
                txtNumeroColumnas.requestFocusInWindow();
                txtNumeroColumnas.selectAll();
            } else if (nf == 0) {
                Helper.mensaje(this, "No puede ser 0", "Error", 2);
                txtNumeroFilas.requestFocusInWindow();
                txtNumeroFilas.selectAll();
            } else {

                tm.setRowCount(nf);
                tm.setColumnCount(nc);

                tm2.setRowCount(nf);
                tm2.setColumnCount(nc);

                JButton botonesH[] = {cmdLimpiar, cmdLlAutomatico, cmdManual};
                JButton botonesD[] = {cmdCrear, cmdOperar};
                Helper.HabilitarBotones(botonesH);
                Helper.DeshabilitarBotones(botonesD);
                txtNumeroColumnas.setEditable(false);
                txtNumeroFilas.setEditable(false);
            }
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlAutomaticoActionPerformed
        // TODO add your handling code here:

        int nf, nc;
        int n;
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 25 + 1);
                tblMatrizInicial.setValueAt(n, i, j);
            }

        }

        JButton botonesH[] = {cmdLimpiar, cmdOperar};
        JButton botonesD[] = {cmdCrear, cmdLlAutomatico, cmdManual};
        Helper.HabilitarBotones(botonesH);
        Helper.DeshabilitarBotones(botonesD);

    }//GEN-LAST:event_cmdLlAutomaticoActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        // TODO add your handling code here:

        Helper.TablaPorDefecto(tblMatrizInicial);
        Helper.TablaPorDefecto(tblMatrizFinal);

        txtNumeroFilas.setText("");
        txtNumeroColumnas.setText("");
        txtNumeroFilas.requestFocusInWindow();
        cmbOpciones.setSelectedIndex(0);

        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdLlAutomatico, cmdManual, cmdOperar};
        txtNumeroColumnas.setEditable(true);
        txtNumeroFilas.setEditable(true);
        Helper.HabilitarBotones(botonesH);
        Helper.DeshabilitarBotones(botonesD);

    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed
        // TODO add your handling code here:

        int nf, nc, res, aux;
        double n;
        boolean sw = true;
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    aux = 1;
                    try {
                        n = Double.parseDouble(Helper.RecibirDatos(this, "Digite el elemento en la posición: [" + i + "][" + j + "]"));
                        tblMatrizInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Digite la información correctamente", "Error", JOptionPane.ERROR_MESSAGE);
                        aux = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Desea Salir?", "Salir", JOptionPane.YES_NO_OPTION);

                        if (res == 0) {
                            aux = 1;
                            j = nc;
                            i = nf;
                            sw = false;
                            JButton botonesH[] = {cmdCrear, cmdLimpiar};
                            JButton botonesD[] = {cmdLlAutomatico, cmdManual, cmdOperar};
                            Helper.HabilitarBotones(botonesH);
                            Helper.DeshabilitarBotones(botonesD);
                            Helper.TablaPorDefecto(tblMatrizInicial);
                            Helper.TablaPorDefecto(tblMatrizFinal);

                        } else {
                            aux = 0;
                            JButton botonesH[] = {cmdOperar, cmdLimpiar};
                            JButton botonesD[] = {cmdLlAutomatico, cmdManual, cmdCrear};
                            Helper.HabilitarBotones(botonesH);
                            Helper.DeshabilitarBotones(botonesD);
                        }

                    }
                } while (aux == 0);

            }

        }


    }//GEN-LAST:event_cmdManualActionPerformed

    private void cmdOperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperarActionPerformed
        // TODO add your handling code here:
        int op, nf, nc, n, a;

        op = cmbOpciones.getSelectedIndex();
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();

        Helper.LimpiarTabla(tblMatrizFinal);
        switch (op) {
            case 0:
                if (nf == nc) {
                    Helper.DiagonalSecundaria(tblMatrizInicial, tblMatrizFinal);
                } else {
                    Helper.mensaje(this, "No se puede resolver, el número de filas debe ser igual al número de columnas", "Error", 2);
                }
                break;
            case 1:
                if (nf == nc) {
                    Helper.TriangularSuperior(tblMatrizInicial, tblMatrizFinal);
                } else {
                    Helper.mensaje(this, "No se puede resolver, el número de filas debe ser igual al número de columnas", "Error", 2);
                }
                break;
            case 2:
                if (nf == nc) {
                    Helper.TriangularInferior(tblMatrizInicial, tblMatrizFinal);
                } else {
                    Helper.mensaje(this, "No se puede resolver, el número de filas debe ser igual al número de columnas", "Error", 2);
                }
                break;
            case 3:
                if (nf == nc) {
                    Helper.Traspuesta(tblMatrizInicial, tblMatrizFinal);
                } else {
                    Helper.mensaje(this, "No se puede resolver, el número de filas debe ser igual al número de columnas", "Error", 2);
                }
                break;
            case 4:
                Helper.LetraA(tblMatrizInicial, tblMatrizFinal);
                break;
            case 5:
                if (nf == nc) {
                    Helper.LetraZ(tblMatrizInicial, tblMatrizFinal);
                } else {
                    Helper.mensaje(this, "No se puede resolver, el número de filas debe ser igual al número de columnas", "Error", 2);
                }
                break;
            case 6:
                if (nc % 2 == 1) {
                    Helper.LetraT(tblMatrizInicial, tblMatrizFinal);
                } else {
                    Helper.mensaje(this, "El número de columnas debe ser impar", "Error", 2);
                }
                break;
            case 7:
                if (nf == nc) {
                    Helper.mensaje(this, "El número de filas y columnas debe ser igual a 7", "Error", 2);
                    if (nf == 7 && nc == 7) {
                        Helper.LetraV(tblMatrizInicial, tblMatrizFinal);
                    }
                } else {
                    Helper.mensaje(this, "No se puede resolver, el número de filas debe ser igual al número de columnas", "Error", 2);
                }
                break;
            case 8:
                if (nf == nc) {
                    Helper.mensaje(this, "Las filas y columnas deben ser impares", "Error", 2);
                    if (nc % 2 == 1 && nf % 2 == 1) {
                        Helper.LetraE(tblMatrizInicial, tblMatrizFinal);
                    }
                } else {
                    Helper.mensaje(this, "No se puede resolver, el número de filas debe ser igual al número de columnas", "Error", 2);
                }
                break;
            case 9:
                Helper.LetraF(tblMatrizInicial, tblMatrizFinal);
                break;
            case 10:

                Helper.LetraP(tblMatrizInicial, tblMatrizFinal);

                break;
            case 11:
                if (nc % 2 == 1) {
                    Helper.LetraI(tblMatrizInicial, tblMatrizFinal);
                } else {
                    Helper.mensaje(this, "El número de columnas debe ser impar", "Error", 2);
                }
                break;
            case 12:
                Helper.LetraN(tblMatrizInicial, tblMatrizFinal);
                break;
            case 13:
                if (nc % 2 == 1) {
                    Helper.LetraY(tblMatrizInicial, tblMatrizFinal);
                } else {
                    Helper.mensaje(this, "El número de columnas debe ser impar", "Error", 2);
                }
                break;
            case 14:
                if (nf == nc) {
                    Helper.LetraX(tblMatrizInicial, tblMatrizFinal);
                } else {
                    Helper.mensaje(this, "No se puede resolver, el número de filas debe ser igual al número de columnas", "Error", 2);
                }
                break;
        }


    }//GEN-LAST:event_cmdOperarActionPerformed

    private void txtNumeroFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroFilasKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroFilasKeyTyped

    private void txtNumeroColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroColumnasKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroColumnasKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOpciones;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLlAutomatico;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdOperar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMatrizFinal;
    private javax.swing.JTable tblMatrizInicial;
    private javax.swing.JTextField txtNumeroColumnas;
    private javax.swing.JTextField txtNumeroFilas;
    // End of variables declaration//GEN-END:variables
}
