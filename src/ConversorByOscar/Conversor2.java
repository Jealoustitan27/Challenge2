package ConversorByOscar;

import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class Conversor2 extends javax.swing.JFrame {

    public Conversor2() {
        initComponents();
    }
    //variables
    public String moneda;
    double x = 0;
    //fin variable

    //inicio conversor 
    //contador inicio
    //inicio caracteres en text area
    //fin coversor  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        V1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CB1 = new javax.swing.JComboBox<>();
        V2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(0, 153, 255));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, 20));

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, 20));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Conversor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 76, 41));

        V1.setBackground(new java.awt.Color(255, 255, 255));
        V1.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(V1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 90, 36));

        jLabel2.setText("Ingresa el monto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel3.setText("Selecciona la divisa");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        CB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elije una opción", "Pesos a Dólar", "Pesos a Euros", "Pesos a Libras Esterlinas", "Pesos a Yen Japonés", "Pesos a Won sul-coreano", "Dolar a pesos", " Euros a pesos", "Libras Esterlinas a pesos", "Yen Japonés a pesos", "Won sul-coreano a pesos" }));
        CB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB1ActionPerformed(evt);
            }
        });
        getContentPane().add(CB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        V2.setBackground(new java.awt.Color(255, 255, 255));
        V2.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(V2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 140, 40));

        jLabel4.setText("Valor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ConversorByOscar/monedas2.gif"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 320, 210));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ConversorByOscar/monedas2.gif"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 0, 390, 210));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB1ActionPerformed

        try {
            int c = CB1.getSelectedIndex();
            double res;
            switch (c) {//inicio switch
                case 0:

                    V2.setText("");
                    break;
                case 1:

                    moneda = V1.getText();
                    x = Double.parseDouble(moneda);
                    if (x <= 0) {
                        JOptionPane.showMessageDialog(null, "Ingrese un valor a transformar de manera correcta");
                    } else {
                        res = x * 0.054;
                        V2.setText("" + res);
                    }

                    break;
                case 2:

                    moneda = V1.getText();
                    x = Double.parseDouble(moneda);
                    if (x <= 0) {
                        JOptionPane.showMessageDialog(null, "Ingrese un valor a transformar de manera correcta");
                    } else {
                        res = x * 0.051;
                        V2.setText("" + res);
                    }

                    break;
                case 3:
                    moneda = V1.getText();
                    x = Double.parseDouble(moneda);
                    if (x <= 0) {
                        JOptionPane.showMessageDialog(null, "Ingrese un valor a transformar de manera correcta");
                    } else {
                        res = x * 0.90;
                        V2.setText("" + res);
                    }

                    break;
                case 4:
                    moneda = V1.getText();
                    x = Double.parseDouble(moneda);
                    if (x <= 0) {
                        JOptionPane.showMessageDialog(null, "Ingrese un valor a transformar de manera correcta");
                    } else {
                        res = x * 7.30;
                        V2.setText("" + res);
                    }

                    break;
                case 5:

                    moneda = V1.getText();
                    x = Double.parseDouble(moneda);

                    if (x <= 0) {
                        JOptionPane.showMessageDialog(null, "Ingrese un valor a transformar de manera correcta");
                    } else {
                        res = x * 70.51;
                        V2.setText("" + res);
                    }

                    break;
                case 6:
                    moneda = V1.getText();
                    x = Double.parseDouble(moneda);
                    if (x <= 0) {
                        JOptionPane.showMessageDialog(null, "Ingrese un valor a transformar de manera correcta");
                    } else {
                        res = x * 18.40;
                        V2.setText("" + res);
                    }

                    break;
                case 7:

                    moneda = V1.getText();
                    x = Double.parseDouble(moneda);
                    if (x <= 0) {
                        JOptionPane.showMessageDialog(null, "Ingrese un valor a transformar de manera correcta");
                    } else {
                        res = x * 19.64;
                        V2.setText("" + res);
                    }

                    break;
                case 8:
                    moneda = V1.getText();
                    x = Double.parseDouble(moneda);
                    if (x <= 0) {
                        JOptionPane.showMessageDialog(null, "Ingrese un valor a transformar de manera correcta");
                    } else {
                        res = x * 22.12;
                        V2.setText("" + res);
                    }

                    break;
                case 9:
                    moneda = V1.getText();
                    x = Double.parseDouble(moneda);
                    if (x <= 0) {
                        JOptionPane.showMessageDialog(null, "Ingrese un valor a transformar de manera correcta");
                    } else {
                        res = x * 0.14;
                        V2.setText("" + res);
                    }

                    break;
                case 10:
                    moneda = V1.getText();
                    x = Double.parseDouble(moneda);
                    if (x <= 0) {
                        JOptionPane.showMessageDialog(null, "Ingrese un valor a transformar de manera correcta");
                    } else {
                        res = x * 0.014;
                        V2.setText("" + res);
                    }

                    break;

            }//fin case

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ingreses datos validos o ingrese alguno");
        }
    }//GEN-LAST:event_CB1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       this.hide(); 
       new Conversor().show();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Conversor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB1;
    private javax.swing.JTextField V1;
    private javax.swing.JTextField V2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
