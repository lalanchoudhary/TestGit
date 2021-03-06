/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murach.ui;

/**
 *
 * @author lalan
 */
public class FutureValueFrame extends javax.swing.JFrame {

    /**
     * Creates new form FutureValueFrame
     */
    public FutureValueFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        paymentTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        yearlyInterestRateTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        yearsTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        futureValueTextField = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Monthly  Payment ");

        paymentTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                paymentTextFieldFocusGained(evt);
            }
        });
        paymentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Yearly Rate of Interest");

        yearlyInterestRateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlyInterestRateTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Number of Years");

        yearsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearsTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Future  value");

        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(calculateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(paymentTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(yearlyInterestRateTextField)
                            .addComponent(yearsTextField))
                        .addComponent(exitButton))
                    .addComponent(futureValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(paymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(yearlyInterestRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(yearsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(futureValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculateButton)
                    .addComponent(exitButton))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paymentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentTextFieldActionPerformed
        // TODO add your handling code here:
            paymentTextField.requestFocusInWindow();
    }//GEN-LAST:event_paymentTextFieldActionPerformed

    private void yearlyInterestRateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlyInterestRateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearlyInterestRateTextFieldActionPerformed

    private void yearsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearsTextFieldActionPerformed
       
        
 
        
    }//GEN-LAST:event_yearsTextFieldActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        
    }//GEN-LAST:event_exitButtonActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        // TODO add your handling code here: 
        double p = Double.parseDouble(paymentTextField.getText());double q = Double.parseDouble(yearlyInterestRateTextField.getText());
        double r = Double.parseDouble(yearsTextField.getText());
        double t = p*q*r/100 + p;
        String v = t+"";
        futureValueTextField.setText(v);
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void paymentTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paymentTextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentTextFieldFocusGained

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
            java.util.logging.Logger.getLogger(FutureValueFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FutureValueFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FutureValueFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FutureValueFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FutureValueFrame frame = new FutureValueFrame();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField futureValueTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField paymentTextField;
    private javax.swing.JTextField yearlyInterestRateTextField;
    private javax.swing.JTextField yearsTextField;
    // End of variables declaration//GEN-END:variables
}
