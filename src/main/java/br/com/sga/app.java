package br.com.sga;

import br.com.sga.ui.Login;
import javax.swing.SwingUtilities;
import org.javalite.activejdbc.Base;

/**
 *
 * @author Luciano Bezerra
 */
public class app {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {

      @Override
      public void run() {
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1/db_sga", "root", "mysql");
        Login login = new Login();
        login.setVisible(true);
      }
    });
  }
}
