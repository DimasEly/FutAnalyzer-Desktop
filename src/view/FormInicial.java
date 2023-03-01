/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author gabif
 */
public class FormInicial extends javax.swing.JDialog {

    /**
     * Creates new form FormInicial
     */
    public FormInicial() {
        initComponents();
        setTitle("Tela inicial");
        
        jLNomeUsuario.setText("Bem vindo(a): " + FutAnalyzer.ccont.usuario.getUsuario());
        
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
        jBJogadores = new javax.swing.JButton();
        jBVisualizaJogo = new javax.swing.JButton();
        jLNomeUsuario = new javax.swing.JLabel();
        jBEstatistica = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Você deseja:");

        jBJogadores.setBackground(new java.awt.Color(98, 0, 238));
        jBJogadores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBJogadores.setForeground(new java.awt.Color(255, 255, 255));
        jBJogadores.setText("Visualizar jogadores");
        jBJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJogadoresActionPerformed(evt);
            }
        });

        jBVisualizaJogo.setBackground(new java.awt.Color(98, 0, 238));
        jBVisualizaJogo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBVisualizaJogo.setForeground(new java.awt.Color(255, 255, 255));
        jBVisualizaJogo.setText("Visualizar jogos");
        jBVisualizaJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisualizaJogoActionPerformed(evt);
            }
        });

        jLNomeUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLNomeUsuario.setText("Seja Bem Vindo(a):");

        jBEstatistica.setBackground(new java.awt.Color(98, 0, 238));
        jBEstatistica.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBEstatistica.setForeground(new java.awt.Color(255, 255, 255));
        jBEstatistica.setText("Estatísticas");
        jBEstatistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEstatisticaActionPerformed(evt);
            }
        });

        jBSair.setBackground(new java.awt.Color(98, 0, 238));
        jBSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBSair.setForeground(new java.awt.Color(255, 255, 255));
        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLNomeUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBVisualizaJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBEstatistica, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1)))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLNomeUsuario)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jBJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBVisualizaJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBEstatistica, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJogadoresActionPerformed
        // TODO add your handling code here:
        FormVisualizacaoJogadores form = new FormVisualizacaoJogadores();
        form.setModal(true);
        form.setVisible(true);
    }//GEN-LAST:event_jBJogadoresActionPerformed

    private void jBVisualizaJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisualizaJogoActionPerformed
        // TODO add your handling code here:
        FormVisualizacaoJogos form = new FormVisualizacaoJogos();
        form.setModal(true);
        form.setVisible(true);
    }//GEN-LAST:event_jBVisualizaJogoActionPerformed

    private void jBEstatisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEstatisticaActionPerformed
        // TODO add your handling code here:
        FormEstatisticas form = new FormEstatisticas();
        form.setModal(true);
        form.setVisible(true);
        //investigar erro
    }//GEN-LAST:event_jBEstatisticaActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSairActionPerformed

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
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEstatistica;
    private javax.swing.JButton jBJogadores;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBVisualizaJogo;
    private javax.swing.JLabel jLNomeUsuario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
