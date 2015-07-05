package br.com.sga.test;

import br.com.sga.model.Usuario;
import br.com.sga.model.Window;
import java.util.List;

/**
 *
 * @author luciano
 */
public class TestaPermissao {
  public static void main(String[] args) {
    Usuario usuario = Usuario.findById(1);
    List<Window> projects = usuario.getAll(Window.class);
    for (Window project : projects) {
      System.out.println(project);
    }
  }
}
