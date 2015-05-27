package br.com.sga.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Luciano Bezerra
 */
public class UsuarioTableModel extends AbstractTableModel {

  private final List<Usuario> usuarios;
  private final String[] colunas = {"Cód", "Login", "Nome", "Ativo"};

  public UsuarioTableModel() {
    this.usuarios = new ArrayList<>();
  }

  public void addRow(Usuario u) {
    this.usuarios.add(u);
    this.fireTableDataChanged();
  }

  @Override
  public String getColumnName(int column) {
    return this.colunas[column];
  }

  @Override
  public int getRowCount() {
    return usuarios.size();
  }

  @Override
  public int getColumnCount() {
    return colunas.length;
  }

  @Override
  public Object getValueAt(int row, int column) {
    switch (column) {
      case 0: return String.format("%03d", usuarios.get(row).getInteger("id"));
      case 1: return usuarios.get(row).getString("login");
      case 2: return usuarios.get(row).getString("nome");
      case 3: return usuarios.get(row).getBoolean("ativo") == true ? "Ativo" : "Inativo";
    }
    return null;
  }

  public void removeRow(int linha) {
    this.usuarios.remove(linha);
    this.fireTableRowsDeleted(linha, linha);
  }

  public void removeAll() {
    this.usuarios.clear();
    this.fireTableDataChanged();
  }

  public Usuario get(int linha) {
    return this.usuarios.get(linha);
  }

  @Override
  public boolean isCellEditable(int rowIndex, int columnIndex) {
    return false;
  }

  @Override
  public void setValueAt(Object aValue, int row, int column) {
    if (aValue == null) {
      return;
    }

    switch (column) {
      case 1: usuarios.get(row).set("login", aValue);
      case 2: usuarios.get(row).set("nome",  aValue);
      case 3: usuarios.get(row).set("ativo", aValue);
    }
    this.fireTableRowsUpdated(row, row);
  }

  @Override
  public Class<?> getColumnClass(int column) {
    switch (column) {
      case 0: return Integer.class;
      case 1: case 2: return String.class;
      case 3: return Boolean.class;
    }
    return String.class;
  }
  
}
