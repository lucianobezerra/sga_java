package br.com.sga.model;

/**
 *
 * @author Luciano Bezerra
 */
public class UsuarioLogado {
  private Integer id;
  private String name;

  public static Boolean isLogged() {
    return UsuarioLogadoHolder.instance != null;
  }
  
  public static UsuarioLogado getInstance(){
    return UsuarioLogadoHolder.instance;
  }
  
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private static class UsuarioLogadoHolder {

    private final static UsuarioLogado instance = new UsuarioLogado();
  }
   
}
