package Modul2.RegExp;

public class ClientValidator {

  boolean validateEmail(String email) {
    String pattern = "^[a-zA-Z][\\w.-]*@[a-zA-Z]{2,6}\\.(com|net|org|ru)$";
    return email.matches(pattern);
  }

  boolean validateIP(String ip) {
    String pattern = "";

    return ip.matches(pattern);
  }

  boolean validateUrl(String url) {
    String pattern = "";

    return url.matches(pattern);
  }

  boolean validateAdress(String adress) {
    String pattern = "";

    return adress.matches(pattern);
  }

  public static void main(String[] args) {
    ClientValidator clientValidator = new ClientValidator();
    System.out.println(clientValidator.validateEmail("a.petrov_nd-2fd36@madfil.com"));
  }

}
