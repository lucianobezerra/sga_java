package br.com.sga.util;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author Luciano Bezerra
 */
public class Form {
  
  public static void preparaForm(String opcao, JDialog form, JPanel panel, JTabbedPane tab){
    switch(opcao){
      case "iniciar":  { preparaIniciar(panel, tab, form); break; }
      case "novo":     { preparaNovo();    break; }
      case "salvar":   { preparaSalvar();  break; }
      case "alterar":  { preparaAlterar(); break; }
      case "cancelar": { preparaCancelar(); break; }
    }
  }
  
  public static void preparaIniciar(JPanel panel, JTabbedPane tab, JDialog form){
    PrepareForm.disableFields(panel);
    PrepareForm.cleanFields(panel);
    for (int i = 0; i < panel.getComponentCount(); i++) {
      Component component = panel.getComponent(i);
      if(component instanceof JButton){
        JButton button = (JButton) component;
        System.out.println(button.getName());
        if("buttonCancelar".equals(component.getName()) 
                || "buttonEdit".equals(component.getName()) 
                || "buttonExcluir".equals(component.getName()) 
                || "buttonSalvar".equals(component.getName())){
          button.setEnabled(false);
        } else if("buttonNovo".equals(component.getName()) || "buttonSair".equals(component.getName())){
          button.setEnabled(true);
        }
      }else if (component instanceof JLabel) {
        JLabel labelField = (JLabel) component;
        if ("labelCodigo".equals(component.getName())) {
          labelField.setText(null);
        }
      }
    }
    tab.setSelectedIndex(0);    
  }
  public static void preparaNovo(){
    
  }
  public static void preparaSalvar(){
    
  }
  public static void preparaAlterar(){
    
  }
  public static void preparaCancelar(){
    
  }
  
}
