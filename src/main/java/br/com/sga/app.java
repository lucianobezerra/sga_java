package br.com.sga;

import br.com.sga.model.Usuario;
import br.com.sga.ui.Login;
import br.com.sga.util.Criptografia;
import br.com.sga.util.Message;
import javax.swing.SwingUtilities;
import org.javalite.activejdbc.Base;
import org.javalite.activejdbc.validation.ValidationException;

/**
 *
 * @author Luciano Bezerra
 */
public class app {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {

      @Override
      public void run() {
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1/db_sga", "root", "mysql");
        //insereUsuario();
        Login login = new Login();
        login.setVisible(true);
      }

      private void insereUsuario() {
        Usuario usuario = new Usuario();
        usuario.set("user_id", 1, "login", "luciano", "senha", Criptografia.criptografar("123456"), "nome", "Luciano Bezerra", "email", "contato@lucianobezerra.eti.br");
        try {
          usuario.saveIt();
          System.out.println(usuario.errors());
        } catch (ValidationException ve) {
          Message.validation(null, usuario.errors());
        }
        System.out.println("Usuário: " + usuario.getId() + " Criado ...");
      }
    });
  }
}
