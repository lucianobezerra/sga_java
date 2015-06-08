package br.com.sga.ui;

import br.com.sga.model.Estabelecimento;
import br.com.sga.model.EstabelecimentoTableModel;
import br.com.sga.model.UsuarioLogado;
import br.com.sga.util.Buttons;
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
public class FrameEstabelecimento extends javax.swing.JDialog {

  EstabelecimentoTableModel model = new EstabelecimentoTableModel();

  public FrameEstabelecimento(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    tableEstabelecimentos.setModel(model);
    formataGrid(tableEstabelecimentos);
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
    tableEstabelecimentos = new javax.swing.JTable();
    jPanel3 = new javax.swing.JPanel();
    txtPesquisa = new javax.swing.JTextField();
    onlyActive = new javax.swing.JCheckBox();
    jPanel4 = new javax.swing.JPanel();
    jRadioButton1 = new javax.swing.JRadioButton();
    jRadioButton2 = new javax.swing.JRadioButton();
    jRadioButton3 = new javax.swing.JRadioButton();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    checkAih = new javax.swing.JCheckBox();
    checkApac = new javax.swing.JCheckBox();
    checkAtivo = new javax.swing.JCheckBox();
    labelCodigo = new javax.swing.JLabel();
    txtCnes = new javax.swing.JTextField();
    txtRazao = new javax.swing.JTextField();
    txtFantasia = new javax.swing.JTextField();
    txtVTeto = new DecimalFormattedField(DecimalFormattedField.NUMERO); ;
    txtVMedio = new DecimalFormattedField(DecimalFormattedField.NUMERO); ;
    buttonSalvar = new javax.swing.JButton();
    buttonEdit = new javax.swing.JButton();
    buttonNovo = new javax.swing.JButton();
    buttonCancelar = new javax.swing.JButton();
    buttonExcluir = new javax.swing.JButton();
    buttonSair = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Cadastro de Estabelecimentos");
    setMaximumSize(new java.awt.Dimension(515, 370));
    setMinimumSize(new java.awt.Dimension(515, 370));
    setModal(true);
    setName("frameEstabelecimento"); // NOI18N
    setPreferredSize(new java.awt.Dimension(515, 370));
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jTabbedPane1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jTabbedPane1.setMaximumSize(new java.awt.Dimension(515, 370));
    jTabbedPane1.setMinimumSize(new java.awt.Dimension(515, 370));
    jTabbedPane1.setPreferredSize(new java.awt.Dimension(515, 370));

    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    tableEstabelecimentos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    tableEstabelecimentos.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tableEstabelecimentosMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tableEstabelecimentos);

    jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 200));

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));
    jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtPesquisaKeyPressed(evt);
      }
    });
    jPanel3.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 360, 20));

    onlyActive.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    onlyActive.setText("Ativo");
    jPanel3.add(onlyActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 15, 90, 20));

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
    jRadioButton2.setText("Login");
    jRadioButton2.setActionCommand("cnes");
    jPanel4.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 110, 20));

    bgOrdem.add(jRadioButton3);
    jRadioButton3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jRadioButton3.setText("Nome");
    jRadioButton3.setActionCommand("razao");
    jPanel4.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 110, 20));

    jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 490, 50));

    jTabbedPane1.addTab("Listagem", jPanel1);

    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel1.setText("Código:");
    jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 25));

    jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("Cnes:");
    jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, 25));

    jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel3.setText("Razão:");
    jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, 25));

    jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel4.setText("Fantasia:");
    jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, 25));

    jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel5.setText("Valor Teto:");
    jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, 25));

    jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel6.setText("Valor Médio:");
    jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 80, 25));

    checkAih.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    checkAih.setText("Emite AIH");
    checkAih.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jPanel2.add(checkAih, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 90, 25));

    checkApac.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    checkApac.setText("Emite APAC");
    checkApac.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jPanel2.add(checkApac, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 110, 25));

    checkAtivo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    checkAtivo.setText("Ativo");
    checkAtivo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jPanel2.add(checkAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 110, 25));
    jPanel2.add(labelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 60, 25));
    jPanel2.add(txtCnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 70, 25));
    jPanel2.add(txtRazao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 250, 25));
    jPanel2.add(txtFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 250, 25));

    txtVTeto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
    txtVTeto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jPanel2.add(txtVTeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 100, 25));

    txtVMedio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
    txtVMedio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jPanel2.add(txtVMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 100, 25));

    buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432224509_Save.png"))); // NOI18N
    buttonSalvar.setName("buttonSalvar"); // NOI18N
    buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonSalvarActionPerformed(evt);
      }
    });
    jPanel2.add(buttonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 60, 25));

    buttonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432226749_icon-136-document-edit.png"))); // NOI18N
    buttonEdit.setName("buttonEdit"); // NOI18N
    buttonEdit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonEditActionPerformed(evt);
      }
    });
    jPanel2.add(buttonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 60, 25));

    buttonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432226514_Add.png"))); // NOI18N
    buttonNovo.setName("buttonNovo"); // NOI18N
    buttonNovo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonNovoActionPerformed(evt);
      }
    });
    jPanel2.add(buttonNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 60, 25));

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

    jTabbedPane1.addTab("Cadastro", jPanel2);

    getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 505, 340));

    setSize(new java.awt.Dimension(515, 370));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      fillTable(txtPesquisa.getText().toUpperCase(), onlyActive.isSelected(), bgOrdem.getSelection().getActionCommand());
    }
  }//GEN-LAST:event_txtPesquisaKeyPressed

  private void tableEstabelecimentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEstabelecimentosMouseClicked
    if(evt.getClickCount() == 2){
      int linha = tableEstabelecimentos.getSelectedRow();
      Estabelecimento estabelecimento = Estabelecimento.findById(tableEstabelecimentos.getValueAt(linha, 0));
      if (estabelecimento != null) {
        fillForm(estabelecimento);
      }
      
    }
  }//GEN-LAST:event_tableEstabelecimentosMouseClicked

  private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
    Integer id      = labelCodigo.getText() == null ? null : Integer.valueOf(labelCodigo.getText());
    String msg      = labelCodigo.getText() == null ? "Estabelecimento Cadastrado!" : "Estabelecimento Atualizado!";
    int user        = UsuarioLogado.getInstance().getId();
    String cnes     = txtCnes.getText();
    String razao    = txtRazao.getText().toUpperCase();
    String fantasia = txtFantasia.getText().toUpperCase();
    Double vTeto    = Double.valueOf(txtVTeto.getText());
    Double vMedio   = Double.valueOf(txtVMedio.getText());
    Boolean vAih    = checkAih.isSelected();
    Boolean vApac   = checkApac.isSelected();
    Boolean vAtivo  = checkAtivo.isSelected();
    saveIt(id, user, cnes, razao, fantasia, vTeto, vMedio, vAih, vApac, vAtivo, msg);
  }//GEN-LAST:event_buttonSalvarActionPerformed

  private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
    preparaForm("alterar");
  }//GEN-LAST:event_buttonEditActionPerformed

  private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed
    preparaForm("novo");
  }//GEN-LAST:event_buttonNovoActionPerformed

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
      java.util.logging.Logger.getLogger(FrameEstabelecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        FrameEstabelecimento dialog = new FrameEstabelecimento(new javax.swing.JFrame(), true);
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
  private javax.swing.JCheckBox checkAih;
  private javax.swing.JCheckBox checkApac;
  private javax.swing.JCheckBox checkAtivo;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
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
  private javax.swing.JTable tableEstabelecimentos;
  private javax.swing.JTextField txtCnes;
  private javax.swing.JTextField txtFantasia;
  private javax.swing.JTextField txtPesquisa;
  private javax.swing.JTextField txtRazao;
  private javax.swing.JFormattedTextField txtVMedio;
  private javax.swing.JFormattedTextField txtVTeto;
  // End of variables declaration//GEN-END:variables

  private void formataGrid(JTable grid) {
    Funcoes.fontGrid(grid, "Arial", Font.PLAIN, 12);
    Funcoes.alinhaColunas(grid, 0, SwingConstants.CENTER);
    Funcoes.alinhaColunas(grid, 1, SwingConstants.CENTER);
    Funcoes.sizeColumn(grid, 0, 40);
    Funcoes.sizeColumn(grid, 1, 70);
    Funcoes.sizeColumn(grid, 2, 280);
    Funcoes.sizeColumn(grid, 3, 40);
  //  Funcoes.alinhaColunas(grid, 3, SwingConstants.CENTER);
  }

  private void fillTable(String name, boolean onlyActive, String ordem) {
    String active = onlyActive ? " and ativo" : "";
    List<Estabelecimento> estabelecimentos = Estabelecimento.find("razao like '%" + name + "%'" + active).orderBy(ordem);
    model.removeAll();
    for (Estabelecimento estabelecimento : estabelecimentos) {
      model.addRow(estabelecimento);
    }
  }

  private void fillForm(Estabelecimento estabelecimento) {
    jTabbedPane1.setSelectedIndex(1);
    labelCodigo.setText(String.format("%03d", estabelecimento.getId()));
    txtCnes.setText(estabelecimento.getString("cnes"));
    txtRazao.setText(estabelecimento.getString("razao"));
    txtFantasia.setText(estabelecimento.getString("fantasia"));
    txtVTeto.setText(estabelecimento.getString("valorteto"));
    txtVMedio.setText(estabelecimento.getString("valormedio"));
    checkAih.setSelected(estabelecimento.getBoolean("emiteaih"));
    checkApac.setSelected(estabelecimento.getBoolean("emiteapac"));
    checkAtivo.setSelected(estabelecimento.getBoolean("ativo"));
    preparaForm("fill");
  }

  private void preparaForm(String opcao) {
    switch(opcao){
      case "fill": { preparaFill(); break; }
      case "novo": { preparaNovo(); break; }
      case "alterar": { preparaAlterar(); break; }
      case "cancelar": { preparaCancelar(); break; }
    }
  }

  private void preparaFill() {
    Funcoes.habilitaButtons(buttonEdit, buttonExcluir, buttonNovo, buttonSair);
    Funcoes.desabilitaButtons(buttonSalvar, buttonCancelar);
  }

  private void excluir(Integer valueOf) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  private void preparaNovo() {
    PrepareForm.enableFields(jPanel2);
    PrepareForm.cleanFields(jPanel2);
    Buttons.setNewButtons(buttonSalvar, buttonCancelar, buttonNovo, buttonEdit, buttonExcluir, buttonSair);
    Funcoes.limpaLabel(labelCodigo);
  }

  private void setCancelButtons() {
    Funcoes.habilitaButtons(buttonNovo, buttonSair);
    Funcoes.desabilitaButtons(buttonSalvar, buttonEdit, buttonCancelar, buttonExcluir);
  }

  private void preparaAlterar() {
    PrepareForm.enableFields(jPanel2);
    Buttons.setEditButtons(buttonSalvar, buttonCancelar, buttonNovo, buttonEdit, buttonExcluir, buttonSair);
  }

  private void preparaCancelar() {
    PrepareForm.cleanFields(jPanel2);
    PrepareForm.disableFields(jPanel2);
    labelCodigo.setText(null);
    txtVTeto.setValue(null);
    txtVMedio.setValue(null);
    Buttons.setCancelButtons(buttonSalvar, buttonCancelar, buttonNovo, buttonEdit, buttonExcluir, buttonSair);
    jTabbedPane1.setSelectedIndex(0);
  }

  private void saveIt(Integer id, int user, String cnes, String razao, String fantasia, Double vTeto, Double vMedio, Boolean vAih, Boolean vApac, Boolean vAtivo, String msg) {
    Estabelecimento estabelecimento = new Estabelecimento();
    try{
      estabelecimento.set("id", id, "user_id", user);
    } catch (ValidationException e) {
      Message.validation(this, estabelecimento.errors());
    } catch (Exception e) {
      Message.exception(this, "Erro: ", e.getLocalizedMessage());
    }
  }

}
