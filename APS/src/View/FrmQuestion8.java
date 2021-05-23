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
public class FrmQuestion8 extends javax.swing.JFrame {

    /**
     * Creates new form FrmQuestion1
     */
    public FrmQuestion8() {
        initComponents();
        this.setTitle("SustentableQuiz | Pergunta n°8:");
        lblContinuar.setVisible(false);
        BtnA.setText("<html>Reflorestamento: áreas que sofreram a retirada de vegetação podem<br> ser reflorestadas para preservar o meio ambiente.</html>");
        BtnB.setText("<html>Descarte de equipamentos eletrônicos, baterias e pilhas em locais apropriados <br> para que empresas especializadas possam dar um destino correto a este material.</html>");
        BtnC.setText("<html>Tratamento adequado a todos os poluentes gerados na produção de mercadorias e serviços.</html>");
        BtnD.setText("<html>Orientação aos jovens, através de programas eficientes, sobre o grave problema das drogas.</html>");
        lblPontos.setText(Integer.toString(GC.pontuacao));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblContinuar = new javax.swing.JLabel();
        BtnA = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPontos = new javax.swing.JLabel();
        BtnC = new javax.swing.JButton();
        BtnD = new javax.swing.JButton();
        BtnB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(904, 598));
        getContentPane().setLayout(null);

        lblContinuar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/continua-removebg-preview.png"))); // NOI18N
        lblContinuar.setText(" ");
        lblContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblContinuarMouseClicked(evt);
            }
        });
        getContentPane().add(lblContinuar);
        lblContinuar.setBounds(690, 476, 142, 100);

        BtnA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnA.setText("Reajustar, reciclar e refazer");
        BtnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAActionPerformed(evt);
            }
        });
        getContentPane().add(BtnA);
        BtnA.setBounds(52, 160, 781, 66);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("De acordo com a Sustentabilidade, o que são os 3 R's?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 98, 592, 26);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Pontos:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(22, 23, 81, 26);

        lblPontos.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPontos.setText("00000");
        getContentPane().add(lblPontos);
        lblPontos.setBounds(116, 23, 65, 26);

        BtnC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnC.setText("Reparar, reciclar e reutilizar");
        BtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCActionPerformed(evt);
            }
        });
        getContentPane().add(BtnC);
        BtnC.setBounds(52, 319, 781, 66);

        BtnD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnD.setText("Repensar, refazer e realizar");
        BtnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDActionPerformed(evt);
            }
        });
        getContentPane().add(BtnD);
        BtnD.setBounds(52, 403, 780, 66);

        BtnB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnB.setText("Reduzir, reutilizar e reciclar");
        BtnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBActionPerformed(evt);
            }
        });
        getContentPane().add(BtnB);
        BtnB.setBounds(52, 240, 781, 66);

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
    
    GameController GC = new GameController();
    
    private void BtnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAActionPerformed
        GC.verificar(false);
        DisableButton();
        AlterButtonColor(false, "A"); 
        
    }//GEN-LAST:event_BtnAActionPerformed

    private void BtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCActionPerformed
        GC.verificar(false);
        DisableButton();
        AlterButtonColor(false, "C"); 
    }//GEN-LAST:event_BtnCActionPerformed

    private void BtnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDActionPerformed
        GC.verificar(false);
        DisableButton();
        AlterButtonColor(false, "D"); 
    }//GEN-LAST:event_BtnDActionPerformed

    private void BtnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBActionPerformed
        GC.verificar(true);
        DisableButton();
        AlterButtonColor(true, "B"); 
    }//GEN-LAST:event_BtnBActionPerformed

    private void lblContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContinuarMouseClicked
        FrmQuestion9 Fq = new FrmQuestion9();
        Fq.setVisible(true);
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
            java.util.logging.Logger.getLogger(FrmQuestion8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmQuestion8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmQuestion8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmQuestion8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmQuestion8().setVisible(true);
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
    private javax.swing.JLabel lblContinuar;
    public static javax.swing.JLabel lblPontos;
    // End of variables declaration//GEN-END:variables
}
