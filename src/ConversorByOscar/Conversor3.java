package ConversorByOscar;

import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class Conversor3 extends javax.swing.JFrame {

    public Conversor3() {
        initComponents();
    }
    //variables
    public String temperatura;
    double x = 0;
    //fin variable

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        V1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        V2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        CB1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        V1.setBackground(new java.awt.Color(255, 255, 255));
        V1.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(V1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 90, 36));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingresa la temperatura");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        V2.setBackground(new java.awt.Color(255, 255, 255));
        V2.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(V2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 140, 40));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Temperatura final");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ConversorByOscar/cold-spongebob-squarepants.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 180));

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, 20));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elije una opción", "Celsius a Fahrenheit", "Celsius a Kelvin", "Fahrenheit a Kelvin", "Fahrenheit a Celsius", "Kelvin a Celsius", "Kelvin a Fahrenheit" }));
        CB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB1ActionPerformed(evt);
            }
        });
        jPanel1.add(CB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Conversor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 76, 41));

        jButton4.setBackground(new java.awt.Color(0, 153, 255));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 180));

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
                    temperatura = V1.getText();
                    x = Double.parseDouble(temperatura);

                    res = x * 1.8 + 32;
                    V2.setText("" + res);

                    break;

                case 2:

                    temperatura = V1.getText();
                    x = Double.parseDouble(temperatura);

                    res = x + 273.15;
                    V2.setText("" + res);

                    break;
                case 3:

                    temperatura = V1.getText();
                    x = Double.parseDouble(temperatura);

                    res = (x - 32) / 1.8;
                    V2.setText("" + res);

                    break;
                case 4:
                    temperatura = V1.getText();
                    x = Double.parseDouble(temperatura);

                    res = (x - 32) * (.55555556) + 273.15;
                    V2.setText("" + res);
                    break;
                case 5:
                    temperatura = V1.getText();
                    x = Double.parseDouble(temperatura);
                    res = x - 273.15;
                    V2.setText("" + res);
                    break;
                case 6:
                    temperatura = V1.getText();
                    x = Double.parseDouble(temperatura);
                    res = 1.8 * (x - 273.15) + 32;
                    V2.setText("" + res);

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
            java.util.logging.Logger.getLogger(Conversor3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor3().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
