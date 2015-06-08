package br.com.sga.util;

import br.com.sga.ui.DecimalFormattedField;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Luciano Bezerra
 */
public class PrepareForm {

  public static void cleanFields(JPanel panel) {
    for (int i = 0; i < panel.getComponentCount(); i++) {
      Component component = panel.getComponent(i);
      if (component instanceof JTextField) {
        JTextField textField = (JTextField) component;
        textField.setText(null);
      }else if (component instanceof JFormattedTextField) {
        JFormattedTextField textField = (JFormattedTextField) component;
        textField.setText(null);
      }else if (component instanceof DecimalFormattedField) {
        DecimalFormattedField textField = (DecimalFormattedField) component;
        textField.setText(null);
      } else if (component instanceof JComboBox) {
        JComboBox comboField = (JComboBox) component;
        if (comboField.getItemCount() > 0) {
          comboField.setSelectedIndex(0);
        }
      } else if (component instanceof JCheckBox) {
        JCheckBox checkField = (JCheckBox) component;
        checkField.setSelected(false);
      } else if (component instanceof JLabel) {
        JLabel labelField = (JLabel) component;
        if ("labelCodigo".equals(component.getName())) {
          labelField.setText(null);
        }
      }
    }
  }

  public static void disableFields(JPanel panel) {
    for (int i = 0; i < panel.getComponentCount(); i++) {
      Component component = panel.getComponent(i);
      component.setEnabled(false);
    }
  }

  public static void enableFields(JPanel panel) {
    for (int i = 0; i < panel.getComponentCount(); i++) {
      Component component = panel.getComponent(i);
      component.setEnabled(true);
    }
  }
}
