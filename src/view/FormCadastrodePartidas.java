/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import modelDominio.Jogo;

/**
 *
 * @author gabif
 */
public class FormCadastrodePartidas extends javax.swing.JDialog {

    private int codigo = -1;
    
    public FormCadastrodePartidas(Jogo jogo) {
        initComponents();
        setTitle("Cadastro de partidas");
        if(jogo == null){
            codigo = -1;
            jBExcluir.setEnabled(false);
        } else {
            codigo = jogo.getId();
            jTFGolsMeuTime.setText(""+ jogo.getMeuPlacar());
            jTFGolsOponente.setText("" + jogo.getAdvPlacar());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLNome = new javax.swing.JLabel();
        jLOverall = new javax.swing.JLabel();
        jTFGolsMeuTime = new javax.swing.JTextField();
        jTFGolsOponente = new javax.swing.JTextField();
        jBExcluir = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLNome.setText("Meu Time");

        jLOverall.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLOverall.setText("Oponente");

        jBExcluir.setBackground(new java.awt.Color(98, 0, 238));
        jBExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBSalvar.setBackground(new java.awt.Color(98, 0, 238));
        jBSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBVoltar.setBackground(new java.awt.Color(98, 0, 238));
        jBVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLOverall)
                            .addComponent(jLNome))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFGolsMeuTime, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFGolsOponente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jBVoltar)))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jBVoltar)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTFGolsMeuTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLOverall)
                    .addComponent(jTFGolsOponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jBSalvar)
                .addGap(18, 18, 18)
                .addComponent(jBExcluir)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        // TODO add your handling code here:
        int certeza = JOptionPane.showConfirmDialog(this, "Tem certeza?", this.getTitle(), JOptionPane.YES_NO_OPTION);

        System.out.println("f" + codigo);
        // CASO O USUÁRIO RESPONDA SIM PARA A EXCLUSÃO
        if(certeza == JOptionPane.YES_OPTION){
            Jogo jogo = new Jogo (codigo);
            System.out.println("f" + codigo);
            
            String msg = FutAnalyzer.ccont.jogoExcluir(jogo);
            if(msg.equals("ok")){
                JOptionPane.showMessageDialog(this, "Jogo excluido com sucesso");
                
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível excluir" ,this.getTitle(), JOptionPane.ERROR_MESSAGE);
            }
            dispose();
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        // TODO add your handling code here:

        //verificando se os campos são válidos
        if(!jTFGolsMeuTime.getText().equals("")){

            if(!jTFGolsOponente.getText().equals("")){

                int meusGols = Integer.parseInt(jTFGolsMeuTime.getText());
                int golsAdv = Integer.parseInt(jTFGolsOponente.getText());
                
                Jogo jogo = new Jogo(0, meusGols, golsAdv, FutAnalyzer.ccont.getUsuarioLogado().getCod());
                
                String msg;
                
                if(codigo == -1){
                    msg = FutAnalyzer.ccont.inserirJogo(jogo);
                    dispose();
                } else {
                    jogo.setId(codigo);
                    dispose();
                    msg = FutAnalyzer.ccont.jogoAlterar(jogo);
                    if (msg.equals("ok")){
                        dispose();
                    }
                }                                             

                //caso servidor responda com ok
                if (msg.equals("ok")) {
                    JOptionPane.showMessageDialog(this, "Jogo cadastrado com sucesso!",
                        this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
                    jTFGolsMeuTime.setText("");
                    jTFGolsMeuTime.requestFocus();
                    jTFGolsOponente.setText("");
                    jTFGolsOponente.requestFocus();
                } else {
                    //caso não
                    JOptionPane.showMessageDialog(this, "Jogo não foi cadastrado!",
                        this.getTitle(), JOptionPane.ERROR_MESSAGE);
                    jTFGolsMeuTime.requestFocus();
                    jTFGolsOponente.requestFocus();
                }

            }else{
                JOptionPane.showMessageDialog(this, "ERRO: Preencha o campo 'Meu time'! ",
                    this.getTitle(),JOptionPane.ERROR_MESSAGE);
                jTFGolsOponente.requestFocus();
            }

        }else{
            JOptionPane.showMessageDialog(this, "ERRO: Preencha o campo 'Oponente'!",
                this.getTitle(),JOptionPane.ERROR_MESSAGE);
            jTFGolsMeuTime.requestFocus();
        }
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadastrodePartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastrodePartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastrodePartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastrodePartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastrodePartidas(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLOverall;
    private javax.swing.JTextField jTFGolsMeuTime;
    private javax.swing.JTextField jTFGolsOponente;
    // End of variables declaration//GEN-END:variables
}
