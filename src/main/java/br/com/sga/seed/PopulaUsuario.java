package br.com.sga.seed;

import br.com.sga.model.Usuario;
import br.com.sga.util.Criptografia;
import org.javalite.activejdbc.Base;

/**
 *
 * @author Luciano Bezerra
 */
public class PopulaUsuario {

  public static void main(String[] args) {
    Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1/db_sga", "root", "mysql");
    Usuario usuario = Usuario.createIt(
            "login", "luciano",
            "senha", Criptografia.criptografar("123456"),
            "nome", "Luciano Bezerra",
            "email", "contato@lucianobezerra.eti.br"
    );
    System.out.println("Usuário: " + usuario.getId() + " Criado ...");
  }
}
