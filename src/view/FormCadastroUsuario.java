/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import modelDominio.Usuario;

/**
 *
 * @author magal
 */
public class FormCadastroUsuario extends javax.swing.JDialog{

    /**
     * Creates new form FormCadastroUsuario
     */
    public FormCadastroUsuario() {
        initComponents();
        setTitle("Cadastro usuário");
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
        jTFUsuario = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jBSalvar = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();
        jLNome = new javax.swing.JLabel();
        jLOverall = new javax.swing.JLabel();
        jLNome1 = new javax.swing.JLabel();
        jTFSenha = new javax.swing.JPasswordField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jLNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLNome.setText("Usuario");

        jLOverall.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLOverall.setText("Senha");

        jLNome1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLNome1.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLOverall)
                            .addComponent(jLNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(jTFEmail)
                            .addComponent(jTFSenha)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome1)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLOverall)
                    .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jBSalvar)
                .addGap(18, 18, 18)
                .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        // TODO add your handling code here:

        //verificando se os campos são válidos
        if(!jTFUsuario.getText().equals("")){

            if(!jTFEmail.getText().equals("")){
                
                if(!jTFSenha.getText().equals("")){
                    
                String usuario = (jTFUsuario.getText());
                String email = (jTFEmail.getText());
                String senha = (jTFSenha.getText());
                
                Usuario user = new Usuario(senha, usuario, email);

                String msg;

                    msg = FutAnalyzer.ccont.cadastroUsuario(user);
                    if (msg.equals("ok")){
                        dispose();
                    }
                

                //caso servidor responda com ok
                if (msg.equals("ok")) {
                    JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso",
                        this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
                    jTFUsuario.setText("");
                    jTFUsuario.requestFocus();
                    jTFEmail.setText("");
                    jTFEmail.requestFocus();
                    jTFSenha.setText("");
                    jTFSenha.requestFocus();
                } else {
                    //caso não
                    JOptionPane.showMessageDialog(this, "Usuário não foi cadastrado!",
                        this.getTitle(), JOptionPane.ERROR_MESSAGE);
                    jTFUsuario.requestFocus();
                    jTFEmail.requestFocus();
                    jTFSenha.requestFocus();
                }

                }else{
                    JOptionPane.showMessageDialog(this, "ERRO: Preencha o campo 'Senha'! ",
                    this.getTitle(),JOptionPane.ERROR_MESSAGE);
                jTFSenha.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(this, "ERRO: Preencha o campo 'Email'! ",
                    this.getTitle(),JOptionPane.ERROR_MESSAGE);
                jTFEmail.requestFocus();
            }

        }else{
            JOptionPane.showMessageDialog(this, "ERRO: Preencha o campo 'Usuário'!",
                this.getTitle(),JOptionPane.ERROR_MESSAGE);
            jTFUsuario.requestFocus();
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
            java.util.logging.Logger.getLogger(FormCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNome1;
    private javax.swing.JLabel jLOverall;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JPasswordField jTFSenha;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
