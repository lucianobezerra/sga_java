package br.com.sga.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Luciano Bezerra
 */
public class PermissionTableModel extends AbstractTableModel {

  private final List<Permission> permissoes;
  private final String[] colunas = {"Cód", "Usuário", "Tela"};

  public PermissionTableModel() {
    this.permissoes = new ArrayList<>();
  }

  public void addRow(Permission p) {
    this.permissoes.add(p);
    this.fireTableDataChanged();
  }

  @Override
  public String getColumnName(int column) {
    return this.colunas[column];
  }

  @Override
  public int getRowCount() {
    return permissoes.size();
  }

  @Override
  public int getColumnCount() {
    return colunas.length;
  }

  @Override
  public Object getValueAt(int row, int column) {
    switch (column) {
      case 0: return String.format("%03d", permissoes.get(row).getInteger("id"));
      case 1: return permissoes.get(row).parent(Usuario.class).get("id") + " - "+ permissoes.get(row).parent(Usuario.class).get("nome");
      case 2: return permissoes.get(row).parent(Window.class).get("description");
    }
    return null;
  }

  public void removeRow(int linha) {
    this.permissoes.remove(linha);
    this.fireTableRowsDeleted(linha, linha);
  }

  public void removeAll() {
    this.permissoes.clear();
    this.fireTableDataChanged();
  }

  public Permission get(int linha) {
    return this.permissoes.get(linha);
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
      case 1: permissoes.get(row).set("user_id", aValue);
      case 2: permissoes.get(row).set("window",  aValue);
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
