package br.com.sga.ui;

import br.com.sga.model.Usuario;
import br.com.sga.model.UsuarioLogado;
import br.com.sga.model.UsuarioTableModel;
import br.com.sga.util.Criptografia;
import br.com.sga.util.Form;
import br.com.sga.util.Funcoes;
import br.com.sga.util.Message;
import br.com.sga.util.PrepareForm;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import org.javalite.activejdbc.validation.ValidationException;

/**
 *
 * @author Luciano Bezerra
 */
public class FrameUsuario extends javax.swing.JDialog {

  UsuarioTableModel model = new UsuarioTableModel();

  public FrameUsuario() {
    initComponents();
    tableUsuarios.setModel(model);
    formataGrid(tableUsuarios);    
    jTabbedPane1.setSelectedIndex(0);
    Form.preparaIniciar(jPanel2, jTabbedPane1, this);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bgOrdem = new javax.swing.ButtonGroup();
    jTabbedPane1 = new javax.swing.JTabbedPane();
    jPanel1 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tableUsuarios = new javax.swing.JTable();
    jPanel3 = new javax.swing.JPanel();
    txtPesquisa = new javax.swing.JTextField();
    onlyActive = new javax.swing.JCheckBox();
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
    setTitle("Cadastro do Usuário");
    setModal(true);
    setName("frameUsuario"); // NOI18N
    setResizable(false);
    getContentPane().setLayout(new java.awt.GridLayout(1, 0));

    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jScrollPane1.setMaximumSize(new java.awt.Dimension(452, 402));
    jScrollPane1.setMinimumSize(new java.awt.Dimension(452, 402));

    tableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null}
      },
      new String [] {
        "Cód", "Login", "Nome", "Ativo"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tableUsuarios.setColumnSelectionAllowed(true);
    tableUsuarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    tableUsuarios.getTableHeader().setReorderingAllowed(false);
    tableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tableUsuariosMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tableUsuarios);
    tableUsuarios.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    if (tableUsuarios.getColumnModel().getColumnCount() > 0) {
      tableUsuarios.getColumnModel().getColumn(0).setResizable(false);
      tableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(40);
      tableUsuarios.getColumnModel().getColumn(1).setResizable(false);
      tableUsuarios.getColumnModel().getColumn(1).setPreferredWidth(160);
      tableUsuarios.getColumnModel().getColumn(2).setResizable(false);
      tableUsuarios.getColumnModel().getColumn(2).setPreferredWidth(210);
      tableUsuarios.getColumnModel().getColumn(3).setResizable(false);
      tableUsuarios.getColumnModel().getColumn(3).setPreferredWidth(60);
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

    onlyActive.setText("Ativo");
    jPanel3.add(onlyActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 15, 90, 20));

    jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 490, 50));

    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordem"));
    jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    bgOrdem.add(jRadioButton1);
    jRadioButton1.setSelected(true);
    jRadioButton1.setText("Código");
    jRadioButton1.setActionCommand("id");
    jPanel4.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 20));

    bgOrdem.add(jRadioButton2);
    jRadioButton2.setText("Login");
    jRadioButton2.setActionCommand("login");
    jPanel4.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 110, 20));

    bgOrdem.add(jRadioButton3);
    jRadioButton3.setText("Nome");
    jRadioButton3.setActionCommand("nome");
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
    labelCodigo.setName("labelCodigo"); // NOI18N
    jPanel2.add(labelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 60, 20));

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("Login:");
    jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 20));

    txtLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    txtLogin.setName("txtLogin"); // NOI18N
    jPanel2.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 150, 20));

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel3.setText("Nome Completo:");
    jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 20));

    txtNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    txtNome.setName("txtNome"); // NOI18N
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
    txtSenha.setName("txtSenha"); // NOI18N
    jPanel2.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 150, 20));

    jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel6.setText("Nível:");
    jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 20));

    comboNivel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    comboNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Administrador", "Gerente", "Operador" }));
    comboNivel.setName("txtEmail"); // NOI18N
    jPanel2.add(comboNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 150, 20));

    jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel8.setText("Ativo:");
    jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, 20));

    checkAtivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    checkAtivo.setText("");
    jPanel2.add(checkAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, 20));

    buttonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432226514_Add.png"))); // NOI18N
    buttonNovo.setName("buttonNovo"); // NOI18N
    buttonNovo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonNovoActionPerformed(evt);
      }
    });
    jPanel2.add(buttonNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 60, 25));

    buttonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432226749_icon-136-document-edit.png"))); // NOI18N
    buttonEdit.setName("buttonEdit"); // NOI18N
    buttonEdit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonEditActionPerformed(evt);
      }
    });
    jPanel2.add(buttonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 60, 25));

    buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432224509_Save.png"))); // NOI18N
    buttonSalvar.setName("buttonSalvar"); // NOI18N
    buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonSalvarActionPerformed(evt);
      }
    });
    jPanel2.add(buttonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 60, 25));

    buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432226831_cross.png"))); // NOI18N
    buttonCancelar.setName("buttonCancelar"); // NOI18N
    buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonCancelarActionPerformed(evt);
      }
    });
    jPanel2.add(buttonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 60, 25));

    buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432226877_delete-file.png"))); // NOI18N
    buttonExcluir.setName("buttonExcluir"); // NOI18N
    buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonExcluirActionPerformed(evt);
      }
    });
    jPanel2.add(buttonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 60, 25));

    buttonSair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432226915_22_exit.png"))); // NOI18N
    buttonSair.setText("Sair");
    buttonSair.setName("buttonSair"); // NOI18N
    buttonSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonSairActionPerformed(evt);
      }
    });
    jPanel2.add(buttonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 80, 25));

    txtEmail.setName("txtEmail"); // NOI18N
    jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 270, 20));

    jTabbedPane1.addTab("Cadastro", jPanel2);

    getContentPane().add(jTabbedPane1);

    setSize(new java.awt.Dimension(515, 370));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
    this.dispose();
  }//GEN-LAST:event_buttonSairActionPerformed

  private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed
    preparaForm("novo");
  }//GEN-LAST:event_buttonNovoActionPerformed

  private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
    String wSenha = String.valueOf(txtSenha.getPassword()).toLowerCase();
    String vSenha = Funcoes.isNullOrBlank(labelCodigo.getText()) ? Criptografia.criptografar(wSenha) :  wSenha;
    salvar(labelCodigo.getText(),
            UsuarioLogado.getInstance().getId(),
            txtLogin.getText().toLowerCase(),
            vSenha,
            txtNome.getText().toUpperCase(),
            txtEmail.getText().toLowerCase(),
            comboNivel.getSelectedIndex(),
            checkAtivo.isSelected()
    );
  }//GEN-LAST:event_buttonSalvarActionPerformed

  private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
    preparaForm("cancelar");
  }//GEN-LAST:event_buttonCancelarActionPerformed

  private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      fillTable(txtPesquisa.getText().toUpperCase(), onlyActive.isSelected(), bgOrdem.getSelection().getActionCommand());
    }
  }//GEN-LAST:event_txtPesquisaKeyPressed

  private void tableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUsuariosMouseClicked
    if (evt.getClickCount() == 2) {
      int linha = tableUsuarios.getSelectedRow();
      Usuario usuario = Usuario.findById(tableUsuarios.getValueAt(linha, 0));
      if(usuario != null){
        fillForm(usuario);
      }
    }
  }//GEN-LAST:event_tableUsuariosMouseClicked

  private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
    preparaForm("alterar");
  }//GEN-LAST:event_buttonEditActionPerformed

  private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
    if(Message.confirmation(this, "Tem certeza? \nEssa Operação não pode ser revertida!") == JOptionPane.OK_OPTION){
      excluir(Integer.valueOf(labelCodigo.getText()));
    }
  }//GEN-LAST:event_buttonExcluirActionPerformed

  public static void main(String args[]) {
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
      System.out.println("Erro: " + ex.getLocalizedMessage());
    }

    EventQueue.invokeLater(new Runnable() {

      @Override
      public void run() {
        new FrameUsuario().setVisible(true);
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
  private javax.swing.JCheckBox onlyActive;
  private javax.swing.JTable tableUsuarios;
  private javax.swing.JTextField txtEmail;
  private javax.swing.JTextField txtLogin;
  private javax.swing.JTextField txtNome;
  private javax.swing.JTextField txtPesquisa;
  private javax.swing.JPasswordField txtSenha;
  // End of variables declaration//GEN-END:variables

  private void preparaForm(String opcao) {
    switch (opcao) {
      case "iniciar":  { preparaIniciar(); break; }
      case "novo":     { preparaNovo();    break; }
      case "salvar":   { preparaSalvar();  break; }
      case "alterar":  { preparaAlterar(); break; }
      case "cancelar": { preparaCancelar(); break; }
    }
  }

  private void preparaIniciar() {
    Form.preparaIniciar(jPanel2, jTabbedPane1, this);
    /*
    PrepareForm.disableFields(jPanel2);
    PrepareForm.cleanFields(jPanel2);
    Funcoes.desabilitaButtons(buttonCancelar, buttonEdit, buttonExcluir, buttonSalvar);
    Funcoes.limpaLabel(labelCodigo);
    Funcoes.habilitaButtons(buttonNovo, buttonSair);
    jTabbedPane1.setSelectedIndex(0);
   */
    txtPesquisa.requestFocusInWindow();
  }

  private void salvar(String vCodigo, int vUser, String vLogin, String vSenha, String vNome, String vEmail, int vNivel, boolean vAtivo) {
    Usuario usuario = new Usuario();
    usuario.set("id", vCodigo, "user_id", vUser, "login", vLogin, "senha", vSenha, "nome", vNome, "email", vEmail, "nivel", vNivel, "ativo", vAtivo);
    try {
      usuario.saveIt();
      labelCodigo.setText(String.format("%03d", usuario.get("id")));
      preparaForm("salvar");
      Message.information(this, "Usuário Cadastrado!");
    } catch (ValidationException e) {
      Message.validation(this, usuario.errors());
    } catch (Exception e) {
      Message.exception(this, "Erro: ", e.getLocalizedMessage());
    }
  }

  private void preparaSalvar() {
    PrepareForm.disableFields(jPanel2);
    setSaveButtons();
  }

  private void setSaveButtons() {
    Funcoes.desabilitaButtons(buttonSalvar, buttonCancelar);
    Funcoes.habilitaButtons(buttonNovo, buttonEdit, buttonExcluir, buttonSair);
  }

  private void preparaNovo() {
    PrepareForm.enableFields(jPanel2);
    PrepareForm.cleanFields(jPanel2);
    setNewButtons();
    Funcoes.limpaLabel(labelCodigo);
    comboNivel.setSelectedIndex(0);
    checkAtivo.setSelected(false);
    txtLogin.requestFocusInWindow();
  }

  private void setNewButtons() {
    Funcoes.habilitaButtons(buttonSalvar, buttonCancelar);
    Funcoes.desabilitaButtons(buttonNovo, buttonEdit, buttonExcluir, buttonSair);
  }

  private void preparaCancelar() {
    PrepareForm.cleanFields(jPanel2);
    PrepareForm.disableFields(jPanel2);
    setCancelButtons();
    Funcoes.limpaLabel(labelCodigo);
    comboNivel.setSelectedIndex(0);
    checkAtivo.setSelected(false);
    buttonNovo.requestFocusInWindow();
  }

  private void setCancelButtons() {
    Funcoes.habilitaButtons(buttonNovo, buttonSair);
    Funcoes.desabilitaButtons(buttonSalvar, buttonEdit, buttonCancelar, buttonExcluir);
  }

  private void fillTable(String name, boolean onlyActive, String ordem) {
    String active = onlyActive ? " and ativo" : "";
    List<Usuario> usuarios = Usuario.find("nome like '%" + name + "%'" + active).orderBy(ordem);
    model.removeAll();
    for (Usuario usuario : usuarios) {
      model.addRow(usuario);
    }
  }

  private void fillForm(Usuario usuario) {
    jTabbedPane1.setSelectedIndex(1);
    labelCodigo.setText(String.format("%03d", usuario.getId()));
    txtLogin.setText(usuario.getString("login"));
    txtNome.setText(usuario.getString("nome"));
    txtEmail.setText(usuario.getString("email"));
    txtSenha.setText(usuario.getString("senha"));
    comboNivel.setSelectedIndex(usuario.getInteger("nivel"));
    checkAtivo.setSelected(usuario.getBoolean("ativo"));
    Funcoes.habilitaButtons(buttonEdit, buttonExcluir, buttonNovo, buttonSair);
    Funcoes.desabilitaButtons(buttonSalvar, buttonCancelar);
    buttonEdit.requestFocusInWindow();
  }

  private void preparaAlterar() {
    PrepareForm.enableFields(jPanel2);
    Funcoes.habilitaButtons(buttonSalvar, buttonCancelar);
    Funcoes.desabilitaButtons(buttonEdit, buttonExcluir, buttonNovo, buttonSair);
  }

  private void excluir(int id) {
    Usuario usuario = Usuario.findById(id);
    if(UsuarioLogado.getInstance().getId() == usuario.getInteger("id")){
      Message.information(this, "Desculpe, " + usuario.getString("nome") +" está logado.\nNão posso excluí-lo ...");
    }else{
      if(isUnique()){
        Message.information(this, "Desculpe, " + usuario.getString("nome") +" eh o Único usuário do sistema.\nNão posso excluí-lo ...");
      }else{
        if(usuario.delete()){
          PrepareForm.cleanFields(jPanel2);
          Funcoes.limpaLabel(labelCodigo);
          Message.information(this, "Usuário Excluido!");
        }
      }
    }
  }

  private void formataGrid(JTable grid) {
    Funcoes.fontGrid(grid, "Arial", Font.PLAIN, 12);
    Funcoes.alinhaColunas(grid, 0, SwingConstants.CENTER);
    Funcoes.alinhaColunas(grid, 3, SwingConstants.CENTER);
  }

  private boolean isUnique() {
    List<Usuario> usuarios = Usuario.findAll();
    return usuarios.size() <= 1;
  }
}
