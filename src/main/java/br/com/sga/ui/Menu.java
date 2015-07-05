package br.com.sga.ui;

import br.com.sga.model.Usuario;
import br.com.sga.model.UsuarioLogado;
import br.com.sga.model.Window;
import br.com.sga.util.Funcoes;
import br.com.sga.util.Message;
import br.com.sga.util.Report;
import java.awt.EventQueue;
import java.util.HashMap;
import java.util.List;

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
    jMenuItem4 = new javax.swing.JMenuItem();
    jMenuItem5 = new javax.swing.JMenuItem();
    jMenuItem6 = new javax.swing.JMenuItem();
    jMenuItem3 = new javax.swing.JMenuItem();
    jSeparator1 = new javax.swing.JPopupMenu.Separator();
    jMenuItem1 = new javax.swing.JMenuItem();
    jMenuItem2 = new javax.swing.JMenuItem();
    jSeparator2 = new javax.swing.JPopupMenu.Separator();
    jMenuItem13 = new javax.swing.JMenuItem();
    jMenu2 = new javax.swing.JMenu();
    jMenuItem8 = new javax.swing.JMenuItem();
    jMenuItem7 = new javax.swing.JMenuItem();
    jMenu3 = new javax.swing.JMenu();
    jMenuItem9 = new javax.swing.JMenuItem();
    jMenuItem10 = new javax.swing.JMenuItem();
    jMenu4 = new javax.swing.JMenu();
    jMenuItem12 = new javax.swing.JMenuItem();
    jMenuItem11 = new javax.swing.JMenuItem();
    jSeparator3 = new javax.swing.JPopupMenu.Separator();
    jMenuItem14 = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Emissão de Autorização");
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    labelUsuario.setText("jLabel1");
    getContentPane().add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 300, 20));

    jMenu1.setText("Tabelas Básicas");

    jMenuItem4.setText("Competências");
    jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItem4ActionPerformed(evt);
      }
    });
    jMenu1.add(jMenuItem4);

    jMenuItem5.setText("Tipos de Autorização");
    jMenu1.add(jMenuItem5);

    jMenuItem6.setText("Faixas de Autorização");
    jMenu1.add(jMenuItem6);

    jMenuItem3.setText("Estabelecimentos");
    jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItem3ActionPerformed(evt);
      }
    });
    jMenu1.add(jMenuItem3);
    jMenu1.add(jSeparator1);

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
    jMenu1.add(jSeparator2);

    jMenuItem13.setText("Sair");
    jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItem13ActionPerformed(evt);
      }
    });
    jMenu1.add(jMenuItem13);

    jMenuBar1.add(jMenu1);

    jMenu2.setText("Autorização");

    jMenuItem8.setText("Configurar Ambiente");
    jMenu2.add(jMenuItem8);

    jMenuItem7.setText("Emitir Autorização");
    jMenu2.add(jMenuItem7);

    jMenuBar1.add(jMenu2);

    jMenu3.setText("Manutenção");

    jMenuItem9.setText("Alterar Senha");
    jMenu3.add(jMenuItem9);

    jMenuItem10.setText("Gerar Liberação");
    jMenu3.add(jMenuItem10);

    jMenuBar1.add(jMenu3);

    jMenu4.setText("Relatórios");

    jMenuItem12.setText("Emissão");
    jMenu4.add(jMenuItem12);

    jMenuItem11.setText("Resumo Mensal");
    jMenu4.add(jMenuItem11);
    jMenu4.add(jSeparator3);

    jMenuItem14.setText("Permissões");
    jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItem14ActionPerformed(evt);
      }
    });
    jMenu4.add(jMenuItem14);

    jMenuBar1.add(jMenu4);

    setJMenuBar(jMenuBar1);

    setSize(new java.awt.Dimension(746, 419));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    if (UsuarioLogado.isAdmin() || Funcoes.checaPermissao("frameUsuario")) {
      FrameUsuario frameUsuario = new FrameUsuario();
      frameUsuario.setAlwaysOnTop(true);
      frameUsuario.setVisible(true);
    } else {
      Message.information(this, "Desculpe, você não tem Permissão para acessar\nessa funcionalidade!");
    }
  }//GEN-LAST:event_jMenuItem1ActionPerformed

  private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    if (UsuarioLogado.isAdmin() || Funcoes.checaPermissao("framePermissao")) {
      FramePermissao p = new FramePermissao(this, true);
      p.setAlwaysOnTop(true);
      p.setVisible(true);
    } else {
      Message.information(this, "Desculpe, você não tem Permissão para acessar\nessa funcionalidade!");
    }
  }//GEN-LAST:event_jMenuItem2ActionPerformed

  private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    if (UsuarioLogado.isAdmin() || Funcoes.checaPermissao("frameEstabelecimento")) {
      FrameEstabelecimento e = new FrameEstabelecimento(this, true);
      e.setAlwaysOnTop(true);
      e.setVisible(true);
    } else {
      Message.information(this, "Desculpe, você não tem Permissão para acessar\nessa funcionalidade!");
    }
  }//GEN-LAST:event_jMenuItem3ActionPerformed

  private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
    System.exit(0);
  }//GEN-LAST:event_jMenuItem13ActionPerformed

  private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    if (Funcoes.checaPermissao("frameCompetencia")) {
      FrameCompetencia c = new FrameCompetencia(this, true);
      c.setVisible(true);
    } else {
      Message.information(this, "Desculpe, você não tem Permissão para acessar\nessa funcionalidade!");
    }
  }//GEN-LAST:event_jMenuItem4ActionPerformed

  private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
    HashMap params = new HashMap();
    Report.openReport("Permissões", "reports/lista_permissoes.jasper", params);
  }//GEN-LAST:event_jMenuItem14ActionPerformed

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
  private javax.swing.JMenu jMenu3;
  private javax.swing.JMenu jMenu4;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenuItem jMenuItem1;
  private javax.swing.JMenuItem jMenuItem10;
  private javax.swing.JMenuItem jMenuItem11;
  private javax.swing.JMenuItem jMenuItem12;
  private javax.swing.JMenuItem jMenuItem13;
  private javax.swing.JMenuItem jMenuItem14;
  private javax.swing.JMenuItem jMenuItem2;
  private javax.swing.JMenuItem jMenuItem3;
  private javax.swing.JMenuItem jMenuItem4;
  private javax.swing.JMenuItem jMenuItem5;
  private javax.swing.JMenuItem jMenuItem6;
  private javax.swing.JMenuItem jMenuItem7;
  private javax.swing.JMenuItem jMenuItem8;
  private javax.swing.JMenuItem jMenuItem9;
  private javax.swing.JPopupMenu.Separator jSeparator1;
  private javax.swing.JPopupMenu.Separator jSeparator2;
  private javax.swing.JPopupMenu.Separator jSeparator3;
  private javax.swing.JLabel labelUsuario;
  // End of variables declaration//GEN-END:variables

}
