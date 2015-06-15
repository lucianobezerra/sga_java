package br.com.sga.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author Luciano Bezerra
 */
public class DecimalFormattedField extends JFormattedTextField {

  public static final String NUMERO = "#,###,##0.00; -#,###,##0.00";
  public static final String REAL = "R$ #,##0.00;R$ -#,##0.00";
  public static final String PORCENTAGEM = "#,##0.00'%';-#,##0.00'%'";
  private DecimalFormat df;
  private double dValue = 0.0;
  private String oldValue = "0.00";
  public static final String ERRO = "Valor inválido";

  public DecimalFormattedField(String formato) {
    super();

    df = new DecimalFormat();
    df.setRoundingMode(RoundingMode.UP);
    df.applyPattern(formato);

    this.setHorizontalAlignment(JTextField.RIGHT);

    setValue(oldValue);
    applyActions();
  }

  public void setDf(DecimalFormat df) {
    this.df = df;
    setValue("0.00");
    this.thisFocusGained(null);
    setText("0.00");
  }

  /**
   * Retorna o DecimalFormat sendo usado atualmente
   * @return 
   */
  public DecimalFormat getDf() {
    return df;
  }

  private void applyActions() {

    this.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        transferFocus();
      }
    });

    this.addFocusListener(new FocusListener() {

      @Override
      public void focusLost(FocusEvent evt) {
        thisFocusLost(evt);
      }

      @Override
      public void focusGained(FocusEvent evt) {
        thisFocusGained(evt);
      }
    });

  }

  public void thisFocusLost(FocusEvent evt) {
    String valor = getText().replace(',', '.');
    if (!valor.equals("") && !valor.trim().isEmpty()) {
      oldValue = valor;
    }
    setValue(valor);
  }

  public void thisFocusGained(FocusEvent fe) {
    super.setText("");
    normalText();
  }

  private void setValue(String value) {
    try {
      dValue = arredondar(Double.parseDouble(value));
    } catch (Exception e) {
      value = oldValue;
    }
    showValue(value);
  }

  @Override
  public void setValue(Object value) {
    if (value instanceof Double) {
      double d = (Double) value;
      this.setText(String.format("%f", d));
    } else {
      this.setText(value.toString());
    }
  }

  public void showValue(String s) {
    try {
      super.setText(df.format(new java.math.BigDecimal(s)));
    } catch (Exception e) {
      error();
      dValue = Double.NaN;
    }
  }

  public double getDoubleValue() {
    return dValue;
  }

  @Override
  public Object getValue() {
    return getDoubleValue();
  }

  private void error() {
    this.setForeground(Color.red);
    super.setText(ERRO);
  }

  private void normalText() {
    this.setForeground(null);
  }

  @Override
  public void setText(String valor) {
    super.setText(valor);
    this.thisFocusLost(null);
  }

  public double arredondar(double d) {
    if (d > 0) {
      return (Math.ceil((d * 100.0))) / 100.0;
    } else {
      return (Math.floor((d * 100.0))) / 100.0;
    }
  }
}
