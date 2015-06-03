package br.com.sga.model;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.BelongsToParents;
import org.javalite.activejdbc.annotations.Table;

/**
 *
 * @author Luciano Bezerra
 */
@Table(value = "permissions")
@BelongsToParents({ 
  @BelongsTo(foreignKeyName = "user_id", parent = Usuario.class), 
  @BelongsTo(foreignKeyName = "user_access_id", parent = Usuario.class),
  @BelongsTo(foreignKeyName = "window_id", parent = Window.class) 
})

public class Permission extends Model {

  static {
    validatePresenceOf("user_id").message("Usuário Não Informado");
    validatePresenceOf("window_id").message("Tela Não Informada");
  }

  
}
