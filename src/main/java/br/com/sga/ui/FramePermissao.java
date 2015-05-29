package br.com.sga.ui;

import br.com.sga.model.Permissao;
import br.com.sga.model.PermissaoTableModel;
import br.com.sga.model.UsuarioLogado;
import br.com.sga.util.Criptografia;
import br.com.sga.util.Funcoes;
import br.com.sga.util.Message;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

/**
 *
 * @author Luciano Bezerra
 */
public class FramePermissao extends javax.swing.JDialog {
  PermissaoTableModel model = new PermissaoTableModel();
  public FramePermissao(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    formataGrid(tablePermissoes);
    tablePermissoes.setModel(model);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bgOrdem = new javax.swing.ButtonGroup();
    jTabbedPane1 = new javax.swing.JTabbedPane();
    jPanel1 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablePermissoes = new javax.swing.JTable();
    jPanel3 = new javax.swing.JPanel();
    txtPesquisa = new javax.swing.JTextField();
    jPanel4 = new javax.swing.JPanel();
    jRadioButton1 = new javax.swing.JRadioButton();
    jRadioButton2 = new javax.swing.JRadioButton();
    jRadioButton3 = new javax.swing.JRadioButton();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    labelCodigo = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    txtLogin = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    txtNome = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    txtSenha = new javax.swing.JPasswordField();
    jLabel6 = new javax.swing.JLabel();
    comboNivel = new javax.swing.JComboBox();
    jLabel8 = new javax.swing.JLabel();
    checkAtivo = new javax.swing.JCheckBox();
    buttonNovo = new javax.swing.JButton();
    buttonEdit = new javax.swing.JButton();
    buttonSalvar = new javax.swing.JButton();
    buttonCancelar = new javax.swing.JButton();
    buttonExcluir = new javax.swing.JButton();
    buttonSair = new javax.swing.JButton();
    txtEmail = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Cadastro de Permissões");
    setMaximumSize(new java.awt.Dimension(505, 327));
    setMinimumSize(new java.awt.Dimension(505, 327));
    setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jScrollPane1.setMaximumSize(new java.awt.Dimension(452, 402));
    jScrollPane1.setMinimumSize(new java.awt.Dimension(452, 402));

    tablePermissoes.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null}
      },
      new String [] {
        "Cód", "Usuário", "Tela"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tablePermissoes.setColumnSelectionAllowed(true);
    tablePermissoes.getTableHeader().setReorderingAllowed(false);
    tablePermissoes.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tablePermissoesMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tablePermissoes);
    tablePermissoes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    if (tablePermissoes.getColumnModel().getColumnCount() > 0) {
      tablePermissoes.getColumnModel().getColumn(1).setResizable(false);
      tablePermissoes.getColumnModel().getColumn(2).setResizable(false);
    }

    jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 200));

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));
    jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtPesquisaKeyPressed(evt);
      }
    });
    jPanel3.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 360, 20));

    jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 490, 50));

    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordem"));
    jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    bgOrdem.add(jRadioButton1);
    jRadioButton1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jRadioButton1.setSelected(true);
    jRadioButton1.setText("Código");
    jRadioButton1.setActionCommand("id");
    jPanel4.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 20));

    bgOrdem.add(jRadioButton2);
    jRadioButton2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jRadioButton2.setText("Usuário");
    jRadioButton2.setActionCommand("user");
    jPanel4.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 110, 20));

    bgOrdem.add(jRadioButton3);
    jRadioButton3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jRadioButton3.setText("Tela");
    jRadioButton3.setActionCommand("window");
    jPanel4.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 110, 20));

    jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 490, 50));

    jTabbedPane1.addTab("Listagem", jPanel1);

    jPanel2.setMaximumSize(new java.awt.Dimension(500, 295));
    jPanel2.setMinimumSize(new java.awt.Dimension(500, 295));
    jPanel2.setPreferredSize(new java.awt.Dimension(500, 295));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel1.setText("Código:");
    jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 20));

    labelCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jPanel2.add(labelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 60, 20));

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("Login:");
    jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 20));

    txtLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    txtLogin.setEnabled(false);
    jPanel2.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 150, 20));

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel3.setText("Nome Completo:");
    jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 20));

    txtNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    txtNome.setEnabled(false);
    jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 270, 20));

    jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel4.setText("Email:");
    jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 20));

    jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel5.setText("Senha:");
    jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, 20));

    txtSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    txtSenha.setEnabled(false);
    jPanel2.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 150, 20));

    jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel6.setText("Nível:");
    jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 20));

    comboNivel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    comboNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Administrador", "Gerente", "Operador" }));
    comboNivel.setEnabled(false);
    jPanel2.add(comboNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 150, 20));

    jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel8.setText("Ativo:");
    jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, 20));

    checkAtivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    checkAtivo.setEnabled(false);
    jPanel2.add(checkAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, 20));

    buttonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432226514_Add.png"))); // NOI18N
    buttonNovo.setEnabled(false);
    buttonNovo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonNovoActionPerformed(evt);
      }
    });
    jPanel2.add(buttonNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 60, 25));

    buttonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432226749_icon-136-document-edit.png"))); // NOI18N
    buttonEdit.setEnabled(false);
    buttonEdit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonEditActionPerformed(evt);
      }
    });
    jPanel2.add(buttonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 60, 25));

    buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432224509_Save.png"))); // NOI18N
    buttonSalvar.setEnabled(false);
    buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonSalvarActionPerformed(evt);
      }
    });
    jPanel2.add(buttonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 60, 25));

    buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432226831_cross.png"))); // NOI18N
    buttonCancelar.setEnabled(false);
    buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonCancelarActionPerformed(evt);
      }
    });
    jPanel2.add(buttonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 60, 25));

    buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432226877_delete-file.png"))); // NOI18N
    buttonExcluir.setEnabled(false);
    buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonExcluirActionPerformed(evt);
      }
    });
    jPanel2.add(buttonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 60, 25));

    buttonSair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432226915_22_exit.png"))); // NOI18N
    buttonSair.setText("Sair");
    buttonSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonSairActionPerformed(evt);
      }
    });
    jPanel2.add(buttonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 80, 25));
    jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 270, 20));

    jTabbedPane1.addTab("Cadastro", jPanel2);

    getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

    setSize(new java.awt.Dimension(515, 370));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void tablePermissoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePermissoesMouseClicked
    if (evt.getClickCount() == 2) {
      int linha = tablePermissoes.getSelectedRow();
      Permissao permissao = Permissao.findById(tablePermissoes.getValueAt(linha, 0));
      if(permissao != null){
        fillForm(permissao);
      }
    }
  }//GEN-LAST:event_tablePermissoesMouseClicked

  private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      fillTable(txtPesquisa.getText().toUpperCase(), bgOrdem.getSelection().getActionCommand());
    }
  }//GEN-LAST:event_txtPesquisaKeyPressed

  private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed
    //preparaForm("novo");
  }//GEN-LAST:event_buttonNovoActionPerformed

  private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
    //preparaForm("alterar");
  }//GEN-LAST:event_buttonEditActionPerformed

  private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
    String wSenha = String.valueOf(txtSenha.getPassword()).toLowerCase();
    String vSenha = Funcoes.isNullOrBlank(labelCodigo.getText()) ? Criptografia.criptografar(wSenha) :  wSenha;
   /* salvar(labelCodigo.getText(),
      UsuarioLogado.getInstance().getId(),
      txtLogin.getText().toLowerCase(),
      vSenha,
      txtNome.getText().toUpperCase(),
      txtEmail.getText().toLowerCase(),
      comboNivel.getSelectedIndex(),
      checkAtivo.isSelected()
    );
           */
  }//GEN-LAST:event_buttonSalvarActionPerformed

  private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
    //preparaForm("cancelar");
  }//GEN-LAST:event_buttonCancelarActionPerformed

  private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
    if(Message.confirmation(this, "Tem certeza? \nEssa Operação não pode ser revertida!") == JOptionPane.OK_OPTION){
      //excluir(Integer.valueOf(labelCodigo.getText()));
    }
  }//GEN-LAST:event_buttonExcluirActionPerformed

  private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
    this.dispose();
  }//GEN-LAST:event_buttonSairActionPerformed

  public static void main(String args[]) {
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FramePermissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        FramePermissao dialog = new FramePermissao(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup bgOrdem;
  private javax.swing.JButton buttonCancelar;
  private javax.swing.JButton buttonEdit;
  private javax.swing.JButton buttonExcluir;
  private javax.swing.JButton buttonNovo;
  private javax.swing.JButton buttonSair;
  private javax.swing.JButton buttonSalvar;
  private javax.swing.JCheckBox checkAtivo;
  private javax.swing.JComboBox comboNivel;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JRadioButton jRadioButton1;
  private javax.swing.JRadioButton jRadioButton2;
  private javax.swing.JRadioButton jRadioButton3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JLabel labelCodigo;
  private javax.swing.JTable tablePermissoes;
  private javax.swing.JTextField txtEmail;
  private javax.swing.JTextField txtLogin;
  private javax.swing.JTextField txtNome;
  private javax.swing.JTextField txtPesquisa;
  private javax.swing.JPasswordField txtSenha;
  // End of variables declaration//GEN-END:variables

  private void formataGrid(JTable grid) {
    Funcoes.fontGrid(grid, "Arial", Font.PLAIN, 12);
    Funcoes.alinhaColunas(grid, 0, SwingConstants.CENTER);
    Funcoes.alinhaColunas(grid, 3, SwingConstants.CENTER);
  }

  private void fillForm(Permissao permissao) {
    jTabbedPane1.setSelectedIndex(1);
    labelCodigo.setText(String.format("%03d", permissao.getId()));
    txtLogin.setText(permissao.getString("user_id"));
    txtNome.setText(permissao.getString("window"));
    Funcoes.habilitaButtons(buttonEdit, buttonExcluir, buttonNovo, buttonSair);
    Funcoes.desabilitaButtons(buttonSalvar, buttonCancelar);
    buttonEdit.requestFocusInWindow();

  }

  private void fillTable(String user, String order) {
    List<Permissao> permissoes = Permissao.find("user_id = ?", Integer.valueOf(user)).orderBy(order);
    model.removeAll();
    for (Permissao permissao : permissoes) {
      model.addRow(permissao);
    }
  }

}