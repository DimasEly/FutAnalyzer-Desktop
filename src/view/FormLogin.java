/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ConexaoController;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import modelDominio.Usuario;

/**
 *
 * @author gabif
 */
public class FormLogin extends javax.swing.JFrame {

    
    
    /**
     * Creates new form TelaLogin
     */
    public FormLogin() {
        initComponents();
        jLErro.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBEntrar = new javax.swing.JButton();
        Login = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        jTFSenha = new javax.swing.JPasswordField();
        jBEsqueceuSenha = new javax.swing.JLabel();
        jBSair = new javax.swing.JButton();
        jTFLogin = new javax.swing.JTextField();
        jLErro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBEntrar.setText("Entrar");
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });

        Login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Login.setText("Login");

        Senha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Senha.setText("Senha");

        jTFSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jBEsqueceuSenha.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jBEsqueceuSenha.setText("Esqueceu Senha");
        jBEsqueceuSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBEsqueceuSenhaMouseClicked(evt);
            }
        });

        jBSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jTFLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFLoginActionPerformed(evt);
            }
        });

        jLErro.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLErro.setForeground(new java.awt.Color(249, 0, 0));
        jLErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLErro.setText("Usuário ou senha inválida!");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBSair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBEntrar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Login)
                                .addComponent(jTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Senha)
                                .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBEsqueceuSenha)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel2)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel2)
                .addGap(78, 78, 78)
                .addComponent(Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Senha)
                .addGap(4, 4, 4)
                .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEsqueceuSenha)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSair)
                    .addComponent(jBEntrar))
                .addGap(18, 18, 18)
                .addComponent(jLErro)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEsqueceuSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEsqueceuSenhaMouseClicked
        // TODO add your handling code here:
        
        //CHAMAR A TELA DE RECUPERAÇÃO DE SENHA
        
    }//GEN-LAST:event_jBEsqueceuSenhaMouseClicked

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed
        // TODO add your handling code here:
        
        //recebendo
        String loginUsuario = jTFLogin.getText();
        String senha = jTFSenha.getText();
        
        //criando um usuario
        Usuario usuario = new Usuario(loginUsuario, senha);
        
        //conectando ao servidor
        Usuario usuarioSelecionado = FutAnalyzer.ccont.efetuarLogin(usuario);
        
        //verificando credenciais
        if (usuarioSelecionado != null){
            jLErro.setVisible(false);
            
            FutAnalyzer.ccont.usuario = usuarioSelecionado;
            
            FutAnalyzer.ccont.setUsuarioLogado(usuarioSelecionado);
            FormInicial formInicial = new FormInicial();
            formInicial.setVisible(true);
            dispose();
        } else {
           jLErro.setVisible(true);
           limpaCampos();
        }
        
    }//GEN-LAST:event_jBEntrarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jTFLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFLoginActionPerformed

    private void jtfLoginKeyPressed(java.awt.event.KeyEvent evt) {                                    
        // TODO add your handling code here:
        jLErro.setVisible(false);
    }
    
    private void jpfSenhaKeyPressed(java.awt.event.KeyEvent evt) {                                    
        // TODO add your handling code here:
        jLErro.setVisible(false);
    }
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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }
    
    public void limpaCampos(){
        jTFLogin.setText("");
        jTFSenha.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Senha;
    private javax.swing.JButton jBEntrar;
    private javax.swing.JLabel jBEsqueceuSenha;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLErro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTFLogin;
    private javax.swing.JPasswordField jTFSenha;
    // End of variables declaration//GEN-END:variables
}
