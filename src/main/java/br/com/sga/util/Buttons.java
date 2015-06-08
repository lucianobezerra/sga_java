package br.com.sga.util;

import javax.swing.JButton;

/**
 *
 * @author Luciano Bezerra
 */
public class Buttons {
  public static void setNewButtons(JButton ... buttons){
    for (JButton button : buttons) {
      if(button.getName().equals("buttonNovo") || button.getName().equals("buttonEdit") || button.getName().equals("buttonExcluir") || button.getName().equals("buttonSair")){
        button.setEnabled(false);
      } else{
        button.setEnabled(true);
      }
    }
  }

  public static void setEditButtons(JButton ... buttons) {
    for (JButton button : buttons) {
      if(button.getName().equals("buttonNovo") || button.getName().equals("buttonEdit") || button.getName().equals("buttonExcluir") || button.getName().equals("buttonSair")){
        button.setEnabled(false);
      } else{
        button.setEnabled(true);
      }
    }
  }

  public static void setCancelButtons(JButton ... buttons) {
    for (JButton button : buttons) {
      if(button.getName().equals("buttonNovo") || button.getName().equals("buttonSair")){
        button.setEnabled(true);
      } else{
        button.setEnabled(false);
      }
    }
  }
}
