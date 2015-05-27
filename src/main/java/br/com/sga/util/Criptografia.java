package br.com.sga.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Luciano Bezerra
 */
public class Criptografia {

  public static String criptografar(String password) {
    return hexCodes(password).toString();
  }

  private static StringBuilder hexCodes(String text) {
    StringBuilder hexString = new StringBuilder();
    try {
      MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
      byte messageDigest[] = algorithm.digest(text.getBytes("UTF-8"));

      for (byte b : messageDigest) {
        hexString.append(String.format("%02X", 0xFF & b));
      }
    } catch (NoSuchAlgorithmException | UnsupportedEncodingException nsa) {
      System.out.println(nsa.getLocalizedMessage());
    }
    return hexString;
  }
}
