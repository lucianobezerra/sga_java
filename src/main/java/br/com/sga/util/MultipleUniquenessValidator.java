package br.com.sga.util;

import org.javalite.activejdbc.Base;
import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.Registry;
import org.javalite.activejdbc.validation.ValidatorAdapter;

/**
 *
 * @author Luciano Bezerra
 */
public class MultipleUniquenessValidator extends ValidatorAdapter {

  private final String attr1;
  private final String attr2;

  public MultipleUniquenessValidator(String attr1, String attr2) {
    this.attr1 = attr1;
    this.attr2 = attr2;
    setMessage("Já Cadastrado");
  }

  @Override
  public void validate(Model m) {
    if (Base.count(Registry.instance().getMetaModel(m.getClass()).getTableName(), attr1 + " = ? AND " + attr2 + " = ? and id != ?", m.get(attr1), m.get(attr2), m.getId()) > 0) {
      m.addValidator(this, attr1);
      m.addValidator(this, attr2);
    }
  }
}