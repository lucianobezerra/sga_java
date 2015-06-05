package br.com.sga.ui;

import br.com.sga.model.EstabelecimentoTableModel;

/**
 *
 * @author Luciano Bezerra
 */
public class FrameEstabelecimento extends javax.swing.JDialog {

  EstabelecimentoTableModel estabelecimentoTableModel = new EstabelecimentoTableModel();

  public FrameEstabelecimento(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    tableEstabelecimentos.setModel(estabelecimentoTableModel);
    jTabbedPane1.setSelectedIndex(0);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jTabbedPane1 = new javax.swing.JTabbedPane();
    jPanel1 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tableEstabelecimentos = new javax.swing.JTable();
    jPanel2 = new javax.swing.JPanel();

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
    jScrollPane1.setViewportView(tableEstabelecimentos);

    jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 315));

    jTabbedPane1.addTab("Listagem", jPanel1);
    jTabbedPane1.addTab("Cadastro", jPanel2);

    getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 505, 340));

    setSize(new java.awt.Dimension(515, 370));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

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
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JTable tableEstabelecimentos;
  // End of variables declaration//GEN-END:variables
}
