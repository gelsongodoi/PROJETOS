/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.deserve.menu;

import java.awt.Image;
import java.awt.Toolkit;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gelson
 */
public class FrmLoggin_v2 extends javax.swing.JFrame {

    private static final long serialVersionUID = -6666418552725585974L;
    URL caminhoImagem;
    Image iconeTitulo;

    /**
     * Creates new form FrmLoggin_v2
     */
    public FrmLoggin_v2() {
        initComponents();
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(jButtonEntrar);
        caminhoImagem = this.getClass().getClassLoader()
                .getResource("br/com/deserve/resources/Icone_SiSAD.png");
        iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
        setIconImage(iconeTitulo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLUsuario = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jLVersao = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jTFSenha = new javax.swing.JPasswordField();
        jComboBoxVersao = new javax.swing.JComboBox();
        jButtonSair = new javax.swing.JButton();
        jButtonEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLUsuario.setText("Usuário:");

        jLSenha.setText("Senha:");

        jLVersao.setText("Escolha abaixo uma versão para acessar:");

        jTFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUsuarioActionPerformed(evt);
            }
        });

        jComboBoxVersao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SiSAD v4", "SiSAD v5" }));

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLVersao))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButtonSair)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonEntrar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jComboBoxVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLSenha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTFSenha))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBoxVersao, jTFSenha, jTFUsuario});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUsuario)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSenha)
                    .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLVersao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonEntrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed

        String usuario = jTFUsuario.getText();
        String senha = new String(jTFSenha.getPassword());
        int a = jComboBoxVersao.getSelectedIndex();

        if (usuario.equals(usuarioAtual()) && senha.equals(senhaAtual()) && a == 0) {
            FrmConfig_v4 frm4;
            try {
                frm4 = new FrmConfig_v4();
                frm4.setLocationRelativeTo(null);
                frm4.setVisible(true);
                dispose();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FrmLoggin.class.getName()).log(Level.SEVERE,
                        null, ex);
            }

        }
        if (usuario.equals(usuarioAtual()) && senha.equals(senhaAtual()) && a == 1) {
            FrmConfig_v5 frm5;
            try {
                frm5 = new FrmConfig_v5();
                frm5.setLocationRelativeTo(null);
                frm5.setVisible(true);
                dispose();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FrmLoggin.class.getName()).log(Level.SEVERE,
                        null, ex);
            }
        }
        if (usuario.equals(usuarioAtual()) && !senha.equals(senhaAtual())
                || !usuario.equals(usuarioAtual()) && senha.equals("")
                || !usuario.equals(usuarioAtual()) && senha.equals(senhaAtual())) {
            jTFSenha.setText("");
            jTFSenha.grabFocus();
            String msg = ("Usuário ou senha incorretos");
            JOptionPane.showMessageDialog(this, msg, null, WIDTH);
        }

    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUsuarioActionPerformed

    public String usuarioAtual() {

        if (jTFUsuario.getText().equals("sisad")) {
            String usuario = "sisad";
            return String.valueOf(usuario);
        }

        if (jTFUsuario.getText().equals("root")) {
            String usuario = "root";
            return String.valueOf(usuario);
        }

        return usuarioAtual();
    }

    public String senhaAtual() {

        if (jTFUsuario.getText().equals("sisad")) {
            int fixo = 14;
            int ano = Calendar.getInstance().get(Calendar.YEAR);
            int mes = Calendar.getInstance().get(Calendar.MONTH);
            int dia = Calendar.getInstance().get(Calendar.DATE);
            int hora = Calendar.getInstance().get(Calendar.HOUR);
            int soma = (ano + mes + dia) * hora * fixo;
            return String.valueOf(soma);
        }

        if (jTFUsuario.getText().equals("root")) {
            String senha = "sisad";
            return String.valueOf(senha);
        }

        return senhaAtual();
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
            java.util.logging.Logger.getLogger(FrmLoggin_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLoggin_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLoggin_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLoggin_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLoggin_v2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox jComboBoxVersao;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JLabel jLVersao;
    private javax.swing.JPasswordField jTFSenha;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
