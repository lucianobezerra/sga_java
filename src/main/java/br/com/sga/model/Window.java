package br.com.sga.model;

import br.com.sga.util.SingleUniquenessValidator;
import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.Table;

/**
 *
 * @author Luciano Bezerra
 */
@Table(value = "windows")
@BelongsTo(foreignKeyName = "user_id", parent = Usuario.class)

public class Window extends Model {

  static {
    validatePresenceOf("description").message("Descrição não Informada!");
    validateWith(new SingleUniquenessValidator("description"));
  }

  @Override
  public String toString() {
    return getString("description");
  }

}
