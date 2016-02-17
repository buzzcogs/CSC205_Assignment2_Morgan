/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc205.assignment2.morgan.gui;
import csc205.assignment2.morgan.utils.DecimalToFloat;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author buzzcogs
 */
public class DecimalToFloatUI extends javax.swing.JFrame
{

    /**
     * Creates new form DecimalToFloatUI
     */
    public DecimalToFloatUI()
    {
        initComponents();
       // ImageIcon image = new ImageIcon("/images/Compass-Rose-BW-300px.png");
       // this.setIconImage(image.getImage());
       // this.setIconImage(Toolkit.getDefaultToolkit().getImage("/images/Compass-Rose-BW-300px.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        DecimalToFloatTabbedPane = new javax.swing.JTabbedPane();
        spPanel = new javax.swing.JPanel();
        spDecimalTextField = new javax.swing.JTextField();
        spTextField = new javax.swing.JTextField();
        spHexTextField = new javax.swing.JTextField();
        spDecToFloatButton = new javax.swing.JButton();
        spFloatToDecButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spClearButton = new javax.swing.JButton();
        dpPanel = new javax.swing.JPanel();
        dpDecimalTextField = new javax.swing.JTextField();
        dpTextField = new javax.swing.JTextField();
        dpHexTextField = new javax.swing.JTextField();
        dpDecimalToFloatButton = new javax.swing.JButton();
        dpFloatToDecimal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dpClearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CSC 205 Binary to Float Converter");
        setIconImages(null);

        DecimalToFloatTabbedPane.setToolTipText("convert decimal to single precision");

        spHexTextField.setEditable(false);
        spHexTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                spHexTextFieldActionPerformed(evt);
            }
        });

        spDecToFloatButton.setLabel("DecimalToFloat");
        spDecToFloatButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                spDecToFloatButtonActionPerformed(evt);
            }
        });

        spFloatToDecButton.setText("FloatToDecimal");
        spFloatToDecButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                spFloatToDecButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Decimal");

        jLabel2.setText("Single Precision Floating Point");

        jLabel3.setText("Hexidecimal");

        spClearButton.setText("Clear");
        spClearButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                spClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout spPanelLayout = new javax.swing.GroupLayout(spPanel);
        spPanel.setLayout(spPanelLayout);
        spPanelLayout.setHorizontalGroup(
            spPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(spPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(spPanelLayout.createSequentialGroup()
                        .addComponent(spDecToFloatButton)
                        .addGap(63, 63, 63)
                        .addComponent(spFloatToDecButton)
                        .addGap(51, 51, 51)
                        .addComponent(spClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spDecimalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spHexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        spPanelLayout.setVerticalGroup(
            spPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spDecimalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(spHexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(spPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spDecToFloatButton)
                    .addComponent(spFloatToDecButton)
                    .addComponent(spClearButton))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        DecimalToFloatTabbedPane.addTab("Single Precision", spPanel);

        dpPanel.setToolTipText("convert decimal to double precision");

        dpDecimalTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                dpDecimalTextFieldActionPerformed(evt);
            }
        });

        dpHexTextField.setEditable(false);

        dpDecimalToFloatButton.setText("DecimalToFloat");
        dpDecimalToFloatButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                dpDecimalToFloatButtonActionPerformed(evt);
            }
        });

        dpFloatToDecimal.setText("FloatToDecimal");
        dpFloatToDecimal.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                dpFloatToDecimalActionPerformed(evt);
            }
        });

        jLabel4.setText("Decimal");

        jLabel5.setText("Double Precision Floating Point");

        jLabel6.setText("Hexidecimal");

        dpClearButton.setText("Clear");
        dpClearButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                dpClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dpPanelLayout = new javax.swing.GroupLayout(dpPanel);
        dpPanel.setLayout(dpPanelLayout);
        dpPanelLayout.setHorizontalGroup(
            dpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(dpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dpPanelLayout.createSequentialGroup()
                        .addGroup(dpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(dpHexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dpDecimalTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(317, Short.MAX_VALUE))
                    .addGroup(dpPanelLayout.createSequentialGroup()
                        .addComponent(dpDecimalToFloatButton)
                        .addGap(63, 63, 63)
                        .addComponent(dpFloatToDecimal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dpClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dpTextField))
        );
        dpPanelLayout.setVerticalGroup(
            dpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dpDecimalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dpHexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(dpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpDecimalToFloatButton)
                    .addComponent(dpFloatToDecimal)
                    .addComponent(dpClearButton))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        DecimalToFloatTabbedPane.addTab("Double Precision", null, dpPanel, "convert decimal to double precision");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DecimalToFloatTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DecimalToFloatTabbedPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spHexTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_spHexTextFieldActionPerformed
    {//GEN-HEADEREND:event_spHexTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spHexTextFieldActionPerformed

    private void dpDecimalTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_dpDecimalTextFieldActionPerformed
    {//GEN-HEADEREND:event_dpDecimalTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpDecimalTextFieldActionPerformed

    private void spDecToFloatButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_spDecToFloatButtonActionPerformed
    {//GEN-HEADEREND:event_spDecToFloatButtonActionPerformed
        try
        {
            String decVal = spDecimalTextField.getText();
            float floatVal = DecimalToFloat.convertStringToFloat(decVal);
            int binaryDigits = DecimalToFloat.convertSPToBinaryInts(floatVal);
            String binDigStr = DecimalToFloat.convertSPBinaryIntsToString(binaryDigits);
            spTextField.setText(binDigStr);
            String hexStr = DecimalToFloat.convertSPToHexString(binaryDigits);
            spHexTextField.setText(hexStr);
        }
        catch (Exception exp)
        {
            JOptionPane.showMessageDialog(null,  exp.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_spDecToFloatButtonActionPerformed

    private void spFloatToDecButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_spFloatToDecButtonActionPerformed
    {//GEN-HEADEREND:event_spFloatToDecButtonActionPerformed
        try
        {
            String binaryStr =  spTextField.getText();
            int binaryDigits = DecimalToFloat.convertStringToSP(binaryStr);
            float floatVal = DecimalToFloat.convertSPToFloat(binaryDigits);
            String floatStr = DecimalToFloat.convertFloatToString(floatVal);
            spDecimalTextField.setText(floatStr);
            String hexStr = DecimalToFloat.convertSPToHexString(binaryDigits);
            spHexTextField.setText(hexStr);
        }
        catch (Exception exp)
        {
            JOptionPane.showMessageDialog(null,  exp.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_spFloatToDecButtonActionPerformed

    private void dpDecimalToFloatButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_dpDecimalToFloatButtonActionPerformed
    {//GEN-HEADEREND:event_dpDecimalToFloatButtonActionPerformed
        try
        {
            String decVal = dpDecimalTextField.getText();
            double doubleVal = DecimalToFloat.convertStringToDouble(decVal);
            long binaryDigits = DecimalToFloat.convertDPToBinaryInts(doubleVal);
            String binDigStr = DecimalToFloat.convertDPBinaryIntsToString(binaryDigits);
            dpTextField.setText(binDigStr);
            String hexStr = DecimalToFloat.convertDPToHexString(binaryDigits);
            dpHexTextField.setText(hexStr);
        }
        catch (Exception exp)
        {
            JOptionPane.showMessageDialog(null,  exp.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_dpDecimalToFloatButtonActionPerformed

    private void dpFloatToDecimalActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_dpFloatToDecimalActionPerformed
    {//GEN-HEADEREND:event_dpFloatToDecimalActionPerformed
              try
        {
            String binaryStr =  dpTextField.getText();
            long binaryDigits = DecimalToFloat.convertStringToDP(binaryStr);
            double doubleVal = DecimalToFloat.convertDPToDouble(binaryDigits);
            String doubleStr = DecimalToFloat.convertDoubleToString(doubleVal);
            dpDecimalTextField.setText(doubleStr);
            String hexStr = DecimalToFloat.convertDPToHexString(binaryDigits);
            dpHexTextField.setText(hexStr);
        }
        catch (Exception exp)
        {
            JOptionPane.showMessageDialog(null,  exp.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_dpFloatToDecimalActionPerformed

    private void spClearButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_spClearButtonActionPerformed
    {//GEN-HEADEREND:event_spClearButtonActionPerformed
       spTextField.setText("");
       spHexTextField.setText("");
       spDecimalTextField.setText("");
    }//GEN-LAST:event_spClearButtonActionPerformed

    private void dpClearButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_dpClearButtonActionPerformed
    {//GEN-HEADEREND:event_dpClearButtonActionPerformed
        dpTextField.setText("");
        dpHexTextField.setText("");
        dpDecimalTextField.setText("");
    }//GEN-LAST:event_dpClearButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(DecimalToFloatUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(DecimalToFloatUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(DecimalToFloatUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(DecimalToFloatUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new DecimalToFloatUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane DecimalToFloatTabbedPane;
    private javax.swing.JButton dpClearButton;
    private javax.swing.JTextField dpDecimalTextField;
    private javax.swing.JButton dpDecimalToFloatButton;
    private javax.swing.JButton dpFloatToDecimal;
    private javax.swing.JTextField dpHexTextField;
    private javax.swing.JPanel dpPanel;
    private javax.swing.JTextField dpTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton spClearButton;
    private javax.swing.JButton spDecToFloatButton;
    private javax.swing.JTextField spDecimalTextField;
    private javax.swing.JButton spFloatToDecButton;
    private javax.swing.JTextField spHexTextField;
    private javax.swing.JPanel spPanel;
    private javax.swing.JTextField spTextField;
    // End of variables declaration//GEN-END:variables
}
