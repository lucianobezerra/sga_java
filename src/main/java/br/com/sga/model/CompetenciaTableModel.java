package br.com.sga.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Luciano Bezerra
 */
public class CompetenciaTableModel extends AbstractTableModel {

  private final List<Competencia> competencias;
  private final String[] colunas = {"Cód", "Mês", "Ano", "Ativo"};

  public CompetenciaTableModel() {
    this.competencias = new ArrayList<>();
  }

  public void addRow(Competencia c) {
    this.competencias.add(c);
    this.fireTableDataChanged();
  }

  @Override
  public String getColumnName(int column) {
    return this.colunas[column];
  }

  @Override
  public int getRowCount() {
    return competencias.size();
  }

  @Override
  public int getColumnCount() {
    return colunas.length;
  }

  @Override
  public Object getValueAt(int row, int column) {
    switch (column) {
      case 0: return String.format("%03d", competencias.get(row).getInteger("id"));
      case 1: return getMes(competencias.get(row).getInteger("mes"));
      case 2: return competencias.get(row).getInteger("ano");
      case 3: return competencias.get(row).getBoolean("ativo");
    }
    return null;
  }

  public void removeRow(int linha) {
    this.competencias.remove(linha);
    this.fireTableRowsDeleted(linha, linha);
  }

  public void removeAll() {
    this.competencias.clear();
    this.fireTableDataChanged();
  }

  public Competencia get(int linha) {
    return this.competencias.get(linha);
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
      case 0: competencias.get(row).set("id", aValue);
      case 1: competencias.get(row).set("mes",  aValue);
      case 2: competencias.get(row).set("ano",  aValue);
      case 3: competencias.get(row).set("ativo",  aValue);
    }
    this.fireTableRowsUpdated(row, row);
  }

  @Override
  public Class<?> getColumnClass(int column) {
    switch (column) {
      case 0: return Integer.class;
      case 1: case 2: return Integer.class;
      case 3: return Boolean.class;
    }
    return String.class;
  }

  private String getMes(Integer mes) {
    switch(mes){
      case 1: return "Janeiro";
      case 2: return "Fevereiro";
      case 3: return "Março";
      case 4: return "Abril";
      case 5: return "Maio";
      case 6: return "Junho";
      case 7: return "Julho";
      case 8: return "Agosto";
      case 9: return "Setembro";
      case 10: return "Outubro";
      case 11: return "Novembro";
      case 12: return "Dezembro";
    }
    return null;
  }
  
}
