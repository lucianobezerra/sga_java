package br.com.sga.util;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.validation.ValidatorAdapter;

public class UniquenessValidator extends ValidatorAdapter{

  private final String column1;
  private final String column2;
          
  public UniquenessValidator(String column1, String column2) {
    this.column1 = column1;
    this.column2 = column2;
  }
  
  @Override
  public void validate(Model model){
    String newValue1 = model.getString(column1);
    String newValue2 = model.getString(column2);
    Boolean exists  = model.findFirst(column1 + " = ? and " + column2 + " = ?", newValue1, newValue2) == null ? false : model.findFirst(column1 + " = ? and " + column2 + " = ?", newValue1, newValue2).exists();
    if(exists){
      model.addValidator(this, "Já existe");
    }
  }
}