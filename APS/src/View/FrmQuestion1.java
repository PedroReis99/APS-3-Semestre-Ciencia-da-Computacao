/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.GameController;
import java.awt.Color;

/**
 *
 * @author CtSec
 */
public class FrmQuestion1 extends javax.swing.JFrame {

    /**
     * Creates new form FrmQuestion1
     */
    public FrmQuestion1() {
        initComponents();
        this.setTitle("SustentableQuiz | Pergunta n°1:");
        lblPontos.setText(Integer.toString(vqc.pontuacao));
        lblContinuar.setVisible(false);
    }

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblContinuar = new javax.swing.JLabel();
        BtnB = new javax.swing.JButton();
        BtnC = new javax.swing.JButton();
        BtnD = new javax.swing.JButton();
        BtnA = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPontos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(904, 598));
        getContentPane().setLayout(null);

        lblContinuar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/continua-removebg-preview.png"))); // NOI18N
        lblContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblContinuarMouseClicked(evt);
            }
        });
        getContentPane().add(lblContinuar);
        lblContinuar.setBounds(727, 468, 150, 100);

        BtnB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnB.setText("Miami – Estados Unidos. São Paulo – Brasil ");
        BtnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBActionPerformed(evt);
            }
        });
        getContentPane().add(BtnB);
        BtnB.setBounds(12, 216, 865, 66);

        BtnC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnC.setText("Bahia – Brasil. Estrasburgo – França ");
        BtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCActionPerformed(evt);
            }
        });
        getContentPane().add(BtnC);
        BtnC.setBounds(12, 300, 865, 66);

        BtnD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnD.setText("Hamburgo – Alemanha. Cancún – México ");
        BtnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDActionPerformed(evt);
            }
        });
        getContentPane().add(BtnD);
        BtnD.setBounds(12, 384, 865, 66);

        BtnA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnA.setText("Freiburg – Alemanha. Malmö – Suécia");
        BtnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAActionPerformed(evt);
            }
        });
        getContentPane().add(BtnA);
        BtnA.setBounds(12, 137, 865, 66);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("Quais cidades dessas são sustentáveis ? ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(46, 78, 450, 26);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Pontos:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(22, 23, 81, 26);

        lblPontos.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPontos.setText("00000");
        getContentPane().add(lblPontos);
        lblPontos.setBounds(139, 23, 65, 26);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fundoPerguntas.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 910, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void AlterButtonColor(boolean status, String Alternativa){
        if(status == true){
            switch(Alternativa){
                case "A":
                    BtnA.setContentAreaFilled(false);
                    BtnA.setOpaque(true);
                    BtnA.setBackground(Color.GREEN);
                    break;
                case "B":
                    BtnB.setBackground(Color.GREEN);
                    BtnB.setContentAreaFilled(false);
                    BtnB.setOpaque(true);
                    break;
                case "C":
                    BtnC.setBackground(Color.GREEN);
                    BtnC.setContentAreaFilled(false);
                    BtnC.setOpaque(true);
                    break;
                case "D":
                    BtnD.setBackground(Color.GREEN);
                    BtnD.setContentAreaFilled(false);
                    BtnD.setOpaque(true);
                    break;
            }
        } else {
            switch(Alternativa){
                case "A":
                    BtnA.setBackground(Color.RED);
                    BtnA.setContentAreaFilled(false);
                    BtnA.setOpaque(true);
                    break;
                case "B":
                    BtnB.setBackground(Color.RED);
                    BtnB.setContentAreaFilled(false);
                    BtnB.setOpaque(true);
                    break;
                case "C":
                    BtnC.setBackground(Color.RED);
                    BtnC.setContentAreaFilled(false);
                    BtnC.setOpaque(true);
                    break;
                case "D":
                    BtnD.setBackground(Color.RED);
                    BtnD.setContentAreaFilled(false);
                    BtnD.setOpaque(true);
                    break;
            }
        }
    }
    
    public void DisableButton(){
        lblContinuar.setVisible(true);
        BtnA.setEnabled(false);
        BtnB.setEnabled(false);
        BtnC.setEnabled(false);
        BtnD.setEnabled(false);
    }
    
    GameController vqc = new GameController();
    
    private void BtnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAActionPerformed
        vqc.verificar(true);
        DisableButton();
        AlterButtonColor(true, "A");     
    }//GEN-LAST:event_BtnAActionPerformed

    private void BtnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBActionPerformed
        vqc.verificar(false);
        DisableButton();
        AlterButtonColor(false, "B");   
    }//GEN-LAST:event_BtnBActionPerformed

    private void BtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCActionPerformed
        vqc.verificar(false);
        DisableButton();
        AlterButtonColor(false, "C");   
    }//GEN-LAST:event_BtnCActionPerformed

    private void BtnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDActionPerformed
        vqc.verificar(false);
        DisableButton();
        AlterButtonColor(false, "D");   
    }//GEN-LAST:event_BtnDActionPerformed

    private void lblContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContinuarMouseClicked
        FrmQuestion2 fq = new FrmQuestion2();
        fq.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblContinuarMouseClicked

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
            java.util.logging.Logger.getLogger(FrmQuestion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmQuestion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmQuestion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmQuestion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmQuestion1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnA;
    private javax.swing.JButton BtnB;
    private javax.swing.JButton BtnC;
    private javax.swing.JButton BtnD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel lblContinuar;
    private javax.swing.JLabel lblPontos;
    // End of variables declaration//GEN-END:variables
}
