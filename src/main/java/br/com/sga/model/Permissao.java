package br.com.sga.model;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;

/**
 *
 * @author Luciano Bezerra
 */
@Table(value = "permissoes")
public class Permissao extends Model {

  static {
    validatePresenceOf("user_id").message("Usuário Não Informado");
    validatePresenceOf("window").message("Tela Não Informada");
  }
}
