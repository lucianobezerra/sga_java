package br.com.sga;

import br.com.sga.model.Estabelecimento;
import br.com.sga.model.Usuario;
import br.com.sga.model.Window;
import br.com.sga.ui.Login;
import br.com.sga.util.Criptografia;
import br.com.sga.util.Message;
import java.util.List;
import javax.swing.SwingUtilities;
import org.javalite.activejdbc.Base;
import org.javalite.activejdbc.validation.ValidationException;

/**
 *
 * @author Luciano Bezerra
 */
public class App {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {

      @Override
      public void run() {
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1/db_sga", "root", "mysql");
        //insereUsuario();
        //listaEstabelecimentos();
        Login login = new Login();
        login.setVisible(true);
        /*
        Usuario usuario = Usuario.findById(1);
        List<Window> projects = usuario.getAll(Window.class);
        for (Window project : projects) {
          System.out.println(project);
        }*/
      }

      private void insereUsuario() {
        Usuario usuario = new Usuario();
        usuario.set("user_id", 1, "login", "luciano", "senha", Criptografia.criptografar("123456"), "nome", "Luciano Bezerra", "email", "contato@lucianobezerra.eti.br");
        try {
          if (usuario.saveIt()) {
            Window.createIt("description", "frameUsuario", "user_id", 1);
            Window.createIt("description", "framePermissao", "user_id", 1);

          }
          System.out.println(usuario.errors());
        } catch (ValidationException ve) {
          Message.validation(null, usuario.errors());
        }
        System.out.println("Usuário: " + usuario.getId() + " Criado ...");
      }

      private void listaEstabelecimentos() {
        List<Estabelecimento> unidades = Estabelecimento.findAll();
        for (Estabelecimento unidade : unidades) {
          System.out.println(unidade);
        }
      }
    });
  }
}
