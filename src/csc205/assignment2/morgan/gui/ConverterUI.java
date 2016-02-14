package csc205.assignment2.morgan.gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author buzzcogs
 */
public class ConverterUI extends JFrame
{    
        // Variables declaration - do not modify                     
    private javax.swing.JButton convertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration       
    public ConverterUI() 
    {         
        setTitle("CSC Assignment 2");
        JTabbedPane converterPane = new JTabbedPane();
        getContentPane().add(converterPane );
        JPanel decimalToFloatPanel = new JPanel();
        JPanel decimalToDoublePanel = new JPanel();
        JLabel d2FLabel = new JLabel();
        d2FLabel.setText("You are in Decimal to Float");
        JLabel d2DLabel = new JLabel();
        d2DLabel.setText("You are in Decimal to Double");
        decimalToFloatPanel.add(d2FLabel);
        decimalToDoublePanel.add(d2DLabel);
        converterPane.addTab("DecToFloat", d2FLabel);
        converterPane.addTab("DecToDouble", d2DLabel);
        initComponents();
        setSize(900, 500);    
         
    }
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        convertButton = new javax.swing.JButton();
    }
    
    
    public static void main(String[] args) 
    {
        ConverterUI myUI = new ConverterUI();
        myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myUI.setVisible(true);         
    }
}

