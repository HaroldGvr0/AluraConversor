/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.fomdeskapp.toolsapp.Frames;

import com.fomdeskapp.toolsapp.utils.Utils;

/**
 *
 * @author emerson.guevara
 */
public class MonedasResultFrame extends javax.swing.JFrame {

    /** Creates new form CurrencyFormStep2
     *  */
    public MonedasResultFrame(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        this.currency = args[0];
        this.amount=args[1];
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        csf2ResultLb = new javax.swing.JLabel();
        cfs2ResultTxt = new javax.swing.JTextField();
        cfs2CalcularBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor");

        csf2ResultLb.setText("Resultado");

        cfs2ResultTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfs2ResultTxtActionPerformed(evt);
            }
        });

        cfs2CalcularBtn.setText("Calcular");
        cfs2CalcularBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfs2CalcularBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("→");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(csf2ResultLb)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cfs2ResultTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(cfs2CalcularBtn)))
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(csf2ResultLb)
                    .addComponent(cfs2ResultTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cfs2CalcularBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cfs2ResultTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfs2ResultTxtActionPerformed
        // TODO add your handling code here:
        ContinuarFrame newframe = new ContinuarFrame();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cfs2ResultTxtActionPerformed

    private void cfs2CalcularBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfs2CalcularBtnActionPerformed
        // TODO add your handling code here: 
        
        cfs2ResultTxt.setText(Utils.calculateCurrency2(this.currency, this.amount));
        
    }//GEN-LAST:event_cfs2CalcularBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ContinuarFrame newframe = new ContinuarFrame();
       newframe.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonedasResultFrame(args).setVisible(true);
               
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cfs2CalcularBtn;
    private javax.swing.JTextField cfs2ResultTxt;
    private javax.swing.JLabel csf2ResultLb;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
    private String currency = this.currency;
    private String amount = this.amount;
}