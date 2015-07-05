package br.com.sga.util;

import java.awt.BorderLayout;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
import org.javalite.activejdbc.Base;

public class Report {
  public static void openReport(String titulo, String path, Map params){
    InputStream inputStream;
    JasperPrint jasperPrint = null;
    try {
      inputStream = new FileInputStream(path);
      jasperPrint = JasperFillManager.fillReport(inputStream, params, Base.connection());
    } catch (Exception e) {
      e.printStackTrace();
      Message.exception(null, "Erro ao gerar relatório", e.getMessage());
    }
    viewReportFrame(titulo, jasperPrint);
  }

  private static void viewReportFrame(String titulo, JasperPrint jasperPrint) {
    JRViewer viewer = new JRViewer(jasperPrint);
    JFrame frameReport = new JFrame(titulo);
    frameReport.add(viewer, BorderLayout.CENTER);
    frameReport.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frameReport.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frameReport.setVisible(true);
  }
}
