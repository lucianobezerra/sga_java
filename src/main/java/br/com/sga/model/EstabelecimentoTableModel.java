package br.com.sga.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Luciano Bezerra
 */
public class EstabelecimentoTableModel extends AbstractTableModel {

  private final List<Estabelecimento> estabelecimentos;
  private final String[] colunas = {"Cód", "Cnes", "Razão", "Ativo"};

  public EstabelecimentoTableModel() {
    this.estabelecimentos = new ArrayList<>();
  }

  public void addRow(Estabelecimento p) {
    this.estabelecimentos.add(p);
    this.fireTableDataChanged();
  }

  @Override
  public String getColumnName(int column) {
    return this.colunas[column];
  }

  @Override
  public int getRowCount() {
    return estabelecimentos.size();
  }

  @Override
  public int getColumnCount() {
    return colunas.length;
  }

  @Override
  public Object getValueAt(int row, int column) {
    switch (column) {
      case 0: return String.format("%03d", estabelecimentos.get(row).getInteger("id"));
      case 1: return estabelecimentos.get(row).getString("cnes");
      case 2: return estabelecimentos.get(row).getString("razao");
      case 3: return estabelecimentos.get(row).getBoolean("ativo");
    }
    return null;
  }

  public void removeRow(int linha) {
    this.estabelecimentos.remove(linha);
    this.fireTableRowsDeleted(linha, linha);
  }

  public void removeAll() {
    this.estabelecimentos.clear();
    this.fireTableDataChanged();
  }

  public Estabelecimento get(int linha) {
    return this.estabelecimentos.get(linha);
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
      case 0: estabelecimentos.get(row).set("id", aValue);
      case 1: estabelecimentos.get(row).set("cnes",  aValue);
      case 2: estabelecimentos.get(row).set("razao",  aValue);
      case 3: estabelecimentos.get(row).set("ativo",  aValue);
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
