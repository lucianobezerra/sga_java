package br.com.sga.ui;

import br.com.sga.model.Competencia;
import br.com.sga.model.CompetenciaTableModel;
import br.com.sga.model.UsuarioLogado;
import br.com.sga.util.Buttons;
import br.com.sga.util.ComboItem;
import br.com.sga.util.Form;
import br.com.sga.util.Funcoes;
import br.com.sga.util.Message;
import br.com.sga.util.PrepareForm;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import org.javalite.activejdbc.validation.ValidationException;

/**
 *
 * @author luciano
 */
public class FrameCompetencia extends javax.swing.JDialog {

  CompetenciaTableModel model = new CompetenciaTableModel();

  public FrameCompetencia(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    tableCompetencias.setModel(model);
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
    tableCompetencias = new javax.swing.JTable();
    jPanel3 = new javax.swing.JPanel();
    txtPesquisa = new javax.swing.JTextField();
    onlyActive = new javax.swing.JCheckBox();
    jPanel4 = new javax.swing.JPanel();
    jRadioButton1 = new javax.swing.JRadioButton();
    jRadioButton2 = new javax.swing.JRadioButton();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    labelCodigo = new javax.swing.JLabel();
    comboMes = new javax.swing.JComboBox();
    comboAno = new javax.swing.JComboBox();
    checkAtivo = new javax.swing.JCheckBox();
    buttonNovo = new javax.swing.JButton();
    buttonEdit = new javax.swing.JButton();
    buttonCancelar = new javax.swing.JButton();
    buttonSalvar = new javax.swing.JButton();
    buttonExcluir = new javax.swing.JButton();
    buttonSair = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Cadastro de Competências");
    setMinimumSize(new java.awt.Dimension(475, 312));
    setModal(true);
    setName("frameCompetencia"); // NOI18N
    setResizable(false);

    tableCompetencias.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    tableCompetencias.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tableCompetenciasMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tableCompetencias);

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));
    jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtPesquisaKeyPressed(evt);
      }
    });
    jPanel3.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 260, 20));

    onlyActive.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    onlyActive.setSelected(true);
    onlyActive.setText("Ativo");
    jPanel3.add(onlyActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 15, 90, 20));

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
    jRadioButton2.setText("Mês");
    jRadioButton2.setActionCommand("mes");
    jPanel4.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 110, 20));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
      .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    jTabbedPane1.addTab("Listagem", jPanel1);

    jPanel2.setMaximumSize(new java.awt.Dimension(470, 285));
    jPanel2.setPreferredSize(new java.awt.Dimension(470, 285));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel1.setText("Código:");
    jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 20, 56, 25));

    jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("Mês:");
    jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 63, 56, 25));

    jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel3.setText("Ano:");
    jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 106, 56, 25));

    labelCodigo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    labelCodigo.setText(" ");
    jPanel2.add(labelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 20, 37, 25));

    comboMes.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jPanel2.add(comboMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 63, 142, 25));

    comboAno.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jPanel2.add(comboAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 106, 94, 25));

    checkAtivo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    checkAtivo.setText("Ativo");
    jPanel2.add(checkAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 149, 94, -1));

    buttonNovo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    buttonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432226514_Add.png"))); // NOI18N
    buttonNovo.setName("buttonNovo"); // NOI18N
    buttonNovo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonNovoActionPerformed(evt);
      }
    });
    jPanel2.add(buttonNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 60, 25));

    buttonEdit.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    buttonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432226749_icon-136-document-edit.png"))); // NOI18N
    buttonEdit.setName("buttonEdit"); // NOI18N
    buttonEdit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonEditActionPerformed(evt);
      }
    });
    jPanel2.add(buttonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 60, 25));

    buttonCancelar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432226831_cross.png"))); // NOI18N
    buttonCancelar.setName("buttonCancelar"); // NOI18N
    buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonCancelarActionPerformed(evt);
      }
    });
    jPanel2.add(buttonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 60, 25));

    buttonSalvar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432224509_Save.png"))); // NOI18N
    buttonSalvar.setName("buttonSalvar"); // NOI18N
    buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonSalvarActionPerformed(evt);
      }
    });
    jPanel2.add(buttonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 60, 25));

    buttonExcluir.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432226877_delete-file.png"))); // NOI18N
    buttonExcluir.setName("buttonExcluir"); // NOI18N
    buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonExcluirActionPerformed(evt);
      }
    });
    jPanel2.add(buttonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 60, 25));

    buttonSair.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1432226915_22_exit.png"))); // NOI18N
    buttonSair.setText("Sair");
    buttonSair.setName("buttonSair"); // NOI18N
    buttonSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonSairActionPerformed(evt);
      }
    });
    jPanel2.add(buttonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 80, 25));

    jTabbedPane1.addTab("Cadastro", jPanel2);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
    );

    setSize(new java.awt.Dimension(485, 342));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      fillTable(txtPesquisa.getText(), onlyActive.isSelected(), bgOrdem.getSelection().getActionCommand());
    }
  }//GEN-LAST:event_txtPesquisaKeyPressed

  private void tableCompetenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCompetenciasMouseClicked
    if(evt.getClickCount() == 2){
      int linha = tableCompetencias.getSelectedRow();
      Competencia competencia = Competencia.findById(tableCompetencias.getValueAt(linha, 0));
      if (competencia != null) {
        fillForm(competencia);
      }
    }
  }//GEN-LAST:event_tableCompetenciasMouseClicked

  private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed
    preparaForm("novo");
  }//GEN-LAST:event_buttonNovoActionPerformed

  private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
    preparaForm("alterar");
  }//GEN-LAST:event_buttonEditActionPerformed

  private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
    preparaForm("cancelar");
  }//GEN-LAST:event_buttonCancelarActionPerformed

  private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
    Integer id      = labelCodigo.getText() == null ? null : Integer.valueOf(labelCodigo.getText());
    String msg      = labelCodigo.getText() == null ? "Competência Cadastrada!" : "Competência Atualizada!";
    int user        = UsuarioLogado.getInstance().getId();
    saveIt(id, user, (ComboItem) comboMes.getSelectedItem(), (ComboItem) comboAno.getSelectedItem(), msg);
  }//GEN-LAST:event_buttonSalvarActionPerformed

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
      java.util.logging.Logger.getLogger(FrameCompetencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        FrameCompetencia dialog = new FrameCompetencia(new javax.swing.JFrame(), true);
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
  private javax.swing.JComboBox comboAno;
  private javax.swing.JComboBox comboMes;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JRadioButton jRadioButton1;
  private javax.swing.JRadioButton jRadioButton2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JLabel labelCodigo;
  private javax.swing.JCheckBox onlyActive;
  private javax.swing.JTable tableCompetencias;
  private javax.swing.JTextField txtPesquisa;
  // End of variables declaration//GEN-END:variables

  private void preparaForm(String opcao) {
    switch(opcao){
      case "fill": { preparaFill(); break; }
      case "novo": { preparaNovo(); break; }
      case "alterar": { preparaAlterar(); break; }
      case "cancelar": { preparaCancelar(); break; }
      case "salvar": { preparaSalvar(); break; }
    }
  }
  
    private void fillTable(String ano, boolean onlyActive, String ordem) {
    List<Competencia> competencias = Competencia.find("ano = ? and ativo = ?", ano, onlyActive).orderBy(ordem);
    model.removeAll();
    for (Competencia competencia : competencias) {
      model.addRow(competencia);
    }

  }

  private void fillForm(Competencia competencia) {
    jTabbedPane1.setSelectedIndex(1);
    labelCodigo.setText(String.format("%03d", competencia.getId()));
    fillComboMes(competencia);
    fillComboAno(competencia);
    checkAtivo.setSelected(competencia.getBoolean("ativo"));
    preparaForm("fill");
  }

  private void fillComboMes(Competencia cmpt) {
    comboMes.removeAllItems();
    comboMes.addItem(new ComboItem("1", "Janeiro"));
    comboMes.addItem(new ComboItem("2", "Fevereiro"));
    comboMes.addItem(new ComboItem("3", "Março"));
    comboMes.addItem(new ComboItem("4", "Abril"));
    comboMes.addItem(new ComboItem("5", "Maio"));
    comboMes.addItem(new ComboItem("6", "Junho"));
    comboMes.addItem(new ComboItem("7", "Julho"));
    comboMes.addItem(new ComboItem("8", "Agosto"));
    comboMes.addItem(new ComboItem("9", "Setembro"));
    comboMes.addItem(new ComboItem("10", "Outubro"));
    comboMes.addItem(new ComboItem("11", "Novembro"));
    comboMes.addItem(new ComboItem("12", "Dezembro"));
    setSelectedMonth(cmpt);
  }

  private void fillComboAno(Competencia cmpt) {
    List competencias = Competencia.findAll().collect("ano");
    comboAno.removeAllItems();
    for (Object competencia : competencias) {
      comboAno.addItem(competencia.toString());
    }
    setSelectedYear(cmpt);
  }

  private void setSelectedMonth(Competencia cmpt) {
    if(cmpt != null) {
      comboMes.setSelectedIndex(cmpt.getInteger("mes") -1);
      comboAno.setSelectedItem(cmpt.getString("ano"));
    }
    
  }

  private String getMonth(String idMes) {
    switch(idMes){
      case "1": return "Janeiro";
      case "2": return "Fevereiro";
      case "3": return "Março";
      case "4": return "Abril";
      case "5": return "Maio";
      case "6": return "Junho";
      case "7": return "Julho";
      case "8": return "Agosto";
      case "9": return "Setembro";
      case "10": return "Outubro";
      case "11": return "Novembro";
      case "12": return "Dezembro";
    }
    return null;
  }

  private void setSelectedYear(Competencia cmpt) {
    comboAno.setSelectedItem(cmpt.getString("ano"));
  }

  private void preparaFill() {
    Funcoes.habilitaButtons(buttonEdit, buttonExcluir, buttonNovo, buttonSair);
    Funcoes.desabilitaButtons(buttonSalvar, buttonCancelar);
  }

  private void preparaNovo() {
    PrepareForm.enableFields(jPanel2);
    PrepareForm.cleanFields(jPanel2);
    Buttons.setNewButtons(buttonSalvar, buttonCancelar, buttonNovo, buttonEdit, buttonExcluir, buttonSair);
    Funcoes.limpaLabel(labelCodigo);
  }

  private void preparaAlterar() {
    PrepareForm.enableFields(jPanel2);
    Buttons.setEditButtons(buttonSalvar, buttonCancelar, buttonNovo, buttonEdit, buttonExcluir, buttonSair);
  }

  private void preparaCancelar() {
    PrepareForm.cleanFields(jPanel2);
    PrepareForm.disableFields(jPanel2);
    labelCodigo.setText(null);
    Buttons.setCancelButtons(buttonSalvar, buttonCancelar, buttonNovo, buttonEdit, buttonExcluir, buttonSair);
    jTabbedPane1.setSelectedIndex(0);
  }

  private void preparaSalvar() {
    PrepareForm.disableFields(jPanel2);
    Buttons.setSaveButtons(buttonSalvar, buttonCancelar, buttonNovo, buttonEdit, buttonExcluir, buttonSair);
  }

  private void excluir(Integer id) {
    Competencia competencia = Competencia.findById(id);
    if(competencia.delete()){
      PrepareForm.cleanFields(jPanel2);
      Buttons.setDeleteButtons(buttonSalvar, buttonCancelar, buttonNovo, buttonEdit, buttonExcluir, buttonSair);
      Funcoes.limpaLabel(labelCodigo);
    } else {
      JOptionPane.showMessageDialog(this, "Não foi possível excluir a Competência", "Erro", JOptionPane.ERROR_MESSAGE);
    }    
  }

  private void saveIt(Integer id, int user, ComboItem selectedMonth, ComboItem selectedYear, String msg) {
    Competencia competencia = new Competencia();
    try{
      competencia.set("id", id, "user_id", user, "mes", selectedMonth.getKey(), "ano", selectedYear.getKey(), "ativo", checkAtivo.isSelected());
      if(competencia.saveIt()){
        labelCodigo.setText(String.format("%03d", competencia.get("id")));
        preparaForm("salvar");
        Message.information(this, msg);
      }
    } catch (ValidationException e) {
      Message.validation(this, competencia.errors());
    } catch (Exception e) {
      Message.exception(this, "Erro: ", e.getLocalizedMessage());
    }
  }
}
