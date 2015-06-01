package br.com.sga.model;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;

/**
 *
 * @author Luciano Bezerra
 */
@Table(value="usuarios")
public class Usuario extends Model {
  static{
    validatePresenceOf("login").message("Login não Informado!");
    validatePresenceOf("senha").message("Senha não Informada!");
    validatePresenceOf("nome").message("Nome não preenchido!");
    validatePresenceOf("email").message("Email não preenchido!");
    validateEmailOf("email").message("Formato do Email Inválido!");
    validateWith(new UniquenessValidator("login"));
  }

  @Override
  public String toString() {
    return getString("nome");
  }
  
  

}
