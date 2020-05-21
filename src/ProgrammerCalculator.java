
import javax.swing.JOptionPane;

public class ProgrammerCalculator extends javax.swing.JFrame {
    
    public ProgrammerCalculator() {
        initComponents();
    }
    long number;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfield = new javax.swing.JTextField();
        joctal = new javax.swing.JButton();
        jbinary = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jfield.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jfieldFocusGained(evt);
            }
        });
        jfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfieldActionPerformed(evt);
            }
        });
        jfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jfieldKeyReleased(evt);
            }
        });

        joctal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        joctal.setText("Octal");
        joctal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joctalActionPerformed(evt);
            }
        });

        jbinary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbinary.setText("Binary");
        jbinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbinaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbinary, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(jfield, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(joctal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jfield, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbinary, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(joctal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jfieldKeyReleased
        try
        {
            Integer.parseInt(jfield.getText());
        }catch(Exception e)
        {
            jfield.setText("");
        }
    }//GEN-LAST:event_jfieldKeyReleased

    private void jbinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbinaryActionPerformed
        try
        {
            number = Integer.parseInt(jfield.getText());
            if(number >= 16384) jfield.setText("Too Large !");
            else                jfield.setText(String.format("%d", Convert(2, number)));
        }catch(Exception e)
        {
            jfield.setText("");
            JOptionPane.showMessageDialog(null, "Enter a number first!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jbinaryActionPerformed

    private void joctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joctalActionPerformed
        try
        {
            number = Integer.parseInt(jfield.getText());
            jfield.setText(String.format("%d", Convert(8, number)));
        }catch(Exception e)
        {
            jfield.setText("");
            JOptionPane.showMessageDialog(null, "Enter a number first!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_joctalActionPerformed

    private void jfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfieldActionPerformed

    private void jfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jfieldFocusGained
        jfield.setText("");
    }//GEN-LAST:event_jfieldFocusGained

    public static long Convert(int Base, long number)
    {
        long s = 0, i = 0;
        while(number != 0)
        {
            s += (number%Base)*Math.pow(10, i);
            i++;
            number /= Base;
        }
        return s;
    }
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
            java.util.logging.Logger.getLogger(ProgrammerCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgrammerCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgrammerCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgrammerCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgrammerCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbinary;
    private javax.swing.JTextField jfield;
    private javax.swing.JButton joctal;
    // End of variables declaration//GEN-END:variables
}
