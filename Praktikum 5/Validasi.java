public class Validasi implements IValidasi {

  @Override
  public boolean validasiUsername(String username) {
    return username != null && !username.isEmpty();
  }

  @Override
  public boolean validasiNama(String name) {
    return name != null && !name.isEmpty() && name.matches("[\\w\\s]+");
  }

  @Override
  public boolean validasiNomorTelepon(String phoneNumber) {
    return phoneNumber != null && !phoneNumber.isEmpty() && phoneNumber.matches("[0-9]+");
  }

  @Override
  public boolean validasiEmail(String email) {
    return email != null && !email.isEmpty() && email.contains("@") && email.contains(".");
  }

  @Override
  public boolean validasiPassword(String password) {
    return password != null && !password.isEmpty() && password.length() >= 8;
  }
}