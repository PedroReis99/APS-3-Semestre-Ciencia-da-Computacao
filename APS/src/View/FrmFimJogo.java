/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Controller.GameController;
import javax.swing.JOptionPane;

/**
 *
 * @author CtSec
 */
public class FrmFimJogo extends javax.swing.JFrame {

    /**
     * Creates new form FrmQuestion1
     */
    public FrmFimJogo() {
        initComponents();
        this.setTitle("SustentableQuiz | FIM DE JOGO!");
//        lblPontosFim.setText(Integer.toString(pc.pontuacao));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSair = new javax.swing.JLabel();
        lblPontosFim = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(904, 598));
        getContentPane().setLayout(null);

        lblSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sair.png"))); // NOI18N
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });
        getContentPane().add(lblSair);
        lblSair.setBounds(680, 310, 200, 100);

        lblPontosFim.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lblPontosFim.setForeground(new java.awt.Color(255, 255, 255));
        lblPontosFim.setText("00000");
        getContentPane().add(lblPontosFim);
        lblPontosFim.setBounds(400, 380, 130, 40);

        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });
        getContentPane().add(lblMenu);
        lblMenu.setBounds(680, 420, 200, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fimJOgo.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 540);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        FrmIniciar FI = new FrmIniciar();
        GameController GC = new GameController();
        GC.ZerarPontos();
        FI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblMenuMouseClicked

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        int sair = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do jogo?","Atenção", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_lblSairMouseClicked
    
    int pontos;
    
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
            java.util.logging.Logger.getLogger(FrmFimJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFimJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFimJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFimJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFimJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMenu;
    public static javax.swing.JLabel lblPontosFim;
    private javax.swing.JLabel lblSair;
    // End of variables declaration//GEN-END:variables
}
