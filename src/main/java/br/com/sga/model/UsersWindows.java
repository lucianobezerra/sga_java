package br.com.sga.model;

import br.com.sga.util.MultipleUniquenessValidator;
import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;

/**
 *
 * @author Luciano Bezerra
 */
@Table(value = "users_windows")
public class UsersWindows extends Model {

  static {
    validatePresenceOf("user_id").message("Usuário Não Informado");
    validatePresenceOf("window_id").message("Tela Não Informada");
    validateWith(new MultipleUniquenessValidator("user_id", "window_id"));
  }

}
