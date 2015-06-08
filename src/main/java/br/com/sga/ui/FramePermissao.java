package br.com.sga.ui;

import br.com.sga.model.Permission;
import br.com.sga.model.PermissionTableModel;
import br.com.sga.model.Usuario;
import br.com.sga.model.UsuarioLogado;
import br.com.sga.model.Window;
import br.com.sga.util.Form;
import br.com.sga.util.Funcoes;
import br.com.sga.util.Message;
import br.com.sga.util.PrepareForm;
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
public class FramePermissao extends javax.swing.JDialog {

  PermissionTableModel model = new PermissionTableModel();

  public FramePermissao(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    tablePermissoes.setModel(model);
    formataGrid(tablePermissoes);
    Form.preparaIniciar(jPanel2, jTabbedPane1, this);
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
    jLabel5 = new javax.swing.JLabel();
    buttonNovo = new javax.swing.JButton();
    buttonEdit = new javax.swing.JButton();
    buttonSalvar = new javax.swing.JButton();
    buttonCancelar = new javax.swing.JButton();
    buttonExcluir = new javax.swing.JButton();
    buttonSair = new javax.swing.JButton();
    comboUser = new javax.swing.JComboBox();
    comboWindow = new javax.swing.JComboBox();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Cadastro de Permissões");
    setMaximumSize(new java.awt.Dimension(505, 327));
    setMinimumSize(new java.awt.Dimension(505, 327));
    setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
    setName("framePermissao"); // NOI18N
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
        "Title 1", "Title 2", "Title 3"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false
      };

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
    tablePermissoes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    if (tablePermissoes.getColumnModel().getColumnCount() > 0) {
      tablePermissoes.getColumnModel().getColumn(0).setResizable(false);
      tablePermissoes.getColumnModel().getColumn(0).setPreferredWidth(60);
      tablePermissoes.getColumnModel().getColumn(1).setResizable(false);
      tablePermissoes.getColumnModel().getColumn(1).setPreferredWidth(250);
      tablePermissoes.getColumnModel().getColumn(2).setResizable(false);
      tablePermissoes.getColumnModel().getColumn(2).setPreferredWidth(250);
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
    jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 30));

    labelCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jPanel2.add(labelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 60, 30));

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("Usuário:");
    jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 30));

    jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel5.setText("Janela:");
    jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 30));

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

    comboUser.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    jPanel2.add(comboUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 180, 30));

    comboWindow.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    jPanel2.add(comboWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 180, 30));

    jTabbedPane1.addTab("Cadastro", jPanel2);

    getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

    setSize(new java.awt.Dimension(515, 370));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void tablePermissoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePermissoesMouseClicked
    if (evt.getClickCount() == 2) {
      int linha = tablePermissoes.getSelectedRow();
      Permission permissao = Permission.findById(tablePermissoes.getValueAt(linha, 0));
      if (permissao != null) {
        fillForm(permissao);
      }
    }
  }//GEN-LAST:event_tablePermissoesMouseClicked

  private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      fillTable(txtPesquisa.getText(), bgOrdem.getSelection().getActionCommand());
    }
  }//GEN-LAST:event_txtPesquisaKeyPressed

  private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed
    preparaForm("novo");
  }//GEN-LAST:event_buttonNovoActionPerformed

  private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
    preparaForm("alterar");
  }//GEN-LAST:event_buttonEditActionPerformed

  private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
    Integer id      = labelCodigo.getText() == null ? null : Integer.valueOf(labelCodigo.getText());
    String msg      = labelCodigo.getText() == null ? "Permissão Cadastrada!" : "Permissão Atualizada!";
    int user        = UsuarioLogado.getInstance().getId();
    Usuario usuario = (Usuario) comboUser.getSelectedItem();
    Window window   = (Window)  comboWindow.getSelectedItem();
    saveIt(id, user, usuario, window, msg);
  }//GEN-LAST:event_buttonSalvarActionPerformed

  private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
    preparaForm("cancelar");
  }//GEN-LAST:event_buttonCancelarActionPerformed

  private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
    if (Message.confirmation(this, "Tem certeza? \nEssa Operação não pode ser revertida!") == JOptionPane.OK_OPTION) {
      excluir(Integer.valueOf(labelCodigo.getText()));
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
  private javax.swing.JComboBox comboUser;
  private javax.swing.JComboBox comboWindow;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel5;
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
  private javax.swing.JTextField txtPesquisa;
  // End of variables declaration//GEN-END:variables

  private void formataGrid(JTable grid) {
    Funcoes.fontGrid(grid, "Arial", Font.PLAIN, 12);
    Funcoes.alinhaColunas(grid, 0, SwingConstants.CENTER);
    Funcoes.sizeColumn(grid, 0, 40);
    Funcoes.sizeColumn(grid, 1, 215);
    Funcoes.sizeColumn(grid, 2, 215);
    grid.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
  }

    private void fillForm(Permission permission) {
    jTabbedPane1.setSelectedIndex(1);
    labelCodigo.setText(String.format("%03d", permission.getId()));
    fillComboUser(permission);
    fillComboWindow(permission);
    preparaForm("fill");
    buttonEdit.requestFocusInWindow();
  }

  private void fillTable(String user, String order) {
    String ordem = getOrder(order);
    List<Permission> permissoes;
    if (user.equals("")) {
      permissoes = Permission.findAll().orderBy(ordem);
    } else {
      permissoes = Permission.find("user_id = ?", Integer.valueOf(user)).orderBy(ordem);
    }
    model.removeAll();
    for (Permission permissao : permissoes) {
      model.addRow(permissao);
    }
  }

  private String getOrder(String order) {
    switch (order) {
      case "id":     return "id";
      case "user":   return "user_id";
      case "window": return "window_id";
    }
    return null;
  }

  private void fillComboUser(Permission permission) {
    int index = 0;
    int selectedIndex = 0;
    Usuario selectedUser = null;
    if(permission != null) { selectedUser = permission.parent(Usuario.class); }
    comboUser.removeAllItems();
    List<Usuario> users = Usuario.findAll();
    for (Usuario user : users) {
      comboUser.addItem(user);
      if(selectedUser != null && user.getInteger("id").equals(selectedUser.getInteger("id"))){
        selectedIndex = index;
      }
      index++;
    }
    if(selectedUser != null){
      comboUser.setSelectedIndex(selectedIndex);
    }
  }
  
  private void fillComboWindow(Permission permission) {
    int index = 0;
    int selectedIndex = 0;
    Window selectedWindow = null;
    if(permission != null ) { selectedWindow = permission.parent(Window.class); }
    comboWindow.removeAllItems();
    List<Window> windows = Window.findAll();
    for (Window window : windows) {
      comboWindow.addItem(window);
      if(selectedWindow != null && window.getInteger("id").equals(selectedWindow.getInteger("id"))){
        selectedIndex = index;
      }
      index++;
    }
    if(selectedWindow != null){
      comboWindow.setSelectedIndex(selectedIndex);
    }
  }

  private void preparaForm(String opcao) {
    switch(opcao){
    case "fill":    { preparaFill();     break; }
    case "novo":    { preparaNovo();     break; }
    case "cancelar":{ preparaCancelar(); break; }
    case "salvar":  { preparaSalvar();   break; }
    case "alterar": { preparaAlterar();  break; }
    
    }
  }

  private void preparaNovo() {
    Permission permission = null;
    PrepareForm.enableFields(jPanel2);
    PrepareForm.cleanFields(jPanel2);
    setNewButtons();
    Funcoes.limpaLabel(labelCodigo);
    fillComboUser(permission);
    fillComboWindow(permission);
    comboUser.setSelectedIndex(-1);
    comboWindow.setSelectedIndex(-1);
    comboUser.requestFocusInWindow();
  }

  private void preparaCancelar() {
    PrepareForm.cleanFields(jPanel2);
    PrepareForm.disableFields(jPanel2);
    setCancelButtons();
    Funcoes.limpaLabel(labelCodigo);
    comboUser.setSelectedIndex(-1);
    comboWindow.setSelectedIndex(-1);
    buttonNovo.requestFocusInWindow();
  }

  private void preparaSalvar() {
    PrepareForm.disableFields(jPanel2);
    setSaveButtons();
  }

  private void preparaAlterar() {
    PrepareForm.enableFields(jPanel2);
    Funcoes.habilitaButtons(buttonSalvar, buttonCancelar);
    Funcoes.desabilitaButtons(buttonEdit, buttonExcluir, buttonNovo, buttonSair);
  }

  private void setNewButtons() {
    Funcoes.habilitaButtons(buttonSalvar, buttonCancelar);
    Funcoes.desabilitaButtons(buttonNovo, buttonEdit, buttonExcluir, buttonSair);
  }

  private void setCancelButtons() {
    Funcoes.habilitaButtons(buttonNovo, buttonSair);
    Funcoes.desabilitaButtons(buttonSalvar, buttonEdit, buttonCancelar, buttonExcluir);
  }

  private void saveIt(Integer id, int user, Usuario usuario, Window window, String msg) {
    Permission permission = new Permission();
    try{
      permission.set("id", id, "user_access_id", user, "user_id", usuario.getId(), "window_id", window.getId());
      if(permission.saveIt()){
        labelCodigo.setText(String.format("%03d", permission.get("id")));
        preparaForm("salvar");
        Message.information(this, msg);
      }
    } catch (ValidationException e) {
      Message.validation(this, permission.errors());
    } catch (Exception e) {
      Message.exception(this, "Erro: ", e.getLocalizedMessage());
    }
  }

  private void setSaveButtons() {
    Funcoes.desabilitaButtons(buttonSalvar, buttonCancelar);
    Funcoes.habilitaButtons(buttonNovo, buttonEdit, buttonExcluir, buttonSair);
  }

  private void preparaFill() {
    Funcoes.habilitaButtons(buttonEdit, buttonExcluir, buttonNovo, buttonSair);
    Funcoes.desabilitaButtons(buttonSalvar, buttonCancelar);
  }

  private void excluir(Integer id) {
    Permission permission = Permission.findById(id);
    if(permission.delete()){
      comboUser.setSelectedIndex(-1);
      comboWindow.setSelectedIndex(-1);
      buttonNovo.requestFocusInWindow();
      Funcoes.limpaLabel(labelCodigo);
      Message.information(this, "Permissão Excluida!");
    }

  }

}
