package br.com.sga.util;

import br.com.sga.model.UsersWindows;
import br.com.sga.model.UsuarioLogado;
import br.com.sga.model.Window;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Luciano Bezerra
 */
public class Funcoes {
  
  public static boolean checaPermissao(String tela){
    Window window = Window.findFirst("description = ?", tela);
    UsersWindows permission = null;
    if(window != null){
      permission = UsersWindows.findFirst("user_id = ? and window_id = ?", UsuarioLogado.getInstance().getId(), window.getId());
    }
    return permission != null;
  }

  public static void formatFontGrid(JTable grid, Font font){
    grid.setFont(font);
  }
  
  public static void formatFontHeader(JTable grid, Font font){
    grid.getTableHeader().setFont(font);
  }
  
  public static void formatHeader(JTable grid, Font font, int size){
    JTableHeader header = grid.getTableHeader();
    header.setPreferredSize(new Dimension(0,400));
    header.setFont(font);
  }
  
  public static void sizeColumn(JTable grid, int column, int size){
    grid.getColumnModel().getColumn(column).setPreferredWidth(size);
    grid.getColumnModel().getColumn(column).setResizable(true);
  }

  public static void alinhaColunas(JTable grid, int column, int align) {
    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
    renderer.setHorizontalAlignment(align);
    grid.getColumnModel().getColumn(column).setCellRenderer(renderer);
  }
  
  public static void fontGrid(JTable grid, String font, int style, int sizeFont) {
    formatFontHeader(grid, new Font(font, style, sizeFont));
    formatFontGrid(grid, new Font(font, style, sizeFont));
  }

  public static void desabilitaEdits(JTextField... edits) {
    for (JTextField edit : edits) {
      edit.setEnabled(false);
    }
  }

  public static void desabilitaPasswordEdits(JPasswordField... edits) {
    for (JPasswordField edit : edits) {
      edit.setEnabled(false);
    }
  }

  public static void desabilitaFormatedEdits(JFormattedTextField... edits) {
    for (JFormattedTextField edit : edits) {
      edit.setEnabled(false);
    }
  }

  public static void desabilitaChecks(JCheckBox... checks) {
    for (JCheckBox check : checks) {
      check.setEnabled(false);
    }
  }

  public static void desabilitaCombos(JComboBox... combos) {
    for (JComboBox combo : combos) {
      combo.setEnabled(false);
    }
  }

  public static void desabilitaButtons(JButton... buttons) {
    for (JButton button : buttons) {
      button.setEnabled(false);
    }
  }

  public static void habilitaButtons(JButton... buttons) {
    for (JButton button : buttons) {
      button.setEnabled(true);
    }
  }

  public static void habilitaEdits(JTextField... edits) {
    for (JTextField edit : edits) {
      edit.setEnabled(true);
    }
  }

  public static void habilitaPasswordEdits(JPasswordField... edits) {
    for (JPasswordField edit : edits) {
      edit.setEnabled(true);
    }
  }

  public static void habilitaFormatedEdits(JFormattedTextField... edits) {
    for (JFormattedTextField edit : edits) {
      edit.setEnabled(true);
    }
  }

  public static void habilitaChecks(JCheckBox... checks) {
    for (JCheckBox check : checks) {
      check.setEnabled(true);
    }
  }

  public static void habilitaCombos(JComboBox... combos) {
    for (JComboBox combo : combos) {
      combo.setEnabled(true);
    }
  }

  public static void limpaLabel(JLabel... labels) {
    for (JLabel label : labels) {
      label.setText(null);
    }
  }
  
  public static void alignColumns(JTable grid, int column, int align) {
    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
    renderer.setHorizontalAlignment(align);
    grid.getColumnModel().getColumn(column).setCellRenderer(renderer);
  }
  
  public static boolean removeLinha(DefaultTableModel model) {
    int linha = model.getRowCount();
    for (int i = linha - 1; i >= 0; --i) {
      model.removeRow(i);
    }
    return false;
  }  

  public static String getStatus(Boolean status) {
    return status ? "ATIVO" : "INATIVO";
  }
  
  public static boolean isNullOrBlank(String s){
    return (s == null || s.trim().equals(""));
  }
}
