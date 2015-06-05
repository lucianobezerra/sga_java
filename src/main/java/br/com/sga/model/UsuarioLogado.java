package br.com.sga.model;

/**
 *
 * @author Luciano Bezerra
 */
public class UsuarioLogado {
  private Integer id;
  private String name;
  private Integer nivel;

  public static Boolean isLogged() {
    return UsuarioLogadoHolder.instance != null;
  }
  
  public static UsuarioLogado getInstance(){
    return UsuarioLogadoHolder.instance;
  }
  
  public static Boolean isAdmin(){
    return (isLogged() && getInstance().getNivel() == 1);
  }
  
  public static Boolean isGerente(){
    return (isLogged() && getInstance().getNivel() == 2);
  }
  
  public static Boolean isOperador(){
    return (isLogged() && getInstance().getNivel() == 3);
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

  public Integer getNivel() {
    return nivel;
  }

  public void setNivel(Integer nivel) {
    this.nivel = nivel;
  }

  private static class UsuarioLogadoHolder {

    private final static UsuarioLogado instance = new UsuarioLogado();
  }
   
}
