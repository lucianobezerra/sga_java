package br.com.sga.util;

import org.javalite.activejdbc.Base;
import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.Registry;
import org.javalite.activejdbc.validation.ValidatorAdapter;

/**
 *
 * @author Luciano Bezerra
 */
public class SingleUniquenessValidator extends ValidatorAdapter {

  private final String attribute;

  public SingleUniquenessValidator(String attribute) {
    this.attribute = attribute;
    setMessage("Já Cadastrado");
  }

  @Override
  public void validate(Model m) {
    if (Base.count(Registry.instance().getMetaModel(m.getClass()).getTableName(), attribute + " = ? AND id != ?", m.get(attribute), m.getId()) > 0) {
      m.addValidator(this, attribute);
    }
  }
}