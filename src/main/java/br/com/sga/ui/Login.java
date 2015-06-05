package br.com.sga.ui;

import br.com.sga.model.Usuario;
import br.com.sga.model.UsuarioLogado;
import br.com.sga.util.Criptografia;
import java.awt.EventQueue;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciano Bezerra
 */
public class Login extends javax.swing.JFrame {

  public Login() {
    initComponents();
    //btOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432168203_Check.png")));
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    txtLogin = new javax.swing.JTextField();
    txtSenha = new javax.swing.JPasswordField();
    btOk = new javax.swing.JButton();
    jLabel4 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Acesso ao Sistema");
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(239, 0, 0));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel1.setText("Identifique-se:");
    getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 120, 30));

    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("Login:");
    getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 30));

    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel3.setText("Senha:");
    getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 30));
    getContentPane().add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 130, 30));
    getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 130, 30));

    btOk.setIcon(new javax.swing.ImageIcon("C:\\projects\\sga\\src\\main\\resources\\images\\1432168203_Check.png")); // NOI18N
    btOk.setText("Ok");
    btOk.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btOkActionPerformed(evt);
      }
    });
    getContentPane().add(btOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 110, 30));

    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432170000_gnome-keyring-manager.png"))); // NOI18N
    getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

    setSize(new java.awt.Dimension(427, 295));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
    String vLogin = txtLogin.getText().toLowerCase();
    String vSenha = Criptografia.criptografar(String.valueOf(txtSenha.getPassword()).toLowerCase());
    Usuario usuario = Usuario.findFirst("login = ? and senha = ?", vLogin, vSenha);
    if (usuario != null) {
      UsuarioLogado.getInstance().setId(usuario.getInteger("id"));
      UsuarioLogado.getInstance().setName(usuario.getString("nome"));
      UsuarioLogado.getInstance().setNivel(usuario.getInteger("nivel"));
      this.dispose();
      Menu menu = new Menu();
      menu.setVisible(true);
    } else {
      JOptionPane.showMessageDialog(this, "Usuario e/ou Senha Invalidos!");
    }
  }//GEN-LAST:event_btOkActionPerformed

  public static void main(String args[]) {
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    EventQueue.invokeLater(new Runnable() {

      @Override
      public void run() {
        new Login().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btOk;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JTextField txtLogin;
  private javax.swing.JPasswordField txtSenha;
  // End of variables declaration//GEN-END:variables
}
