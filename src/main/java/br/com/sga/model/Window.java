package br.com.sga.model;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.Table;

/**
 *
 * @author Luciano Bezerra
 */
@Table(value = "windows")
@BelongsTo(foreignKeyName = "user_id", parent = Usuario.class)

public class Window extends Model{
  
}
