/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import modelDominio.Jogador;
import view.tableModel.JogadorTableModel;

/**
 *
 * @author gabif
 */
public class FormVisualizacaoJogadores extends javax.swing.JDialog {

    //TableModel da Tabela de Jogador que será utilizada
    private JogadorTableModel jogadorModel;
    
    //Método para atualizar a tabela a cada vez    
     public void atualizaTabela(){
        if(FutAnalyzer.ccont.jogadorLista() != null){
             if(jTFFiltro.getText().isEmpty()){
                jogadorModel = new JogadorTableModel(FutAnalyzer.ccont.jogadorLista());
            } else {
                jogadorModel = new JogadorTableModel(FutAnalyzer.ccont.jogadorListaNome(jTFFiltro.getText()));
             }
        }else{
             System.out.println("lista passando nula"); //teste
        }
         
        jTable1.setModel(jogadorModel);
    }
    
    /**
     * Creates new form FormVisualizacaoJogadores
     */
    public FormVisualizacaoJogadores() {
        initComponents();
        atualizaTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBCadastrar = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();
        jLFiltro = new javax.swing.JLabel();
        jTFFiltro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jBCadastrar.setBackground(new java.awt.Color(98, 0, 238));
        jBCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
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

        jLFiltro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLFiltro.setText("Filtro");

        jTFFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFiltroActionPerformed(evt);
            }
        });
        jTFFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFFiltroKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jBVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jLFiltro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jBCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFiltro)
                    .addComponent(jTFFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBVoltar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jBCadastrar)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBVoltarActionPerformed

    
     
    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        // TODO add your handling code here:
        
        //Criando o formulário de cadastro passando null como parâmetro
        //O formulário de cadastro recebe uma Raça como parâmetro, quando for para editar 
        // um registro. Neste caso, estamos adicionando um novo registro.
        FormCadastroEManutencao form = new FormCadastroEManutencao(null);
        
        // abrindo formulario modal (Só é possível quando o formulário for do tipo JDialog
        form.setModal(true);
        
        // Como foi setado para o formulário ser MODAL. Aqui o sistema ficará travado
        form.setVisible(true);
        
        // Quando o usuário fechar o cadastro de Marcas deve-se novamente atualizar a tabela
        atualizaTabela();
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jTFFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFiltroActionPerformed
        // TODO add your handling code here:
        atualizaTabela();
    }//GEN-LAST:event_jTFFiltroActionPerformed

    private void jTFFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFFiltroKeyReleased
        // TODO add your handling code here:
        atualizaTabela();
    }//GEN-LAST:event_jTFFiltroKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        Jogador jogador = jogadorModel.getJogador(jTable1.getSelectedRow());
        FormCadastroEManutencao formcad = new FormCadastroEManutencao(jogador);
        // abrindo formulario modal (Só é possível quando o formulário for do tipo JDialog
        formcad.setModal(true);
         // Como foi setado para o formulário ser MODAL. Aqui o sistema ficará travado
        formcad.setVisible(true);
        // Quando o usuário fechar o cadastro de Marcas deve-se novamente atualizar a tabela
        atualizaTabela();
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(FormVisualizacaoJogadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVisualizacaoJogadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVisualizacaoJogadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVisualizacaoJogadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVisualizacaoJogadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLFiltro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFFiltro;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
