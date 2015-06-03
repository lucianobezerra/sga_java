package br.com.sga.ui;

import br.com.sga.model.UsuarioLogado;
import br.com.sga.util.Funcoes;
import br.com.sga.util.Message;
import java.awt.EventQueue;

/**
 *
 * @author Luciano Bezerra
 */
public class Menu extends javax.swing.JFrame {

  public Menu() {
    initComponents();
    labelUsuario.setText("USUÁRIO: " + UsuarioLogado.getInstance().getName());
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    labelUsuario = new javax.swing.JLabel();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenuItem1 = new javax.swing.JMenuItem();
    jMenuItem2 = new javax.swing.JMenuItem();
    jMenu2 = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Emissão de Autorização");
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    labelUsuario.setText("jLabel1");
    getContentPane().add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 300, 20));

    jMenu1.setText("Cadastros");

    jMenuItem1.setText("Usuários");
    jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItem1ActionPerformed(evt);
      }
    });
    jMenu1.add(jMenuItem1);

    jMenuItem2.setText("Permissões");
    jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItem2ActionPerformed(evt);
      }
    });
    jMenu1.add(jMenuItem2);

    jMenuBar1.add(jMenu1);

    jMenu2.setText("Edit");
    jMenuBar1.add(jMenu2);

    setJMenuBar(jMenuBar1);

    setSize(new java.awt.Dimension(746, 419));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    if(Funcoes.checaPermissao("frameUsuario")){
      FrameUsuario frameUsuario = new FrameUsuario();
      frameUsuario.setAlwaysOnTop(true);
      frameUsuario.setVisible(true);      
    }else{
      Message.information(this, "Desculpe, você não tem Permissão para acessar\nessa funcionalidade!");
    }
  }//GEN-LAST:event_jMenuItem1ActionPerformed

  private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    if(Funcoes.checaPermissao("framePermissao")){
      FramePermissao p = new FramePermissao(this, true);
      p.setAlwaysOnTop(true);
      p.setVisible(true);
    }else{
      Message.information(this, "Desculpe, você não tem Permissão para acessar\nessa funcionalidade!");
    }
  }//GEN-LAST:event_jMenuItem2ActionPerformed

  public static void main(String args[]) {
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    EventQueue.invokeLater(new Runnable() {

      @Override
      public void run() {
        new Menu().setVisible(true);
      }
    });

  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenuItem jMenuItem1;
  private javax.swing.JMenuItem jMenuItem2;
  private javax.swing.JLabel labelUsuario;
  // End of variables declaration//GEN-END:variables

}
