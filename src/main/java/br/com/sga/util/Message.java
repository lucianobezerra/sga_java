package br.com.sga.util;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import org.javalite.activejdbc.Errors;

/**
 *
 * @author Luciano Bezerra
 */
public class Message {

  public static void error(Component parent, String message) {
    JOptionPane.showMessageDialog(parent, message, "Erro: ", JOptionPane.ERROR_MESSAGE);
  }

  public static int confirmation(Component parent, String message) {
    return JOptionPane.showConfirmDialog(parent, message, "Confirmação", JOptionPane.YES_NO_OPTION);
  }

  public static void information(Component parent, String message) {
    JOptionPane.showMessageDialog(parent, message, "Informação", JOptionPane.INFORMATION_MESSAGE);
  }

  public static void validation(Component parent, Errors errors) {
    String message = "Antes de prosseguir verifique os seguintes erros:\n\n";
    for (Map.Entry<String, String> entry : errors.entrySet()) {
      message += " - " + entry.getValue() + "\n";
    }
    JOptionPane.showMessageDialog(parent, message);
  }

  public static void exception(Component parent, String erroMessage, String exceptionMessage) {
    JScrollPane scrollPane = new JScrollPane(new JLabel(erroMessage));
    scrollPane.setPreferredSize(new Dimension(400, 200));
    Object message;

    JTextArea textArea = new JTextArea(exceptionMessage);
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    textArea.setMargin(new Insets(5, 5, 5, 5));
    scrollPane.getViewport().setView(textArea);
    message = scrollPane;
  }
}
